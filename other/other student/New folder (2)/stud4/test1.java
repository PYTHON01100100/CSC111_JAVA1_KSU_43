package stud4;

import java.util.Locale;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		student1 s1=new student1();
		s1.print();
		student1 s2=new student1(4411,"Abdulrahman",4.2,false);
		s2.print();
		//compile
		//student1 s3=new student1(4.5,4,"Abdulrahman",false);

	}

}
