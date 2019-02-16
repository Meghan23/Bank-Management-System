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

public class Enternewname {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private long accno;
	private JButton btnBack;
	private JButton btnHome;
	private JLabel label;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public Enternewname(long accno) {
		this.accno=accno;
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
		
		JLabel lblNewLabel = new JLabel("ENTER NEW NAME");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(158, 90, 180, 39);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(158, 153, 180, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean isnamevalid=true;
				String name =textField.getText(); 
				for(int counter=0;counter<name.length();counter++)
				{		
					char ch = name.charAt(counter);
					if(Character.isDigit(ch))
					{
						isnamevalid = false;
						break;
					}
				
				}
		if(isnamevalid==true)
		{
			try
			{
				Modifyjdbc object=new Modifyjdbc();
				object.modifyName(textField.getText(),accno);
			}
			catch(Exception e){}
			JOptionPane.showMessageDialog(frame, "DETAILS SUCCESSFULLY UPDATED");
			frame.dispose();
			adminoptions object1=new adminoptions();
		}
		else
		{
			JOptionPane.showMessageDialog(frame, "PLEASE ENTER A VALID NAME");
			textField.setText("");
		}
			}
		});
		btnNewButton.setBounds(183, 216, 130, 34);
		frame.getContentPane().add(btnNewButton);
		
		btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Modifyaccount obj1 = new Modifyaccount(accno);
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
