package dataexam.test.util;

import dataexam.entity.Bank;

/**
 * Created by Dell on 6/13/2015.
 */
public class BankUtil {
    public static Bank createBank()
    {
        Bank bank = new Bank();
        bank.setName("Gold Bank");
        return bank;
    }
}
