package model;

public class Customer 
{
	private int customer_id;
	private String customer_name;
	private String email_address;
	private String mobile_number;
	private int account_number;
	private String password;
	private float balance_amount;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getBalance_amount() 
	{
		return balance_amount;
	}
	public void setBalance_amount(float balance_amount) 
	{
		this.balance_amount = balance_amount;
	}
	public Customer(int customer_id, String customer_name, String email_address, String mobile_number,
			int account_number, String password) 
	{
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.email_address = email_address;
		this.mobile_number = mobile_number;
		this.account_number = account_number;
		this.password = password;
	}
	public Customer(int i, String string, String string2, String string3, int j, String string4, float f) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
	
