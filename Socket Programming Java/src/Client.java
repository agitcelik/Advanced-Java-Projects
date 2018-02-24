import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		Socket client= new Socket("localhost", 5000);
		
		OutputStream output= client.getOutputStream();
		DataOutputStream strOut= new DataOutputStream(output);
		//strOut.writeUTF("Client: thanks server.....");
		strOut.writeUTF("add:200:300");
		
		
		InputStream input= client.getInputStream();
		DataInputStream istr= new DataInputStream(input);
		String msg= istr.readUTF();
		System.out.println(msg);
		
		
		
	}

}
