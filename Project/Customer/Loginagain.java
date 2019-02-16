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

public class Loginagain {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Loginagain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnter = new JLabel("ENTER YOUR LOGIN DETAILS");
		lblEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnter.setBounds(119, 36, 191, 24);
		frame.getContentPane().add(lblEnter);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(73, 90, 71, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(73, 151, 71, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(160, 87, 165, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Custoptions object;
				Loginagain object1;
				Checkuser obj=new Checkuser();
				String user=textField.getText();
				String passwd=String.valueOf(passwordField.getPassword());
				getacnofromusername obj1=new getacnofromusername();
				try {
					System.out.println(obj1.getacno(user));
					if(obj.enteruser(user,passwd,obj1.getacno(user))) {
						frame.dispose();
						object =new Custoptions(user);
					}
					else {
						JOptionPane.showMessageDialog(btnLogin, "Incorrect Details!Enter details again!");
						frame.dispose();
						object1 = new Loginagain();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(174, 203, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 148, 165, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Check obj = new Check();
			}
		});
		btnBack.setBounds(6, 6, 78, 28);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\fssf.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
	}
}
