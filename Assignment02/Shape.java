
import java.awt.Color;
import java.util.Random;//To generate random variables, Random class must be importted.

public abstract class Shape implements IShape {//Beginning of the Shape class

	Random rnd2 = new Random();//I use Random class to get random numbers from.
	private int id = rnd2.nextInt(1000)+1000;//Generate int random id to use it into shapeId method.
	protected CartesianPlane loc;
	private Color color;
	
	public Color getRandomColor() {
		return new Color(rnd2.nextInt(255), rnd2.nextInt(255), rnd2.nextInt(255));
	}
	
	public Shape() {//loc (is defined into constructor) will be used into distanceToCoordinateCenter() method.
		loc = new CartesianPlane();
		color= getRandomColor();//new Color(rnd2.nextInt(255), rnd2.nextInt(255), rnd2.nextInt(255));
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public double area() {//area method will be overrided into sub-classes(Circle,Rectangle,Square)
		return 0;//This data will change after overriding into sub-classes
	}

	public double distanceToCoordinateCenter() {//distanceToCoordinateCenter method will be overrided into sub-classes(Circle,Rectangle,Square)
		return Math.sqrt((loc.getX() * loc.getX()) + (loc.getY() * loc.getY()));//Calculating distance between orjin to coordiante system.
	}

	public boolean isFullShape() {//isFullShape method will be overrided into sub-classes(Circle,Rectangle,Square)
		return false;//This data will change after overriding into sub-classes
	}

	public String thisIsa(IShape shape) {/*To avoid using that thisIsa method again and again.
		I write all of the properties into that main Shape class.*/
		// if(shape.getClass().getName()==Character.toString((getClass().getName().charAt(0))))
		return shape.getClass().getName();
	}

	public String propertiesOfShape() {//propertiesOfShape method will be overrided into sub-classes(Circle,Rectangle,Square)
		return null;//This data will change after overriding into sub-classes
	}

	public String shapeId() {/*To avoid using that shapeId method again and again.
		I write all of the properties into that main Shape class.*/
		return String.valueOf(getClass().getName().charAt(0)) + id; // getClass().getName().charAt...
	}

	public void DrawShape() {/*DrawShape that I added to our IShape interface class will be aslo overrided 
							into sub-classes(Circle,Rectangle,Square)*/
		System.out.printf("Genaral shape");//This data will change after overriding into sub-classes
	}
}//End of the Shape class.