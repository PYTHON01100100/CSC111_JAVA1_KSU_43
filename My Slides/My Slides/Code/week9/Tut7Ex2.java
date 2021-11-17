package week9;

import java.util.Scanner;

public class Tut7Ex2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("Enter x: ");
		x = input.nextInt();
		
		System.out.print("Enter y: ");
		y = input.nextInt();
		
		for (int i = y-1 ; i >= x+1 ; i--)
		{
			if (i % x == 0 || i % y == 0)
				System.out.println(i);
		}
		
		input.close();
	}

}
