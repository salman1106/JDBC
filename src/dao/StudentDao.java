package dao;

import java.sql.*;
import model.Student;

public class StudentDao 
{

	Connection con;
	
	public void AddStudent(Student s)
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			Statement st = con.createStatement();
			
			int query = st.executeUpdate("insert into student  values ("+s.getRoll_no()+",'"+s.getName()+"','"+s.getCourse()+"')");
			
			if(query>0)
			{
				System.out.println("Data Stored successfully");
			}
			else
			{
				System.out.println("There is some issue in Code, please check again");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception at ==>" +ex.getMessage());
		}
		
	}
	
}
