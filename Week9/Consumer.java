import java.util.Random;

public class Consumer extends Thread{
	private SharedData data;
	private Random r;
	
	public Consumer( SharedData data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		r= new Random();
	}
	
	public void run(){
		
		while(true){
			try{
				data.calculating();
				sleep(r.nextInt(1000)+500);
			}
			catch(InterruptedException e){
				
			}
		}
	}

}
