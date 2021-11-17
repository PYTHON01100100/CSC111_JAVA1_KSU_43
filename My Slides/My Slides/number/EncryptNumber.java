package number;

import java.util.Scanner;

public class EncryptNumber
{
	public static void main(String[] args)
	{
		int no;
		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter an inetger between 1000 to 9999 : ");
			no = input.nextInt();
		}while(no < 1000 || no > 9999);

		int d1 = no % 10;
		int d2 = no / 10 % 10;
		int d3 = no / 100 % 10;
		int d4 = no / 1000;

		d1 = (d1 + 7) % 10;
		d2 = (d2 + 7) % 10;
		d3 = (d3 + 7) % 10;
		d4 = (d4 + 7) % 10;

		int b = d2 * 1000 + d1 * 100 + d4 * 10 + d3;

		System.out.println("Original  Number : " + no);
		System.out.println("Encrypted Number : " + b);
		
		input.close();
	}
}