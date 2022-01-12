package number;

import java.util.Scanner;

public class power
{
	public static void main(String[] args)
	{
		int base, power, i, result = 1;
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("Enter an inetger for the base  : ");
			base = input.nextInt();

			System.out.print("Enter an inetger for the power : ");
			power = input.nextInt();
		} while (base < 0 || power < 0);

		for (i = 1; i <= power; i++)
			result *= base;

		System.out.println(base + " to the power of " + power + " = " + result);

		input.close();
	}
}