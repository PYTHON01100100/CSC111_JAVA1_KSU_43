package number;

import java.util.Scanner;

public class fact
{
	public static void main(String[] args)
	{
		int no, fact = 1, i;
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("Enter an integer : ");
			no = input.nextInt();
		} while (no < 0 || no > 15);

		for (i = 1; i <= no; i++)
			fact *= i;

		System.out.println(no + "! = " + fact);

		input.close();
	}
}