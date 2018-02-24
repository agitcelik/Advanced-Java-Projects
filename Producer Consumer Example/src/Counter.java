import java.util.Random;

public class Counter {
	private int c,max,min;
	private Random r;
public Counter() {
	// TODO Auto-generated constructor stub
	min=0;
	max=100;
	c=0;
	r= new Random();
}

public synchronized void increase(){
	
	int n= r.nextInt(10);
	try{
		if(c+n>max){
			System.out.println("Producer: "+Thread.currentThread().getName()+" is waiting..."
					+ " \n The generated number is: "+ n+ ""
							+ "\n the current counter value is: "+c);
			wait();
			Thread.currentThread().sleep(2000);
		}
		else{
			c=c+n;
			System.out.println("Producer: "+Thread.currentThread().getName()+ "is working "
					+ "\n the generated data is: "+n +""
							+ "\n The updated value of the counter is:"+c);
			Thread.currentThread().sleep(2000);
			notifyAll();
			
		}
	}
	catch(InterruptedException e){
		
	}
	
} // end of the increase method...


public synchronized void decrease(){
	
	int n= r.nextInt(10);
	try{
		if(c-n<min){
			System.out.println("Consumer: "+Thread.currentThread().getName()+" is waiting..."
					+ " \n The generated number is: "+ n+ ""
							+ "\n the current counter value is: "+c);
			wait();
			Thread.currentThread().sleep(2000);
		}
		else{
			c=c-n;
			System.out.println("Consumer: "+Thread.currentThread().getName()+ "is working "
					+ "\n the generated data is: "+n +""
							+ "\n The updated value of the counter is:"+c);
			Thread.currentThread().sleep(2000);
			notifyAll();
			
		}
	}
	catch(InterruptedException e){
		
	}
	
} // end of the increase method...



}
