import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;




public class MyAnimationPart1 extends JPanel implements ActionListener,KeyListener{

		//private JButton btnStp, btnStart;
		private Circle circle;
		private int x,y;
		javax.swing.Timer timer;   
			
		
		public MyAnimationPart1(){
		
			setLayout(new BorderLayout());			
			
			/*
			add(btnStp, BorderLayout.SOUTH);
			btnStp.addActionListener(this);
			btnStp= new JButton("Stop");
			
			
			add(btnStart, BorderLayout.NORTH);
			btnStart.addActionListener(this);
			btnStart = new JButton("Start");
			*/
			
			
			 circle = new Circle();
			
			addKeyListener(this);
			setFocusable(true);
			
			//timer= new javax.swing.Timer(100, this);
			
		
		}		
		public void paint(Graphics g){
			super.paint(g);
				g.setColor(circle.getColor());
				g.fillOval(circle.getX(),circle.getY(),circle.getR(),circle.getR());
			}
			
		
		public static void main(String[] args) {
			JFrame window= new JFrame("Animation");
			
			
			MyAnimationPart1 bilgi= new MyAnimationPart1();
			window.add(bilgi);
			window.setSize(500, 500);
			window.setVisible(true);
			window.setResizable(false);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		}


		public void actionPerformed(ActionEvent e) {
			/*if(e.getSource().equals(btnStart))
				timer.start();
				
			else if(e.getSource().equals(btnStp))
				timer.stop();
				
				else if(e.getSource().equals(timer)){
					circle.moveToRight();
			
				}
					
		repaint();*/

			}

		public void keyPressed(KeyEvent e) {
	
               if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            	   circle.moveToRight();
			
				}
               if(e.getKeyCode()==KeyEvent.VK_LEFT){
            	   circle.moveToLeft();
   				
   				}
               if(e.getKeyCode()==KeyEvent.VK_U){
            	   circle.moveToUp();
   				
   				}
               if(e.getKeyCode()==KeyEvent.VK_B){
            	   circle.moveToDown();
   				
   				}
              
               if(e.getKeyCode()==KeyEvent.VK_S){
            	   circle.biggerCircle();
   				
   				}
               if(e.getKeyCode()==KeyEvent.VK_T){
            	   circle.smallerCircle();
  				
               }
               if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
      				System.exit(0);
   		
   				}
               repaint();
		}
	
		public void keyReleased(KeyEvent e) {
			
			
		}
	
		public void keyTyped(KeyEvent e) {

			
			
		}
		
	}