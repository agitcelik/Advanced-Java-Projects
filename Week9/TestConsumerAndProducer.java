
public class TestConsumerAndProducer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SharedData counter= new SharedData();
		
		
		Producer p1= new Producer(counter);

		Consumer c1= new Consumer(counter);
		
		p1.start();
		c1.start();
		p1.join();
		c1.join();
		
		

	}

}
