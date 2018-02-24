import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyAnimation extends JPanel implements Runnable,ActionListener{

	private JButton btnStart,btnStop;

	private Circle circle;
	private Thread myThread, t2,t3,t4;
	public int dx=0;
	public int dy=0;
	public MyAnimation() {
		
		btnStart= new JButton("Start");
		setLayout(new BorderLayout());
		add(btnStart,BorderLayout.NORTH);
		btnStart.addActionListener(this);
		
		btnStop= new JButton("Stop");
		add(btnStop,BorderLayout.SOUTH);
		btnStop.addActionListener(this);
		
		circle= new Circle();
		
		
		//myThread.start();
		
		
		
	}
	
/*	public String findRandomWay()
	{
		String result;
	      switch (new Random().nextInt(4)) {
          case 0:  result = "up";
                   break;
          case 1:  result = "left";
                   break;
          case 2:  result = "right";
                   break;
          default: result = "down";
                   break;
      }
	      System.out.println(result);
		return result;
	}*/
	
	public void run(){
		
		System.out.println("run....");
	String changeWays=Thread.currentThread().getName();
		while(true){
		
			try{
				
				if(changeWays.equals("right"))
				{
					if (circle.getX() >= 550) {
						changeWays = "left";//Thread.currentThread().setName("left");
						circle.moveToLeft();
						System.out.println(changeWays);
					} 
					else
					{
						circle.moveToRight();
					}
					
				}
				else if (changeWays.equals("up")) {
					
					if (circle.getY() <= 0) {
						changeWays = "down";
						circle.moveToDown();
						System.out.println(changeWays);
					} 
					else
					{
						circle.moveToUp();
					}
				}
				else if(changeWays.equals("down"))
				{	
					if (circle.getY() >= 500) {
						changeWays="up";
						circle.moveToUp();
						System.out.println(changeWays);
					}
					else
					{
						circle.moveToDown();
					}
					
				}
				else if(changeWays.equals("left"))
				{

					if (circle.getX() <= 0) {
						changeWays = "right";
						circle.moveToRight();
						System.out.println(changeWays);
					} 
					else
					{
						circle.moveToLeft();
					}
				}
				
				myThread.sleep(50);
				//changeWays=findRandomWay();
				repaint();
			}
			catch(InterruptedException e){
				
			}
			
		}
	}
	

	public void paint(Graphics g) {
	
		super.paint(g);
		
		g.fillOval(circle.getX(),circle.getY(),circle.getR(),circle.getR());
		
		g.setColor(circle.getColor());
	

	}
	
	

	public static void main(String[] args) {
		JFrame window= new JFrame("Game");
		MyAnimation s= new MyAnimation();
		window.add(s);
		window.setSize(700, 700);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	   private boolean threadSuspended=true;
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource().equals(btnStart)){
		 if(myThread==null&& t2==null){
			 
			
			 myThread= new Thread(this);
			 t2= new Thread(this);
			 t3= new Thread(this);
		   	 t4= new Thread(this);
			/* System.out.println(getWidth());
			 
			/* if(circle.moveToRight()>(getWidth()-circle.getR()))
				 circle.moveToRight();*/
		
			 myThread.setName("down");
			 t2.setName("right");
			 
			// myThread.setName("right");
			 /*if((circle.getY()+circle.getR())>=0)
				  t2.setName("down");
			  
			  if((circle.getY()+circle.getR())>=500-circle.getR())
				  t2.setName("up");*/
			 
			 myThread.start();
			 t2.start();
			
			 
		 }
		 else
		 {
			 if (!threadSuspended)
			 {
				 System.out.println(threadSuspended);
				 myThread.resume();
				 t2.resume();
			 }
		 }
			 
		}
		else if(e.getSource().equals(btnStop)){
		
			myThread.suspend();
			t2.suspend();
			System.out.println(threadSuspended);
			 threadSuspended = !threadSuspended;
			 System.out.println(threadSuspended);
		}
	}
}
