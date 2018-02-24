import java.util.Random;

public class Workers implements Runnable{
	String name;
	public Workers(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	
	public void run(){
		
		System.out.println(Thread.currentThread().getName()+" start");
		tasks();
		System.out.println(Thread.currentThread().getName()+ "end");
	}
	
	
	public void tasks(){
		try{
			Thread.currentThread().sleep(new Random().nextInt(5000));
		}
		catch(InterruptedException e){
			
		}
	}

}
