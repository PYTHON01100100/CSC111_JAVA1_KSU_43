package Drawings;

import java.util.Scanner;

public class triNumbers
{
	public static void main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int N,j;
	
		do
		{
			System.out.print("Enter N (1-9) : ");
			N = s.nextInt();
		}while(N < 1 || N > 9);
	
		for (int i = 1 ; i <= N ; i++)
		{
			for(j = 1 ; j <= N - i ; j++)
				System.out.print(" ");
	
			for(j = 1 ; j <= i ; j++)
				System.out.print(N - i + 1);
	
			System.out.println();
		}
	}
}