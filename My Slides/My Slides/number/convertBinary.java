package number;

import java.util.Scanner;

public class convertBinary
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String num;
		boolean flag;
		int no,a;

		for (int i = 1  ; i <= 10 ; i++)
		{
			flag = true;
			no = 0;
			a = 1;

			System.out.println("Enter Bunary Number : ");
			num = input.next();
			System.out.println(num);
			
			for (int k = num.length()-1 ; k >= 0  ; k--)
			{
				if (num.charAt(k) == '0' || num.charAt(k) == '1')
				{
					//(num.charAt(k) - 48) to get the value in int (0 or 1)
					no += a * (num.charAt(k) - 48);
					a = a * 2;
				}
				else
					flag = false;
			}
		
			if (flag)
				System.out.println("The Equivalent decimal number : " + no);
			else
				System.out.println("Wrong value\n");
		}
		
		input.close();
	}
}