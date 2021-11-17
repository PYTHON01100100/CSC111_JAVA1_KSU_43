package number;

import java.util.Scanner;

public class fab
{
	public static void main(String[] args)
	{

		int n, f1, f2, f3, i;
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("Enter an integer : ");
			n = input.nextInt();
		} while (n < 0 || n > 20);

		if (n == 0 || n == 1)
			f3 = n;
		else
		{
			f1 = 0;
			f2 = 1;
			f3 = 1;

			for (i = 3; i <= n; i++)
			{
				f1 = f2;
				f2 = f3;
				f3 = f1 + f2;
			}
		}

		System.out.println("Fibonacci of " + n + " = " + f3);
		
		input.close();
	}
}