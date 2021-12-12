package stud1;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;
public class Student {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	public String name;
	public int id;
	public double gpa;
	public static String course;
	
	public void read() {
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Enter your name:");
		name=input.next();
		System.out.println("Enter your ID:");
		id=input.nextInt();
		System.out.println("Enter your GPA:");
		gpa=input.nextDouble();
		System.out.println("---------------------------------------------------------------------------------------------");
	}
	public void printInfo() {
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Student name: "+name);
		System.out.println("Student ID: "+id);
		System.out.println("Student GPA: "+gpa);
		System.out.println("Student course: "+course);
		System.out.println("---------------------------------------------------------------------------------------------");
	}
	public void GPAtopercentage() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Student name: "+name);
		System.out.println("Student ID: "+id);
		System.out.println("Student GPA:  "+gpa);
		System.out.println("Student GPA as Percentage:  "+((gpa/5)*100));
		System.out.println("--------------------------------------------------------------------------------------");
		
	}
	
	
	
}
