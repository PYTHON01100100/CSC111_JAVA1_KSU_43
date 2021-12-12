package stud1;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;
public class class2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Please enter course name:");
		Student.course=input.next();
		Student s1=new Student();
		Student s2=new Student();
		s1.read();
		s2.read();
		s1.printInfo();
		s2.printInfo();
		s1.GPAtopercentage();
		s2.GPAtopercentage();
	}

}
