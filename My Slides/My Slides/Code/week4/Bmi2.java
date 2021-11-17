package week4;

import java.util.Scanner;

public class Bmi2 
{
	public static void main(String[] args) 
	{
		double weight,height,bmi;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter weight in kilograms: ");
		weight = input.nextDouble();
		System.out.print("Enter height in meters: ");
		height = input.nextDouble();

		bmi = weight / Math.pow(height, 2);
		//bmi = weight / (height * height);
		System.out.println("BMI is " + bmi);
	}
}