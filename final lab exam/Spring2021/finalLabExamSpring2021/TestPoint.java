package week16;

import java.util.Scanner;

public class TestPoint
{
	public static void main(String[] args)
	{
//		/1. Declare two Point objects p1 and p2
		Point p1 = new Point();
		Point p2 = new Point();
	
		Scanner input = new Scanner(System.in);
		double x;
		double y;

		//2. Read the values of x and y for both points.
		/*
		 * 	3. Compute the distance between the two points using the method distance, 
			if the distance is less than or equal to 5.0 you should print the distance and exit. 
			Otherwise keep reading two more points and printing the distance until you get
 			two points with distance less than or equal to 5.0.
		 */
		
		double d;

		do
		{
			System.out.print("Enter x and y for p1 ");
			x = input.nextDouble();
			y = input.nextDouble();
			p1.setX(x);
			p1.setY(y);
			
			System.out.print("Enter x and y for p2 ");
			x = input.nextDouble();
			y = input.nextDouble();
			p2.setX(x);
			p2.setY(y);
	
			d = p1.distance(p2);
			
			if (d > 5)
			{
				System.out.println("Distance is " + d + " which is > 5. Try again.");
			}
			else
			{
				System.out.println("The two points are close.");
				System.out.println("The distance between them is " + d + " which is less than 5");
			}
		}while(d > 5);

		input.close();
	}
}
/*


*/