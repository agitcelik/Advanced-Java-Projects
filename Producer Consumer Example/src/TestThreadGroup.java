
public class TestThreadGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadGroup myGroup= new ThreadGroup("My Thread Groupe");
		ThreadGroup yourGroup= new ThreadGroup("Your Groupe");
		
		
		MyThread a1= new MyThread(myGroup, "bilgi1");
		MyThread a2= new MyThread(myGroup, "bilgi2");
		MyThread a3= new MyThread(myGroup, "bilgi3");
		MyThread a4= new MyThread(myGroup, "bilgi4");
		MyThread a5= new MyThread(myGroup, "bilgi5");
		
		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
		
		
		Thread t1= new Thread(yourGroup, new GroupExample(), "santral1");
		Thread t2= new Thread(yourGroup, new GroupExample(), "santral2");
		Thread t3= new Thread(yourGroup, new GroupExample(), "santral3");
		Thread t4= new Thread(yourGroup, new GroupExample(), "santral4");
		Thread t5= new Thread(yourGroup, new GroupExample(), "santral5");
		
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
	
	
	yourGroup.list();

	}

}
