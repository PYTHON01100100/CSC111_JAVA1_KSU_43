package Drawings;

import java.util.Scanner;

public class draw_tri
{
	public static void main(String args[])
	{
		int n,out_space,in_space,i,j;
		
		Scanner s = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter number of lines ( greater than 3) : ");
			n = s.nextInt();
		}while (n < 3);
	
		for (j = 1 ; j < n ; j++)
			System.out.print(" ");
	
		out_space = n-2;
		in_space = 1;
	
		System.out.println("*");
	
		for (i = 2 ; i < n; i++)
		{
			for (j = 1 ; j <= out_space ; j++)
				System.out.print(" ");
	
			System.out.print("*");
	
			for (j = 1 ; j <= in_space ; j++)
				System.out.print(" ");
	
			System.out.println("*");
	
			out_space--;
			in_space += 2;
		}
	
		for (i = 1 ; i <= 2 * n - 1; i++)
			System.out.print("*");
	
		System.out.println();
	}
}