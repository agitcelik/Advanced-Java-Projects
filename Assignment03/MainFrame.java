import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Semaphore;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {//Beginning of the class

	public ThreadPanel threadPanel;//To use panel of program
	
	static ArrayList<Car> carList = new ArrayList<Car>();//Hold number of cars and their properties in a static array list.
//After that, carList array list will be used.
	public static void main(String[] args) {//Beginning of the main thread.
		String numberOfCars;//Command input 1
		String numberOfThread;//Command input 2
		MainFrame frameOfCar = new MainFrame();//In order to use methods whose are in Frame class
		MovingCarThread carObject = new MovingCarThread();
		if(args.length>0){//not to get any execption in command line.
			numberOfCars = args[0];//Get input of number of vehicels from users in command line.
			numberOfThread = args[1];//Get input of number of thread from users in command line.
		
			carObject.creatingCars(Integer.parseInt(numberOfCars));//Get input from command line.
			MovingCarThread threadMove = new MovingCarThread(carList,frameOfCar.threadPanel,Integer.parseInt(numberOfThread));
													//Using array list , panel and number of vehicles, are allowing to pass.
			threadMove.start();//Execute out thread to move.
		
		}//End of if.	
		
	}//End of the main thread.
		public MainFrame(){
			threadPanel = new ThreadPanel();//Object should be created in order to be used in Frame
		
			setVisible(true);//to get visibility panel
			setDefaultCloseOperation(EXIT_ON_CLOSE);//Should be written
			setSize(880,600);//Size of panel
			add(threadPanel);//addind panel to the Frame
	}
		
	
	

}//End of the Frame class
