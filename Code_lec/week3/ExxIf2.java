package week3;

import java.util.Scanner;

//Input: Length and Width 
//Process: calculate the area (length * width)
//Output: area

public class ExxIf2
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double length,width,area;

		System.out.print("Enter Length (> 0): ");
		length = input.nextDouble();

		if (length > 0)
		{
			System.out.print("Enter Width: (> 0): ");
			width = input.nextDouble();

			if (width > 0) //width == 0
			{
				area = length * width;
				System.out.println("Area = " + area);
			}
			else
			{
				System.out.println("Negative not allowed for width");
			}
		}
		else
			System.out.println("Negative not allowed for length");
		
		input.close();
	}
}