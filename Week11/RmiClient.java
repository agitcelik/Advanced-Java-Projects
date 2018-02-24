import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
	public static void main(String[] args)  throws Exception{
		
		String m = args[0];
		String k = args[1];
		String n= args[2];
		//String g = args[3];
		try{
			Registry rgist= LocateRegistry.getRegistry(m);
			RmiInterface shared=(RmiInterface)rgist.lookup(k);
			System.out.println(shared.merhaba());
			if(args.length>0){
			System.out.println("The power of "+n +" is: "+ shared.powerOffunction(Integer.parseInt(n)));
			}		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
