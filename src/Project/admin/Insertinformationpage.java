package admin;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Insertinformationpage {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Insertinformationpage()  {
		try
		{
			initialize();
		}
		catch(Exception e){}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception {
		frame = new JFrame();
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 521, 591);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the details");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setBounds(204, 49, 97, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCreateNewAccount = new JLabel("CREATE NEW ACCOUNT");
		lblCreateNewAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateNewAccount.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCreateNewAccount.setBounds(182, 19, 140, 22);
		frame.getContentPane().add(lblCreateNewAccount);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(34, 82, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(34, 110, 66, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblContact = new JLabel("Contact :");
		lblContact.setBounds(34, 135, 66, 14);
		frame.getContentPane().add(lblContact);
		
		JLabel lblDob = new JLabel("DOB:");
		lblDob.setBounds(35, 194, 46, 14);
		frame.getContentPane().add(lblDob);
		
		JLabel lblAccountType = new JLabel("Account type:");
		lblAccountType.setBounds(35, 224, 76, 14);
		frame.getContentPane().add(lblAccountType);
		
		JRadioButton rdbtnCurrent = new JRadioButton("Current");
		rdbtnCurrent.setBackground(new Color(255, 255, 224));
		rdbtnCurrent.setBounds(136, 220, 76, 23);
		frame.getContentPane().add(rdbtnCurrent);
		
		JRadioButton rdbtnSavings = new JRadioButton("Savings");
		rdbtnSavings.setBackground(new Color(255, 255, 224));
		rdbtnSavings.setBounds(263, 220, 76, 23);
		frame.getContentPane().add(rdbtnSavings);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnCurrent);
		group1.add(rdbtnSavings);
		
		textField = new JTextField();
		textField.setBounds(138, 79, 334, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 107, 334, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 132, 121, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(136, 191, 116, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(34, 160, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		textField_4 = new JTextField();
		textField_4.setBounds(136, 163, 223, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCustomerType = new JLabel("Customer type:");
		lblCustomerType.setBounds(34, 262, 84, 14);
		frame.getContentPane().add(lblCustomerType);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Senior citizen");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(136, 258, 102, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMinor = new JRadioButton("Minor");
		rdbtnMinor.setBackground(Color.WHITE);
		rdbtnMinor.setBounds(263, 258, 59, 23);
		frame.getContentPane().add(rdbtnMinor);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBackground(Color.WHITE);
		rdbtnOther.setBounds(358, 258, 59, 23);
		frame.getContentPane().add(rdbtnOther);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton);
		group2.add(rdbtnMinor);
		group2.add(rdbtnOther);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(34, 292, 46, 14);
		frame.getContentPane().add(lblGender);
		
		
		
		JLabel lblMaritalStatus = new JLabel("Marital status:");
		lblMaritalStatus.setBounds(34, 329, 77, 14);
		frame.getContentPane().add(lblMaritalStatus);
		
		JRadioButton rdbtnMarried = new JRadioButton("Married");
		rdbtnMarried.setBackground(Color.WHITE);
		rdbtnMarried.setBounds(137, 325, 75, 23);
		frame.getContentPane().add(rdbtnMarried);
		
		JRadioButton rdbtnUnmarried = new JRadioButton("Unmarried");
		rdbtnUnmarried.setBackground(Color.WHITE);
		rdbtnUnmarried.setBounds(232, 325, 97, 23);
		frame.getContentPane().add(rdbtnUnmarried);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnMarried);
		group3.add(rdbtnUnmarried);
		
		JLabel lblOccupation = new JLabel("Occupation:");
		lblOccupation.setBounds(34, 367, 66, 14);
		frame.getContentPane().add(lblOccupation);
		
		JRadioButton rdbtnSalaried = new JRadioButton("Salaried");
		rdbtnSalaried.setBackground(Color.WHITE);
		rdbtnSalaried.setBounds(136, 363, 76, 23);
		frame.getContentPane().add(rdbtnSalaried);
		
		JRadioButton rdbtnSelfEmployed = new JRadioButton("Self-employed");
		rdbtnSelfEmployed.setBackground(Color.WHITE);
		rdbtnSelfEmployed.setBounds(232, 363, 107, 23);
		frame.getContentPane().add(rdbtnSelfEmployed);
		
		JRadioButton rdbtnBusiness = new JRadioButton("Business");
		rdbtnBusiness.setBackground(Color.WHITE);
		rdbtnBusiness.setBounds(358, 398, 84, 23);
		frame.getContentPane().add(rdbtnBusiness);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Retired");
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		rdbtnNewRadioButton_1.setBounds(136, 398, 66, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setBackground(Color.WHITE);
		rdbtnStudent.setBounds(232, 398, 76, 23);
		frame.getContentPane().add(rdbtnStudent);
		
		JRadioButton rdbtnOthers = new JRadioButton("Others");
		rdbtnOthers.setBackground(Color.WHITE);
		rdbtnOthers.setBounds(358, 363, 66, 23);
		frame.getContentPane().add(rdbtnOthers);
		
		ButtonGroup group4 = new ButtonGroup();
		group4.add(rdbtnSalaried);
		group4.add(rdbtnSelfEmployed);
		group4.add(rdbtnBusiness);
		group4.add(rdbtnNewRadioButton_1);
		group4.add(rdbtnStudent);
		group4.add(rdbtnOthers);
		
		JLabel lblEducation = new JLabel("Education:");
		lblEducation.setBounds(34, 447, 59, 14);
		frame.getContentPane().add(lblEducation);
		
		textField_6 = new JTextField();
		textField_6.setBounds(135, 444, 257, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String name=textField.getText();
				String address=textField_1.getText();
				String contact=textField_2.getText();
				String dob=textField_3.getText();
				String email=textField_4.getText();
				String gender=textField_5.getText();
				boolean current=rdbtnCurrent.isSelected();
				boolean savings=rdbtnSavings.isSelected();
				String education=textField_6.getText();
				boolean seniorcitizen=rdbtnNewRadioButton.isSelected();
				boolean minor=rdbtnMinor.isSelected();
				boolean other=rdbtnOther.isSelected();
				boolean married=rdbtnMarried.isSelected();
				boolean unmarried=rdbtnUnmarried.isSelected();
				boolean salaried=rdbtnSalaried.isSelected();
				boolean selfemployed=rdbtnSelfEmployed.isSelected();
				boolean business=rdbtnBusiness.isSelected();
				boolean retired=rdbtnNewRadioButton_1.isSelected();
				boolean student=rdbtnStudent.isSelected();
				boolean others=rdbtnOthers.isSelected();
				boolean isnamevalid=true;
			for(int counter=0;counter<name.length();counter++)
			{		
				char ch = name.charAt(counter);
				if(Character.isDigit(ch))
				{
					isnamevalid = false;
					break;
				}
			
			}
			
			
			boolean iscontactvalid=true;
			
			for(int counter=0;counter<contact.length();counter++)
			{
					char ch = contact.charAt(counter);
					if(!Character.isDigit(ch))
					{
						iscontactvalid = false;
						break;
					}
					
			}
			
			boolean isgendervalid=true;
			if(!(gender.equals("m") || gender.equals("f")))
			{		
				isgendervalid=false;
			}
			
			
			boolean isemailvalid=false;
			
			for(int counter=0;counter<email.length();counter++)
			{
					char ch = email.charAt(counter);
					if(ch=='@')
					{
						isemailvalid=true;
					}
			}
			
				String maritalstatus="";
				if(married == true)	
				{
					maritalstatus="married";
				}
				else
				{
					maritalstatus="unmarried";
				}
				String acctype="";
				if(current == true)	
				{
					acctype = "current";
				}
				else
				{
					acctype = "savings";
				}
				String occ="";
				if(salaried==true)
				{
					occ="salaried";
				}
				if(business==true)
				{
					occ="business";
				}
					
				if(retired == true)
				{
					occ="retired";
				}
				if(selfemployed == true)
				{
					occ="selfemployed";
				}
				if(student == true)
				{
					occ="student";
				}
				if(others == true)
				{
					occ="others";
				}
				String customertype="";
				if(seniorcitizen == true)
				{
					customertype="seniorcitizen";
				}
				if(minor == true)
				{
					customertype="minor";
				}
				
				if(other == true)
				{
					customertype="other";
				}
			if(isnamevalid==true && iscontactvalid==true && isgendervalid==true  && isemailvalid==true)
			{	
				try
				{
					Insert obj=new Insert();
					obj.Insertinfo(name,address,contact,email,dob, acctype,customertype,gender, maritalstatus,occ,education,"xyz","00000","2000");
					JOptionPane.showMessageDialog(frame, "DETAILS SUCCESSFULLY ENTERED");
					frame.dispose();
					
				}
				catch(Exception e){}
				@SuppressWarnings("unused")
				adminoptions object2=new adminoptions();
				frame.dispose();
			}
			else
			{
				if(iscontactvalid == false)
				{
					JOptionPane.showMessageDialog(frame, "Please enter a valid contact");
					textField_2.setText("");
				}
				if(isnamevalid == false)
				{
					JOptionPane.showMessageDialog(frame, "Please enter a valid name");
					textField.setText("");
				}
				if(isgendervalid == false)
				{		
					JOptionPane.showMessageDialog(frame, "Invalid gender,please enter m for male and f  for female");
					textField_5.setText("");
				}
				if(isemailvalid == false)
				{		
					JOptionPane.showMessageDialog(frame, "Please enter valid email id");
					textField_4.setText("");
				}
				
				
			}
			
			
			
			
			}
		});
	
		btnCreate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCreate.setBounds(209, 497, 89, 23);
		frame.getContentPane().add(btnCreate);
		
		textField_5 = new JTextField();
		textField_5.setBounds(136, 288, 116, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				adminoptions oobj = new adminoptions();
			}
		});
		btnBack.setBounds(10, 6, 90, 28);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Meghan L\\Downloads\\Project\\Create.jpg"));
		lblNewLabel_1.setBounds(0, 0, 505, 552);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
