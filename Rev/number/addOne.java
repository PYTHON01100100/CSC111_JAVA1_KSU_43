package number;

import java.util.Scanner;

public class addOne
{
	public static void main(String[] args)
	{
		int no,temp;
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.print("Enter an integer : ");
			no = input.nextInt();
		}while(no <= 0);

		System.out.println("Number   : " + no);
	
		temp = no;

		int count = 0;

		while (temp != 0)
		{
			count++;
			temp /= 10;
		}

		int a = 1;

		for (int i = 1 ; i <= count ; i++)
		{
			no += a;
			a *= 10;
		}

		System.out.println("After ading one to each digit in the number : " + no);
		
		input.close();
	}
}