package Drawings;

import java.util.Scanner;

public class triDraw
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);	int i,j,espace,ispace,lines;
		char ch = 'A';
	
		do
		{
			System.out.print("Enter number of lines : ");
			lines = s.nextInt();
		}while (lines < 2 || lines > 26);
	
	
		for (i = 1;i < lines;i++)
			System.out.print(" ");
	
		System.out.println(ch);
	
		espace = lines - 1;
		ispace = 1;
		ch++;
	
		for (i = 2 ; i < lines; i++)
		{
			for (j = 1 ; j < espace; j++)
				System.out.print(" ");
	
			System.out.print(ch);
	
			for (j = 1 ; j <= ispace; j++)
				System.out.print(" ");
	
			System.out.println(ch);
	
			espace--;
			ispace += 2;
			ch++;
		}
	
		for (i = 1 ; i <= ispace+2 ; i++)
			System.out.print(ch);
	
		System.out.println();
	}
}