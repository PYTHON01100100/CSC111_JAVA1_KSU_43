package help;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;
public class teststudent {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in).useLocale(Locale.US);
		Student s1 = new Student () ;
	    Student s2 = new Student () ;
		System.out.println("Enter course name: ");
	    Student.course=kb.next();
	  
	System.out.print("Please enter Name, Age and GPA of first student: "); 
	s1.name =kb.next();
	s1.age = kb.nextInt();
	s1.GPA = kb.nextDouble();
	System.out.print("Please enter Name, Age and GPA of second student:"); 
	s2.name =kb.next();
	s2.age = kb.nextInt();
	s2.GPA = kb.nextDouble();
	s1.printInfo();
	s2.printInfo();

	}

}
