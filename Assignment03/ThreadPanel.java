
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ThreadPanel extends JPanel {//Must extends JPanel to use paint methods.
	
	@Override
	protected void paintComponent(Graphics graphs) {//Using paintcomponent to make our cirlces and rectangle paint.
		super.paintComponent(graphs);//due to is a relation
		// Graphics2D g2d = (Graphics2D) g;

		graphs.setColor(new Color(77,176,230));//Setting color of rectangle.
		graphs.fillRect(300, 0, 200, 600);//Painting rectangle
		
		setBackground(Color.LIGHT_GRAY);//setting color of background of Frame
		drawCircle(graphs);//Draw circles method is below...

	}

	public void drawCircle(Graphics graphs) {//After creating circles, they will be drawn here
		synchronized (MainFrame.carList) {
			for (int i = 0; i < MainFrame.carList.size(); i++) {//Each circles whose are in list are painted.
				Car circle = MainFrame.carList.get(i);
				graphs.setColor(circle.getColor());//Setting color of circles.
				graphs.fillOval(circle.getX(), circle.getY(), 30, 30);
			}
		}
	}//End of drawCircle method.

}//End of the class.
