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
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Enternewmaritalstatus {

	private JFrame frame;
	private long accountnumber;
	private JTextField textField;
	private JButton btnBack;
	private JButton btnHome;
	private JLabel label;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Enternewmaritalstatus(long accountnumber) {
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
		
		JLabel lblNewLabel = new JLabel("ENTER NEW MARITAL STATUS");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(121, 86, 253, 57);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(144, 155, 207, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Modifyjdbc object=new Modifyjdbc();
					object.modifyMaritalstatus(textField.getText(),accountnumber);
				}
				catch(Exception ex){}
				JOptionPane.showMessageDialog(frame, "DETAILS SUCCESSFULLY UPDATED");
				frame.dispose();
				adminoptions object1=new adminoptions();
				
				
			}
		});
		btnNewButton.setBounds(199, 224, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Modifyaccount obj1 = new Modifyaccount(accountnumber);
			}
		});
		btnBack.setBounds(6, 6, 90, 28);
		frame.getContentPane().add(btnBack);
		
		btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				adminoptions obj1 = new adminoptions();
			}
		});
		btnHome.setBounds(400, 6, 90, 28);
		frame.getContentPane().add(btnHome);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\A New Design (4).jpg"));
		label.setBounds(0, 0, 496, 412);
		frame.getContentPane().add(label);
	}

}
