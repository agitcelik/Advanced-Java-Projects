import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class FRMAPPLET  extends JApplet{
	  private JTextField t1,t2;
	  private JButton b1,b2,b3;
	  
	  public FRMAPPLET(){
	setLayout(null);//Border LAYOUT at default.
		  t1= new JTextField("TextField1");
		  t1.setSize(100,50);
		  t1.setLocation(50,40);
		  t1.setLocation(160,270);
		  add(t1);
		  
		  t2= new JTextField("TextField2");
		  t2.setSize(100,50);
		  t2.setLocation(180,40);
		  add(t2);
		  
		  b1 = new JButton("OK");
		  b1.setText("OK");
		  b1.setSize(100,50);
		  b1.setLocation(100,150);
		  add(b1);
		  
		  
		  b2 = new JButton("OK");
		  b2.setText("OK");
		  b2.setSize(100,50);
		  b2.setLocation(350,150);
		  add(b2);
		  
		  b3 = new JButton("OK");
		  b3.setText("OK");
		  b3.setSize(100,50);
		  b3.setLocation(230,150);
		  add(b3);
		
		  
		  
		  
		  
		  
		  setSize(500,500);
		  setTitle("Bilgi");
		  setVisible(true);
		  
	  }
public static void main(String[] args) {
	new FRMAPPLET();
}
}
