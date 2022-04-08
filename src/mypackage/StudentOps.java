package mypackage;

import java.util.Scanner;

import dao.StudentDao;
import model.Student;
public class StudentOps 
{

	public static void main(String[] args) 
	{

		
		int roll;
		String name, course;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Registration Form");
		System.out.println("Enter Roll Number: ");
		roll = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Course: ");
		course = sc.next();
		
		Student s = new Student(roll,name,course);
		StudentDao std = new StudentDao();
		std.AddStudent(s);
		
		sc.close();
		
	}

}
