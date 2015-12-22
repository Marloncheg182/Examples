package rmi.ExportObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public interface CalculatorService extends Remote {
    int add(int num1, int num2) throws RuntimeException, RemoteException;

    double div(double num1, double num2) throws RemoteException;
}
