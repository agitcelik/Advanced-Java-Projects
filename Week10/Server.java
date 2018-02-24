import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/*public  long factorial(int num){
		int fact = 1;
		for(int i=1; i<=num; i++){

				fact=fact*i;
				
			}

		return fact;
	}*/
	public int gcd(int a, int b)
	{
	  if(a == 0 || b == 0) return a+b;
	  return gcd(b,a%b);
	}
	public boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public int add(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		int port =Integer.parseInt(args[0]);
	
			ServerSocket server= new ServerSocket(port);
	
		
		String result=null;
		//boolean result2;
		InetAddress ip = null;
		Server myCalculation= new Server();
		
		System.out.println("Server: I am waiting for a client..."+server.getLocalPort()); 
		Socket mySocket= server.accept();
		System.out.println("Server: I got a client...");
		
		InputStream input= mySocket.getInputStream();
		DataInputStream datainput= new DataInputStream(input);
		//System.out.println("Server: the message from client is: "+datainput.readUTF());
		/*String []data= datainput.readUTF().split(":");
		if(data[0].equals("add")){
			result=myCalculation.add(Integer.parseInt(data[1]),Integer.parseInt(data[2]) );
		}
		else{
			result=myCalculation.sub(Integer.parseInt(data[1]),Integer.parseInt(data[2]) );
		}*/
		String [] getData  = datainput.readUTF().split(":");
		if(getData[0].equals("gcd")){
			result= ""+myCalculation.gcd(Integer.parseInt(getData[1]),Integer.parseInt(getData[2]));
		}
		else{
			
			result=""+myCalculation.isEven(Integer.parseInt(getData[1]));
		}
		
		/*if(getData[0].equals("isEven")){
			result=""+myCalculation.isEven(Integer.parseInt(getData[1]));
		}
		else
		{
			result=""+myCalculation.isEven(Integer.parseInt(getData[1]));
		}*/
		
		OutputStream output= mySocket.getOutputStream();
		DataOutputStream dot= new DataOutputStream(output);
		dot.writeUTF("Server: serverIPNumber is: ["+ip.getLocalHost()+" serverPortNumber is : "+server.getLocalPort()+"] result is: "+result);
				
		//dot.writeUTF("Server port number is:"+String.valueOf(server.getLocalPort()));
		//InetAddress.getLocalHost().getHostName()//ip.getLocalHost().getHostName()
		
		dot.close();
		output.close();
		mySocket.close();
		
		
		
	}

}
