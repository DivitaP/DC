import java.rmi.*;

/**
 * Remote Interface for the &quot;Hello, world!&quot; example.
 */
public interface HelloInterface extends Remote {
    /**
     * Remotely invocable method.
     * 
     * @return the message of the remote object, such as &quot;Hello, world!&quot;.
     * @exception RemoteException if the remote invocation fails.
     */
    public String say() throws RemoteException;
}