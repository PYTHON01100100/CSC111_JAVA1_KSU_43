package number;

import java.util.Scanner;

public class encrypt
{
	public static void main(String[] args)
	{
		int num, units, tens;
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("Enter Number in integer : ");
			num = input.nextInt();

			if (num != 0)
			{
				if (num < 0)
				{
					num = -1 * num;
					System.out.println("Number after converting from negitive to positive : " + num);
				}

				units = num % 10;
				tens = num / 10 % 10;

				System.out.println("Units in the number : " + units);
				System.out.println("Tens  in the number : " + tens);

				if (units > tens)
				{
					num = (num / 100) * 100 + units * 10 + tens;
					System.out.println("Number after swaping units with tens : " + num);
				}

				if (num % 3 == 0)
					System.out.println("Yes, " + num + " is multiple of 3\n");
				else
					System.out.println("No, " + num + " is not multiple of 3\n");

				int temp = num;

				while (temp % 3 == 0)
					temp /= 3;

				if (temp == 1)
					System.out.println("yes, " + num + " is power of 3\n");
				else
					System.out.println("No, " + num + " is not power of 3\n");
			}
		} while (num != 0);
		
		input.close();
	}
}