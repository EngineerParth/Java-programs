<<<<<<< HEAD

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;




/**
 *
 * @author Parth
 */
public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry r = LocateRegistry.getRegistry(1099);
        upperCaseStringInterface ref = (upperCaseStringInterface)r.lookup("abc");
        System.out.println(ref.toUpperCase("dexter"));
    }
    
}
=======

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;




/**
 *
 * @author Parth
 */
public class ClientRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry r = LocateRegistry.getRegistry(1099);
        upperCaseStringInterface ref = (upperCaseStringInterface)r.lookup("abc");
        System.out.println(ref.toUpperCase("dexter"));
    }
    
}
>>>>>>> 237445ba335f733694eab7d8a314a3c785146de6
