
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ShapeFrame extends JPanel implements ActionListener{/*
*This ShapeFrame class extends JPanel class to use GUI methods and implements ActionListener class to make program execute with GUI concept
	There are "has a"(Abstract classes) relation and "is a"(Interface classes) relation
*/
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  private JTable table;
	    private JMenuBar menuBar;
	    private JMenu menuCreate, menuDisplay, menuHelp;
	    private JMenuItem itemRandom, itemCircle, itemSquare, itemRectangle, itemExit, itemDisplayAll, itemDisplayCircle
	            ,itemDisplaySquare, itemDisplayRectangle, itemHelp, itemVersion, itemAuthor;
	    public static JLabel informationText;
	    public static String drawShape;
	    
	    public static DefaultTableModel model;
	
	    public static String []  header(){
	        String [] header={"ID","Type","Aree","Full Shape","Distance","Properties"};
	        return header;
	   }
	    public ShapeFrame(){
	        setLayout(new BorderLayout());
	       
	        setSize(1000,1000);
	        setVisible(true);
	        
	      

	        table = new JTable();
	        menu();
	        model = new DefaultTableModel(0,6);
	        table.setModel(getModel());
	        model.setColumnIdentifiers(header());
	        //tableModel.setColumnIdentifiers(columnNames);
	        //model.addRow(header());
	       
	        /*
	         * I adjust size of each headers 
	         * with  .getColumnModel().getColumn().setPreferredWidth();
	         * to make all of information visible and 	writeable
	         */
	        table.getColumnModel().getColumn(0).setPreferredWidth(20);
	        table.getColumnModel().getColumn(1).setPreferredWidth(20);
	        table.getColumnModel().getColumn(2).setPreferredWidth(20);
	        table.getColumnModel().getColumn(3).setPreferredWidth(20);
	        table.getColumnModel().getColumn(4).setPreferredWidth(20);
	        table.getColumnModel().getColumn(5).setPreferredWidth(80);
	        table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
	        table.setEnabled(false);
	        table.setShowGrid(true);
	        table.setGridColor(Color.black);

	     
	        table.setCellSelectionEnabled(false);
	        table.setRowSelectionAllowed(false);
	        table.setColumnSelectionAllowed(false);
	        
	        
	        table.setPreferredScrollableViewportSize(new Dimension(790,500));
	        table.setFillsViewportHeight(true);
	     
	        JScrollPane js=new JScrollPane(table);//Create JScrollPane to use it
	        js.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);//Add scrollable to vertical always
	      
	        js.setHorizontalScrollBarPolicy(
	        		   JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//Add scrollable to horizontal always
	        js.getColorModel();
	        js.setVisible(true); //To make scrollable visible
	       
	        add(js);//add scrollable to the frame.
	      
	        informationText = new JLabel("Information: ");//This is my label to get information about areas of shapes
	      
	        add(informationText, BorderLayout.SOUTH);//Add informationText to the south with BorderLayout
     
	    }//End of the consturctor
	    

	  public  void menu(){//Those are menubars,menuitems and menus 
		
		menuBar= new JMenuBar();//First we have to create JMenuBar object to add into menus and menuitems.
		
		menuCreate= new JMenu("Create Shapes");//Creating menuCreate with Create Shapes title
		
		itemRandom= new JMenuItem("Random Shapes");//Adding itemRandom to Create Shapes Menu
		itemRandom.addActionListener(this);//To use it in ActionListener method
		menuCreate.add(itemRandom);//Add itemRandom to menuCreate
		
		
		itemRectangle= new JMenuItem("Rectangle");//Adding itemRectangle to Create Shapes Menu
		itemRectangle.addActionListener(this);//To use it in ActionListener method
		menuCreate.add(itemRectangle);//Add itemRectangle to menuCreate
		

		itemCircle= new JMenuItem("Circle");//Adding itemCircle to Create Shapes Menu
		itemCircle.addActionListener(this);//To use it in ActionListener method
		menuCreate.add(itemCircle);//Add itemCircle to menuCreate
		
		itemSquare = new JMenuItem("Square");//Adding itemSquare to Create Shapes Menu
		itemSquare.addActionListener(this);//To use it in ActionListener method
		menuCreate.add(itemSquare);//Add itemSquare to menuCreate
		
		itemExit = new JMenuItem("Exit");//Adding itemExit to Create Shapes Menu
		itemExit.addActionListener(this);//To use it in ActionListener method
		menuCreate.add(itemExit);//Add itemExit to menuCreate
		
		menuDisplay= new JMenu("Display");//Creating menuDisplay with Display title
		
		itemDisplayAll= new JMenuItem("Display All");//Adding itemDisplayAll to the Display menu
		itemDisplayAll.addActionListener(this);//To use it in ActionListener method
		menuDisplay.add(itemDisplayAll);//Add itemDisplayAll to menuDisplay
		
		
		itemDisplayRectangle= new JMenuItem("Rectangle");//Adding itemDisplayAll to the Display menu
		itemDisplayRectangle.addActionListener(this);//To use it in ActionListener method
		menuDisplay.add(itemDisplayRectangle);//Add itemDisplayRectangle to menuDisplay
		
		itemDisplayCircle=new JMenuItem("Circle");//Adding itemDisplayCircle to the Display menu
		itemDisplayCircle.addActionListener(this);//To use it in ActionListener method
		menuDisplay.add(itemDisplayCircle);
		
		itemDisplaySquare=new JMenuItem("Square");//Adding itemDisplaySquare to the Display menu
		itemDisplaySquare.addActionListener(this);//To use it in ActionListener method
		menuDisplay.add(itemDisplaySquare);//Add itemDisplaySquare to menuDisplay
		
		menuHelp= new JMenu("Help");//Creating menuHelp with Help title
		
		itemHelp = new JMenuItem("Help");//Adding itemHelp to the Help menu
		itemHelp.addActionListener(this);//To use it in ActionListener method
		menuHelp.add(itemHelp);//Add itemHelp to menuHelp

		itemAuthor = new JMenuItem("Author");//Adding itemAuthor to the Help menu
		itemAuthor.addActionListener(this);//To use it in ActionListener method
		menuHelp.add(itemAuthor);//Add itemAuthor to menuHelp

		itemVersion = new JMenuItem("Verision");//Adding itemVersion to the Help menu
		itemVersion.addActionListener(this);//To use it in ActionListener method
		menuHelp.add(itemVersion);//Add itemVersion to menuHelp
		
		
		menuBar.add(menuCreate);//Adding menuCreate to the menuBar
		menuBar.add(menuDisplay);//Adding menuDisplay to the menuBar
		menuBar.add(menuHelp);//Adding menuHelp to the menuBar
	     add(menuBar, BorderLayout.NORTH);//Add menuBar to the North positon with BorderLayout
	     add(table, BorderLayout.CENTER);//Add table to the CENTER positon with BorderLayout
   }//End of the menu.



	public void actionPerformed(ActionEvent e) {//Beggining of the actionPerformed method.
		
	JTextField informationText = new JTextField(); 
	Object []a = {"Input the shape numbers \n",informationText,}; 
	
		if (e.getSource().equals(itemRectangle)) {//if itemRectangle is  selected create method will execute
			selectedType="ShowAll";//Refer to the ImageFrame class variable 
			if (listAnything.isEmpty()) {//if list is empty it will create shapes.
				JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
				int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createRectangle(m);
				JOptionPane.showMessageDialog(null, m + " Rectangles have been created");//Showing us how many shapes are created dialog. 
				createRectangle(m);//Create Rectangles using "int m" that was inputted into TextField and coming from txtOne.getText
			} else {//If list is not empty warning message will pop up to make us decide wheter we will delete shapes or not
				int msg = JOptionPane.showConfirmDialog(null,
						"There are some shapes exist in the list Do you wanna delete them?", "Create shapes",
						JOptionPane.OK_OPTION);// Message dialog like this will
												// demonstrate to us
				if (msg == JOptionPane.YES_OPTION) {// If yes option selected.
					// It will remove all of the object into the our static
					// ArrayList
					JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
					int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createRectangle(m);
					JOptionPane.showMessageDialog(null, m + " Rectangles have been created");//Showing us how many shapes are created dialog. 
					clearAll();//After yes option is selected clearAll method will remove all of the row elements in the tables.
					listAnything.clear();//Also our list will be cleared to make a area to create new shapes
					createRectangle(m);//Create Rectangles using "int m" that was inputted into TextField and coming from txtOne.getText
				} else {//If no option is selected
					JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
					int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createRectangle(m);
					JOptionPane.showMessageDialog(null, m + " Rectangles have been created");//Showing us how many shapes are created dialog. 
					createRectangle(m);//Create Rectangles using "int m" that was inputted into TextField and coming from txtOne.getText
				}
			}

		}//end of itemRectangle.

		else if (e.getSource().equals(itemCircle)) {//if itemCircle is  selected create method will execute
			selectedType="ShowAll";//Refer to the ImageFrame class variable 
			if (listAnything.isEmpty()) {//if list is empty it will create shapes.
				JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
				int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createCircle(m);
				JOptionPane.showMessageDialog(null, m + " Circle have been created");//Showing us how many shapes are created dialog. 
				createCircle(m);//Create Circles using "int m" that was inputted into TextField and coming from txtOne.getText
			} else {//If list is not empty warning message will pop up to make us decide wheter we will delete shapes or not
				int msg = JOptionPane.showConfirmDialog(null,
						"There are some shapes exist in the list Do you wanna delete them?", "Create shapes",
						JOptionPane.OK_OPTION);// Message dialog like this will
												// demonstrate to us
				if (msg == JOptionPane.YES_OPTION) {// If yes option selected.
					// It will remove all of the object into the our static
					// ArrayList
					JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
					int m = Integer.parseInt(informationText.getText());//Create Rectangles using "int m" that was inputted into TextField and coming from txtOne.getText
					JOptionPane.showMessageDialog(null, m + " Circles have been created");//Showing us how many shapes are created dialog. 
					clearAll();//After yes option is selected clearAll method will remove all of the row elements in the tables.
					listAnything.clear();//Also our list will be cleared to make a area to create new shapes
					createCircle(m);//Create Circles using "int m" that was inputted into TextField and coming from txtOne.getText
				} else {//If no option is selected
					JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
					int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createCircle(m);
					JOptionPane.showMessageDialog(null, m + " Circles have been created");//Showing us how many shapes are created dialog. 
					createCircle(m);//Create Circles using "int m" that was inputted into TextField and coming from txtOne.getText
				}
			}
		}

		else if (e.getSource().equals(itemSquare)) {//if itemSquare is  selected create method will execute
			selectedType="ShowAll";//Refer to the ImageFrame class variable 
			if (listAnything.isEmpty()) {//if list is empty it will create shapes.
				JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
				int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createSquare(m);
				JOptionPane.showMessageDialog(null, m + " Squares have been created");//Showing us how many shapes are created dialog. 
				createSquare(m);
			} else {//If list is not empty warning message will pop up to make us decide wheter we will delete shapes or not
				int msg = JOptionPane.showConfirmDialog(null,
						"There are some shapes exist in the list Do you wanna delete them?", "Create shapes",
						JOptionPane.OK_OPTION);// Message dialog like this will
												// demonstrate to us
				if (msg == JOptionPane.YES_OPTION) {// If yes option selected.
					// It will remove all of the object into the our static
					// ArrayList
					JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
					int m = Integer.parseInt(informationText.getText());//Create Rectangles using "int m" that was inputted into TextField and coming from txtOne.getText
					JOptionPane.showMessageDialog(null, m + " Squares have been created");//Showing us how many shapes are created dialog. 
					clearAll();//After yes option is selected clearAll method will remove all of the row elements in the tables.
					listAnything.clear();//Also our list will be cleared to make a area to create new shapes
					createSquare(m);
				} else {//If no option is selected
					JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
					int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createSquare(m);
					JOptionPane.showMessageDialog(null, m + " Squares have been created");//Showing us how many shapes are created dialog. 
					createSquare(m);//Create Squares using "int m" that was inputted into TextField and coming from txtOne.getText
				}
			}

		}

		else if (e.getSource().equals(itemRandom)) {
			selectedType="ShowAll";
			if (listAnything.isEmpty()) {
				JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
				int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createRandom(m);
				JOptionPane.showMessageDialog(null, m + " random shapes have been created");//Showing us how many shapes are created dialog. 
				createRandom(m);//Create Random shapes using "int m" that was inputted into TextField and coming from txtOne.getText
			} else {//If list is not empty warning message will pop up to make us decide wheter we will delete shapes or not
				int msg = JOptionPane.showConfirmDialog(null,
						"There are some shapes exist in the list Do you wanna delete them?", "Create shapes",
						JOptionPane.OK_OPTION);// Message dialog like this will
												// demonstrate to us
				if (msg == JOptionPane.YES_OPTION) {// If yes option selected.
					// It will remove all of the object into the our static
					// ArrayList
					JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
					int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createRandom(m);
					JOptionPane.showMessageDialog(null, m + " random shapes have been created");//Showing us how many shapes are created dialog. 
					clearAll();//After yes option is selected clearAll method will remove all of the row elements in the tables.
					listAnything.clear();//Also our list will be cleared to make a area to create new shapes
					createRandom(m);//Create Random shapes using "int m" that was inputted into TextField and coming from txtOne.getText
				} else {//If no option is selected
					JOptionPane.showConfirmDialog(null, a, "Input", JOptionPane.OK_OPTION);//Input the shape numbers that you wanna create.
					int m = Integer.parseInt(informationText.getText());//"int m" helps methods to know how many shapes to crates for them e.g.createRandom(m);
					JOptionPane.showMessageDialog(null, m + " random shapes have been created");//Showing us how many shapes are created dialog. 
					createRandom(m);//Create Random shapes using "int m" that was inputted into TextField and coming from txtOne.getText
				}
			}

		}

		else if (e.getSource().equals(itemDisplayRectangle)) {
		/*
		 * with using selecedType , when display shapes is selected, it will make other shapes not to be drawable except selected type.
		 */
			selectedType="Rectangle";
			clearAll();
			//listAnything.clear();
			//ImageFrame.getImageTab().removeAll();
			
			selectedType="Rectangle";
			displayRectangle(listAnything);//Display only Rectangles whose are in listAnything.
					
		}
		else if (e.getSource().equals(itemDisplaySquare)) {//Display only Squares whose are in listAnything.
			clearAll();
			
			selectedType="Square";
			displaySquare(listAnything);
			
			
		} 
		else if (e.getSource().equals(itemDisplayCircle)) {//Display only Circles whose are in listAnything.
			clearAll();
			
			selectedType="Circle";
			displayCircle(listAnything);
				
		
		} 
		else if (e.getSource().equals(itemDisplayAll)) {//Display all Shapes whose are in listAnything.
			clearAll();
			if (!listAnything.isEmpty()) {//if list is NOT empty it will display  all of the shapes.
				selectedType="ShowAll";

			displayAll(listAnything);
			
			}
			else{//if it it EMPTY it will it will clear all rows after that display  all of the shapes.
				selectedType="ShowAll";
				
				clearAll();
				displayAll(listAnything);
			}
		}
		else if (e.getSource().equals(itemExit)) {//if itemExit message opitons will pop up
			int message =JOptionPane.showConfirmDialog(null, "Do you really want to exit...", "Exit Program", JOptionPane.OK_CANCEL_OPTION);
			if (message == JOptionPane.YES_OPTION)//ýf yes option is seleceted 
			System.exit(0);//then System.exit(0); will execute and program will terminate
			else{//if no option will selected
				JOptionPane.showMessageDialog(null, "You can still execute program... ");//This message will pop up then program will keep working.
			}
			
		}
		else if(e.getSource().equals(itemAuthor)){//if itemAuthor is selected 
			JOptionPane.showConfirmDialog(null, "Agit ÇELÝK \n 114200030", "Author", JOptionPane.OK_CANCEL_OPTION);//information about author message will occur
		}
		else if(e.getSource().equals(itemVersion)){//if itemVersion is selected 
			JOptionPane.showConfirmDialog(null, "2016 Eclipse Mars", "Version", JOptionPane.OK_CANCEL_OPTION);// information about verison message will occur
		}
		else if(e.getSource().equals(itemHelp)){//if itemHelp is selected
			JOptionPane.showConfirmDialog(null, "You can call us later to fing help...", "Help", JOptionPane.OK_CANCEL_OPTION);// information about help message will occur
		}
	}

	
	public static void createSquare(int n){//Creating Square method
			for(int i =0; i<n; i++){
			Square square= new Square();//Creating Square object
			listAnything.add(square);//Each times added one Square into the static ArrayList with for loop.
			square.DrawShape();/*this method is in each of shapes seperately and Square object get infotmations about shapes 
			*from this method.
			*/	
		}
			informationText.setText("Squares has been created.");//Label will occur when dispaly Rectangle is selected.
	}//End of the method.
	
	public static void createRectangle(int n){//Creating Rectangle method
			for(int i =0; i<n; i++){
				Rectangle rectangle = new Rectangle();//Creating Rectangle object
				listAnything.add(rectangle);//Each times added one Square into the static ArrayList with for loop.
				rectangle.DrawShape();	/*this method is in each of shapes seperately and Rectangle object get infotmations about shapes 
				*from this method.
				*/			
			}	
			informationText.setText("Rectangles have been created.");//Label will occur when dispaly Rectangle is selected.
	}//End of the method.

	
	  public static void createCircle(int n){//Creating Circle method
	  	
	  		for(int i =0; i<n; i++){
	  			Circle circle = new Circle();//Creating Circle object
	  			listAnything.add(circle);
	  			circle.DrawShape();/*this method is in each of Circle seperately and Rectangle object get infotmations about shapes 
				*from this method.
				*/	
	  		}
	  		informationText.setText("Circles have been created.");//Label will occur when dispaly Rectangle is selected.
	  	}//End of the method.

		public static void createRandom(int n) {//I use switch case into for loop to get random shapes.
			Random rnd5 = new Random();
			for (int i = 0; i < n; i++) {
				int x = rnd5.nextInt(3);//The reason why x is random is that there are three shapes that we should print out.
				switch (x) {//switch case in terms of random x
				case 0://if x=0 adding a Circle.
					Circle circle = new Circle();
					listAnything.add(circle);//adding Circle
					circle.DrawShape();
					break;//then terminate.
				case 1://if x=1 adding a Square.
					Square square=new Square();
					listAnything.add(square);//adding Square
					square.DrawShape();
					break;//then terminate.
				case 2://if x=2 adding a Rectangle.
					Rectangle rectangle = new Rectangle();
					listAnything.add(rectangle);//adding Rectangle
					rectangle.DrawShape();
					break;//then terminate.
				}//End of the switch-case.
			}//End of the for loop
			informationText.setText("Random shapes have been created.");//Label will occur when dispaly Rectangle is selected.
		}//End of the method
	
		
	public static void clearAll(){//Clear all of rows from table.
		if (getModel().getRowCount() > 0) {//first row numbers must be greater than 0
			for (int i = getModel().getRowCount() - 1; i >=0; i--) {//it will start from row numbers to the  0
		    	getModel().removeRow(i);
		    }
		}
	}
	
	public static void displayAll(ArrayList<Shape> array){//Beginning of the displayAll method
		int numberOfShapes = 0;//initialize numberOfShapes with 0 to make it uptade
		double totalArea = 0;//initialize totalArea with 0 to make it uptade
		for(int i=0; i<array.size(); i++){
			//properties will take all of the informations from listAnything.
		    String [] properties= { listAnything.get(i).shapeId(), listAnything.get(i).thisIsa(listAnything.get(i)), 
					Double.toString(listAnything.get(i).area()),
					String.valueOf(listAnything.get(i).isFullShape()),
					Double.toString(listAnything.get(i).distanceToCoordinateCenter()), listAnything.get(i).propertiesOfShape()};
			
			getModel().addRow(properties);//Add all of the informations ,whose are got by arraylist, to the each rows one by one.
		numberOfShapes++;//Count how many shapes are inputted.
		totalArea = totalArea + array.get(i).area();//Calculate how much area of shapes is
		}
			informationText.setText("There are " + numberOfShapes + " shapes have been created and the area of all shapes are: "
			+ totalArea);//Label will occur when dispaly Rectangle is selected.
	}//End  of the displayAll method.
	
	public static void displayRectangle(ArrayList<Shape> array){//Beginning of the displayRectangle method
		int numberOfShapes = 0;//initialize numberOfShapes with 0 to make it uptade
		double totalArea = 0;//initialize totalArea with 0 to make it uptade
	        for(int i=0;i<array.size();i++){
			
				if(array.get(i).getClass().getName().equals("Rectangle")){
				//properties will take all of the informations from listAnything.
				String [] properties= {  listAnything.get(i).shapeId(), listAnything.get(i).thisIsa(listAnything.get(i)),
						Double.toString(listAnything.get(i).area()),
							String.valueOf(listAnything.get(i).isFullShape()), 
							Double.toString(listAnything.get(i).distanceToCoordinateCenter()), listAnything.get(i).propertiesOfShape()};
					
					getModel().addRow(properties);//Add all of the informations ,whose are got by arraylist, to the each rows one by one.
				numberOfShapes++;//Count how many shapes are inputted.
				totalArea = totalArea + array.get(i).area();//Calculate how much area of shapes is
				}
					informationText.setText("There are " + numberOfShapes + " Rectangle have been created and the area is: "
					+ totalArea);//Label will occur when dispaly Rectangle is selected.
				}
	}//End  of the displayRectangle method.

	public static void displaySquare(ArrayList<Shape> array) {//Beginning of the displaySquare method
		int numberOfShapes = 0;//initialize numberOfShapes with 0 to make it uptade
		double totalArea = 0;//initialize totalArea with 0 to make it uptade
	
		for (int i = 0; i < array.size(); i++) {

			if (array.get(i).getClass().getName().equals("Square")) {
				//properties will take all of the informations from listAnything.
				String[] properties = { array.get(i).shapeId(), array.get(i).thisIsa(array.get(i)),
						Double.toString(array.get(i).area()), String.valueOf(array.get(i).isFullShape()),
						Double.toString(array.get(i).distanceToCoordinateCenter()), array.get(i).propertiesOfShape() };
					
					getModel().addRow(properties);//Add all of the informations ,whose are got by arraylist, to the each rows one by one.
				numberOfShapes++;//Count how many shapes are inputted.
				totalArea = totalArea + array.get(i).area();//Calculate how much area of shapes is

			}
			informationText.setText("There are " + numberOfShapes + " Square have been created and the area is: "
					+ totalArea);//Label will occur when dispaly Square is selected.
		}
	}//End  of the displaySquare method.
	
	public static void displayCircle(ArrayList<Shape> array){//Beginning of the displayCircle method
		int numberOfShapes = 0;//initialize numberOfShapes with 0 to make it uptade
		double totalArea = 0;//initialize totalArea with 0 to make it uptade
		for(int i=0;i<array.size();i++){
			//properties will take all of the informations from listAnything.
			if(array.get(i).getClass().getName().equals("Circle")){
			
				String [] properties= {  listAnything.get(i).shapeId(), listAnything.get(i).thisIsa(listAnything.get(i)),
						Double.toString(listAnything.get(i).area()),
						String.valueOf(listAnything.get(i).isFullShape()), Double.toString(listAnything.get(i).distanceToCoordinateCenter()),
						listAnything.get(i).propertiesOfShape()};
				
				getModel().addRow(properties);//Add all of the informations ,whose are got by arraylist, to the each rows one by one.
				
				numberOfShapes++;//Count how many shapes are inputted.
			totalArea = totalArea + array.get(i).area();//Calculate how much area of shapes is
			}
				informationText.setText("There are " + numberOfShapes + " Circle have been created and the area is: "
				+ totalArea);//Label will occur when dispaly Circle is selected.
		}
}//End  of the displayCircle method.

		
	
	
	 static ArrayList<Shape> listAnything = new ArrayList<Shape>();/*I use Static ArrayList when the objects are created, 
	  they will be added to static  ArrayList, and due to static variables will not lost.*/
	  	
	 	public static String selectedType = "ShowAll";
	 	
		public static DefaultTableModel getModel() {
			return model;
		}
		public static void setModel(DefaultTableModel model) {
			ShapeFrame.model = model;
		}
		
		
		
}