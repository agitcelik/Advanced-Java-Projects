import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
	private SharedData data;
	private Random r;
	
	
	//private BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
 	public Producer( SharedData data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		r=new Random();
	}
	
	public void run(){
		while(true){
			
			try{
				data.adding();
				sleep(r.nextInt(1000)+500);
			}
			catch(InterruptedException e){
				
			}
			
		}
	}

}
