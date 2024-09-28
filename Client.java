package RMIClient;

import java.rmi.Naming;




public class Client {
    public static void main(String[] args) {
        try {
            
        	TraductionI stub = (TraductionI) Naming.lookup("rmi://localhost:1098/TD");
            String motTraduit = stub.Traduction("Bonjour");
            
            System.out.println("Mot traduit : " + motTraduit);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	
	
}
