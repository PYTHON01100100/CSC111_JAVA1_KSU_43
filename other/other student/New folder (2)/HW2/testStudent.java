/*
 * ID:
 * NAME:ABDULRAHMAN ALMAYMAN
 * DAY4S
 * CSC111
 * HW2
 */
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Locale;
public class testStudent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		// Using empty constructor
		Student s1 = new Student ();
		System.out.print("Please enter the name, age and GPA ");
		s1.setName(input.next());
		s1.setAge(input.nextInt());
		s1.setGPA(input.nextDouble());
		// Print student info
		s1.printInfo();
		// Using second constructor
		System.out.print("Please enter the name, age and GPA ");
		Student s2 = new Student( input.next(),input.nextInt(),input.nextDouble());
		// Print student info
		s2.printInfo();
		// Print student info using getters
		System.out.println("############################################################################################################################");
		System.out.println("############################################################################################################################");
		System.out.println("The first student name is "+s1.getName()+" and his age is "+s1.getAge()+" his GPA is "+s1.getGPA());
		System.out.println("The second student name is "+s2.getName()+" and his age is "+s2.getAge()+" his GPA is "+s2.getGPA());
		// Which student has a higher GPA?
		//if the same it should tell me that
		if (s1.getGPA() > s2.getGPA()) {
		System.out.println(s1.getName()+" has a higher GPA than "+s2.getName());
		}
		else if (s1.getGPA() < s2.getGPA()) {
		System.out.println(s2.getName()+" has a higher GPA than "+s1.getName());
		}
		else {
			System.out.println(s1.getName()+" and "+s2.getName()+"  have same GPA");
		}
			input.close();
		}

}
