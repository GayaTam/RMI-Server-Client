package ServerRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class TraductionC extends UnicastRemoteObject implements TraductionI {
   
    public TraductionC() throws RemoteException {
        super();
    }

    
    public String Traduction(String mot) throws RemoteException {
        // Modify this method to add either a database or a list of words you want to translate.
        if (mot.equals("hello")) { 
            return "bonjour";
        } else {
            return "Traduction non disponible";
        }
    }
}
