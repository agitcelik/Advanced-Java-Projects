import java.rmi.RemoteException;

public class RmiServerImplementation  implements RmiInterface {
	
	
	
	@Override
	public String merhaba() throws RemoteException {
		// TODO Auto-generated method stub
		return "Hello bilgi";
	}

	

	@Override
	public int powerOffunction(int a) throws RemoteException {
		// TODO Auto-generated method stub
		return (int) java.lang.Math.pow(a, 2);
	}
	

}
