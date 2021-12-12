package stud3;

import java.util.Locale;
import java.util.Scanner;

public class student {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	private int id;
	private String name;
	private double gpa;
	private boolean isMarried;
	
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
