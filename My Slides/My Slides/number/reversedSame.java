package number;

import java.util.Scanner;

public class reversedSame
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int no,rev = 0,temp;

		System.out.print("Enter an integer : ");
		no = input.nextInt();

		System.out.println("Number   : " + no);
	
		temp = no;

		while(no != 0)
		{
			rev = rev * 10 + no % 10;
			no /= 10;
		}

		System.out.println("Reversed : " + rev);

		if (temp == rev)
			System.out.println("The original number and reversed are the same");
		else
			System.out.println("The original number and reversed are not the same");

		input.close();
	}
}