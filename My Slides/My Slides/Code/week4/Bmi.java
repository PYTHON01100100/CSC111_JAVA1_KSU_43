package week4;

import java.util.Scanner;

public class Bmi 
{
	public static void main(String[] args) 
	{
		double weight,height,bmi;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in kilograms: ");
		weight = input.nextDouble();
		
		if (weight >= 0)
		{
			System.out.print("Enter height in meters: ");
			height = input.nextDouble();

			if (height >= 0)
			{
				bmi = weight / Math.pow(height, 2);
				//bmi = weight / (height * height);
				System.out.println("BMI is " + bmi);
			}
			else
				System.out.println("Please enter positive values for height");
		}
		else
			System.out.println("Please enter positive values for weight");
		
		input.close();
	}
}