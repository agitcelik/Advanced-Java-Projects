import java.awt.Color;
import java.util.Random;

public class Car implements Runnable {//Beggining of the Car class.
	private Bridge bridgeBorders;//Bridge object created from Bridge class
	private Car car;//Car object created from Bridge class.
	public ThreadPanel panel;//panel object created from ThreadPanel class.
	protected int x = 12;//X coordinate is certain, 
	private int y;//while y coordinate is generated randomly
	public Color color;//To use colors, color object created from Color class.
	public Random randomGenerator = new Random();//For initializing random variables
	private int randomSpeedOfCar;//To make random speed.

	public Car() {//Empty consturctor in order to call methods in Car class.
		y = randomGenerator.nextInt(475 - 10) + 25;
		randomSpeedOfCar = (int) ((randomGenerator.nextDouble() + 0.7) * 5);
		color = new Color(randomGenerator.nextFloat(), randomGenerator.nextFloat(), randomGenerator.nextFloat());
	}

	public Car(Bridge b, Car c, ThreadPanel pa) {//Use 3 variables in constructor(bridge for bridge class and bordes, Car for shapes
												//Using panel to make panel to be visible
		this.bridgeBorders = b;//To use them we have to use this keyword
		this.car = c;//To use them we have to use this keyword
		this.panel = pa;//To use them we have to use this keyword
	}

	public void run() {
		bridgeBorders.crossBridge(car, panel);//Callin crossBridge method which into the Bridge class
	}

	public void moveCar() {//To move our shapes into the panel with increasing constant x variable.
		x = x + randomSpeedOfCar;//each time x coortinate will be increased with random speed variable.
	}

	public int getY() {//For getting y coordinate into another class
		return y;
	}
	public void setY(){//For setting y coordinate into another class
		this.y=y;
	}
	
	public int getRandomSpeedOfCar() {//For getting random speed into another class
		return randomSpeedOfCar;
	}

	public void setRandomSpeedOfCar(int randomSpeedOfCar) {//For setting random speed into another class
		this.randomSpeedOfCar = randomSpeedOfCar;
	}

	public Color getColor() {//For getting colors into another class
		return color;
	}

	public int getX() {//For getting x coordinate into another class
		return x;
	}

	public void setX(int x) {//For setting x coordinate into another class
		this.x = x;

	}
}//End of the class.