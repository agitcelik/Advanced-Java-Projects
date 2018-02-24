import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
	public static void main(String[] args) {
		try{
			Registry rgist= LocateRegistry.getRegistry("localhost");
			RmiInterface shared=(RmiInterface)rgist.lookup("bilgi");
			System.out.println(shared.merhaba());
					
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
