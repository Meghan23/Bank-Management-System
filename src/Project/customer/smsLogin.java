package customer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class smsLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public smsLogin(Long acno) {
		
		initialize(acno);
	}
	private void initialize(Long acno) {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(192, 92, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterDetailsProvided = new JLabel("ENTER DETAILS PROVIDED BY SMS");
		lblEnterDetailsProvided.setBounds(93, 33, 236, 16);
		frame.getContentPane().add(lblEnterDetailsProvided);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(77, 95, 72, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(77, 154, 72, 16);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(192, 151, 116, 22);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login object;
				smsLogin object1;
				Checkuser obj=new Checkuser();
				String user=textField.getText();
				String passwd=String.valueOf(passwordField.getPassword());
				try {
					if(obj.enteruser(user, passwd,acno)) {
						JOptionPane.showMessageDialog(btnLogin,"Login again with new details!");
						frame.dispose();
						object =new Login(acno);
					}
					else {
						JOptionPane.showMessageDialog(btnLogin, "Incorrect Details!Enter details again!");
						frame.dispose();
						object1 = new smsLogin(acno);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(168, 199, 97, 25);
		frame.getContentPane().add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\fssf.jpg"));
		label.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(label);
		
		
	}
}
