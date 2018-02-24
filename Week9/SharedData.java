import java.util.ArrayList;
import java.util.Random;

public class SharedData {
	private Random r;
public SharedData() {



	r= new Random();
}

/*private static int factorial () {
	int num = 1;
	for (int i = 1; i <= list.size(); i++) {
		num=list.get(i);
		if(num==0)
			return 1;
		if(num==1)
			return 1;
		else
		num = num * i;
	}
	
	return num;

}*/
private static long factorial(int num){
	int fact = 1;
	for(int i=1; i<=num; i++){

			fact=fact*i;
			
		}

	return fact;
}

static ArrayList<Integer> list = new ArrayList<Integer>();
public synchronized void adding(){
	
	int n= r.nextInt(20);
	try{
		if(!list.isEmpty()){
System.out.println("[Producer: "+Thread.currentThread().getName()+"] (is waiting...) because list is not empty");
			
			Thread.currentThread().sleep(200);
			wait();
		}
		else{
			
			System.out.println("[Producer: "+Thread.currentThread().getName()+ "] (is working...) the element "+ n+ 
					 " is adding to the list");
			list.add(0,n);
			notifyAll();
			Thread.currentThread().sleep(200);
			
		}
	}
	catch(InterruptedException e){
		
	}
	
} // end of the increase method...


public synchronized void calculating(){
	
//	int n= r.nextInt(10);
	try{
		if(!list.isEmpty()){
			System.out.println("[Consumer: "+Thread.currentThread().getName()+ "]  (is working) "
					+ "    The fact of " +list.get(0)+" is " +	factorial(list.get(0)));
			list.clear();
		//	factorial(list.get(0));
			notifyAll();
			Thread.currentThread().sleep(200);
		}
		else{
		
System.out.println("[Consumer:   "+Thread.currentThread().getName()+"]  (is waiting...)"
					+ " ,because list is empty");
			wait();
			Thread.currentThread().sleep(200);
			
			
		}
	}
	catch(InterruptedException e){
		
	}
	
} // end of the increase method...



}
