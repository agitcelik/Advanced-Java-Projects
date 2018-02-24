import java.util.concurrent.locks.ReentrantLock;

public class LockUser extends Thread{
 
	
	private Item item;
	private ReentrantLock myLock;
	public LockUser(Item i,ReentrantLock myLock){
		this.item=i;
		this.myLock=myLock;
	}

	public void run(){

			try{
				
				for(int i=0;i<=5;i++){
					
					myLock.lock();
					String k = item.buyCar();
					myLock.unlock();
					System.out.println(k);	
					sleep(1000);
				}
					}catch(Exception e){
						
					}

		}
	

}