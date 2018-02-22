
import java.rmi.Remote;
import java.rmi.RemoteException;



/**
 *
 * @author Parth
 */
public interface upperCaseStringInterface  extends Remote{
    public String toUpperCase(String s) throws RemoteException;
}
