package rmi.ExportObject;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class ExportObjectToRMI {
    public static void main(String[] args) {
        // Create an instance of the remote object and bind it to the RMI registry
        try {

            CalculatorService calculatorService = new CalculatorServiceImpl();

            Naming.rebind("//localhost/CalculatorService", calculatorService);
        } catch (MalformedURLException e) {
        } catch (RemoteException e) {
        }

        // Look up the remote object and invoke the exposed methods
        try {

            CalculatorService calculatorService = (CalculatorService) Naming.lookup("//localhost/CalculatorService");

            double result = calculatorService.div(10, 5);

            System.out.println("Division 10/5 result : " + result);
        } catch (MalformedURLException e) {
        } catch (NotBoundException e) {
        } catch (RemoteException e) {

// Get the actual exception that was thrown.

            Throwable realException = e.detail;
        }
    }
}
