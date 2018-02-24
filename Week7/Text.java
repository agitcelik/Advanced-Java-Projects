import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Text extends JPanel implements Runnable, ActionListener {

	private JButton btnStart, btnStop;

	private Circle circle;
	private Thread myThread, t2;
	public int dx = 0;
	public int dy = 0;

	public Text() {
		// TODO Auto-generated constructor stub
		btnStart = new JButton("Start");
		setLayout(new BorderLayout());
		add(btnStart, BorderLayout.NORTH);
		btnStart.addActionListener(this);

		btnStop = new JButton("Stop");
		add(btnStop, BorderLayout.SOUTH);
		btnStop.addActionListener(this);

		circle = new Circle();

		// myThread.start();

	}

	public void run() {
		Text s = new Text();
		System.out.println("run....");
		String firstWays = Thread.currentThread().getName();
		while (true) {
			System.out.println(Thread.currentThread().getName()
					+ "Thread ID : " + Thread.currentThread().getId());
			try {

			  if (firstWays.equals("up")) {

					if (circle.getY() <= 0) {
						firstWays = "down";
						circle.moveToDown();
					} else {
						circle.moveToUp();
						System.out.println("up");
					}
				}
			  else if (firstWays.equals("down")) {
					if (circle.getY() >= 500) {
						firstWays = "up";
						circle.moveToUp();
					} else {
						circle.moveToDown();
						System.out.println("down");
					}
				} 
				/*
				 * else if(firstWays.equals("movex")) s.movex(); else
				 * if(Thread.currentThread().getName().equals("movex"))
				 * s.movey();
				 */
				myThread.sleep(50);
				repaint();
			} catch (InterruptedException e) {

			}

		}
	}

	public void paint(Graphics g) {
	
		super.paint(g);

		// g.fillOval(circle.getX(),circle.getY(),circle.getR(),circle.getR());
		g.drawString("HELLO WORLD! JGUI", circle.getX(), circle.getY());
		g.setColor(circle.getColor());
		// g.drawLine(circle.getY(), circle.getR(), circle.getX(),
		// circle.getR());
		// g.drawString(iterator, x, y);

	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Game");
		Text s = new Text();
		window.add(s);
		window.setSize(700, 700);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	/*public void movex(){
		if(circle.getX()<0)
			dx=1;
		
		else if(circle.getX()>=600-circle.getR())
			dx=-1;
			
		int x =circle.getX();
		x+=dx;
	}
	public void movey(){
		if(circle.getY()<0)
			dy=1;
		
		else if(circle.getY()>=600-circle.getR())
			dy=-1;
			
		int y =circle.getY();
		y+=dy;
	}*/
	private boolean threadSuspend;

	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(btnStart)) {
			if (myThread == null) {
				myThread = new Thread(this);

				myThread.setName("down");

				myThread.start();

			} 
			else {
				if (threadSuspend) {
					System.out.println(threadSuspend);
					myThread.resume();
				}
			}

		} else if (e.getSource().equals(btnStop)) {
			// t2= new Thread(this);
			myThread.suspend();
			threadSuspend = !threadSuspend;

		}
	}
}
