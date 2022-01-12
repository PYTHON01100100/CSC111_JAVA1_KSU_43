package number;

import java.util.Scanner;

public class primeAdvisors
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n,i;

		System.out.print("Enter a number : ");
		n = input.nextInt();
	
		System.out.println("--------------------------");
		System.out.println("The prime a dvisors for " + n);
		System.out.println("--------------------------");
		
		while (n != 1)
		{
			i = 2;
	
			while (n % i != 0)
				i++;
	
			System.out.println(" " + i);
			n /= i;
		}
		
		System.out.println("--------------------------");
	
		input.close();
	}
}