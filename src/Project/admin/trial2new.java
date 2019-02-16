//username and password created...



package admin;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class trial2new {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */

	
	/**
	 * Create the application.
	 */
	public trial2new() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBackground(new Color(255, 0, 0));
		frame.setForeground(new Color(220, 20, 60));
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 549, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(223, 144, 137, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setBounds(77, 149, 74, 16);
		frame.getContentPane().add(lblUsername);

		
		passwordField = new JPasswordField();
		passwordField.setBounds(223, 218, 137, 27);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username=textField.getText();
				@SuppressWarnings("deprecation")
				String password=passwordField.getText();
				if(username.equals("anikamath") && password.equals("password"))
				{
					JOptionPane.showMessageDialog(frame, "You're successfully logged in");
					frame.dispose();
					@SuppressWarnings("unused")
					adminoptions obj =new adminoptions();
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Invalid username or password");
				}
		
			}
		});
		btnNewButton.setBounds(181, 321, 113, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setBounds(77, 223, 89, 16);
		frame.getContentPane().add(lblPassword);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			frame.dispose();
			trial obj1 = new trial();
			}
		});
		btnBack.setBounds(32, 22, 90, 28);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\A New Design.jpg"));
		lblNewLabel.setBounds(0, 0, 533, 427);
		frame.getContentPane().add(lblNewLabel);
	
	}
}
