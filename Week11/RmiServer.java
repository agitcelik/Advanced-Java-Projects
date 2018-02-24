import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.management.relation.RelationServiceNotRegisteredException;

public class RmiServer {
	
	public static void main(String[] args) {
		
		try{
		RmiServerImplementation server= new RmiServerImplementation();
		
		RmiInterface shared= (RmiInterface)UnicastRemoteObject.exportObject(server, 0);
		Registry regist= LocateRegistry.getRegistry();
		regist.bind("bilgi", shared);
		System.out.println("server is ready");
		
		}
		catch(Exception e){
			
		}
	}

}
