import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public  class PrintAndCreate {//Beggining of the class.
	 
	  
	  static ArrayList<Shape> listAnything = new ArrayList<Shape>();/*I use Static ArrayList when the objects are created, 
	  they will be added to static  ArrayList, and due to static variables will not lost.*/
	  	
	  public static void createCircle(int n){//Creating Circle method
	  		for(int i =0; i<n; i++){
	  			listAnything.add(new Circle());//Each times added one Circle into the static ArrayList with for loop.
	  		}
	  	}//End of the method.
	  
		public static void createRectangle(int n){//Creating Rectangle method
			for(int i =0; i<n; i++){
				listAnything.add(new Rectangle());//Each times added one Rectangle into the static ArrayList with for loop.
			}
		}//End of the method.
		
		public static void createSquare(int n){//Creating Rectangle method
			for(int i =0; i<n; i++){
				listAnything.add(new Square());//Each times added one Square into the static ArrayList with for loop.
			}
		}//End of the method.
		
		public static void createRandom(int n) {//I use switch case into for loop to get random shapes.
			Random rnd5 = new Random();
			for (int i = 0; i < n; i++) {
				int x = rnd5.nextInt(3);//The reason why x is random is that there are three shapes that we should print out.
				switch (x) {//switch case in terms of random x
				case 0://if x=0 adding a Circle.
					listAnything.add(new Circle());//adding Circle
					break;//then terminate.
				case 1://if x=1 adding a Square.
					listAnything.add(new Square());//adding Square
					break;//then terminate.
				case 2://if x=2 adding a Rectangle.
					listAnything.add(new Rectangle());//adding Rectangle
					break;//then terminate.
				}//End of the switch-case.
			}//End of the for loop
		}//End of the method

	  public static void printAll(){//Printing allShapes method
		  int numberOfShapes=0;
			double totalArea=0;
		  System.out.printf("\nId\tType\t\tArea\t\tFullShape\tDistance\tProperties\n");
		for (Shape element : listAnything) {//Using for each to draw all of the shapes that are into our static ArrayList 
			element.DrawShape();//For printing all of them.
			numberOfShapes++;
			totalArea=totalArea+element.area();
		}
		  System.out.println("There are "+numberOfShapes+" shapes have been listed and the total area is: "+ totalArea);
	  }//End of the method

	  public static void printCircle(){//Printing Circle method
		  int numberOfShapes=0;
			double totalArea=0;
		System.out.printf("\n\nId\tType\t\tArea\t\tFullShape\tDistance\tProperties\n");
		for (Shape element : listAnything) {//Using for each to draw all of the Circle that are into our static ArrayList 
			if (element instanceof Circle) {/*if(element.getClass().getName().equalsIgnoreCase("Circle")){/*if the shapes ara Circle 
				Then print them */
				Circle circleItem = (Circle) element;//Cast the elements to Circle class.
				circleItem.DrawShape();//For printing Circles.
				numberOfShapes++;
				totalArea=totalArea+circleItem.area();
			}
		}
		  System.out.println("There are "+numberOfShapes+" circles have been listed and the total area is: "+ totalArea);
	  }//End of the method
	 
	  public static void printSquare(){//Printing Square method
		  int numberOfShapes=0;
			double totalArea=0;
		System.out.printf("\n\nId\tType\t\tArea\t\tFullShape\tDistance\tProperties\n");
		for (Shape element : listAnything) {
			if (element instanceof Square) {/*if(element.getClass().getName().equalsIgnoreCase("Square")){//if the shapes ara Circle 
				Then print them */
				Square squareItem = (Square) element;//Cast the elements to Square class.
				squareItem.DrawShape();//For printing Square.
				numberOfShapes++;	
				totalArea=totalArea+squareItem.area();	
			}
		}
		  System.out.println("There are "+numberOfShapes+" squares have been listed and the total area is: "+ totalArea);
	  }//End of the method
	  public static void printRectangle(){//Printing Rectangle method
		  int numberOfShapes=0;
			double totalArea=0;
		  System.out.printf("\n\nId\tType\t\tArea\t\tFullShape\tDistance\tProperties\n");
		for(Shape element : listAnything){//Using for each to draw all of the Rectangle that are into our static ArrayList 
			 
			if(element.getClass().getName().equals("Rectangle")){//	same as "if (element instanceof Rectangle) {" //if the shapes are Rectangle 
																	//Then print them */
				Rectangle rectItem= (Rectangle) element;//Cast the elements to Rectangle class.
				rectItem.DrawShape();//For printing Rectangle.	
				numberOfShapes++;	
				totalArea=totalArea+rectItem.area();				
			}
		}
        System.out.println("There are "+numberOfShapes+" rectangles have been listed and the total area is: "+ totalArea);
	  }//End of the method
	  static PrintAndCreate test = new PrintAndCreate();
	  private static String shp;//make it static and create it out of the method will be help us to repat it over and over.

	  public static final String[] shapes = { "Create Random Shapes", "Circles", "Rectangles", "Squares","Print All Shapes"
				  ,"Print Circles","Print Rectangles","Print Squares","Exit" };//Item names which are in the comboboxes.
	  
	  public  String comboBox(){
			  JFrame frame = new JFrame("Input Dialog Example 3");
			 shp = (String) JOptionPane.showInputDialog(frame,  "Select one of the options","The main menu"
						,JOptionPane.QUESTION_MESSAGE,  null,  shapes,  shapes[0]);
			  return creating();
		}
	
	public static String creating() {/*Beggining of the creatin method. This method is used to create shapes but not printing them until choosing
		printing shapes. First create them after choosing print option all of the shapes(which are into static ArrayList)will be printed out.
		  */
		/* JFrame frame = new JFrame("Input Dialog Example 3");
		 shp = (String) JOptionPane.showInputDialog(frame,  "Select one of the options","The main menu"
					,JOptionPane.QUESTION_MESSAGE,  null,  shapes,  shapes[0]);*/
		 
		JTextField txtOne = new JTextField();//To input how many shapes that we wanna create.
		  Object []a = {"Input the shape numbers \n",txtOne,}; //Creatinf textOne
		  
		 // JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
		//  int m= Integer.parseInt(txtOne.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createCircle(m);
		
		  if(shp.equalsIgnoreCase("Create Random Shapes")){//IfCreate Random Shapes opiton selected among others
			  JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
			   int  m= Integer.parseInt(txtOne.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createRandom(m);
			   JOptionPane.showMessageDialog(null, m+" random shapes have been created");//Showing us how many shapes are created dialog. 
			   		createRandom(m);//Create random shapes using "int m" that was inputted into TextField and coming from txtOne.getText
			   		printing();//After creating printing() passing to the print out part.
		  }//End of if statement.
		  
		  else if(shp.equalsIgnoreCase("circles")){//IfCreate circles  opiton selected among others
			  JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
			    int  m= Integer.parseInt(txtOne.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createCircle(m);
			   JOptionPane.showMessageDialog(null, m +" circles shapes have been created");//Showing us how many shapes are created dialog. 
			   		createCircle(m);//Create circle using "int m" that was inputted into TextField and coming from txtOne.getText
			   		printing();//After creating printing() passing to the print out part.
		  }//End of else if statement.
		  
		 else if(shp.equalsIgnoreCase("Rectangles")){//IfCreate Rectangles  opiton selected among others
			 JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
			 int m= Integer.parseInt(txtOne.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createRectangle(m);
			   JOptionPane.showMessageDialog(null, m +" rectangles shapes have been created");//Showing us how many shapes are created dialog.
			   		createRectangle(m);//Create Rectangles using "int m" that was inputted into TextField and coming from txtOne.getText
			   		printing();//After creating printing() passing to the print out part.
		  }//End of else if statement.
		  
		 else if(shp.equalsIgnoreCase("Squares")){//IfCreate Squares  opiton selected among others
			 JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
			 int  m= Integer.parseInt(txtOne.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createSquare(m);
			   JOptionPane.showMessageDialog(null, m +" squares shapes have been created");//Showing us how many shapes are created dialog.
			   		createSquare(m);//Create Squares using "int m" that was inputted into TextField and coming from txtOne.getText
			   		printing();//After creating printing() passing to the print out part.
			  }//End of else else if statement.
		 else if(shp==null){
			 System.exit(0);
		 }
		
			else if(shp.equalsIgnoreCase("exit")){
			  	JOptionPane.showMessageDialog(null, "Exit!",null, JOptionPane.WARNING_MESSAGE);//if exit option is selected.Program end up with dialog
			}
			else{
		  System.exit(0);
			}
		return "";
	}//End of the creating method
	
	public static void printing(){/*Beggining of the printing method. This method is used to print shapes but not creating them until choosing
		creating again it will give us message to add shapes or remove them. 
		choosing print option all of the shapes(which are into static ArrayList)will be printed out.*/
		JFrame frame = new JFrame("Input Dialog Example 3");
		String shp = (String) JOptionPane.showInputDialog(frame,  "Select one of the options","The main menu", 
				  JOptionPane.QUESTION_MESSAGE,  null,  shapes,  shapes[0]);/*Casting string means that we will use these items 
				  	as a String into if and else if blocsk, when we are checking them.													
				  */
		 	
		if(shp.equalsIgnoreCase("Print All Shapes")){//If print all shapes is selected 
			printAll();//printAll() is calling and prints out all of the shapes that we have inputted
			printing();//Then, printing method will be start again (Like a recursive functions.)
		  }//End of if statament
		else if(shp.equalsIgnoreCase("Print Circles")){//If Print Circles shapes is selected 
			printCircle();//printCircle() is calling and prints out all of the shapes that we have inputted
			printing();//Then, printing method will be start again (Like a recursive functions.)
		}//End of else if statament
		else if(shp.equalsIgnoreCase("print rectangles")){//If Print Circles shapes is selected 
			printRectangle();//	printRectangle() is calling and prints out all of the shapes that we have inputted
			printing();//Then, printing method will be start again (Like a recursive functions.)
		}//End of else if statament
		else if(shp.equalsIgnoreCase("Print Squares")){//If Print Circles shapes is selected 
			printSquare();//printSquare() is calling and prints out all of the shapes that we have inputted
			printing();//Then, printing method will be start again (Like a recursive functions.)
		}//End of else if statament
		else if(shp.equalsIgnoreCase("exit")){
			System.exit(0);
		}//End of else if statament
		else{//Other conditions which are creates mehthod is selceted again it will show message dialog and want us to remove them or not
			
			int msg=  JOptionPane.showConfirmDialog(null,"There are some shapes exist in the list Do you wanna delete them?", 
					"Create shapes",JOptionPane.OK_OPTION);//Message dialog like this will demonstrate to us
			  if(msg==JOptionPane.YES_OPTION){//If yes option selected. 	 			
				  listAnything.clear();//It will remove all of the object into the our static ArrayList			
				 
				  
//REPEAT creating() methods codes AGAÝN BECAUSE I TRIED NOT TO REPEAT BUT IT DIDNT WORK OTHERWISE.				  
				  JTextField txtOne = new JTextField();
				  Object []a = {"Input the shape numbers \n",txtOne,}; 
//There was no choice not to repeat this part again so I had to write again even if I try to make it shorter.				 
				  if(shp.equalsIgnoreCase("Create Random Shapes")){

					  JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);
					   int  m= Integer.parseInt(txtOne.getText());
					   JOptionPane.showMessageDialog(null, m+" random shapes have been created");
					   		createRandom(m);
					   		printing();
				  }			  
				  else if(shp.equalsIgnoreCase("circles")){
					  JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);
					    int  m= Integer.parseInt(txtOne.getText());
					   JOptionPane.showMessageDialog(null, m +" circles shapes have been created");
					   		createCircle(m);
					   		printing();					  
				  }
				 else if(shp.equalsIgnoreCase("Rectangles")){
					 JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);
					 int m= Integer.parseInt(txtOne.getText());
					   JOptionPane.showMessageDialog(null, m +" rectangles shapes have been created");
					   		createRectangle(m);
					   		printing();
				  }
				 else if(shp.equalsIgnoreCase("Squares")){
					 JOptionPane.showConfirmDialog(null,a , "Input",JOptionPane.OK_OPTION);
					 int  m= Integer.parseInt(txtOne.getText());
					   JOptionPane.showMessageDialog(null, m +" squares shapes have been created");
					   		createSquare(m);
					   		printing();
				 }
	//END OF THE REPEATÝNG creating() METHOD.I wrote creating() there but it did not work in that ways.	  
			  }//END OF THE IF STATEMENT	
			  
			  else//Otherwise,
				  test.comboBox();/*In the other words, no option is selected. It will add another objects(Shapes) 
							   into the static ArrayList*/	 			
		}//End of else		
	}//End  of the printing method.

}//End of the class.
