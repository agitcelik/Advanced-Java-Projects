
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
    static int port=8088;
    public SimpleXMLRPCServer(){
        //a dummy constructor
    }
    public String hello(String msg){
            return("You said:"+ msg);
        }
    
    public static void main(String args[]){
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