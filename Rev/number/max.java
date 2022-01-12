package number;

import java.util.Scanner;

public class max
{
	public static void main(String[] args)
	{
		int no;
		int max;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number : ");
		no = input.nextInt();
		max = no;
		
		while (no != 0)
		{
			if (no > max)
				max = no;

			System.out.print("Enter a number: ");
			no = input.nextInt();
		}
		
		System.out.println("Maximum number is: " + max);
		
		input.close();
	}
}