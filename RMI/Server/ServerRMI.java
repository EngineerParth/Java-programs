


import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import threaded.ThreadedRMIServer;

/**
 *
 * @author Parth
 */
public class ServerRMI {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        LocateRegistry.createRegistry(1099);
        Registry r =  LocateRegistry.getRegistry();
        UpperCase obj1 = new UpperCase();
        r.rebind("abc", obj1);
        System.out.println("Object is bound and ready for communication.....");
        
        
    }
}
