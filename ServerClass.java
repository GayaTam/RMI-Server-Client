package ServerRMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerClass {
    public static void main(String[] args) {
        try {
        	LocateRegistry.createRegistry(1098);
            TraductionC trad = new TraductionC();
            System.out.print(trad.toString()); // pour afficher la ref
            Naming.rebind("rmi://localhost:1098/TD", trad);
            
            //System.out.println("Server is running on port " + port + "...");
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
