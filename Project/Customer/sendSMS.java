package customer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


public class sendSMS {

	public String send(String cmessage ,String number) {
		try {
			// Construct data
			String apiKey = "apikey=" + "vwFQAnL9Kh0-ZqdMAOJ5aWEXqvf0kuFnoh1gRIgWMq";
			String message = "&message="+cmessage;
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=91" +number;
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();//connects to https://api.textlocal.in/send/? 
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);//method which determines if you want to  use url connection for output
			conn.setRequestMethod("POST");//depends on site
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));//depends on site
			conn.getOutputStream().write(data.getBytes("UTF-8"));//Returns an output stream that writes to this connection.
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));//Returns an input stream that reads from this open connection
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			return stringBuffer.toString();
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
	}
	public String getmobilenumber(Long acno) throws Exception {
		String number=null;
		getcontact obj = new getcontact();
		number = obj.contact(acno);
		return number;
	}
	public String transfermessage(Long acno,String amt,Long otheracno,String bal) throws Exception {
		String message=null;
		String name = null;
		getname obj = new getname();
		name=obj.name(acno);
		message ="Dear,"+name+".YourA/c"+acno+"has successfully transferred"+amt+"INR to"+otheracno+"Your current balance is"+bal;
		return message;
	}
	public String transferotheraccountmsg(String amt,Long otheracno,String bal) throws Exception {
		String message=null;
		String name = null;
		getname obj = new getname();
		name=obj.name(otheracno);
		message ="Dear,"+name+".YourA/c"+otheracno+"is debited with"+amt+"INR.Your current balance is"+bal;
		return message;
	}
	public String tempuserloginmessage(Long acno) throws Exception {
		String message;
		String username=String.valueOf(acno%100000);
		Modifyjdbc obj = new Modifyjdbc();
		obj.modifyusername(username,acno);
		String name = null;
		getname obj1 = new getname();
		name=obj1.name(acno);
		message="Dear Customer,"+name+".Your A/c"+acno+" has \nUsername: "+username+"\nPassword: 00000\n you can change it later";
		return message;
	}
}