
/*
* Simple XMLRPC server using Apache's XML-RPC library
*
* Author: Mehmet Gencer, mgencer@cs.bilgi.edu.tr
* 
* This example uses builtin web server of Apache library
* 
*/
import org.apache.xmlrpc.WebServer;

public class SimpleXMLRPCServer{
    static int port=9000;
    public SimpleXMLRPCServer(){
        //a dummy constructor
    }
    public String hello(String msg){
            return("You said:"+ msg);
        }
   /* public int fact(int n){
    	int multp=1;
    	for(int i=1; i<=n; i++){
    		multp=multp*i;
    	}
		return multp;
    }*/
    public int power(int n){
    	int a = (int) Math.pow(n, 2);
    	return a;
    }
    public static void main(String args[]){
    //	SimpleXMLRPCServer test = new SimpleXMLRPCServer();
    	
    	//System.out.println(test.power(5));
    	
    	try{
            WebServer webserver = new WebServer(port);
            webserver.addHandler("myhandler", new SimpleXMLRPCServer()); 
            webserver.start();
            System.out.println("XML-RPC server is awaiting for calls at port:"+port);
       } catch (Exception e){
            System.out.println(e);
       }
    }

}