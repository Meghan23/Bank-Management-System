package customer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Transfer {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Transfer(String username) {
		initialize(username);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String username) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 493, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTransfereesAcNo = new JLabel("Transferee's A/c No. :");
		lblTransfereesAcNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTransfereesAcNo.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblTransfereesAcNo.setBounds(95, 74, 150, 14);
		frame.getContentPane().add(lblTransfereesAcNo);
		
		textField = new JTextField();
		textField.setBounds(271, 71, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAmount = new JLabel("Amount :");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblAmount.setBounds(105, 106, 62, 14);
		frame.getContentPane().add(lblAmount);
		
		textField_1 = new JTextField();
		textField_1.setBounds(271, 103, 140, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTransfer = new JButton("TRANSFER");
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String amt=textField_1.getText();
				Long otheracno=Long.parseLong(textField.getText());
				Modifyjdbc obj=new Modifyjdbc();
				getbalance obj1=new getbalance();
				getacnofromusername obj2=new getacnofromusername(); 
				getusrfromacno obj3 = new getusrfromacno();
				getcontact obj5 = new getcontact();
				sendSMS obj4 = new sendSMS();
				sendSMS obj6 = new sendSMS();
				String otheruser=null;
				try {
					otheruser=obj3.getusr(otheracno);
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					obj.modifysubbalance(obj1.balance(username),obj2.getacno(username), amt);
					System.out.println("Transfer message to user ac");
					obj4.send(obj4.transfermessage(obj2.getacno(username), amt, otheracno, obj1.balance(username)), obj5.contact(obj2.getacno(username)));
				} catch (Exception e1) {
					// TODO Auto-generated catch bloc
					e1.printStackTrace();
				}
				try {
					obj.modifyaddbalance(obj1.balance(otheruser), otheracno, amt);
					System.out.println("Transfer message to other ac");
					obj4.send(obj6.transferotheraccountmsg(amt, otheracno, obj1.balance(obj3.getusr(otheracno))), obj5.contact(otheracno));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.dispose();
				Custoptions cust=new Custoptions(username);
				
			}
		});
		btnTransfer.setFont(new Font("SansSerif", Font.BOLD, 11));
		btnTransfer.setBounds(194, 183, 89, 23);
		frame.getContentPane().add(btnTransfer);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				Custoptions abj = new Custoptions(username);
			}
		});
		btnBack.setBounds(6, 6, 76, 28);
		frame.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\TRANSFER.jpg"));
		label.setBounds(0, 0, 477, 293);
		frame.getContentPane().add(label);
	}
}
