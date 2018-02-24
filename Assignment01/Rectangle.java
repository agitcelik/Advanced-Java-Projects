import java.util.Random;

public class Rectangle extends Shape {//Beggining 
	Random rnd=new Random();//I use Random class to get random numbers from.
	private int width ;//Define width of Rectangle
	private int height ;//Define height of Rectangle
	
	public Rectangle(){
	 width = rnd.nextInt(50);//Generate int random width
	 height = rnd.nextInt(70);//Generate int random height
	}

	public double area() {//Overrided area method in Rectangle class which extends Shape class. 

		return width * height;//Calculating area
	}

	public String propertiesOfShape() {//Overrided propertiesOfShape method in Rectangle class which extends Shape class. 

		return "The Width is: " + width + " The height is: " + height;//Properties of Rectangle
	}

	public boolean isFullShape() {//Overrided isFullShape method in Rectangle class which extends Shape class. 	

		if (this.distanceToCoordinateCenter() > width + height) {//if distance to coordinate center is bigger than (width + height) of Rectangle 
			return true;										//return false.	
		 }	
		return false;//Otherwise, returnn true
	}

	public void DrawShape() {//Overrided DrawShape method in Circle class which extends Shape class. 		

		System.out.printf("%s\t%s\t%.2f\t\t%b\t\t%.2f\t\t%s\n", this.shapeId(), this.thisIsa(this), this.area(),
				this.isFullShape(), this.distanceToCoordinateCenter(), this.propertiesOfShape());
		// System.out.println("\n");

	}
}//End of the Circle class