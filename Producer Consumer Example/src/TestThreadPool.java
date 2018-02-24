import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor= Executors.newFixedThreadPool(3);
		
		for(int i=0; i<10;i++){
			Workers w= new Workers("Worker: "+i);
			executor.execute(w);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()){
			
		}
		System.out.println("Finished all threads");

	}

}
