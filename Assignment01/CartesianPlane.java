import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CartesianPlane {
	Random r2 = new Random();//I use Random class to get random numbers from.
	Random r1 = new Random();//I use Random class to get random numbers from.
	private int x;//Define x coordinate
	private int y;//Define y coordinate

	public CartesianPlane() {//Genearte random into the constructor.
		super();/*
		this.x= random.nextDouble()*(700-100)+100;
		this.y= random.nextDouble()*(700-100)+100;
		*/
	/*	int  min =0;
		int max =70;
		double random = ThreadLocalRandom.current().nextDouble(min, max);*/
		setX(r1.nextInt(70));//Setting x to the random numbers
		setY(r2.nextInt(70));//Setting y to the random numbers
	}

	public int getX() {//Get point of x coordinate
		return x;
	}

	public void setX(int x) {//Set(change) point of x coordinate
		this.x = x;
	}

	public int getY() {//Get point of y coordinate

		return y;
	}

	public void setY(int y) {//Set(change) point of y coordinate
		this.y = y;
	}

}
