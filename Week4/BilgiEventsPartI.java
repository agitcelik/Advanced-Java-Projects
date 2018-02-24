import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BilgiEventsPartI extends JPanel implements ActionListener,KeyListener, MouseListener{
	
	private JTextField txtOne,txtTwo, txtResult;
	private JLabel lblOne, lblTwo,lblResult, lblRdAdd, lblRdSub,lblStatus, lblMult, lblDivide;
	private JButton btnCalculate, btnReset, btnExit;
	private JRadioButton btnAdd, btnSub, btnMult, btnDivide;
	private ButtonGroup btnGrup;
	
	private SimpleCalculations simple;
	
	public BilgiEventsPartI(){
		
		setLayout(null);
		
		simple= new SimpleCalculations();
		// Label One
		lblOne= new JLabel("First Number");
		lblOne.setSize(120,50);
		lblOne.setLocation(10,10);
		add(lblOne);
		
		
		// Text One
		txtOne= new JTextField();
		txtOne.setSize(100, 50);
		txtOne.setLocation(150,10);
		add(txtOne);
		
		
         // Label two
		lblTwo= new JLabel("Second Number");
		lblTwo.setSize(120,50);
		lblTwo.setLocation(10,100);
		add(lblTwo);
		
		// Text two
		txtTwo= new JTextField();
		txtTwo.setSize(100, 50);
		txtTwo.setLocation(150,100);
		add(txtTwo);
		
		
		// lbl Three
		
		lblResult=new JLabel("Result");
		lblResult.setSize(120,50);
		lblResult.setLocation(10,200);
		add(lblResult);
		
		// txt Result
		txtResult= new JTextField();
		txtResult.setSize(100, 50);
		txtResult.setLocation(150,200);
		add(txtResult);
		
		// btnCalcualte
		btnCalculate= new JButton("Calculate");
		btnCalculate.setSize(100,50);
		btnCalculate.setLocation(100, 300);
		add(btnCalculate);
		
		// btnReset
		btnReset= new JButton("Reset");
		btnReset.setSize(100,50);
		btnReset.setLocation(200, 300);
		add(btnReset);
		
		// register button to perform actions....
	//	btnCalculate.addActionListener(this);
		btnReset.addActionListener(this);
		
		
		btnExit= new JButton("Exit");
		btnExit.setSize(100,50);
		btnExit.setLocation(300, 300);
		add(btnExit);
		
		btnExit.addActionListener(this);
		/*
		lblRdAdd= new JLabel("Add");
		lblRdAdd.setSize(100,50);
		lblRdAdd.setLocation(100,400);
		add(lblRdAdd);
			*/	
	btnAdd= new JRadioButton("Add");
	btnAdd.setSize(100, 50);
	btnAdd.setLocation(50,400);
	add(btnAdd);
		
	
	btnSub= new JRadioButton("Sub");
	btnSub.setSize(100, 50);
	btnSub.setLocation(150,400);
	add(btnSub);
	
	btnMult = new JRadioButton("Mult");
	btnMult.setSize(100,50);
	btnMult.setLocation(250,400);
	add(btnMult);
	
	btnDivide = new JRadioButton("Divide");
	btnDivide.setSize(100,50);
	btnDivide.setLocation(350,400);
	add(btnDivide);
	
	btnGrup= new ButtonGroup();
	btnGrup.add(btnAdd);
	btnGrup.add(btnSub);
	btnGrup.add(btnMult);
	btnGrup.add(btnDivide);
	
	btnAdd.setSelected(true);
	
	txtOne.addKeyListener(this);
	txtTwo.addKeyListener(this);
	
	
	txtOne.addMouseListener(this);
	
	btnCalculate.addMouseListener(this);
	
	
	
	/*lblStatus= new JLabel("333");
	lblStatus.setSize(100,50);
	lblStatus.setLocation(50,500);
	add(lblStatus);*/
	}
	
	
	public void calculate(){
		
		
		
		String strOne= txtOne.getText().trim();
		if(strOne.length()<1){
			JOptionPane.showMessageDialog(this, "Fitst Text Fied is Empty","Text field is empty",JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		String strTwo= txtTwo.getText().trim();
		if(strTwo.length()<1){
		JOptionPane.showMessageDialog(this, "Second Text Fied is Empty","Text field is empty",JOptionPane.WARNING_MESSAGE);
			return;
		}
		try{
		int one= Integer.parseInt(strOne);
		int two=Integer.parseInt(strTwo);
		
		int sum=0;
		if(btnAdd.isSelected())
		 sum= simple.add(one, two);
		else if(btnSub.isSelected())
			sum=simple.sub(one, two);
		else if(btnMult.isSelected())
			sum=simple.mult(one,two);
		else if(btnDivide.isSelected())
			sum=simple.divide(one,two);
		
		txtResult.setText(String.valueOf(sum));
		
		}
		
		catch(NumberFormatException ee){
			JOptionPane.showMessageDialog(this, "Input Integer Numbers Only","Number format Exception",JOptionPane.WARNING_MESSAGE);
		}
		
		catch(Exception eee){
			JOptionPane.showMessageDialog(this, "Text Field can not be empty","Text field can not be empty",JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	public static void main(String[] args) {
		
		JFrame window= new JFrame("Event Based Programming");
		BilgiEventsPartI bilgi= new BilgiEventsPartI();
		
		window.add(bilgi);
		
		window.setSize(500, 500);
		window.setVisible(true);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//window.setBackground(Color.GREEN);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnCalculate))
		calculate();
		else if(e.getSource().equals(btnReset))
			resetData();
		else if(e.getSource().equals(btnExit))
			System.exit(1);
		
	}
	
	public void resetData(){
		txtOne.setText("");
		txtTwo.setText("");
		txtResult.setText("");
	}

	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(txtTwo)){
		
		if(e.getKeyCode()==e.VK_ENTER)
			calculate();
		else if(e.getKeyCode()==e.VK_ESCAPE)
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
		
	//	System.out.println("Mouse is entered...");
		
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("Mouse is Exit...");
		
	}

	

	
	

}

