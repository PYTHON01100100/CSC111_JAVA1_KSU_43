package number;

import java.util.Scanner;

public class perfectNumber
{
	public static void main(String[] args)
	{
		int no, sum = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer : ");
		no = input.nextInt();

		for (int i = 1; i <= no / 2; i++)
		{
			if (no % i == 0)
				sum += i;
		}

		if (no == sum)
			System.out.println(no + " is perfect number\n");
		else
			System.out.println(no + " is not perfect number\n");

		input.close();
	}
}