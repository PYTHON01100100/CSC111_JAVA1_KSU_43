package number;

import java.util.Scanner;

public class prime
{
	public static void main(String[] args)
	{
		int no, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer : ");
		no = input.nextInt();

		i = 2;

		while (i <= no / 2 && no % i != 0)
			i++;

		if (i <= no / 2)
			System.out.println(no + " is not prime number");
		else
			System.out.println(no + " is prime number");

		input.close();
	}
}