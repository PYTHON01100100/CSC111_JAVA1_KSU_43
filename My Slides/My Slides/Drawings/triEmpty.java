package Drawings;

import java.util.Scanner;

public class triEmpty
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,i,j;
	
		do
		{
			System.out.print("Enter N : ");
			n = s.nextInt();
		}while(n < 3 || n > 20);
	
		for (i = 1 ; i <= n - 1 ; i++)
			System.out.print(" ");
	
		System.out.println("*");
	
		int space = 1;
	
		for (i = 2 ; i <= n-1 ; i++)
		{
			for (j = 1 ; j <= n - i ; j++)
				System.out.print(" ");
	
			System.out.print("*");
	
			for (j = 1 ; j <= space ; j++)
				System.out.print(" ");
	
			System.out.println("*");
	
			space += 2;
		}
	
		for (i = 1; i <= 2 * n-1 ; i++)
			System.out.print("*");
	
		System.out.println();
	}
}