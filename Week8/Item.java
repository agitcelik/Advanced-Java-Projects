
public class Item {

	private int index;
	private  String []items={"BMW","BENZ","Fiat","Honda","Sony","Toyota"};
	
	public Item(){
		index=0;
	}
	public String buyCar(){
		
		String myCar=items[index];
		index++;
		return  myCar+ " was bought by "+Thread.currentThread().getName();

	}
}
