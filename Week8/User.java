
public class User extends Thread{
 
	
	private Item item;
	
	public User(Item i){
		this.item=i;
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
