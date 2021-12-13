package week16;

import java.util.Scanner;

public class Heart
{
	public static void main(String[] args)
	{
		int hb;
		Scanner input = new Scanner(System.in);
		
		//If HB >120 then patient have HIGH HB.
		//80 =< HB <= 120 NORMAL HB.
		//Below 80 is LOW HB.
		/*
		 * 	1. Continuously read HB and print status of the patient.
			2. Keep reading HB and printing status until you get two consecutive HIGH HB or two consecutive LOW HB, if you do then you should print a warning message and stop reading HB.
		 */

		int countHigh = 0;
		int countLow = 0;
		double total = 0;
		int count = 0;
		
		while(countHigh < 2 && countLow < 2)
		{
			System.out.print("Please enter patient HB ");
			hb = input.nextInt();

			if (hb > 120)
			{
				System.out.println("HB is High");
				countHigh++;
				countLow = 0;
			}
			else if(hb >= 80 && hb <= 120)
			{
				System.out.println("HB is Normal");
				countHigh = 0;
				countLow = 0;
			}
			else
			{
				System.out.println("HB is Low");
				countLow++;
				countHigh = 0;
			}
		
			total += hb;
			count++;
		}

		if (countLow == 2)
			System.out.println("HB is low twice in a row");
		else
			System.out.println("HB is high twice in a row");
		
		double average = total / count;
		System.out.println("The average HB is "  + average);
		
		//3. Print the average HB of all your readings.
		
		//4. Exit the program
		System.out.println("DONE");

		input.close();
	}
}