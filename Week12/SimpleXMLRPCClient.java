
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
       
    	String input1= args[0];
    	String input2= args[1];
    	String input3= args[2];
    	
    	
    	
    	try{
            XmlRpcClient xmlrpc = new XmlRpcClient (input1+"/"+input2);
           Vector<Integer> params1 = new Vector <Integer>();
            //Vector params = new Vector<>();
            //params.addElement ("a string parameter");
            params1.addElement(Integer.parseInt(input3));
            //String result = (String) xmlrpc.execute ("c.power", params);
            int powerOfFunction = (int) xmlrpc.execute ("myhandler.power", params1);
            System.out.println(powerOfFunction);
            //System.out.println(result);
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
