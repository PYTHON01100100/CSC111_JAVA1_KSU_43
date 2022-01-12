package number;

import java.util.Scanner;

public class printUntilSame
{
	public static void main(String[] args)
	{
		int no;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an inetger : ");
		no = input.nextInt();

		int count = 0;
		int temp = no;

		while (temp != 0)
		{
			temp /= 10;
			count++;
		}

		int a = 1;

		for (int i = 1; i < count; i++)
			a *= 10;

		temp = no;
		int x;

		System.out.println(no);

		do
		{
			x = no % 10;
			no /= 10;
			no = x * a + no;
			System.out.println(no);
		} while (temp != no);

		input.close();
	}
}