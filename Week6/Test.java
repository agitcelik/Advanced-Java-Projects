
public class Test {
public static void main(String[] args) {
		Thread2 thrd2 = new Thread2();
		Thread t= new Thread(thrd2);
		Thread1 thrd1 = new Thread1();

	
	thrd1.start();
	t.start();
	
	try{
		Thread.currentThread();
		Thread.sleep(30*1000);
		System.out.println("Finish!...");
		thrd1.interrupt();
		t.interrupt();
		
		thrd1.join();
		t.join();
	}catch(InterruptedException e){
		
	}
}
}
