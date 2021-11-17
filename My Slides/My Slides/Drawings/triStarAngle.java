package Drawings;

import java.util.Scanner;

public class triStarAngle
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
	
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n - i ; j++)
				System.out.print(" ");
	
			for (j = 1 ; j <= i ; j++)
				System.out.print("*");
	
			System.out.println();
		}
	}
}