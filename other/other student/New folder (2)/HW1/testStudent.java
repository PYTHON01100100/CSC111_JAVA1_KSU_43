/*
 * CSC111_HW1
 *  ID:****
 *  NAME:ABDULRAHMAN
 */ 
import java.util.Locale;
import java.util.Scanner;
public class testStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Student s1= new Student();
		Student s2= new Student();
		System.out.println("Enter course name: ");
		Student.course =input.next();
		s1.readStudent();
		s2.readStudent();
		s1.printInfo();
		s2.printInfo();
		s1.GPAtopercentage();
		s2.GPAtopercentage();
	}
}
