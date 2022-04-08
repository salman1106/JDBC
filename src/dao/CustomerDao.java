package dao;

import model.*;
import java.util.*;
import java.sql.*;

public class CustomerDao 
{
	Connection con;
	Statement st;
	ResultSet rs;
	public CustomerDao() 
	{
		try 
		{
	
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
		}
		catch(Exception ex)
		{
			System.out.println("Exception Caught on Db Connection =>"+ex.getMessage());
		}
	}
	
	public String CustomerOperations(String type,Customer c) 
	{
		int cnt=0;
		try 
		{
	
			st=con.createStatement();
			if(type.equals("Insert"))
			{
				cnt=st.executeUpdate("insert into tblcustomers values("+c.getCustomer_id()+",'"+c.getCustomer_name()+"','"+c.getEmail_address()+"','"+c.getMobile_number()+"',"+c.getAccount_number()+",'"+c.getPassword()+"',"+c.getBalance_amount()+")");
				if(cnt>0)
				{
					return "Customer Added Successfully";
				}
				else 
				{
					return "Error!! Please try again";
				}
		}
		else if(type.equals("Update")) {
			cnt=st.executeUpdate("update tblcustomers  set customer_name='"+c.getCustomer_name()+"', email_address='"+c.getEmail_address()+"', mobile_number='"+c.getMobile_number()+"', account_number="+c.getAccount_number()+", password='"+c.getPassword()+"', balance_amount="+c.getBalance_amount()+" where customer_id="+c.getCustomer_id());
			if(cnt>0)
			{
				return "Customer Updated Successfully";
			}
			else {
				return "Error!! Please try again";
			}
		}
		else if(type.equals("Delete")) {
			cnt=st.executeUpdate("delete from tblcustomers   where customer_id="+c.getCustomer_id());
			if(cnt>0)
			{
				return "Customer Deleted Successfully";
			}
			else {
				return "Error!! Please try again";
			}
		}
		else
		{
			return "Please give correct choice";
		}
		
		
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
	return "";
}


public List<Customer> GetAllCustomers(){
	List<Customer>lst=new ArrayList<>();
	try {
	
		st=con.createStatement();
		rs=st.executeQuery("select * from tblcustomers");
		while(rs.next())
		{
			Customer c=new Customer(rs.getInt("customer_id"), rs.getString("customer_name"), rs.getString("email_address"), rs.getString("mobile_number"), rs.getInt("account_number"), rs.getString("password"),rs.getFloat("balance_amount"));
			lst.add(c);
		}
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	return lst;
}

public  Customer GetCustomerById(int cid){
	List<Customer>lst=new ArrayList<>();
	try {
	
		st=con.createStatement();
		rs=st.executeQuery("select * from tblcustomers where customer_id="+cid);
		if(rs.next())
		{
			Customer c= new Customer(rs.getInt("customer_id"), rs.getString("customer_name"), rs.getString("email_address"), rs.getString("mobile_number"), rs.getInt("account_number"), rs.getString("password"),rs.getFloat("balance_amount"));
			return c;
		}
		else
		{
			return null;
		}
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	return null;
	
}


public  void CheckCustomerLogin(int accno,String pass)
{
	//List<Customer>lst=new ArrayList<>();
	try {
	
		st=con.createStatement();
		rs=st.executeQuery("select * from tblcustomers where account_number="+accno+"  and password='"+pass+"'");
		if(rs.next())
		{
			System.out.println(rs.getInt("customer_id")+" "+ rs.getString("customer_name")+" "+ rs.getString("email_address")+" "+ rs.getString("mobile_number")+" "+ rs.getInt("account_number")+" "+ rs.getString("password")+" "+rs.getFloat("balance_amount"));
		}
		else
		{
			System.out.println("Invalid Account number or password");
		}
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	 
}
}
