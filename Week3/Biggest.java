import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Biggest {// PART II Problem02

	public static int Biggest1(){

			
			JTextField number1 = new JTextField();
			JTextField number2 = new JTextField();
			JTextField number3 = new JTextField();
			Object[] message = {
			"number1:", number1,
			"number2:", number2
			,"number3:", number3
			};
			int option = JOptionPane.showConfirmDialog(null, message, "Login",
					JOptionPane.OK_OPTION);
			 int x =Integer.parseInt(number1.getText());
			  int y =Integer.parseInt(number2.getText());
			  int z = Integer.parseInt(number3.getText());
				
			if (option == JOptionPane.OK_OPTION) {
			/*  int x =Integer.parseInt(number1.getText());
			  int y =Integer.parseInt(number2.getText());
			  int z = Integer.parseInt(number3.getText());*/
				
				if((x>y && x>z))
					return x;
				else if((y>x && y>z))
					return y;
				else return z;

			}
			
			return z;
			/*else {
				JOptionPane.showMessageDialog(null, "Canceled", "",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}*/
	}
public static void main(String[] args) {
	
int a =Biggest1();
String s= Integer.toString(a);
//System.out.println(a);//Write biggest vvalue
	JOptionPane.showMessageDialog(null,"The biggest value is: "+s);
}
	}
