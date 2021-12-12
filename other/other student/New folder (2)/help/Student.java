package help;
import java.util.Locale; 
import java.util.Scanner; 
import java.util.Locale; 
import java.util.Scanner; 

public class Student {
	   Scanner input = new Scanner(System.in).useLocale(Locale.US); 
	   public String name;
	   public int age;
	   public double GPA;
	   public static String course;

	   public void printInfo() {
	       System.out.println("===============================================");
	       System.out.println("Student name: "+name); 
	       System.out.println("Student age: "+age); 
	       System.out.println("Student GPA: "+GPA); 
	       System.out.println("Student course: "+course); 
	       System.out.println("===============================================") ;
	    		   System.out.println("___________________________________________");
	}
	     public void GPAtopercentage() {
	    	   double per =((GPA/5)*100);
	           System.out.println("_______________________________________________________________________________________________________");
	           System.out.println("Student GPA: "+GPA);
	           System.out.println("Student GPA as percentage: "+ per);
	}


}
