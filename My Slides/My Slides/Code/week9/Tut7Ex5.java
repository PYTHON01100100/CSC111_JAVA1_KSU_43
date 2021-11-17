package week9;

import java.util.Scanner;

public class Tut7Ex5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char ch;
		int l;
		
		System.out.print("Enter character: ");
		ch = input.next().charAt(0);

		System.out.print("Enter height: ");
		l = input.nextInt();
		int t = 1;
		
		for (int i = 1 ; i <= l ; i++) //lines
		{
			for (int j = 1 ; j <= l-i ; j++)
				System.out.print(" ");
			
			for (int k = 1 ; k <= t ; k++)
				System.out.print(ch + " ");

			System.out.println();
			t++;
		}
		
		input.close();
	}

}
/*
(assuming input character is ‘A’ and height is 6):
		A
       A A
      A A A
     A A A A
    A A A A A
   A A A A A A
*/