package Multithreading.MultipleAccess;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by O1e6 <NsN> on 12/14/2015.
 */
public class MultipleAccess {

    public static final int ACCOUNTNUM = 100;
    public static final double INIT_BALANCE = 1000;

    public static void main(String[] args) {
        Bank bank = new Bank(ACCOUNTNUM, INIT_BALANCE);

        int i;
        for (i = 0; i < ACCOUNTNUM; i++) {
            TransferThread transferThread = new TransferThread(bank, i, INIT_BALANCE);

            Thread thread = new Thread(transferThread);

            thread.start();
        }
    }
}

class TransferThread implements Runnable {
    private Bank bank;
    private int srcAccount;
    private double maxAmount;
    private int timeout = 10;

    public TransferThread(Bank b, int src, double amount) {
        this.bank = b;
        this.srcAccount = src;
        this.maxAmount = amount;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int targetAccount = (int) (bank.size() * Math.random());
                double cashAmount = maxAmount * Math.random();
                bank.transfer(srcAccount, targetAccount, cashAmount);
                Thread.sleep((int) (timeout * Math.random()));
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

class Bank {
    private final double[] accounts;
    private Lock bankLock;
    private Condition sufficientsFunds;

    public Bank(int n, double initBalance) {
        accounts = new double[n];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initBalance;
        }
        bankLock = new ReentrantLock();
        sufficientsFunds = bankLock.newCondition();
    }
    public void transfer(int src , int target, double cash)throws InterruptedException{
        bankLock.lock();
        try {
            while (accounts[src] < cash){
                sufficientsFunds.await();
            }
            System.out.println(Thread.currentThread());
            accounts[target] += cash;
            System.out.printf(" Total Balance : %10.2f%n", getTotalBalance());
            sufficientsFunds.signalAll();
        }finally {
            bankLock.unlock();
        }
    }

    public double getTotalBalance() {
        bankLock.lock();
        try {
            double cash = 0;
            for (double account : accounts) {
                cash += account;
            }
            return cash;
        }finally {
            bankLock.unlock();
        }
    }
    public int size(){
        return accounts.length;
    }
}
