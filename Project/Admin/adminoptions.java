package admin;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class adminoptions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public adminoptions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(25, 25, 112));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("ADD NEW ACCOUNT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("unused")
				Insertinformationpage obj=new Insertinformationpage();
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(34, 211, 202, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDeleteAccount = new JButton("DELETE ACCOUNT");
		btnDeleteAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("unused")
				Enteraccountnumbertobedeleted obj=new Enteraccountnumbertobedeleted();
				frame.dispose();
			}
		});
		btnDeleteAccount.setForeground(Color.BLACK);
		btnDeleteAccount.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDeleteAccount.setBackground(Color.LIGHT_GRAY);
		btnDeleteAccount.setBounds(171, 277, 202, 37);
		frame.getContentPane().add(btnDeleteAccount);
		
		JButton btnModifyExistingAccount = new JButton("MODIFY EXISTING ACCOUNT");
		btnModifyExistingAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("unused")
				Tobemodified obj=new Tobemodified(); 
				frame.dispose();
			}
		});
		btnModifyExistingAccount.setForeground(Color.BLACK);
		btnModifyExistingAccount.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnModifyExistingAccount.setBackground(Color.LIGHT_GRAY);
		btnModifyExistingAccount.setBounds(307, 211, 202, 37);
		frame.getContentPane().add(btnModifyExistingAccount);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				trial2new objj = new trial2new();
			}
		});
		btnLogout.setBounds(434, 23, 90, 28);
		frame.getContentPane().add(btnLogout);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\aS.jpg"));
		label.setBounds(0, 0, 545, 442);
		frame.getContentPane().add(label);
		frame.setBounds(100, 100, 561, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
