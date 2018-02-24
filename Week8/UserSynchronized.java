
public class UserSynchronized extends Thread{

	private ItemSynchronized item;
	
	public UserSynchronized(ItemSynchronized item){
		this.item=item;
	}

	public void run(){

			try{
				
				for(int i=0;i<=5;i++){
				
					System.out.println(item.buyCar());	
					sleep(1000);
				}
					}catch(Exception e){return;}

		}
	

}


