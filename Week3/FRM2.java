import java.awt.FlowLayout;

import javax.swing.*;
public class FRM2  extends JFrame{
	  private JTextField t1,t2;
	  private JButton b1,b2,b3;
	  
	  public FRM2(){
	setLayout(new FlowLayout());//Flow LAYOUT at default.
		  t1= new JTextField("oooooooo");
		  t1.setSize(100,50);
		  t1.setLocation(50,40);
		  add(t1);
		  
	
		  b1 = new JButton("OK");
		  b1.setText("OK");
		  b1.setSize(100,50);
		  b1.setLocation(100,150);
		  add(b1);
		  	  t2= new JTextField("ooooooo");
		  t2.setSize(100,50);
		  add(t2);
		  
		  
		  b2 = new JButton("OK");
		  b2.setText("OK");
		  b2.setSize(100,50);
		  b2.setLocation(150,150);
		  add(b2);
		  
		  b3 = new JButton("OK");
		  b3.setText("OK");
		  b3.setSize(100,50);
		  b3.setLocation(200,150);
		  add(b3);
		
		  
		  
		  
		  
		  
		  setSize(500,500);
		  setTitle("Bilgi");
		  setVisible(true);
		  
	  }
public static void main(String[] args) {
	new FRM2();
}
}
