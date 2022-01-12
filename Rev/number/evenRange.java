package number;

import java.util.Scanner;

public class evenRange
{
	public static void main(String[] args)
	{
		int n1, n2, i, totalEven = 0;
		Scanner input = new Scanner(System.in);

		do
		{
			System.out.print("Enter starting integer : ");
			n1 = input.nextInt();
		} while (n1 < 0);

		do
		{
			System.out.print("Enter ending integer ( >= " + n1 + " ) : ");
			n2 = input.nextInt();
		} while (n2 < 0 || n2 < n1);

		if (n1 % 2 == 0)
			i = n1;
		else
			i = n1 + 1;
		
		for ( ; i <= n2 ; i += 2)
			totalEven += i;

		System.out.println("Total of even number between (" + n1 + "," + n2 + ") = " + totalEven);
	
		input.close();
	}
}