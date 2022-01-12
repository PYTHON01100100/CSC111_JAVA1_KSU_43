package number;

import java.util.Scanner;

public class primeNumbers
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int no,i;
	
		do
		{
			do
			{
				System.out.print("Enter the number : ");
				no = input.nextInt();
			}while (no <= 0 && no != -1);
	
			if (no != -1)
			{
				i = 2;
	
				while (i < no)
				{
					if (no % i == 0)
						break;
	
					i++;
				}
	
				if (i == no || no == 1)
					System.out.println(no + " is PRIME Number");
				else
					System.out.println(no + " is NOT PRIME Number");
			}
		}while (no != -1);
		
		input.close();
	}
}