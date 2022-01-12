package Drawings;

import java.util.Scanner;

public class diamondLetters
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,out_space,in_space,i,j;
		char letter = 'A';
	
		do
		{
			System.out.print("Enter number of lines ( greater than 3) : ");
			n = s.nextInt();
		}while (n < 3 || n > 26);
	
		for (j = 1 ; j < n ; j++)
			System.out.print(" ");
	
		System.out.println(letter);
	
		out_space = n-2;
		in_space = 1;
	
		letter++;
	
		for (i = 2 ; i < n; i++)
		{
			for (j = 1 ; j <= out_space ; j++)
				System.out.print(" ");
	
			System.out.print(letter);
	
			for (j = 1 ; j <= in_space ; j++)
				System.out.print(" ");
	
			System.out.println(letter);
	
			out_space--;
			in_space += 2;
			letter++;
		}
	
		for (i = 1 ; i <= 2 * n - 1; i++)
			System.out.print(letter);
	
		System.out.println();
	
		letter--;
		out_space++;
		in_space -= 2;
	
		for (i = 2 ; i < n; i++)
		{
			for (j = 1 ; j <= out_space ; j++)
				System.out.print(" ");
	
			System.out.print(letter);
	
			for (j = 1 ; j <= in_space ; j++)
				System.out.print(" ");
	
			System.out.println(letter);
	
			out_space++;
			in_space -= 2;
			letter--;
		}
	
		for (j = 1 ; j < n ; j++)
			System.out.print(" ");
	
		System.out.println(letter);
	}
}