package week16;

import java.util.Scanner;

public class Numbers
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int nums[] = new int[100];
		int i = 0;
		
		System.out.print("Enter The Numbers: ");
		nums[i] = input.nextInt(); 
		
		while(i < 100 && nums[i] != 0)
		{
			i++;
			nums[i] = input.nextInt(); 
		}

		//1. Print the array nums.
		System.out.print("The numbers are: ");
		
		for (int m = 0 ; m < i ; m++)
			System.out.print(nums[m] + " ");
		
		System.out.println();

		/*2. Prompt the user to enter two integers j and k where j < k,
		 *  both are not negative, and both are less than the number of entered integers 
		 *  (You must check those two conditions and if any of them not true 
		 *  you must display an appropriate message and ask the user to try again).
		 *  Print all the array elements between index j and index k (including j and k).(1 Mark)
		 */
		System.out.print("Please enter two locations j and k: ");
		int j = input.nextInt();
		int k = input.nextInt();

		while ((j >= k || (j < 0 || k < 0) || (j >= i || k >= i)))
		{
			if (j >= k)
				System.out.println("ERROR: j must be greater than k");
			
			if (j < 0 || k < 0)
				System.out.println("ERROR: j and k can't be negative.");
			
			if (j >= i || k >= i)
				System.out.println("ERROR: j and k must be less than the number of entered numbers.");

			System.out.print("Please enter two locations j and k: ");
			j = input.nextInt();
			k = input.nextInt();
		}

		System.out.print("The elements between " + j + " and " + k + " are: ");

		for (int m = j ; m <= k ; m++)
			System.out.print(nums[m] + " ");

		System.out.println();

		/*3. Create another array nums2 of the same size as nums, 
		 * and copy all the elements that are negative in nums to nums2 
		 * (you don’t have to delete them from nums). (1 Mark)
		 */
		
		int nums2[] = new int[i];
		int l = 0;
		
		for (int m = 0 ; m < i ; m++)
		{
			if (nums[m] < 0)
			{
				nums2[l] = nums[m];
				l++;
			}
		}
		
		//4. Print nums2.
		System.out.print("The elements of nums2: ");
		
		for (int m = 0 ; m < l ; m++)
			System.out.print(nums2[m] + " ");

		System.out.println();

		input.close();
	}
}