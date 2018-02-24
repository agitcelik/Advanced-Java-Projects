import java.util.Random;


public class Thread2 implements Runnable{
	Random rnd = new Random();
	public static int num;
	public static int max=20;
	public static int min=0;
	int a= 1+rnd.nextInt((max-min)/2)*2;
	
	
	public void fact(){
		while (true) {
		
			int randomNumber = rnd.nextInt((max-min));
			
			if (randomNumber % 2 == 0) {
				long factTotal = 1;
				System.out.println("Factraial of "+randomNumber+" is below; ");
				for (int i = 1; i <= randomNumber; i++) {
					factTotal = factTotal * i;
				}
				System.out.println(factTotal);
			}
	
		try{
			if(randomNumber %2 ==0){
		System.out.println("It will continue in 3 second... ");
		Thread.currentThread();
		Thread.sleep(3*1000);
			}
	}catch(InterruptedException e){
		System.out.println("It will terminate in a second... (THREAD 2)");
		System.exit(0);
	}
		
		}
		
		}
	
	public void run(){
		System.out.println("Id of the Thread2: "+Thread.currentThread().getId());
		System.out.println("Name of the Thread2: " +Thread.currentThread().getName());
		fact();
	}
	
	
}
