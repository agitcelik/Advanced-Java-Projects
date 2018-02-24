import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiInterface extends Remote {
	String merhaba ()throws RemoteException;
	//int factorial(int n) throws RemoteException;
	int powerOffunction (int a) throws RemoteException;
	//int powerOffunction() throws RemoteException;
}