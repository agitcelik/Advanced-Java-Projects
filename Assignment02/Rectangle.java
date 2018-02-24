import java.awt.Color;
import java.util.Random;

public class Rectangle extends Shape {//Beggining 
	Random rnd=new Random();//I use Random class to get random numbers from.
	private int width ;//Define width of Rectangle
	private int height ;//Define height of Rectangle
	
	public Rectangle(){
	 width = rnd.nextInt(170);//Generate int random width
	 height = rnd.nextInt(120);//Generate int random height
	//	color = new Color(rnd2.nextInt(255), rnd2.nextInt(255), rnd2.nextInt(255));
	}

	public void DrawShape() {//Overrided DrawShape method in Circle class which extends Shape class. 		
		//properties will take all of the informations from classes and object.
			String [] properties= {  this.shapeId(), this.thisIsa(this), Double.toString(this.area()),
					String.valueOf(this.isFullShape()), Double.toString(this.distanceToCoordinateCenter()), this.propertiesOfShape()};
			// System.out.println("\n");
			ShapeFrame.getModel().addRow(properties);
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



public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}
}//End of the Circle class