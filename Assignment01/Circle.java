import java.awt.Window;
import java.util.Random;

public class Circle extends Shape {
	Random  rnd=new Random();//I use Random class to get random numbers from.
	private double r;//Define radius of Circle
	double pi = 3.14;
	
	public Circle(){
		super();
		 r=rnd.nextInt(50);//Generate int random radius
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

	
	public void DrawShape(){//Overrided DrawShape method in Circle class which extends Shape class. 		
		System.out.printf("%s\t%s\t\t%.2f\t\t%b\t\t%.2f\t\t%s\n",
				this.shapeId(),this.thisIsa(this),this.area(),this.isFullShape(),this.distanceToCoordinateCenter(),this.propertiesOfShape());
		//System.out.println("\n");
	}
}//End of the Circle class
