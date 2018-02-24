import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Mehmet implements Runnable{
	private Atm atm;
	private int money;
	private Semaphore sem;
	
	public Mehmet(Atm atm, int money, Semaphore sem) {
		// TODO Auto-generated constructor stub
		this.atm=atm;
		this.money=money;
		this.sem=sem;
	}
	
	
	public void run(){
		
		try {
			sem.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String message= atm.getMoney(money);
		 sem.release();
		 message= Thread.currentThread(). getName()+ "  "+message;
	
			System.out.println(message);
		
		
		
	}

}
