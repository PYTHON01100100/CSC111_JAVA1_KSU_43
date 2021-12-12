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
	public static String course; // ãÔÊÑß
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
/*
private int apts;
private int normal = 0;
private int delux = 0;
private double rent;
// Methods
public void Building () { }

public void Building (int apts, double rent) {
this.apts = apts;
this.rent = rent;
}
public void setApts(int apts){
this.apts = apts;
}
public int getApts() {
return this.apts;
}
public void setRent(double rent) {
this.rent = rent;
}
public double getRent() {
return rent;
}
public int getNormal () {
return normal;
}
public int getDelux () {
return this.delux;
}
public int howManyRented() {
return normal+delux;
}
public boolean rentApt(int n, String type) {
if (n+normal+delux > apts ) return false;
else {
if (type.equalsIgnoreCase("normal")) normal = normal +n;
else if (type.equalsIgnoreCase("delux")) delux = delux +n;
return true;
}
}
public void printInfo() {
System.out.println("\n================== Building Info==========================");
System.out.println("The Building has "+apts+" appartment.\n"+"Only "+howManyRented()+" have been rented. ");
System.out.println(normal+" normal appartments with rent = "+rent+" SR per month.\nAnd "+delux+" delux appartments with rent "+rent*1.2+" SR per month");
System.out.println("===========================================================\n");
}
*/