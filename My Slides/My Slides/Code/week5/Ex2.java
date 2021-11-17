package week5;

import java.util.Scanner;

public class Ex2
{

	public static void main(String[] args)
	{
		/*
		int x,y; //declaration
		//initializes
		x = 0;
		y = 0;
		*/
		//declaration and initializes in one statement
		
		int x = 0, y = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter y: ");
		y = input.nextInt();
		
		if (y > 0)
			x = 1;
		
		System.out.println("X = " + x); //The local variable x may not have been initialized
	}
}