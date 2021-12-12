package stud2;

import java.util.Locale;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Student s1=new Student();
		s1.read1();
		s1.print();

	}

}
