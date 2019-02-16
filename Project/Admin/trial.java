package admin;
import javax.swing.*;
import customer.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
public class trial {

	private JFrame frmFramenumber;
	
	public static void main(String[] args) {
	@SuppressWarnings("unused")
	trial obj;
	obj = new trial();
	}

	
	public trial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFramenumber = new JFrame();
		frmFramenumber.setTitle("Framenumber1");
		frmFramenumber.setBackground(new Color(0, 0, 128));
		frmFramenumber.setVisible(true);
		frmFramenumber.getContentPane().setBackground(Color.YELLOW);
		frmFramenumber.getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmFramenumber.dispose();
				@SuppressWarnings("unused")
				trial2new object1;
				object1 = new trial2new();
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(97, 260, 130, 46);
		frmFramenumber.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CUSTOMER");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFramenumber.dispose();
				Check obj=new Check();
			}
		});
	
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(280, 260, 130, 46);
		frmFramenumber.getContentPane().add(btnNewButton_1);
		
		JLabel lblSelectTheUser = new JLabel("Select the user type");
		lblSelectTheUser.setForeground(Color.WHITE);
		lblSelectTheUser.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblSelectTheUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectTheUser.setBounds(175, 168, 180, 24);
		frmFramenumber.getContentPane().add(lblSelectTheUser);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(197, 76, 137, 16);
		frmFramenumber.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\back.jpg"));
		lblNewLabel_1.setBounds(0, 0, 531, 429);
		frmFramenumber.getContentPane().add(lblNewLabel_1);
		frmFramenumber.setForeground(Color.RED);
		frmFramenumber.setBounds(100, 100, 547, 468);
		frmFramenumber.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
	}
}
