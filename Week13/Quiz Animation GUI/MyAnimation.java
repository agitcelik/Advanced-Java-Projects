import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MyAnimation extends JPanel implements Runnable, KeyListener, MouseListener {

	private JButton btnStart;

	private Circle circle;
	private Thread myThread, t2;
	public int dx = 0;
	public int dy = 0;

	public MyAnimation() {

		btnStart = new JButton("");
		setLayout(new BorderLayout());
		add(btnStart, BorderLayout.NORTH);
		addMouseListener(this);

		// btnStop= new JButton("Stop");
		// add(btnStop,BorderLayout.SOUTH);
		addMouseListener(this);

		circle = new Circle();
		// keyPressed
		btnStart.addKeyListener(this);
		btnStart.addKeyListener(this);
		// myThread.start();

	}

	public void run() {

		System.out.println("run....");
		String changeWays = Thread.currentThread().getName();
		while (true) {

			try {

				if (changeWays.equals("right")) {
					if (circle.getX() >= 505) {
						changeWays = "up";// Thread.currentThread().setName("left");
						circle.moveToLeft();
						// System.out.println(changeWays);
					} else {
						circle.moveToRight();
					}

				} else if (changeWays.equals("up")) {

					if (circle.getY() <= 50) {
						changeWays = "left";
						circle.moveToDown();
						// System.out.println(changeWays);
					} else {
						circle.moveToUp();
					}
				} else if (changeWays.equals("down")) {
					if (circle.getY() >= 505) {
						changeWays = "right";
						circle.moveToUp();
						// System.out.println(changeWays);
					} else {
						circle.moveToDown();
					}

				} else if (changeWays.equals("left")) {

					if (circle.getX() <= 50) {
						changeWays = "down";
						circle.moveToRight();
						// System.out.println(changeWays);
					} else {
						circle.moveToLeft();
					}
				}

				myThread.sleep(40);
				repaint();
				// changeWays=findRandomWay();
				// repaint();
			} catch (InterruptedException e) {
				// repaint();
			}
			repaint();
		}
	}

	
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(new Color(circle.getX() / 4, circle.getY() / 4, circle.getR() / 4)); // party
																						// mode
		// g.setColor(circle.getColor());
		g.fillOval(circle.getX(), circle.getY(), circle.getR(), circle.getR());
		g.setColor(Color.BLUE);
		// repaint();
		// g.drawRect(97,97, 400, 400);
		g.fillRect(100, 100, 400, 400);
		// g.drawOval(50,50, 500, 500);
		// g.fillOval(x, y, width, height);
		// g.fillRect(circle.getX(),circle.getY(),circle.getR(),circle.getR());
		// Rectangle is for visualizing the borders.

		repaint();
		/*
		 * super.paint(g);
		 * 
		 * circle.setColor(new Color(circle.getX()/4, circle.getY()/4,
		 * circle.getR()/4)); //party mode g.setColor(circle.getColor());
		 * g.fillOval(circle.getX(),circle.getY(),circle.getR(),circle.getR());
		 * 
		 * 
		 * g.drawRect(50,50, 400, 400);
		 * 
		 */
	}

	public static void main(String[] args) {
		JFrame window = new JFrame("Game");
		MyAnimation s = new MyAnimation();
		window.add(s);
		window.setSize(700, 700);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			int exit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "Exit!",
					JOptionPane.YES_NO_OPTION);
			if (exit == (JOptionPane.YES_OPTION)) {
				System.exit(0);
			} else {

			}
		}
	}

	private boolean threadSuspended = true;

	@Override
	public void mouseClicked(MouseEvent e) {

		if (SwingUtilities.isLeftMouseButton(e)) {
			if (myThread == null && t2 == null) {

				myThread = new Thread(this);
				t2 = new Thread(this);

				myThread.setName("down");
				t2.setName("up");

				myThread.start();
				t2.start();

			} else {
				if (!threadSuspended) {
					System.out.println(threadSuspended);
					threadSuspended = !threadSuspended;
					myThread.resume();
					t2.resume();
				}
			}

		} else if (SwingUtilities.isRightMouseButton(e)) {

			myThread.suspend();
			t2.suspend();
			System.out.println(threadSuspended);
			threadSuspended = !threadSuspended;
			System.out.println(threadSuspended);
		}

	}

	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
