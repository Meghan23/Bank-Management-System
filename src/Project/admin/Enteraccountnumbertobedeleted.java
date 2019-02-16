package admin;

import customer.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import admin.Deletequery;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Enteraccountnumbertobedeleted {

	private JFrame frame;
	private JTextField textField;
	public Enteraccountnumbertobedeleted() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(UIManager.getColor("menu"));
		frame.setBackground(UIManager.getColor("Menu.background"));
		frame.setBounds(100, 100, 509, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACCOUNT NUMBER");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(UIManager.getColor("textText"));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(183, 172, 126, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(UIManager.getColor("text"));
		textField.setBounds(171, 138, 153, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ACCOUNT DELETION");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(157, 85, 171, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		try
		{
			boolean isaccnovalid=false;
			Checkingaccountnumbervalidity object2=new Checkingaccountnumbervalidity();
			isaccnovalid=object2.checkWhetherAccnoIsValid(Long.parseLong(textField.getText()));
			
		if(isaccnovalid==true)
		{		
			@SuppressWarnings("unused")
		 Accountdetails ibj = new Accountdetails(textField.getText());
			frame.dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(frame, "ACCOUNT NUMBER INVALID");
			textField.setText("");
		}
		}
		catch(Exception exc){}
		}});
			
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(198, 235, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.dispose();
			adminoptions oobj = new adminoptions();
			}
		});
		btnBack.setBounds(6, 6, 90, 28);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\A New Design (3).jpg"));
		lblNewLabel_2.setBounds(0, 0, 493, 348);
		frame.getContentPane().add(lblNewLabel_2);
		

}
}
	
