package stud4;

import java.util.Locale;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		student2 s1=new student2();
		//s1.print();
		s1.read();
		//s1.print();
		student2 s2=new student2(4411,"Abdulrahman",4.2);
		//s2.print();
		student2 s3=new student2(2413,"ALI",4);
		if(s1.betterGpa(s3))
			System.out.println(s1.getName());
		else
			System.out.println(s3.getName());
		if(s2.betterGpa(s3))
			System.out.println(s2.getName());
		else
			System.out.println(s3.getName());
		
		//s2.betterGpa(s3);
		

		
		//compile
		//student1 s3=new student1(4.5,4,"Abdulrahman",false);

	}

}
