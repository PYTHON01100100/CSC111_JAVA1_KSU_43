package Drawings;

import java.util.Scanner;

public class triStraight
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n,no,i,j,space,digit;
	
		do
		{
			System.out.print("Enter number 1<=n<=9 : ");
			n = s.nextInt();
		}while (n < 1 || n >= 10);
	
		digit = 1;
		space = n - 1;
		no = n;
	
		for (i = 1 ; i <= n; i++)
		{
			for (j = 1; j <= space; j++)
				System.out.print(" ");
	
			for (j = 1; j <= digit; j++)
				System.out.print(no);
	
			System.out.println();
	
			digit++;
			space--;
			no--;
		}
	}
}