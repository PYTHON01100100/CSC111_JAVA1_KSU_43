package arraysOfObjects;

import java.util.Scanner;

public class Student
{
	private int id;
	private String name;
	private double gpa;
	
	public Student()
	{
		id = 1;
		gpa = 5;
		name = "NA";
	}

	public Student(int id, String name, double gpa)
	{
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{	
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void setGpa(double gpa)
	{
		this.gpa = gpa;
	}
	
	public void readStudent()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ID   : ");
		id = input.nextInt();
		
		System.out.print("Enter GPA  : ");
		gpa = input.nextDouble();
		
		System.out.print("Enter Name : ");
		name = input.next();
		
		input.close();
	}
	
	public void print()
	{
		System.out.println("Student Information");
		
		System.out.println("Name : " + name);
		System.out.println("ID   : " + id);
		System.out.println("GPA  : " + gpa);
		System.out.println("------------------------------");
	}
	
	public String toString()
	{
		return name + ", " + id + ", " + gpa;
	}
}