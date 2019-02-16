package customer;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Validate {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */

					
	

	/**
	 * Create the application.
	 */
	public Validate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 469, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreateNewProfile = new JLabel("CREATE NEW PROFILE");
		lblCreateNewProfile.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCreateNewProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateNewProfile.setBounds(159, 57, 138, 14);
		frame.getContentPane().add(lblCreateNewProfile);
		
		JLabel lblAcNo = new JLabel("Enter A/c No.  carefully!");
		lblAcNo.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblAcNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcNo.setBounds(153, 110, 156, 14);
		frame.getContentPane().add(lblAcNo);
		
		textField = new JTextField();
		textField.setBounds(153, 147, 157, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnValidate = new JButton("VALIDATE");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(btnValidate, "Your User name and password will be provided via Text you can change it later");
				Long acno = Long.parseLong(textField.getText());
				sendSMS obj = new sendSMS();
				try {
					obj.send(obj.tempuserloginmessage(acno),obj.getmobilenumber(acno));
					System.out.println("sms send with username and passwd");
					frame.dispose();
					smsLogin obj1 = new smsLogin(acno);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		});
		btnValidate.setBounds(175, 207, 103, 23);
		frame.getContentPane().add(btnValidate);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Check ibj = new Check();
			}
		});
		btnBack.setBounds(6, 6, 90, 28);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\CRE.jpg"));
		lblNewLabel.setBounds(0, 0, 453, 315);
		frame.getContentPane().add(lblNewLabel);
	}
}
