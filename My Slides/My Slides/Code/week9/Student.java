package week9;

import java.util.Scanner;

public class Student
{
	private int id;
	private String name;
	private double gpa;
	private boolean isMarried;

	public void method1()
	{
		 //Constructor call must be the first statement in a constructor
		//this(433000,"NA",5,false);
	}

	public Student() 
	{
		this(433000,"NA",5,false);
		//Student(433000,"NA",5,false); The method Student(int, String, int, boolean) is undefined for the type Student
		int x;

		System.out.println("I am in student cubtroctor");

		/*
		id = 433000;
		name = "NA";
		gpa = 5;
		isMarried = false;
		*/
	}
	
	public Student(int id,String name,double gpa,boolean isMarried)
	{
		//id = id; //The assignment to variable id has no effect
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		this.isMarried = isMarried;
	}
	
	/*
	public Student(int d,String n,double g,boolean m)
	{
		id = d;
		name = n;
		gpa = g;
		isMarried = m;
	}*/
	
	public Student(int d,String n)
	{
		id = d;
		name = n;
		gpa = 5.0;
		isMarried = true;
	}

	public Student(String n,int d)
	{
		id = d;
		name = n;
		gpa = 5.0;
		isMarried = true;
	}

	public double getGpa()
	{
		return gpa;
	}

	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}

	public boolean isMarried()
	{
		return isMarried;
	}

	public void setName(String n)
	{
		name = n;
	}
	
	public void setId(int d)
	{
		if (d > 0)
			id = d;
	}
	
	public void setMarried(boolean b)
	{
		isMarried = b;
	}
	
	public void setGpa(double g)
	{
		if (g >= 0 && g <= 5)
			gpa = g;
	}
	
	public void setGpa2(double g)
	{
		if (g >= 0 && g <= 5)
			gpa = g;
		else
			System.out.println("GPA must be from 0 to 5");
	}

	public boolean setGPA(double g)
	{
		if (g >= 0 && g <= 5)
		{
			gpa = g;
			return true;
		}
		else
			return false;
	}
	
	public String getGrade()
	{
		if (gpa >= 4.75)
			return "A+";
		else if (gpa >= 4.5)
			return "A";
		else
			return "Normal student";
	}
	
	public double calculateSalary()
	{
		if (gpa >= 4.5)
			return 1500;
		else
			return 1000;
	}
	
	public void mm(int d)
	{
		int id = 10;
		this.id = 33;
		//System.out.println(id);
	}
	
	public void read()
	{
		Scanner input = new Scanner(System.in);
		//int x; //has no default value
		//System.out.println(x);
		System.out.print("Enter ID: ");
		id = input.nextInt();

		System.out.print("Enter Name: ");
		name = input.next();

		/*
		do
		{
			System.out.print("Enter GPA: ");
			gpa = input.nextDouble();
		}while(gpa < 0 || gpa > 5);
		*/

		System.out.print("Enter GPA: ");
		double g = input.nextDouble();
		setGPA(g);
		
		System.out.print("Is married: ");
		isMarried = input.nextBoolean();

		input.close();
	}
	
	public void print()
	{
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("GPA: " + gpa);	
		System.out.println("Is married: " + isMarried);
		System.out.println("--------------------");
	}

	public void m1(int x,double r)
	{
		
	}
	
	public void m1(double r)
	{
		
	}
	
	public void m1(int x,double r,char c)
	{
		
	}

	public int m1(int r)
	{
		return 1;
	}

	public void pp()
	{
		this.id = 10;
		this.name ="AAAA";
		this.isMarried = false;
		this.gpa = 2.3;
	}
}