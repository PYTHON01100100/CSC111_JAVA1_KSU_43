package stud3;

import java.util.Locale;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		student s1= new student();
		student s2=s1;
		s1.setMarried(true);
		s2.setGpa(4.2);
		s1.setId(44123);
		s2.setName("ali");
		// s1.setGpa(4);
		s1.print();
		s2.print();
		System.out.println(s1);
		System.out.println(s2);
	}

}
