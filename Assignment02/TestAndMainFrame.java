import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/*
 * I use 2 classes for tabs and , one Test class to add tabs into the frame.
 */
public class TestAndMainFrame extends JPanel{//This is my Test class.
	/*
	*This TestAndMainFrame class extends JPanel class to use GUI methods and GUI concept
		There are "has a"(Abstract classes)
	*/

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabs;//For adding tabs I use JTabbedPane class
    private ShapeFrame shapesTab;//For adding shapes list tab to the JTabbedPane
    private static ImageFrame imageTab;////For adding display shapes tab to the JTabbedPane

    public TestAndMainFrame(){
    
        tabs = new JTabbedPane();// Not to get NullPointerExecption we have to make new JTabbedPane();, then use it with add method
        shapesTab = new ShapeFrame();// Not to get NullPointerExecption we have to make new ShapeFrame();  , then use it with add method
        imageTab = new ImageFrame();// Not to get NullPointerExecption we have to make new ImageFrame();, then use it with add method

        shapesTab.setPreferredSize(new Dimension(900,500));//Dimension of shapes tab frame
        imageTab.setPreferredSize(new Dimension(800,580));//Dimension of images tab frame
      
        //We have to use add method to make tabs visible
        tabs.add("Shapes", shapesTab);
        tabs.add("Image", imageTab);

      	setLayout(new BorderLayout());//I use borderlayout and we have to set it.

        add(tabs, BorderLayout.CENTER);//To add tabs
    }


    public static void main(String [] a) {//Main method to execute all of the codes here
    	  JFrame window= new JFrame("Assignment 2");//Title of my Frame
    	  TestAndMainFrame tabs = new TestAndMainFrame();//
          
    	  window.setLayout(new BorderLayout());
          window.getContentPane().add(tabs,BorderLayout.NORTH);
          window.setSize(1000,650);//Size of my Frame
          window.setVisible(true);///To make window(Frame) visible
          window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          window.setResizable(false);

	    }
}
