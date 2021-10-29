/*
 * CSC111_HW1
 *  ID:********
 *  NAME:ABDULRAHMAN
 */ 
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;
public class Student {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	public String name;
	public int age;
	public double GPA;
	public static String course; // „‘ —ﬂ
	public void printInfo() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Student name:  "+name);
		System.out.println("Student age:  "+age);
		System.out.println("Student GPA:  "+GPA);
		System.out.println("Student course:  "+course);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
	}
	public void GPAtopercentage() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Student GPA:  "+GPA);
		System.out.println("Student GPA as percentage:  "+((GPA/5)*100));
	}	
	public void readStudent() {
		System.out.println("Please enter name, age and GPA of student: ");
		name =input.next();
		age =input.nextInt();
		GPA =input.nextDouble();
		System.out.println();
		input.close();
	}
}
