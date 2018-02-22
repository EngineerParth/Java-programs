
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;




/**
 *
 * @author Parth
 */
public class UpperCase extends UnicastRemoteObject implements upperCaseStringInterface 
{

    public UpperCase() throws RemoteException{
        
    }
    public String toUpperCase(String s) throws RemoteException {
        return s.toUpperCase();
    }
    
}
