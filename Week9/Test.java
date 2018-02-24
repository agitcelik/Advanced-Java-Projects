import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub==  m
		
		Atm atm = new Atm(200);
		Semaphore semTest= new Semaphore(10);
		
	
		Ahmet a=new Ahmet(atm,110,semTest);
		a.setName("Ahmet");
		
		
		Ahmet k=new Ahmet(atm,210,semTest);
		k.setName("Bilgi");
		
		
		
		Thread b= new Thread(new Mehmet(atm, 200,semTest));
		b.setName("Mehmet");
		a.start();
		b.start();
		k.start();
		
		
		
	/*	Users u1= new Users(atm, 95, semTest);
		Users u2= new Users(atm, 55, semTest);
		/*Users u3= new Users(atm, 80, semTest);
		Users u4= new Users(atm, 100, semTest);*/
		
		/*u1.setName("Ahmet");
		u2.setName("Fatma");
		u3.setName("Bigli");
		u4.setName("Ayse");*/
		
	/*	u1.start();
		u2.start();
		u3.start();
		u4.start();
*/
	}

}
