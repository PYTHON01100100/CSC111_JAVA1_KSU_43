package stud1;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class student1 {
	Scanner input=new Scanner(System.in).useLocale(Locale.US);
	  int id; //INT=0
	  String name; //STR = NULL
	 double gpa;//DOUBLE =0.0
	 boolean isMarried;//BOOLEAN =FALSE
	 
	 public void read() {
		 System.out.println();
		 id=input.nextInt();
		 System.out.println();
		 name=input.next();
		 System.out.println();
		 gpa=input.nextDouble();
		 System.out.println();
		 isMarried=input.nextBoolean();
	 }
	 
	 public void printInfo() {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(gpa);
		 System.out.println(isMarried);
	 }
	
	
	
	
	

}
