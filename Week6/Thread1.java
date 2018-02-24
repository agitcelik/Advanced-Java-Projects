import java.util.Random;


public class Thread1 extends Thread{
	Random rnd = new Random();
	public static int num;
	public static int max=20;
	public static int min=0;
	
	
	
	public void fact(){
		while (true) {
			
			int randomNumber = rnd.nextInt((max-min));
		//	int a= 1+rnd.nextInt((max-min)/2)*2;
			if (randomNumber %2 != 0) {
				long fact = 1;
				System.out.println("Factraial of "+randomNumber+" is below; ");
				for (int i = 1; i <= randomNumber; i++) {
					
					fact = fact * i;
				}
				System.out.println(fact);
			}
		try{
				if(randomNumber %2 !=0){
				System.out.println("It will continue in 3 second... ");
				Thread.currentThread();
				Thread.sleep(3*1000);
				}
			}catch(InterruptedException e){
			System.out.println("It will terminate in a second...(THREAD 1) ");
			System.exit(0);
		}
		}
	}

	public void run(){
	System.out.println("Id of the Thread1: "+ Thread.currentThread().getId());
	System.out.println("Name of the Thread1: "+ Thread.currentThread().getName());
	fact();
	
	}







}
