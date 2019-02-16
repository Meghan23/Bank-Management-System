package customer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Custoptions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Custoptions(String username) {
		initialize(username);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String username) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String bal=null;
		getbalance gbal = new getbalance();
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWelcome.setBounds(170, 67, 94, 14);
		frame.getContentPane().add(lblWelcome);
		
		JButton btnTransferMoney = new JButton("Transfer Money");
		btnTransferMoney.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.dispose();
			Transfer obj = new Transfer(username);
			}
		});
		btnTransferMoney.setBounds(147, 204, 134, 37);
		frame.getContentPane().add(btnTransferMoney);
		
		JButton btnNewButton = new JButton("LOGOUT");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Loginagain pbj = new Loginagain();
			}
		});
		btnNewButton.setBounds(170, 253, 90, 28);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblBalance = new JLabel("Balance :");
		lblBalance.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblBalance.setBounds(33, 126, 68, 16);
		frame.getContentPane().add(lblBalance);
		try{bal = gbal.balance(username);
		}
		catch(Exception e) {System.out.println(e);}
		finally {
		
		JLabel lblNewLabel = new JLabel(bal);
		lblNewLabel.setLabelFor(lblBalance);
		lblNewLabel.setBounds(150, 126, 114, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\cust.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 349);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
}