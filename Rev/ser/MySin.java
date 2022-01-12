package ser;

import java.util.Scanner;

public class MySin
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double x;
		
		System.out.print("Enter x: ");
		x = input.nextDouble();

		x = Math.toRadians(x);

		double p,po;
		double f;
		double sum = 0;

		for (int i = 0 ; i < 30 ; i++)
		{
			p = 2 * i + 1;
			po = Math.pow(x, p);

			f = 1;

			for (int k = 1 ; k <= p ;k++)
				f = f * k;

			if (i % 2 == 0)
				sum = sum + (po/f);
			else
				sum = sum - (po/f);
		}

		String strSum = String.format("%.2f", sum);
		String strX = String.format("%.2f", x);
		
		System.out.println("sin(" + strX + ") = " + strSum);
		System.out.println("sin(" + strX + ") = " + String.format("%.2f",Math.sin(x)));

		input.close();
	}
}