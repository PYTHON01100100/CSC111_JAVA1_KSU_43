package Drawings;

import java.util.Scanner;

public class triStraightChars
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int  n,i,j,space,chars;
		char c;
		
		do
		{
			System.out.print("Enter number of lines : ");
			n = s.nextInt();
		}while (n < 1 || n > 26);
	
		chars = 1;
		space = n - 1;
		c     = 'A';
	
		for (i = 1 ; i <= n; i++)
		{
			for (j = 1; j <= space; j++)
				System.out.print(" ");
	
			for (j = 1; j <= chars; j++)
				System.out.print(c);
	
			System.out.println();
	
			chars++;
			space--;
			c++;
		}
	}
}