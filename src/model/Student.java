package model;

public class Student 
{
	private int roll_no;
	private String name;
	private String course;
	
	public int getRoll_no()
	{
		return roll_no;
	}
	public void setRoll_no(int roll_no)
	{
		this.roll_no = roll_no;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getCourse() 
	{
		return course;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	
	public Student(int rno, String sname, String scourse)
	{
		this.roll_no = rno;
		this.name = sname;
		this.course = scourse;
	}
}
