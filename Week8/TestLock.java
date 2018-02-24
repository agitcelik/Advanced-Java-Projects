import java.util.concurrent.locks.ReentrantLock;


public class TestLock {
	public static void main(String[] args) {
		Item items = new Item();	
		ReentrantLock lock = new ReentrantLock();
		LockUser user1= new LockUser(items,lock);
		LockUser user2 = new LockUser(items,lock);
		
		user1.setName("Itu");
		user2.setName("Bilgi");
		
		user1.start();
		user2.start();
		System.out.println("PART 2 with ReentrantLock");

	}
}
