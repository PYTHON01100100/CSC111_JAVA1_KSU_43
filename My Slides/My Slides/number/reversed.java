package number;

import java.util.Scanner;

public class reversed
{
	public static void main(String[] args)
	{
		int no, rev = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer : ");
		no = input.nextInt();

		System.out.println("Number   : " + no);

		while (no != 0)
		{
			rev = rev * 10 + no % 10;
			no /= 10;
		}

		System.out.println("Reversed : " + rev);

		input.close();
	}
}