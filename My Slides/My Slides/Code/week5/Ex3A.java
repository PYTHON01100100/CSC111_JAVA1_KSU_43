package week5;

import java.util.Scanner;

public class Ex3A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int perf;
		
		//Validating data
		do
		{
			System.out.print("Enter performance level (0-100 only): ");
			perf = input.nextInt();			
		}while(perf < 0 || perf > 100);
		
		double salary;
		
		do
		{
			System.out.print("Enter base salary: ");
			salary = input.nextDouble();
		}while(salary <= 0);
		
		if (perf >= 90)
			//salary += salary * (3.0 / 100);
			salary = salary * 1.03;
		else
			salary = salary * 0.97; //1 - 0.03
		
		System.out.println("Salary is: " + salary);
	}
}