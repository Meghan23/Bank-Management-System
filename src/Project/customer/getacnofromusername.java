package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getacnofromusername {
	public Long getacno(String username) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
		//statement is an interface
		//resultset is an interface
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM cust_data");
		ResultSet rs=stmt.executeQuery(); 
		Long number = null;
		String u=null;
		while(rs.next())
		{
			number=rs.getLong(12);
			u=rs.getString(13);
			if(u.equals(username))
				break;
			
		}
		stmt.close();
		con.close();
		return number;
	}

}
