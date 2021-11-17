package number;

import java.util.Scanner;

//153
public class cube
{
	public static void main(String[] args)
	{
		int no,sum = 0,x,temp;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		no = input.nextInt();

		System.out.println("Number   : " + no);
	
		temp = no;

		while(no != 0)
		{
			x = no % 10;
			sum += x * x * x;
			no /= 10;
		}

		System.out.println("Sum of cubes of the digits : " + sum);

		if (temp == sum)
			System.out.println("The total of cubs of digigts is the same as the number\n");
		else
			System.out.println("The total of cubs of digigts is not the same as the number\n");
		
		input.close();
	}
}