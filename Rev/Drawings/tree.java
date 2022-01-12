package Drawings;

import java.util.Scanner;

public class tree
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int m,n,i,j;
	
		do
		{
			System.out.print("Enter N : ");
			n = s.nextInt();
		}while(n < 3 || n > 20);
	
		do
		{
			System.out.print("Enter M : ");
			m = s.nextInt();
		}while(m < 3 || m > 20);
	
		int starts = 1;
		int space = 2 * (n - 1);
	
		for (i = 1 ; i <= n ; i++)
		{ 
			for (j = 1 ; j <= space ; j++)
				System.out.print(" ");
	
			for (j = 1 ; j <= starts ; j++)
				System.out.print("*");
	
			space -= 2;
			starts += 4;
	
			System.out.println();
		}
	
		for (i = 1 ; i <= m ; i++)
		{
			for (j = 1 ; j <= 2 * n - 3 ; j++)
				System.out.print(" ");
	
			System.out.println("***");
		}
	}
}