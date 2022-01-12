package Drawings;

import java.util.Scanner;

public class draw_rec
{
	public static void main(String args[])
	{
		int  lines,columns,i,j;
		char letter;
		
		Scanner s = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter how many rows (more than 3) : ");
			lines = s.nextInt();
		}while (lines < 3);
	
		do
		{
			System.out.print("Enter how many coulmns (more than 3 and less than 26) : ");
			columns = s.nextInt();
		}while (columns < 3 || columns > 26);
	
		letter = 'A';
	
		for (i = 1;i <= columns; i++)
			System.out.print(letter);
	
		System.out.println();
	
		letter++;
	
		for (i = 2; i < lines; i++)
		{
			System.out.print(letter);
	
			for (j = 1 ; j <= columns-2; j++)
				System.out.print(" ");
	
			System.out.println(letter);
	
			letter++;
		}
	
		for (i = 1;i <= columns; i++)
			System.out.print(letter);
	
		System.out.println();
	}
}