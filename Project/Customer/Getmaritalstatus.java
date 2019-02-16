package customer;
import java.sql.*;
public class Getmaritalstatus {
	public String maritalstatus(Long acno) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
		//statement is an interface
		//resultset is an interface
		PreparedStatement stmt=con.prepareStatement("SELECT * FROM cust_data");  
		ResultSet rs=stmt.executeQuery(); 
		String maritalstatus = null;
		Long a=null;
		while(rs.next())
		{
			maritalstatus=rs.getString(9);
			a=rs.getLong(12);
			if(a.equals(acno))
				break;
		}
		stmt.close();
		con.close();
		return maritalstatus;
	}

}
