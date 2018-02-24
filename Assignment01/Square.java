import java.util.Random;

public class Square extends Shape {
	Random rnd = new Random();//I use Random class to get random numbers from.
	
	private int size;//Define size of Square
	
	public Square(){

		  size = rnd.nextInt(100);//Generate int random size
	}
	
	public double area() {//Overrided area method in Square class which extends Shape class. 

		return size * size;//Calculating area
	}

	public String propertiesOfShape() {//Overrided propertiesOfShape method in Square class which extends Shape class. 

		return "The size of this Square is: " + size;//Properties of Square
	}

	public boolean isFullShape() {//Overrided isFullShape method in Square class which extends Shape class. 	
		try{//To avoid NullPointerException I use try catch block.
			if (this.distanceToCoordinateCenter() > size) {//if distance to coordinate center is bigger than size of Square 
				return true;								//Then return true
			}

		} catch (Exception e) {
			System.out.println(" ");//Empty message shows into catch statement.
		}
		return false;//otherwise, return false
	}

	public void DrawShape() {//Overrided DrawShape method in Circle class which extends Shape class. 		
		System.out.printf("%s\t%s\t\t%.2f\t\t%b\t\t%.2f\t\t%s\n", this.shapeId(), this.thisIsa(this), this.area(),
				this.isFullShape(), this.distanceToCoordinateCenter(), this.propertiesOfShape());
		// System.out.println("\n");
	}

}//End of the Square class
