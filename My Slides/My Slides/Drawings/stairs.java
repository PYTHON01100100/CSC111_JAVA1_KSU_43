package Drawings;

import java.util.Scanner;

public class stairs
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int n,i,j;
	
		do
		{
			System.out.print("Enter N : ");
			n = s.nextInt();
		}while(n < 3 || n > 10);
	
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= 2 * i ; j++)
				System.out.print("*");
	
			System.out.println();
	
			for (j = 1 ; j <= 2 * i ; j++)
				System.out.print("*");
	
			System.out.println();
		}
	}
}