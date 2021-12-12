package stud3;

import java.util.Locale;
import java.util.Scanner;

public class student1 {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	private int id;
	private String name;
	private double gpa;
	private boolean isMarried;
	
	//cons
	//it is a normal method
	public student1() {
		id=0;
		name="NA";
		gpa=5;
		isMarried=false;
		
		
	}
	/*
	//another cons
	public student1(int d,String n,double g,boolean isM) {
		id=d;
		name=n;
		gpa=g;
		isMarried=isM;
		
		
	}
	*/
	public student1(int id,String name,double gpa,boolean isMarried) {
		this.id=id;
		this.name=name;
		this.gpa=gpa;
		this.isMarried=isMarried;
		
		
	}
	//get
	public boolean isMarried() {
		return isMarried;
	}
	public double getGpa() {
		return gpa;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setName(String n) {
		name=n;
	}
	
	public void setGpa(double g) {
		if(g>=0&&g<=5)
		gpa = g;
		else
			System.out.println("wrong");
	}
	public void setId(int d) {
		if(d>10)
		id = d;
		else
			System.out.println("wrong");
	}
	public  boolean setGPA(double g) {
		if(g>=0&&g<=5) {
			gpa=g;
			return true;
		}
		else
			return false;
	}

	public void setMarried(boolean m) {
		isMarried = m;
	}
	public void read() {
		System.out.println("enter id");
		id=input.nextInt();
		System.out.println("enter gpa");
		gpa=input.nextDouble();
		System.out.println("enter name");
		name=input.next();
	}
	public void read1() {
		System.out.println("enter id");
		id=input.nextInt();
		System.out.println("enter gpa");
		double g=input.nextDouble();
		setGPA(g);
		System.out.println("enter name");
		name=input.next();
	}
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(gpa);
		System.out.println(isMarried);
		System.out.println("-------------------------------------------------------------");
	}

}
