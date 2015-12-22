package rmi.ExportObject;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class CalculatorServiceImpl extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServiceImpl() throws RemoteException {

        super();
    }

    // All remote methods must throw RemoteException
    public int add(int num1, int num2) throws RemoteException {

        return (num1 + num2);
    }

    public double div(double num1, double num2) throws RemoteException {

        if (num2 == 0) {
            // The actual exception must be wrapped in a RemoteException


            throw new RemoteException("Divided by zero!", new IllegalArgumentException("Divided by zero!"));

        }

        return (num1 / num2);
    }
}
