package number;

import java.util.Scanner;

public class addOneSolution2
{
	public static void main(String[] args)
	{

		int no, temp, a = 1;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("Enter an integer : ");
			no = input.nextInt();
		} while (no <= 0);

		System.out.println("Number   : " + no);

		temp = 0;

		while (no != 0)
		{
			temp += (no % 10 + 1) * a;
			a *= 10;
			no /= 10;
		}

		System.out.println("After ading one to each digit in the number : " + temp);
		
		input.close();
	}
}