import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public int add(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		ServerSocket server= new ServerSocket(5000);
		int result=0;
		
		Server myCalculation= new Server();
		
		System.out.println("Server: I am waiting for a client..."); 
		Socket mySocket= server.accept();
		System.out.println("Server: I got a client...");
		
		InputStream input= mySocket.getInputStream();
		DataInputStream datainput= new DataInputStream(input);
		//System.out.println("Server: the message from client is: "+datainput.readUTF());
		String []data= datainput.readUTF().split(":");
		if(data[0].equals("add")){
			result=myCalculation.add(Integer.parseInt(data[1]),Integer.parseInt(data[2]) );
		}
		else{
			result=myCalculation.sub(Integer.parseInt(data[1]),Integer.parseInt(data[2]) );
		}
		
		OutputStream output= mySocket.getOutputStream();
		DataOutputStream dot= new DataOutputStream(output);
		dot.writeUTF("Server: result is: "+result);
		
		
		
		dot.close();
		output.close();
		mySocket.close();
		
		
		
	}

}
