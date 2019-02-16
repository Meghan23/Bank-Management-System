package admin;
import java.sql.*;


public class Insert 
{
	public void Insertinfo(String name,String address,String contact,String email,String dob,String acctype,String customertype,String gender,String maritalstatus,String occupation,String education,String username,String passwd,String balance) throws Exception
	
	{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
			//statement is an interface
			//resultset is an interface
			PreparedStatement preparedStmt = con.prepareStatement("INSERT INTO cust_data(name,address,contact,email,dob,accounttype,customertype,gender,maritalstatus,occupation,education,username,passwd,balance)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			 preparedStmt.setString (1,name);
		      preparedStmt.setString (2, address);
		      preparedStmt.setString (3, contact);
		      preparedStmt.setString (4, email);
		      preparedStmt.setString (5, dob);
		      preparedStmt.setString (6, acctype);
		      preparedStmt.setString (7, customertype);
		      preparedStmt.setString (8, gender);
		      preparedStmt.setString (9, maritalstatus);
		      preparedStmt.setString (10, occupation);
		      preparedStmt.setString (11, education);
		      preparedStmt.setString (12,username);
		      preparedStmt.setString (13,passwd);
		      preparedStmt.setString (14,balance);
		      int val=preparedStmt.executeUpdate();
		      System.out.println(val);
		      preparedStmt.close();
		      con.close();
	}
	
	
}
