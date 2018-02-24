

import javax.swing.Icon;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JPasswordField;

import javax.swing.JTextField;

public class JGUI {//PART II PROBLEM 01
	public static void main(String[] args) {
		JGUI8();// FOR the username and password LABEL
		// JGUI();
		
		 // JGUI1();		 
		// JGUI2();	 
		 //JGUI3();		 
		 //JGUI4();		 
		 //JGUI5();
		 
		// JGUI6();
		// JGUI7();
	
	}
	private static void JGUI8() {
		
		JTextField username = new JTextField();
		JTextField password = new JPasswordField();
		Object[] message = {
		"Username:", username,
		"Password:", password
		};
		int option = JOptionPane.showConfirmDialog(null, message, "Login",
				JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			if (username.getText().equals("name")
					&& password.getText().equals("123123")) {
			JOptionPane.showMessageDialog(null, "Login Successful.",
						"Entering!", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			if ((username.getText() != ("name") && password.getText() != ("123123"))) {
				if ((username.getText() != ("name") && password.getText() != ("123123"))) {
					JOptionPane.showMessageDialog(null, "Please,Try again!",
							"Wrong Password!(Last 2 chance)",
							JOptionPane.QUESTION_MESSAGE);
					int a = JOptionPane.showConfirmDialog(null, message,
							"Login", JOptionPane.OK_CANCEL_OPTION);
					if ((username.getText() != ("h") && password.getText() != ("123123"))) {
					JOptionPane.showMessageDialog(null,
								"Please,Try again!",
								"Wrong Password!(Last 1 chance)",
								JOptionPane.QUESTION_MESSAGE);

						JOptionPane.showConfirmDialog(null, message, "Login",
								JOptionPane.OK_CANCEL_OPTION);
					}
					if ((username.getText() != ("name") && password.getText() != ("123123"))) {
						JOptionPane.showMessageDialog(null, "Wrong password",
								"Your account is blocked!",
								JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Canceled", "",
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
	private static void JGUI7() {
		String s = JOptionPane.showInputDialog(null,
				"Enter your user name and password", "Sign in", 0);
	}
	private static void JGUI6() {
		Object[] possibilities = { "ham", "spam", "yam" };
		Icon icon = null;
		String s = (String) JOptionPane.showInputDialog(null,
		"Complete the sentence:\n"
		+ "\"Green eggs and...\"",
		"Customized Dialog",
		JOptionPane.PLAIN_MESSAGE,
		icon,
		possibilities,
		"ham");
	}
	private static void JGUI5() {
		// an example to check return data
		int response = JOptionPane.showConfirmDialog(null,
				"Do you want to continue?", "Confirm",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		if (response == JOptionPane.NO_OPTION) {
			System.out.println("No button clicked");
		} else if (response == JOptionPane.YES_OPTION) {
		System.out.println("Yes button clicked");
		} else if (response == JOptionPane.CLOSED_OPTION) {
			System.out.println("JOptionPane closed");
		}
	}
	private static void JGUI4() {
		// default icon, custom title
		int n = JOptionPane.showConfirmDialog(
		null,
		"Would you like green eggs and ham?",
		"An Inane Question",
		JOptionPane.YES_NO_OPTION);
	}
	private static void JGUI3() {
		Object[] options = { "Yes, please", "No way!" };
		int n = JOptionPane.showOptionDialog(null,
		"Would you like green eggs and ham?",
		"A Silly Question",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null, // do not use a custom Icon
				options, // the titles of buttons
				options[0]); // default button title
	}
	private static void JGUI2() {
		// default icon, custom title
		int n = JOptionPane.showConfirmDialog(
		null,
		"Would you like green eggs and ham?",
		"An Inane Question",
		JOptionPane.YES_NO_OPTION);
	}

	private static void JGUI1() {
		// Custom button text
		Object[] options = { "Yes, please", "No, thanks", "No eggs, no ham!" };
		int n = JOptionPane.showOptionDialog(null,
		"Would you like some green eggs to go "
		+ "with that ham?",
		"A Silly Question",
		JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,
		options,
		options[2]);
	}
	private static void JGUI() {
		// default title and icon
		JOptionPane.showMessageDialog(null,
				"Eggs are not supposed to be green.");
		// custom title, warning icon
		JOptionPane.showMessageDialog(null,
				"Eggs are not supposed to be green.",
				"Inane warning",
				JOptionPane.WARNING_MESSAGE);
		// custom title, error icon*/
		JOptionPane.showMessageDialog(null,
			"Eggs are not supposed to be green.",
				"Inane error",
				JOptionPane.ERROR_MESSAGE);
		// custom title, no icon
		JOptionPane.showMessageDialog(null,
				"Eggs are not supposed to be green.",
				"A plain message",
				JOptionPane.PLAIN_MESSAGE);
		Icon icon = null;
		// custom title, custom icon
		JOptionPane.showMessageDialog(null,
				"Eggs are not supposed to be green.",
				"Inane custom dialog",
				JOptionPane.INFORMATION_MESSAGE,
			icon);
	}
}