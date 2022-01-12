package Drawings;

import java.util.Scanner;

public class triEmptyCounters
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
	
		int inSpace = 1;
		int outSpace = n - 2;
	
		for (i = 2 ; i <= n-1 ; i++)
		{
			for (j = 1 ; j <= outSpace ; j++)
				System.out.print(" ");
	
			System.out.print("*");
	
			for (j = 1 ; j <= inSpace ; j++)
				System.out.print(" ");
	
			System.out.println("*");
	
			inSpace += 2;
			outSpace--;
		}
	
		for (i = 1; i <= 2 * n-1 ; i++)
			System.out.print("*");
	
		System.out.println();
	}
}