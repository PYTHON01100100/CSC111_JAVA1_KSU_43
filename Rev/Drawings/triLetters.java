package Drawings;

import java.util.Scanner;

public class triLetters
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
	
		char ch = 'A';
	
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= i ; j++)
				System.out.print(ch);
	
			System.out.println();
	
			ch++;
		}
	}
}