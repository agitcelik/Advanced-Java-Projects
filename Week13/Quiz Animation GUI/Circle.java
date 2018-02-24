import java.awt.Color;
import java.util.Random;

public class Circle {

	private int x, y, r;
	private Color color;
	private Random random;

	public Circle() {
		// TODO Auto-generated constructor stub
		random = new Random();
		x = 48;
		y = 50;
		r = 50;

		color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int moveToRight() {

		return x += random.nextInt(6) + 5;

	}

	public int moveToLeft() {
		return x -= random.nextInt(6) + 5;
	}

	public int moveToUp() {
		return y -= random.nextInt(6) + 5;
	}
	
	public int moveToDown() {
		return y += random.nextInt(6) + 5;
	}

/*	public int biggerCircle() {
		return r += random.nextInt(6) + 5;
	}

	public int smallerCircle() {
		return r -= random.nextInt(6) + 5;
	}*/

	public Color randomColor() {

		return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
	}

}
