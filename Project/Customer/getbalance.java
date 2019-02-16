package customer;
import java.sql.*;

public class getbalance {
	public String balance(String username) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
		//statement is an interface
		//resultset is an interface
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM cust_data");  
		ResultSet rs=stmt.executeQuery();
		String bal = null ;
		String u=null;
		while(rs.next()) 
		{
			bal=rs.getString(15);
			u=rs.getString(13);
			if(u.equals(username))
				break;
		}
		stmt.close();
		con.close();
		return bal;
	}

}
