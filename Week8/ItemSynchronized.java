
public class ItemSynchronized {

	private int index;
	private  String []items={"BMW","BENZ","Fiat","Honda","Sony","Toyota"};
	
	public ItemSynchronized(){
		index=0;
	}
	public synchronized String buyCar(){
		
		String myCar=items[index];
		index++;
		return  myCar+ " was bought by "+Thread.currentThread().getName();

	}
}
