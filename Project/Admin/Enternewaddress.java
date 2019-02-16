package admin;
import customer.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Enternewaddress {

	private JFrame frame;
	private JTextField textField;
	private long accountnumber;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Enternewaddress(long accountnumber) {
		this.accountnumber=accountnumber;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 512, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER NEW ADDRESS");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 98, 179, 53);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(152, 163, 192, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("UPDATE ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				try
				{
					Modifyjdbc object=new Modifyjdbc();
					object.modifyAddress(textField.getText(),accountnumber);
				}
				catch(Exception ex){}
				JOptionPane.showMessageDialog(frame, "DETAILS SUCCESSFULLY UPDATED");
				frame.dispose();
				adminoptions object1=new adminoptions();
			}
		});
		btnNewButton.setBounds(181, 247, 133, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Modifyaccount obj1 = new Modifyaccount(accountnumber);
			}
		});
		btnBack.setBounds(6, 6, 90, 28);
		frame.getContentPane().add(btnBack);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				adminoptions obj1 = new adminoptions();
			}
		});
		btnHome.setBounds(400, 6, 90, 28);
		frame.getContentPane().add(btnHome);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\A New Design (4).jpg"));
		lblNewLabel_1.setBounds(0, 0, 496, 412);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
