import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class MyAnimationPart2 extends JPanel implements ActionListener{
	private JButton btnMove,btnStop;
	private Circle circle;
	private javax.swing.Timer timer;
	public MyAnimationPart2() {
		
		
		setLayout(new FlowLayout());
		btnMove= new JButton("Start");
		btnMove.addActionListener(this);
		
		btnStop=new JButton("Stop");
		btnStop.addActionListener(this);
		
		add(btnMove,BorderLayout.NORTH);
		add(btnStop,BorderLayout.SOUTH);
		
		
		
			circle=new Circle();
		
		
		timer= new javax.swing.Timer(50, this);
		
		
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
			g.setColor(circle.randomColor());
			g.fillOval(circle.getX(), circle.getY(), circle.getR(),circle.getR());
		
		}
	
	public static void main(String[] args) {
		JFrame window= new JFrame("Animation");
		
		
		MyAnimationPart2 bilgi= new MyAnimationPart2();
		window.add(bilgi);
		window.setSize(1000, 600);
		window.setVisible(true);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	boolean a = true;
	boolean b = true;
	
public void actionPerformed(ActionEvent e) {
if(e.getSource().equals(btnMove))
		timer.start();
	else if(e.getSource().equals(btnStop))
		timer.stop();
	
	else if(e.getSource().equals(timer)){
		
		if (a==true) {
			circle.moveToRight();
		
		}
		else if(a==false){
			circle.moveToLeft();	
		}
		
		if (b==true) {
			
			circle.moveToUp();
			
		}
		else if(b==false){
			
			circle.moveToDown();
		}
				
		if (circle.getX()>=1000){
			circle.setX(999);
			a=false;
			b=true;
	
		}
		
		else if (circle.getX()<=0){
			circle.setX(1);
			b=false;
			a=true;
		
		}
		else if (circle.getY()<=0){
			circle.setY(1);
			a=false;
			b=true;
			
		}
		
		else if (circle.getY()>=600){
			circle.setY(599);
			a=true;
			b=false;
						
		}
	}	
	repaint();
}
}
