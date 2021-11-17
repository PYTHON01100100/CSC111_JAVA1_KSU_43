package week6;

import java.util.Scanner;

public class Rectangle
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double l1,w1;
		
		System.out.print("Enter length: ");
		l1 = input.nextDouble();
		
		System.out.print("Enter width: ");
		w1 = input.nextDouble();

		System.out.println("---------------------------------------");

		double l2,w2;
		
		System.out.print("Enter length: ");
		l2 = input.nextDouble();
		
		System.out.print("Enter width: ");
		w2 = input.nextDouble();

		System.out.println("---------------------------------------");

		double area1 = l1 * w1;
		double area2 = l2 * w2;

		System.out.println("Area 1 : " + area1);
		System.out.println("Area 2 : " + area2);
		
		if (area1 > area2)
			System.out.println("First rectangle is larger the Second rectangle");
		else if (area2 > area1)
			System.out.println("Second rectangle is larger the First rectangle");
		else
			System.out.println("The two rectangels are equal");
		
		input.close();
	}
}
