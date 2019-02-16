package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Modifyjdbc {
	
	
	
	
public void modifyName(String name,long accno) throws Exception
{	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET name=?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,name);
	preparedStmt.setLong(2,accno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}	


public void modifyAddress(String address,long accno) throws Exception
{	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET address = ?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,address);
	preparedStmt.setLong(2,accno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}


public void modifyContact(String contact,long accno) throws Exception
{	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET contact = ?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,contact);
	preparedStmt.setLong(2,accno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}


public void modifyEmail(String email,long accno) throws Exception
{	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET email = ?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,email);
	preparedStmt.setLong(2,accno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}


public void modifyMaritalstatus(String maritalstatus,long accno) throws Exception
{	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET maritalstatus = ?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,maritalstatus);
	preparedStmt.setLong(2,accno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}
public void modifyusername(String username,long accno) throws Exception
{	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET username = ?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,username);
	preparedStmt.setLong(2,accno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}
public void modifypwd(String passwd,long accno) throws Exception
{	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET passwd = ?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,passwd);
	preparedStmt.setLong(2,accno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}
public void modifyaddbalance(String balance,long othaccno,String amt) throws Exception
{	
	String bal= String.valueOf(Long.parseLong(balance)+Long.parseLong(amt));
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET balance = ?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,bal);
	preparedStmt.setLong(2,othaccno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}
public void modifysubbalance(String balance,long accno,String amt) throws Exception
{	
	String bal= String.valueOf(Long.parseLong(balance)-Long.parseLong(amt));
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("UPDATE cust_data SET balance = ?" + "WHERE accountnumber=?");
	preparedStmt.setString(1,bal);
	preparedStmt.setLong(2,accno);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
}





	
	
	
	
	

}
