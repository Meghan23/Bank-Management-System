package admin;

import customer.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Accountdetails {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public Accountdetails(String accountnumber) {
		initialize(accountnumber);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String accountnum) {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String uname = null;
		getname gname = new getname();
		String addr = null;
		Getaddr gaddr = new Getaddr();
		String ucont = null;
		getcontact gcont = new getcontact();
		String username = null;
		getusrfromacno gusrname = new getusrfromacno();
		String gender = null;
		Getgender ggender = new Getgender();
		String actype = null;
		Getactype gactype = new Getactype();
		String dob = null;
		Getdob gdob = new Getdob();
		JLabel lblVerifyDetails = new JLabel("VERIFY DETAILS");
		lblVerifyDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerifyDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVerifyDetails.setBounds(152, 26, 129, 14);
		frame.getContentPane().add(lblVerifyDetails);
		
		JLabel lblNewLabel = new JLabel("A/c No. :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(24, 65, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setBounds(24, 105, 64, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setBounds(24, 145, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblDob = new JLabel("DOB :");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDob.setBounds(24, 185, 46, 14);
		frame.getContentPane().add(lblDob);
		
		JLabel lblNewLabel_1 = new JLabel("Address :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(24, 225, 64, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAcType = new JLabel("A/c type :");
		lblAcType.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAcType.setBounds(24, 305, 64, 14);
		frame.getContentPane().add(lblAcType);
		
		JLabel lblNewLabel_2 = new JLabel("Gender :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(24, 345, 57, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblContact = new JLabel("Contact :");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContact.setBounds(24, 265, 64, 14);
		frame.getContentPane().add(lblContact);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Account deleted successfully");
				try{Deletequery uuu = new Deletequery(Long.parseLong(accountnum));}
				catch(Exception e) {System.out.println(e);}
				finally {
				frame.dispose();
				adminoptions ybj = new adminoptions();
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDelete.setBounds(172, 386, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Enteraccountnumbertobedeleted abj = new Enteraccountnumbertobedeleted();
			}
		});
		
		btnBack.setBounds(6, 9, 89, 23);
		frame.getContentPane().add(btnBack);
		try{uname = gname.name(Long.parseLong(accountnum));
		addr = gaddr.address(Long.parseLong(accountnum));
		ucont = gcont.contact(Long.parseLong(accountnum));
		username = gusrname.getusr(Long.parseLong(accountnum));
		gender = ggender.gender(Long.parseLong(accountnum));
		actype = gactype.actype(Long.parseLong(accountnum));
		dob = gdob.dob(Long.parseLong(accountnum));
		}
		catch(Exception e) {System.out.println(e);}
		finally {
		JLabel lblNewLabel_3 = new JLabel(accountnum);
		lblNewLabel_3.setLabelFor(lblNewLabel);
		lblNewLabel_3.setBounds(125, 63, 136, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(username);
		lblNewLabel_4.setLabelFor(lblUsername);
		lblNewLabel_4.setBounds(125, 103, 136, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(uname);
		lblNewLabel_5.setLabelFor(lblName);
		lblNewLabel_5.setBounds(125, 143, 136, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(dob);
		lblNewLabel_6.setLabelFor(lblDob);
		lblNewLabel_6.setBounds(125, 183, 136, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(addr);
		lblNewLabel_7.setLabelFor(lblNewLabel_1);
		lblNewLabel_7.setBounds(125, 223, 136, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(ucont);
		lblNewLabel_8.setLabelFor(lblContact);
		lblNewLabel_8.setBounds(125, 263, 136, 16);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel(actype);
		lblNewLabel_9.setLabelFor(lblAcType);
		lblNewLabel_9.setBounds(125, 303, 136, 16);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel(gender);
		lblNewLabel_10.setLabelFor(lblNewLabel_2);
		lblNewLabel_10.setBounds(125, 343, 136, 16);
		frame.getContentPane().add(lblNewLabel_10);
		
		JButton btnHome = new JButton("HOME");
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				adminoptions ebj = new adminoptions();
			}
		});
		btnHome.setBounds(338, 9, 90, 25);
		frame.getContentPane().add(btnHome);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\verify.jpg"));
		lblNewLabel_11.setBounds(0, 0, 434, 444);
		frame.getContentPane().add(lblNewLabel_11);
	}
}
}