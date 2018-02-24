import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Ahmet extends Thread{
	
	private Atm atm;
	private int money;
	private Semaphore sem;
	public Ahmet(Atm atm, int money, Semaphore sem) {
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
		   message= getName()+ "  "+message;
			System.out.println(message);
		 sem.release();
	   	
	}

}
