import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BilgiEventsPartII extends JPanel implements ActionListener, KeyListener,
		MouseListener, FocusListener {

	private JTextField txtOne, txtTwo, txtResult;
	private JLabel lblOne, lblTwo, lblResult, lblRdAdd, lblRdSub, lblStatus;
	private JButton btnCalculate, btnReset, btnExit;
	
	private ButtonGroup btnGrup;

	private SimpleCalculations simple;

	public BilgiEventsPartII() {

		setLayout(null);

		simple = new SimpleCalculations();
		// Label One
		lblOne = new JLabel("First Number");
		lblOne.setSize(120, 50);
		lblOne.setLocation(10, 10);
		add(lblOne);

		// Text One
		txtOne = new JTextField();
		txtOne.setSize(100, 50);
		txtOne.setLocation(150, 10);
		add(txtOne);

		// Label two
		lblTwo = new JLabel("Second Number");
		lblTwo.setSize(120, 50);
		lblTwo.setLocation(10, 100);
		add(lblTwo);

		// Text two
		txtTwo = new JTextField();
		txtTwo.setSize(100, 50);
		txtTwo.setLocation(150, 100);
		add(txtTwo);

		// lbl Three

		lblResult = new JLabel("Result");
		lblResult.setSize(120, 50);
		lblResult.setLocation(10, 200);
		add(lblResult);

		// txt Result
		txtResult = new JTextField();
		txtResult.setSize(100, 50);
		txtResult.setLocation(150, 200);
		add(txtResult);

		// btnCalcualte
		btnCalculate = new JButton("Calculate");
		btnCalculate.setSize(100, 50);
		btnCalculate.setLocation(100, 300);
		add(btnCalculate);

		// btnReset
		btnReset = new JButton("Reset");
		btnReset.setSize(100, 50);
		btnReset.setLocation(200, 300);
		add(btnReset);

		// register button to perform actions....
		// btnCalculate.addActionListener(this);
		btnReset.addActionListener(this);

		btnExit = new JButton("Exit");
		btnExit.setSize(100, 50);
		btnExit.setLocation(300, 300);
		add(btnExit);

		btnExit.addActionListener(this);
		/*
		 * lblRdAdd= new JLabel("Add"); lblRdAdd.setSize(100,50);
		 * lblRdAdd.setLocation(100,400); add(lblRdAdd);
		 */
	/*btnAdd = new JRadioButton("Add");
		btnAdd.setSize(100, 50);
		btnAdd.setLocation(150, 400);
		add(btnAdd);

		btnSub = new JRadioButton("sub");
		btnSub.setSize(100, 50);
		btnSub.setLocation(250, 400);
		add(btnSub);

		btnGrup = new ButtonGroup();
		btnGrup.add(btnAdd);
		btnGrup.add(btnSub);

		btnAdd.setSelected(true);
*/
		txtOne.addKeyListener(this);
		txtTwo.addKeyListener(this);

		txtOne.addMouseListener(this);

		btnCalculate.addMouseListener(this);

		txtTwo.addFocusListener(this);
		txtResult.addKeyListener(this);

		/*lblStatus = new JLabel("333");
		lblStatus.setSize(100, 50);
		lblStatus.setLocation(50, 500);
		add(lblStatus);*/
	}

	public void calculate() {
		String strOne = txtOne.getText().trim().toUpperCase();
	
			txtOne.setText(strOne);
			txtTwo.setText(strOne.toLowerCase());
			String a =Integer.toString(strOne.length());
			txtResult.setText(Integer.toString(strOne.length()));
			if(Integer.parseInt(a)>50){
				int b=JOptionPane.showConfirmDialog(null, "The value that you have inputted is greater than 50 if you wanna keep calculating Press OK","Warning!",JOptionPane.OK_CANCEL_OPTION);
				if(b== JOptionPane.OK_OPTION){

					txtResult.setText(Integer.toString(strOne.length()));	
				}
				else if(b== JOptionPane.CANCEL_OPTION){	
				resetData();
				}
			}
			else{
			txtResult.setText(Integer.toString(strOne.length()));	
			}
			
		}


	

	private void txtOne(String lowerCase) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {

		JFrame window = new JFrame("Event Based Programming");
		BilgiEventsPartII bilgi = new BilgiEventsPartII();

		window.add(bilgi);

		window.setSize(500, 400);
		window.setVisible(true);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(btnCalculate))
			calculate();
		else if (e.getSource().equals(btnReset))
			resetData();
		else if (e.getSource().equals(btnExit))
			System.exit(1);

	}

	public void resetData() {
		txtOne.setText("");
		txtTwo.setText("");
		txtResult.setText("");
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		int count=txtOne.getText().length()+1;
		if(e.getKeyChar()==e.KEY_PRESSED)
			count++;
		txtResult.setText(String.valueOf(count));

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(txtTwo)) {
			
			if (e.getKeyCode() == e.VK_ENTER)
				calculate();
			else if (e.getKeyCode() == e.VK_ESCAPE)
				resetData();

		}

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		calculate();

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

		// System.out.println("Mouse is entered...");

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

		//System.out.println("Mouse is Exit...");

	}

	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if (txtTwo.getText().length() < 1)
			lblStatus.setText("INput some data....");

	}

}
