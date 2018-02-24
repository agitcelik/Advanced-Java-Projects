
public class TestSynchronized {
	public static void main(String[] args) {
		ItemSynchronized items = new ItemSynchronized();
		UserSynchronized user1= new UserSynchronized(items);
		UserSynchronized user2 = new UserSynchronized(items);
		user1.setName("Itu");
		user2.setName("Bilgi");
		user1.start();
		user2.start();
		System.out.println("PART 3 with Synchronized");
		

		
	}
}
