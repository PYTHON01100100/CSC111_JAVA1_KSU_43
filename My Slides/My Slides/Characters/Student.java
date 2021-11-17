package others;

import java.util.Scanner;

public class Student
{

	public static void main(String[] args)
	{
		int id;
		double gpa;
		
		Scanner input = new Scanner(System.in);
		
		double maxGPA = 0;
		int maxId = 0;
		int countGT3 = 0;
		double avgGPA;
		int countStudents = 0;
		double total = 0;

		do
		{
			System.out.print("Enter Student ID: ");
			id = input.nextInt();
			
			if(id != 0)
			{
				System.out.print("Enter Student GPA: ");
				gpa = input.nextDouble();
				System.out.println("--------------------------------------------------");
				
				if (gpa >= 3)
					countGT3++;
				
				total += gpa;
				countStudents++;
				
				if (gpa > maxGPA)
				{
					maxGPA = gpa;
					maxId = id;
				}
			}
		}while(id != 0);

		System.out.println("--------------------------------------------------");

		if (countStudents != 0)
		{
			avgGPA = total / (double)countStudents;
			System.out.println("You enterd (" + countStudents + ") students.");
			String av = String.format("%.2f", avgGPA);
			System.out.println("GPA Average: " + av);

			System.out.println("There are (" + countGT3 + ") with gpa gretaer then 3");
			System.out.println("Maimum GPA: " + maxGPA + " belongs to ID : " + maxId);
		}
		else
			System.out.println("Zero students entered");
		
		System.out.println("--------------------------------------------------");
		System.out.println("Thank You");

		input.close();
	}
}