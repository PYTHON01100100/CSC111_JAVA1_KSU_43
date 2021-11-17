package week10;
import java.util.Scanner;

public class TestEquation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		QEquation e1 = new QEquation();

		System.out.print("Enter a: ");
		e1.a = input.nextDouble();
		
		if (e1.a == 0)
			System.out.println("No roots, a can not be 0");
		else
		{
			System.out.print("Enter b: ");
			e1.b = input.nextDouble();

			System.out.print("Enter c: ");
			e1.c = input.nextDouble();
			
			double d = (e1.b * e1.b) - (4 * e1.a * e1.c);  //b*b-4ac
			
			if (d < 0)
				System.out.println("The equation does not have a real solution");
			else if(d == 0)
			{
				double root = -e1.b / (2 * e1.a);
				System.out.println("One Root = " + root);
			}
			else
			{
				double root1 = (-e1.b + Math.sqrt(d))/ (2 * e1.a);
				double root2 = (-e1.b - Math.sqrt(d))/ (2 * e1.a);
				System.out.println("Root 1 = " + root1);
				System.out.println("Root 2 = " + root2);
			}
		}

		input.close();
	}

}
