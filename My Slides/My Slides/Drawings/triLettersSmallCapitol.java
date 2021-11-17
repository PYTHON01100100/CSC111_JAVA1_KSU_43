package Drawings;

import java.util.Scanner;

public class triLettersSmallCapitol
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int n,i,j;
	
		do
		{
			System.out.print("Enter N : ");
			n = s.nextInt();
		}while(n < 3 || n > 26);
	
		char ch = 'A';
	
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n - i ; j++)
				System.out.print(" ");
	
			for (j = 1 ; j <= 2 * i - 1; j++)
				System.out.print(ch);
	
			System.out.println();
	
			if (i % 2 == 1)
				ch += 33;
			else
				ch -= 31;
		}
	}
}