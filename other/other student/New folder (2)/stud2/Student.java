package stud2;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;
public class Student {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	private int id;
	private String name;
	private double gpa;// you can use it in student class but another not 
	private boolean isMarried;
	//ÎÇÕ ÈÇáßáÇÓ åÐÇ ÈÓ
	// private void read(){}
	// 
	
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
	}

}
