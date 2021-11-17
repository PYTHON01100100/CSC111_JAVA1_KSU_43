package number;

import java.util.Scanner;

public class roundNumber
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int no,tens,temp,d,i;
	
		System.out.print("Enter Number : ");
		no = input.nextInt();

		d = 0;
		
		temp = no;
	
		while (temp != 0)
		{
			temp /= 10;
			d++;
		}
	
		tens = 1;
	
		for (i = 1; i < d; i++)
			tens *= 10;
	
		temp = no;
	
		System.out.println("The Original Number : " + no);
		System.out.println("===============================");
	
		do
		{
			temp = temp % 10 * tens + temp / 10;
			System.out.println("=====================> " + temp);
		}while (temp != no);
		
		System.out.println("===============================");

		input.close();
	}
}