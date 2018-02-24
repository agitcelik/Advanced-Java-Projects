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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BilgiEventsPartIII extends JPanel implements ActionListener,KeyListener, MouseListener,FocusListener{

	private JTextField txtOne,txtTwo, txtResult;
	private JLabel lblOne, lblTwo,lblResult, lblRdAdd, lblRdSub,lblStatus;
	private JButton btnCalculate, btnReset, btnExit;
	private JCheckBox  checkBoxEven , checkBoxOdd;
	private ButtonGroup btnGrup;
	private SimpleCalculations simple;
public BilgiEventsPartIII(){
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
		btnCalculate= new JButton("Display");
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
		checkBoxEven= new JCheckBox ("even");
		checkBoxEven.setSize(100, 50);
	checkBoxEven.setLocation(150,250);
	add(checkBoxEven);

	checkBoxOdd= new JCheckBox ("odd");
	checkBoxOdd.setSize(100, 50);
	checkBoxOdd.setLocation(250,250);
	add(checkBoxOdd);

	/*btnGrup= new ButtonGroup();
	btnGrup.add(checkBoxEven);
	btnGrup.add(checkBoxOdd);*/

	

	checkBoxEven.setSelected(true);
//	checkBoxOdd.setSelected(true);
	txtOne.addKeyListener(this);
	txtTwo.addKeyListener(this);
	txtOne.addMouseListener(this);
	btnCalculate.addMouseListener(this);
	txtTwo.addFocusListener(this);
	}

	public void display(){
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
		/*int one= Integer.parseInt(strOne);
		int two=Integer.parseInt(strTwo);*/	
		String total="";

		//for(int i =Integer.parseInt(txtOne.getText())); i++)
		if(checkBoxEven.isSelected()){
	 total= simple.even(strOne)+simple.even(strTwo);;		
		}
		else if(checkBoxOdd.isSelected()){
			total=simple.odd(strOne)+simple.odd(strTwo);
		}
		else if(checkBoxEven.isSelected()&& checkBoxOdd.isSelected())
			txtResult.setText(String.valueOf(strOne+strTwo));
		else{
			txtResult.setText("");
		}
		txtResult.setText(String.valueOf(total));
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
		BilgiEventsPartIII bilgi= new BilgiEventsPartIII();
		window.add(bilgi);
		window.setSize(500, 400);
		window.setVisible(true);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btnCalculate))
		display();
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
	}

	public void keyPressed(KeyEvent e) {
		if(e.getSource().equals(txtTwo)){
		if(e.getKeyCode()==e.VK_ENTER)
			display();
		else if(e.getKeyCode()==e.VK_ESCAPE)
			resetData();
		}
	}

	public void keyReleased(KeyEvent e) {
	}
	public void mouseClicked(MouseEvent e) {
		display();
	}
	public void mousePressed(MouseEvent e) {

	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
	//	System.out.println("Mouse is entered...");
	}
	public void mouseExited(MouseEvent e) {	
	}
	public void focusGained(FocusEvent e) {
	}
	public void focusLost(FocusEvent e) {

		if(txtTwo.getText().length()<1)
			lblStatus.setText("INput some data....");
	}
}