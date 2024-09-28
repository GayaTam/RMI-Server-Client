package ServerRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TraductionI extends Remote {
	public String Traduction(String mot) throws RemoteException;

}
