import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;


public class ImageFrame extends JPanel {
//Begginin of the ImageFrame class
	/*
	*This ImageFrame class extends JPanel class to use GUI methods and GUI concept
		There are "has a"(Abstract classes)
	*/
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public static ImageFrame imageTab;//create object of  ImageFrame class
    	

	public ImageFrame(){//Consturctor of ImageFrame class
		setBackground(new Color(201,212,229));//This is color of backgorund of ImageFrame,
		
    }// end of constructor
  
   

	 public void drawCircle(Graphics g){//Draw Circle method
 
		 for (Shape shape : ShapeFrame.listAnything){//Each time shape object check elements of my ArrayList
	            int x = shape.loc.getX();//To get x coordinate
	            int y=shape.loc.getY();//To get y coordinate
	            g.setColor(shape.getColor());//To paint shapes
	            if (shape.thisIsa(shape).equals("Circle")){/*If shape whose is in ArraList is Circle
					this method only draw Rectangle*/
	            	int r = (int) ((Circle) shape).getR();//To get width of Circle
					g.drawOval(x, y, r, r);//drawing Circles
					g.fillOval(x, y, r, r);//painting Circles
					
	            }
	        }
	      
	 }
	 public void drawRectangle(Graphics g){//Draw Rectangle method
	
		 for(Shape shape : ShapeFrame.listAnything){//Each time shape object check elements of my ArrayList
		 int x = shape.loc.getX(); //To get x coordinate
		 int y=shape.loc.getY();//To get y coordinate
		 g.setColor(shape.getColor());//To paint shapes
		 if(shape.thisIsa(shape).equals("Rectangle")){/*If shape whose is in ArraList is Rectangle
				this method only draw Rectangle*/
			int w = ((Rectangle) shape).getWidth();//To get width of Rectangle
			int h= ((Rectangle) shape).getHeight();//To get height of Rectangle
			g.drawRect(x, y, w, h);//drawing Rectangles
			g.fillRect(x, y, w, h);//painting Rectangles
		 }
		 }
			
	 }//End of method
	 public void drawSquare(Graphics g){ //Draw Square method
		  
		 for(Shape shape : ShapeFrame.listAnything){//Each time shape object check elements of my ArrayList
			 int x = shape.loc.getX(); //To get x coordinate
			 int y=shape.loc.getY();//To get y coordinate
			 g.setColor(shape.getColor());//To paint shapes
			 	if(shape.thisIsa(shape).equals("Square")){/*If shape whose is in ArraList is Square
			 						this method only draw Squares*/
			 		int s= ((Square) shape).getSize();//To get size of square
			 		g.drawRect(x, y, s,s);//drawing squares
			 		g.fillRect(x, y, s, s);//painting squares
			 	}
		 }
	 }//End of method
	 	 
	
	 
	public void paint(Graphics g) {//Beginning of the paint method with using Graphics class variable.
	//	Random random = new Random();
		/*
		 * Each time Shape object(shape) will check our static Array list to get object of shapes from there 
		 * And after checking nested switch-case ,that is using thisIsa(shape)[shape.getClass().getName();], it will display its own Id's shape. 
		 * 
		 */
		for (Shape shape : ShapeFrame.listAnything) {
			//int x = shape.loc.getX(), y = shape.loc.getY();
			g.setColor(shape.getColor());
			switch (shape.thisIsa(shape)) {

			case "Rectangle"://if it is Rectangle 
			
				if(ShapeFrame.selectedType=="ShowAll"||ShapeFrame.selectedType=="Rectangle")//To display only rectangle also used in actionPerformed of ShapeFrame
				{
					drawRectangle(g);//Draw rectangle.
				}
				break;

			case "Circle"://if it is Circle 
			
			
				if(ShapeFrame.selectedType=="ShowAll"||ShapeFrame.selectedType=="Circle")//To display only rectangle also used in actionPerformed of ShapeFrame
				{
					drawCircle(g);//Draw Circle
				}
				break;

			case "Square"://if it is Square 
				
				if(ShapeFrame.selectedType=="ShowAll"||ShapeFrame.selectedType=="Square")//To display only rectangle also used in actionPerformed of ShapeFrame
				{
					drawSquare(g);//Draw Square
				}
			
				break;
			default:
				if(ShapeFrame.selectedType=="ShowAllOfThem"){//Else show all of them.
				drawCircle(g);
				drawSquare(g);
				drawRectangle(g);
				}
				break;
				
			}//End of nested switch-case block
		
		}//End of for loop.
	}//End of paint method.
	 
	  public static ImageFrame getImageTab() {//To get imageTab information in order to be used in another classes due to private instead of public.
			return imageTab;
		}


		public void setImageTab(ImageFrame imageTab) {//To set imageTab information in order to be used in another classes due to private instead of public.
			this.imageTab = imageTab;
		}


}//End of the ImageFrame class.
