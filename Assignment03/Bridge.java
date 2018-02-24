import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
//It is my birdge class which extends Thread class (is a relation)
//Bridge conditions are below.
public class Bridge extends Thread {//Beginning of the Bridge class
	private Semaphore semaphore;//Creating semaphore obeject.
	public Random random = new Random();
	Car cObject= new Car();
	
	public Bridge(int semaphoreCount) {//get int semaphore count from Bridge constructor...
		semaphore = new Semaphore(semaphoreCount);//Not to get null pointer execption
	}

	public static void semaphore(int b) {

	}

	public void crossBridge(Car car, ThreadPanel panel){//Using Car object and panel to move cars on the panel
		boolean done = false;//To make infinite loop
		while (!done) {//While loop always take true due to !done, so it will make infinite loop
			try {
				while (!move(car, panel));//it turns until move method will false.
				semaphore.acquire();//To make cars wait after while(); loop gets us false.

				while (move(car, panel));//it turns until move method will false.
				semaphore.release();//To make cars keep moving after while(); loop gets us false.

			} catch (InterruptedException e) {
				//try catch block must be used due to acquire.
			}
		}//End of the while.
	}//End of the crossBrigde method.
	
	private boolean move(Car car, ThreadPanel panel) {//Beggining of the move method.

		try {
			Thread.currentThread().sleep(125);//Thread sleep in every 125 milisecond
		} catch (InterruptedException e) {

			e.printStackTrace();//when sleep is used try catch block must be used.
		}
		car.moveCar();//To make car move in a random order
		panel.repaint();//To paint each circle over and over.
		if (car.getX() < 267 || car.getX() > 495) {//This condition return false, only if shapes is left side of bridge(x<267)
			return false;
		}
		//Otherwise, it will return true due to right side of the bridge(x>495)
		return true;
//it means that object, before and after bridge, depends on a boolean variable, so that it will make another Semaphore allow to pass.
	}//End of move method.
	

}//End of the bridge class.