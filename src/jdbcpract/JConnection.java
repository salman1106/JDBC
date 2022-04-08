package jdbcpract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JConnection 
{

	public static void main(String[] args) 
	{
		
		String name,city,post;
		
		Connection con;
		Statement st;
		ResultSet rs;
		int cnt=0;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			
				
			System.out.println("Enter You name: ");
			name = sc.next();
			System.out.println("Enter City: ");
			city = sc.next();
			System.out.println("Enter Your Post: ");
			post = sc.next();
			
			st = con.createStatement();
			cnt = st.executeUpdate("insert into info values('"+name+"','"+city+"','"+post+"')");
			
			System.out.println("Information is stored in DB successfully.");
		
		}
		catch (Exception ex)
		{
			System.out.println("Exception Caught at DB connection =>" +ex.getMessage());
		}
		
	}

}
