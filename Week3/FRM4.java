import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class FRM4 extends JFrame{
	  private JTextField t1,t2;
	  private JButton b1,b2,b3;
	  
	  public FRM4(){
	setLayout(new BorderLayout());//Border LAYOUT at default.
		  t1= new JTextField("TEXTFIELD1");
		  t1.setSize(100,50);
		t1.setLocation(50,40);
		  add(t1.BorderLayout.NORTH);
		  
	
		  b1 = new JButton("OK");
		  b1.setText("OK");
		  b1.setSize(100,50);
		 b1.setLocation(100,150);
		  add(b1.BorderLayout.NORTH);

		  	  t2= new JTextField("TEXTFIELD1");
		  t2.setSize(100,50);
		  t2.setLocation(50,40);
		  add(t2.BorderLayout.CENTER);
		  
		  
		  b2 = new JButton("OK");
		  b2.setText("OK");
		  b2.setSize(100,50);
		b2.setLocation(150,150);
		  add(b2.AbstractButton.CENTER);
		  
		  b3 = new JButton("OK");
		  b3.setText("OK");
		  b3.setSize(100,50);
		  b3.setLocation(200,150);
		  add(b3.BorderLayout.WEST);
		
		  
		  
		  
		  
		  
		  setSize(500,500);
		  setTitle("Bilgi");
		  setVisible(true);
		  
	  }
public static void main(String[] args) {
	new FRM4();
}
}
