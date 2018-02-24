
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter= new Counter();
		
		Producer p1= new Producer(counter);
		p1.setName("Patates");
		p1.start();
		
		Producer p2= new Producer(counter);
		p2.setName("Havuc");
		p2.start();
		
		Producer p3= new Producer(counter);
		p3.setName("Domates");
		p3.start();
		
		
		Consumer c1= new Consumer(counter);
		c1.setName("Ali");
		c1.start();
		
		Consumer c2= new Consumer(counter);
		c2.setName("Veli");
		c2.start();
		
		Consumer c3= new Consumer(counter);
		c3.setName("Ayse");
		c3.start();
		
		
		Consumer c4= new Consumer(counter);
		c4.setName("Muzeyen");
		c4.start();
		
		
		
		

	}

}
