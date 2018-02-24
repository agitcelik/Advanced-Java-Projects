
public class GroupExample implements Runnable {
	
	public void run() {
		for(int i=0;i<4;i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
			try{
				Thread.currentThread().sleep(2000);
				
			}
			catch(InterruptedException a){
				
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" End of the thread");
	}

}
