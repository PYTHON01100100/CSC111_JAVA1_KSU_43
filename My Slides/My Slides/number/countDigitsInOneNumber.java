package number;

import java.util.Scanner;

public class countDigitsInOneNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int no, temp;

		int count = 0;

		System.out.print("enter number, to stop enter 0 : ");
		no = input.nextInt();

		if (no != 0)
		{
			temp = no;
	
			while (temp != 0)
			{
				temp /= 10;
				count++;
			}
		}
		else
			count = 1;

		System.out.println("Count of digits : " + count);

		input.close();
	}
}