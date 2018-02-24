
/*
* Simple XMLRPC Client using Apache's XML-RPC library
*
* Author: Mehmet Gencer, mgencer@cs.bilgi.edu.tr
*
*/
import org.apache.xmlrpc.*;
import java.util.*;

public class SimpleXMLRPCClient{
  // this method returns a string
    public static void main(String args[]){
        try{
            XmlRpcClient xmlrpc = new XmlRpcClient ("http://localhost:8088/RPC2");
            Vector params = new Vector ();
            params.addElement ("a string parameter");
            String result = (String) xmlrpc.execute ("myhandler.hello", params);
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
