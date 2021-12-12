package stud2;

import java.util.Locale;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Student s1=new Student();
		double n;
		do {
			System.out.println("enter");
			n=input.nextDouble();
		if(s1.setGPA(n))
		{
			s1.print();
		}
		else
			System.out.println("wrong and try again");
		
	}while(!(s1.setGPA(n)));
		//false and false true
		//false and true false
	
	}
	}
