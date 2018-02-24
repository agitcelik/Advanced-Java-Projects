import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class MovingCarThread extends Thread {
	
	public ThreadPanel panel;//panel object created from ThreadPanel class.
	private int numberOfSemaphore;//semaphore count will be uptaded.
	private static Bridge bridge;
	
	public MovingCarThread(){//Empty constructor for using method in this class into the main method(whic in Frame class)
		
	}
	
	public MovingCarThread(ArrayList<Car> circles, ThreadPanel panel,int numberOfSemaphore) {
		/*This constructor has arraylist which have list of vehicles, panel which make us 
		 visible Frame, and semaphore count which decide, in first time, how many vehicles can pass the bridge*/
		this.panel = panel;//must be this in order to be used.
		this.numberOfSemaphore=numberOfSemaphore;//must be this in order to be used.
	}
	public static void bridgeObject(){
		
	}
	
	public void creatingCars(int howMany){//Creating cars.
		for (int i = 0; i < howMany; i++) {
			MainFrame.carList.add(new Car());//Adding each of new vehicles into the list
		}
	}//End of the creating method.
	
	
	@Override
	public void run() {//Beggining of thread which is defined as if its own class.
		
		final Bridge bridge = new Bridge(numberOfSemaphore);//Brigde class hold the numberOfSemaphore.(semaphore count.)
    
		Thread thrd = new Thread( new Runnable() {//Definin interface class like this.
             
            @Override
            public void run() {//Use Runnable object like a in class like that.
             
            	for (int i = 0; i < MainFrame.carList.size(); i++) 
        		{//check each vehicles in our static array list
            		//Car circleRunner = new Car(bridge,Frame.carList.get(i),panel);
            		Car checkCars = new Car(bridge,MainFrame.carList.get(i),panel);
            		
                    Thread th = new Thread(checkCars);
                    th.start();//Car checks thread is executed.
                }
                 
            }//End of the inner thread.
        });//End of the defining interface class.
         
        thrd.start();
	}//end of the thread.

}// end of the class