package customer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Login(Long acno) {
		initialize(acno);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Long acno) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnter = new JLabel("ENTER YOUR NEW LOGIN DETAILS:");
		lblEnter.setBounds(61, 36, 301, 24);
		lblEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnter.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblEnter);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setBounds(73, 101, 71, 14);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(73, 151, 71, 14);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(160, 98, 165, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(184, 180, 89, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String passwd=passwordField.getText();
				Modifyjdbc obj = new Modifyjdbc();    
				try {
					obj.modifyusername(username,acno);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					obj.modifypwd(passwd,acno);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(btnLogin, " To login ...Login again with new credentials you just entered!");
				frame.dispose();
				Loginagain object=new Loginagain();
			}
		});
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 148, 165, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblRememberThisDetails = new JLabel("Remember these details");
		lblRememberThisDetails.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblRememberThisDetails.setBounds(160, 215, 147, 16);
		frame.getContentPane().add(lblRememberThisDetails);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\fssf.jpg"));
		label.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(label);
	}
}
