import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
		
		String IP= args[0];
		int port=Integer.parseInt( args[1]);
		
		String calculation = args[2];
		int local1=0;
		local1=	Integer.parseInt(args[3]);
		int local2=0;
		if(args.length>4)
		local2=Integer.parseInt(args[4]);
		
		String outPut=calculation+":"+local1+":"+local2;
		Socket client = new Socket(IP,port);
		OutputStream output= client.getOutputStream();
		DataOutputStream strOut= new DataOutputStream(output);
		//strOut.writeUTF("Client: thanks server.....");
		//strOut.writeUTF("gcd:21:69:isEven:8");
		strOut.writeUTF(outPut);
		//strOut.writeUTF("factorial:5");
		
		InputStream input= client.getInputStream();
		DataInputStream istr= new DataInputStream(input);
		String msg= istr.readUTF();
		System.out.println(msg);
		
		
		
	}

}
