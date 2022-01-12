package number;

import java.util.Scanner;

public class primeReturn
{
	public static void main(String[] args)
	{
		int no, i;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer : ");
		no = input.nextInt();

		i = 2;

		while (i <= no / 2)
		{
			if (no % i == 0)
			{
				System.out.println(no + " is not prime number");
				input.close();
				return;
			}

			i++;
		}

		System.out.println(no + " is prime number");

		input.close();
	}
}