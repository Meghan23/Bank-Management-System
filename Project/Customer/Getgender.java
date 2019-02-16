package customer;
import java.sql.*;
public class Getgender {
	public String gender(Long acno) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
		//statement is an interface
		//resultset is an interface
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM cust_data");  
		ResultSet rs=stmt.executeQuery(); 
		String gender = null;
		Long a=null;
		while(rs.next())
		{
			gender=rs.getString(8);
			a=rs.getLong(12);
			if(a.equals(acno))
				break;
		}
		stmt.close();
		con.close();
		return gender;
	}
}
