package stud4;

import java.util.Locale;
import java.util.Scanner;

public class student2 {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	private int id;
	private String name;
	private double gpa;
	public student2() {
		this(0,"NA",0.0);
	}

	public student2(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		if(gpa>= 0&&gpa<=5)
		this.gpa = gpa;
		else
			this.gpa=0;
	}

	public void read() {
		System.out.println("enter id");
		this.id=input.nextInt();
		System.out.println("enter gpa");
		this.gpa=input.nextDouble();
		setGpa(gpa);
		System.out.println("enter name");
		this.name=input.next();
		System.out.println("=======================================================================================================================");
	}
	public void print() {
		System.out.println("-----------------------------------#STUDENT INFORMATION#-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println(id);
		System.out.println(name);
		System.out.println(gpa);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	//you must put boolean to return T OR F
	public  boolean betterGpa(student2 s) {
		if(this.gpa>s.gpa)
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
}
