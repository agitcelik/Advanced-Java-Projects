
public class Test {
public static void main(String[] args) {
	Item items = new Item();
	User user1= new User(items);
	User user2 = new User(items);
	user1.setName("Itu");
	user2.setName("Bilgi");
	user1.start();
	user2.start();
	
	System.out.println("PART 1");

	
}
}
