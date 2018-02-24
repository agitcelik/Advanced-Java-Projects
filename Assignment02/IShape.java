import java.awt.Color;
import java.awt.Window;

public interface IShape //This is our interface class.
{
public  double area();//area will be defined into Shape classes and other sub-classes(Circle,Rectangel,Square) which will extend Shape class.

public double distanceToCoordinateCenter();//distanceToCoordinateCenter method will be defined into Shape class to use in isFullShape method also

public boolean isFullShape();/*isFullShape will be defined into Shape classes and other sub-classes(Circle,Rectangel,Square)
which will extend Shape class.*/

public String thisIsa(IShape shape);//area will be defined into Shape class only not to repeat again in sub-classes.

public String propertiesOfShape();/*propertiesOfShape will be defined into Shape classes and other sub-classes(Circle,Rectangel,Square) 
which will extend Shape class.*/

public String shapeId();//shapeId will be defined into Shape class only not to repeat again in sub-classes.
public Color getColor();
public void DrawShape();/*I use DrawShape method in my IShape interface class for Circle,Rectangel,Square which will extends Shape class to write
System.out.format() to desing outputs.
*/

}//End of the interface class.