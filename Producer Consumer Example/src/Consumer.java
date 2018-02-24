import java.util.Random;

public class Consumer extends Thread{
	private Counter counter;
	private Random r;
	
	public Consumer( Counter counter) {
		// TODO Auto-generated constructor stub
		this.counter=counter;
		r= new Random();
	}
	
	public void run(){
		
		while(true){
			try{
				counter.decrease();
				sleep(r.nextInt(1000)+500);
			}
			catch(InterruptedException e){
				
			}
		}
	}

}
