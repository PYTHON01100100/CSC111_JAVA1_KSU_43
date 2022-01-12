package number;

import java.util.Scanner;

public class numbers
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);	int no,odd_count,even_count,positive_total,negative_total;
		float avg;
	
		even_count = odd_count = positive_total = negative_total = 0;
	
		System.out.print("Enter Number : ");
		no = input.nextInt();
	
		while (no != -99)
		{
			if (no % 2 == 0)
				even_count++;
			else
				odd_count++;
	
			if (no >= 0)
				positive_total += no;
			else
				negative_total += no;
	
			System.out.println("Enter Number : ");
			no = input.nextInt();
		}
	
		if (odd_count + even_count != 0)
			avg = ((float)positive_total + negative_total) / (odd_count + even_count);
		else
			avg = 0;
	
		System.out.println("Number of Odd  numbers     = " + odd_count);
		System.out.println("Number of Even numbers     = " + even_count);
		System.out.println("Total  of Positive numbers = " + positive_total);
		System.out.println("Total  of Negative numbers = " + negative_total);
		System.out.println("Average of all numbers     = " + avg);
	
		input.close();
	}
}