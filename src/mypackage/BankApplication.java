package mypackage;

import model.Customer;
import java.util.*;
import dao.CustomerDao;

public class BankApplication 
{

	public void BankOptions() 
	{
		int ch;
		int p=1;
		while(p!=0)
		{
			Scanner sc=new Scanner(System.in);
			CustomerDao cdao=new CustomerDao();
			System.out.println("Enter your choice\n1.Login\n2.Register");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:	
				{
					System.out.println("enter Account Number");
					int acno=sc.nextInt();
					System.out.println("enter Password");
					String pas=sc.next();
					cdao.CheckCustomerLogin(acno,pas);
					break;
				}
				case 2:
				{
					System.out.println("enter Customer Id");
					int cid=sc.nextInt();
					System.out.println("enter Customer Name");
					String cname=sc.next();
					System.out.println("enter Email Address");
					String email=sc.next();
					System.out.println("enter Mobile Number");
					String mob=sc.next();
					System.out.println("enter Account Number");
					int acno=sc.nextInt();
					System.out.println("enter Password");
					String pas=sc.next();
					System.out.println("enter Inital Balance Amount");
					float b=sc.nextFloat();
					Customer c=new Customer(cid, cname, email, mob, acno, pas, b);
					cdao.CustomerOperations("Insert",c );
					break;
				}
			
				default:	
				{
					System.out.println("Wrong Choice");
					break;
				}
			
			}
			System.out.println("Continue?Yes(1)/No(0)");
			p=sc.nextInt();
			}
		}
	public static void main(String[] args) 
	{
		BankApplication b=new BankApplication();
		b.BankOptions();
	}

}
