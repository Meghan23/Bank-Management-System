package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Checkingaccountnumbervalidity {

	public boolean checkWhetherAccnoIsValid(long accountnumber) throws Exception
	{	
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","Meghan","meghanl23@");
			//statement is an interface
			//resultset is an interface
			PreparedStatement stmt=con.prepareStatement("SELECT * FROM cust_data");  
			ResultSet rs=stmt.executeQuery(); 
			long accno=0;
			boolean flag=false;
			while(rs.next())
			{	  
				accno=rs.getLong(12);
				if(accno==accountnumber)
				{
					flag=true;
				}
			}
			stmt.close();
			con.close();
			return flag;
	
	}

}
