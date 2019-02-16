package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deletequery {

	public Deletequery(long accountnumber)throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
	PreparedStatement preparedStmt = con.prepareStatement("DELETE FROM cust_data WHERE accountnumber=?");
	preparedStmt.setLong(1,accountnumber);
      int val=preparedStmt.executeUpdate();
      System.out.println(val);
      preparedStmt.close();
      con.close();
	}

}
