import java.awt.Window;
import java.util.Random;

public class Circle extends Shape {
	Random  rnd=new Random();//I use Random class to get random numbers from.
	private double r;//Define radius of Circle
	
	
	public void DrawShape() {//Overrided DrawShape method in Circle class which extends Shape class. 		
		//properties will take all of the informations from classes and object.
			String [] properties= {  this.shapeId(), this.thisIsa(this), Double.toString(this.area()),
					String.valueOf(this.isFullShape()), Double.toString(this.distanceToCoordinateCenter()), this.propertiesOfShape()};
			// System.out.println("\n");
			ShapeFrame.getModel().addRow(properties);
		}
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}


	double pi = 3.14;
	
	public Circle(){
		super();
		 r=rnd.nextInt(180)+1;//Generate int random radius
	}

 public  double area(){//Overrided area method in Circle class which extends Shape class. 
		return pi*r*r;//Calculating area
	}

	public String propertiesOfShape() {//Overrided propertiesOfShape method in Circle class which extends Shape class. 
		return "The radius of this Cirlce is: "+r;//Properties of Circle
	}
	
	public boolean isFullShape() {//Overrided isFullShape method in Circle class which extends Shape class. 	
	try{//To avoid NullPointerException I use try catch block.
	 if(this.distanceToCoordinateCenter()>r){//if distance to coordinate center is bigger than radius of circle 
		 return true;						//return false.	
	 }	
	}catch(Exception e){
		System.out.println(" ");//Empty message shows into catch statement.
	} 
	return false;//otherwise, return true
	}

	

}//End of the Circle class
