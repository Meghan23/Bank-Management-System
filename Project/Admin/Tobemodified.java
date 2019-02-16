package admin;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tobemodified {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Tobemodified() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 672, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER ACCOUNT NUMBER TO BE MODIFIED");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(169, 107, 317, 46);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(193, 183, 270, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnChangeDetails = new JButton("SUBMIT");
		btnChangeDetails.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnChangeDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					boolean isaccnovalid=false;
					Checkingaccountnumbervalidity object2=new Checkingaccountnumbervalidity();
					isaccnovalid=object2.checkWhetherAccnoIsValid(Long.parseLong(textField.getText()));
					if(isaccnovalid==true)
					{
						Modifyaccount obj=new Modifyaccount(Long.parseLong(textField.getText()));
						frame.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "ACCOUNT NUMBER INVALID");
						textField.setText("");
					}	
				}
				catch(Exception excet){}
				
				
				
				
				
				
			}
		});
		btnChangeDetails.setBackground(Color.LIGHT_GRAY);
		btnChangeDetails.setBounds(252, 297, 152, 36);
		frame.getContentPane().add(btnChangeDetails);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				adminoptions obbj = new adminoptions();
			}
		});
		btnBack.setBounds(6, 6, 90, 28);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\search.jpg"));
		lblNewLabel_1.setBounds(0, 0, 656, 481);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
