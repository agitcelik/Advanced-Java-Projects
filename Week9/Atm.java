import java.util.Random;

public class Atm {
	private int balance;
	
	public Atm(int balance) {
		// TODO Auto-generated constructor stub
		
		this.balance=balance;
	}
	
	public  String getMoney(int money){
		if(balance>=money){
            
			try{
			
			Thread.currentThread().sleep(new Random().nextInt(1000));	
			balance=balance-money;
			
			}
			
			catch(InterruptedException e ){
				
			}
			
			return "You can get: "+money+" TL";
		}
		
		else {
			return "You can't get:"+money+" TL, your balance is: "+balance+ "TL";
		}
	}

}
