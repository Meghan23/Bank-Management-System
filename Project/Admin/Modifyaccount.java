package admin;

import customer.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Modifyaccount {

	private JFrame frame;
	private long accountnumber;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Modifyaccount(long accountnumber) {
		this.accountnumber=accountnumber; 
		initialize(accountnumber);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(long accountnum) {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("SansSerif", Font.BOLD, 12));
		frame.setVisible(true);
		frame.setBounds(100, 100, 686, 548);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String uname = null;
		getname gname = new getname();
		String addr = null;
		Getaddr gaddr = new Getaddr();
		String ucont = null;
		getcontact gcont = new getcontact();
		String uemail = null;
		Getemail gemail = new Getemail();
		String umarry = null;
		Getmaritalstatus gmarry = new Getmaritalstatus();
		try{uname = gname.name(accountnum);
		addr = gaddr.address(accountnum);
		ucont = gcont.contact(accountnum);
		uemail = gemail.email(accountnum);
		umarry = gmarry.maritalstatus(accountnum);
		}
		catch(Exception e) {System.out.println(e);}
		finally {
			JButton btnBack = new JButton("BACK");
			btnBack.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					Tobemodified obj31 = new Tobemodified();
				}
			});
			btnBack.setBounds(10,11, 89, 23);
			frame.getContentPane().add(btnBack);
			
			JButton btnHome = new JButton("HOME");
			btnHome.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					frame.dispose();
					adminoptions obj1 = new adminoptions();
				}
			});
			btnHome.setBounds(571, 11, 89, 23);
			frame.getContentPane().add(btnHome);
			JButton btnNewButton = new JButton("CHANGE NAME");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Enternewname obj=new Enternewname(accountnumber);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(444, 83, 163, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnChangeAddress = new JButton("CHANGE ADDRESS");
		btnChangeAddress.setBackground(Color.LIGHT_GRAY);
		btnChangeAddress.setForeground(Color.BLACK);
		btnChangeAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enternewaddress obj1=new Enternewaddress(accountnumber);
				frame.dispose();
			}
		});
		btnChangeAddress.setBounds(444, 253, 163, 51);
		frame.getContentPane().add(btnChangeAddress);
		
		JButton btnContactNumber = new JButton("CONTACT NUMBER");
		btnContactNumber.setBackground(Color.LIGHT_GRAY);
		btnContactNumber.setForeground(Color.BLACK);
		btnContactNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enternewcontact obj2=new Enternewcontact(accountnumber);
				frame.dispose();
			}
		});
		btnContactNumber.setBounds(444, 168, 163, 51);
		frame.getContentPane().add(btnContactNumber);
		
		JButton btnChangeEmail = new JButton("CHANGE EMAIL");
		btnChangeEmail.setBackground(Color.LIGHT_GRAY);
		btnChangeEmail.setForeground(Color.BLACK);
		btnChangeEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enternewemail obj3=new Enternewemail(accountnumber);
				frame.dispose();
			}
		});
		btnChangeEmail.setBounds(444, 338, 163, 51);
		frame.getContentPane().add(btnChangeEmail);
		
		JButton btnChangeMaritalstatus = new JButton("CHANGE MARITAL STATUS");
		btnChangeMaritalstatus.setBackground(Color.LIGHT_GRAY);
		btnChangeMaritalstatus.setForeground(Color.BLACK);
		btnChangeMaritalstatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Enternewmaritalstatus obj4=new Enternewmaritalstatus(accountnumber);
				frame.dispose();
			}
		});
		btnChangeMaritalstatus.setBounds(444, 423, 216, 51);
		frame.getContentPane().add(btnChangeMaritalstatus);
		
		JLabel lblYourCurrentDetails = new JLabel("Your current details are ");
		lblYourCurrentDetails.setForeground(Color.WHITE);
		lblYourCurrentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourCurrentDetails.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblYourCurrentDetails.setBounds(247, 33, 176, 14);
		frame.getContentPane().add(lblYourCurrentDetails);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblName.setBounds(22, 100, 55, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblContact = new JLabel("CONTACT :");
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblContact.setBounds(22, 185, 63, 16);
		frame.getContentPane().add(lblContact);
		
		JLabel lblAddress = new JLabel("ADDRESS  :");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblAddress.setBounds(22, 270, 76, 16);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblEmail = new JLabel("E-MAIL :");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblEmail.setBounds(22, 355, 55, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblMaritalStatus = new JLabel("MARITAL STATUS :");
		lblMaritalStatus.setForeground(Color.WHITE);
		lblMaritalStatus.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblMaritalStatus.setBounds(22, 440, 116, 16);
		frame.getContentPane().add(lblMaritalStatus);
		
		JLabel lblNewLabel = new JLabel(uname);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(150, 100, 163, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(ucont);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(150, 185, 163, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(addr);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(150, 270, 163, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(uemail);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(150, 355, 163, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(umarry);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(150, 440, 163, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\AFJKADBF.jpg"));
		lblNewLabel_5.setBounds(0, 0, 670, 509);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
}