
public class MyThread extends Thread{
	public MyThread( ThreadGroup group, String name) {
		// TODO Auto-generated constructor stub
		super(group,name);
	}
	
	public void run(){
		try{
		for(int i=0;i<4;i++){
			System.out.println(getName()+" :"+i);
			Thread.sleep(2000);
		}
		}
		catch(InterruptedException e){
			
		}
		System.out.println(getName()+" End of the thread");
	}

}
