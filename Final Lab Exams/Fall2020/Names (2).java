package week16;

import java.util.Scanner;

public class Names
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n;
		
		//1. Enter the number of students.
		System.out.print("Enter number of students: ");
		n = input.nextInt();
		
		//2. Read and store those names in two different arrays: first and last.
		String first[] = new String[n];
		String last[]  = new String[n];
		
		for (int i  = 0 ; i < n ; i++)
		{
			first[i] = input.next();
			last[i]  = input.next();
		}

		//3. Print all students.
		System.out.println("The students names are:");

		for (int i  = 0 ; i < n ; i++)
			System.out.println("Student " + i + " : " + first[i] + " " + last[i]);			

		//4. Count and print how many students with first name “Mohammed”. (Ignore case) (1 Mark)
		int count = 0;

		for (int i  = 0 ; i < n ; i++)
		{
			if (first[i].equalsIgnoreCase("Mohammed"))
				count++;
		}
		
		System.out.println("There are " + count + " Students with first name \"Mohammed\"");
		
		/*
		 * 5. Remove all students that have a last name that starts with ‘AL’ (Ignore case)
		 * (You can remove with: remove and shift, or copy last).
			Hint: You can use CharAt(i) to access certain characters of a string,
			or use substring(int1,int2) to retrieve a portion of a string. (2 Marks)
		 */

		//Using charAt
		for (int i = 0 ; i < n ; )
		{
			String t = last[i].toUpperCase();

			if (t.charAt(0) == 'A' && t.charAt(1) == 'L')
			{
				last[i] = last[n - 1]; //delete
				n--; //do not increment i, may be the last one starts with "AL"
			}
			else
				i++;
		}

		/*
		//Using substring(0,2)
		for (int i = 0 ; i < n ; )
		{
			//String t = last[i].toUpperCase();

			if (last[i].substring(0,2).equalsIgnoreCase("AL"))
			{
				last[i] = last[n - 1]; //delete
				n--; //do not increment i, may be the last one starts with "AL"
			}
			else
				i++;
		}

		//using startsWith
		for (int i = 0 ; i < n ; )
		{
			String t = last[i].toUpperCase();

			if (t.startsWith("AL"))
			{
				last[i] = last[n - 1]; //delete
				n--; //do not increment i, may be the last one starts with "AL"
			}
			else
				i++;
		}
		*/
		//6. Print all students.
		System.out.println("The students with last name not beginning with \"AL\" are:");

		for (int i  = 0 ; i < n ; i++)
			System.out.println("Student " + i + " : " + first[i] + " " + last[i]);

		input.close();
	}
}