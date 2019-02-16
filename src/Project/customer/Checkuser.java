package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Checkuser {
	public boolean enteruser(String user,String passwd,Long acno) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
		//statement is an interface
		//resultset is an interface
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM cust_data ");  
		ResultSet rs=stmt.executeQuery();
		String p=null;
		String u=null;
		Long a=null;
		boolean flag=false;
		while(rs.next()) {
			u=rs.getString(13);
			p=rs.getString(14);
			a=rs.getLong(12);
			if( u.equals(user) & p.equals(passwd) & a.equals(acno) ) {
				flag=true;
				break;
			}
			else
				System.out.println(0);
		}
		return flag;
	}
	
}
