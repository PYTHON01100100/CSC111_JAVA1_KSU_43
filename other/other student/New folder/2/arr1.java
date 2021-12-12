import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class arr1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Random r=new Random();
		course c1=new course();
		course c2=new course("CSC111",4,15);
		course c3=new course();
		
		/*
		//part1
		
run time error
		System.out.println(c2.getStudent(2));
		student ss=c1.getStudent(2);
		System.out.println(ss.getName());
		
	*/	
		//int a=c1.search(7);
		//ystem.out.println(a);
		c2.adduni(new student(4,"ALI",4));
		c2.adduni(new student(2,"LI",4));
		c2.adduni(new student(2,"AL",4));
		c2.adduni(new student(4,"ALILLL",5));
		c2.adduni(new student());
		c2.printArray();
		System.out.println("==========================================================================");
		c2.printArrayToString();

	}

}