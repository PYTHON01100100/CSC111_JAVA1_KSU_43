package week9;

import java.util.Scanner;

public class Student1
{
	private int id;
	private double gpa;
	private String name;

	public Student1()
	{
		this(1,5.0,"NA");
	}
	
	public Student1(int id, double gpa, String name)
	{
		this.id = id;
		this.gpa = gpa;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public double getGpa()
	{
		return gpa;
	}

	public void setGpa(double gpa)
	{
		if (gpa >= 0 && gpa <= 5)
			this.gpa = gpa;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void read()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ID: ");
		this.id = input.nextInt();

		System.out.print("Enter Name: ");
		this.name = input.next();

		System.out.print("Enter GPA: ");
		double g = input.nextDouble();
		setGpa(g);
	
		input.close();
	}

	public void print()
	{
		System.out.println("Student Information");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("GPA: " + gpa);	
		System.out.println("--------------------");
	}

	public boolean betterGPA(Student1 s)
	{
		if (this.gpa > s.gpa)
			return true;
		else
			return false;
	}

	public Student1 m1(int g)
	{
		if (g >= gpa)
			return this;
		else
			return null;
	}
}
