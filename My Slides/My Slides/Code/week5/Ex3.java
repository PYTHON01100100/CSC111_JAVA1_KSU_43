package week5;

import java.util.Scanner;

public class Ex3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter performance level: ");
		int perf = input.nextInt();
		
		if (perf < 0 || perf > 100)
			System.out.println("Wrong perf");
		else
		{
			
			System.out.print("Enter base salary: ");
			double salary = input.nextDouble();
			
			if (perf >= 90)
				salary += salary * (3.0/100);
	
			System.out.println("Salary is: " + salary);
		}
	}
}