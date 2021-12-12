package k;
import java.util.Scanner;
import java.util.Locale;
public class test {
	public static void main(String[] args) { 
	    Scanner kb = new Scanner (System.in).useLocale(Locale.US);
		Student s1 = new Student () ; 
		Student s2 = new Student () ; 

		System.out.print("Enter course name: ");
		Student.course=kb.next();
		System.out.print("Please enter Name, Age and GPA of the first student: ");
	    s1.name =kb.next();
	    s1.age = kb.nextInt();
	    s1.GPA = kb.nextDouble();
		System.out.print("Please enter Name, Age and GPA of the second student: ");
	    s2.name =kb.next();
	    s2.age = kb.nextInt();
	    s2.GPA = kb.nextDouble();
		s1.printInfo();
		s2.printInfo();
		s1.GPAToPercentage();
		s2.GPAToPercentage();
	}
}
