package customer;
import java.sql.*;
public class Getaddr {
	public String address(Long acno) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
		//statement is an interface
		//resultset is an interface
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM cust_data");  
		ResultSet rs=stmt.executeQuery(); 
		String address = null;
		Long a=null;
		while(rs.next())
		{
			address=rs.getString(2);
			a=rs.getLong(12);
			if(a.equals(acno))
				break;
		}
		stmt.close();
		con.close();
		return address;
	}

}
