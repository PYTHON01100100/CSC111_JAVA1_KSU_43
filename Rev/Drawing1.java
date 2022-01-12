package testing;

import java.util.Scanner;

public class Drawing1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//System.out.print("Ente number of lines: ");
		//int n = input.nextInt();
		
		for (int n = 1 ; n <= 9 ; n++)
		{
			int spaceOut = 2 * n - 2;
		
			for (int i = 1 ; i <= n ; i++)
			{
				//print spaces before numbers
				for (int j = 1 ; j <= spaceOut ; j++)
					System.out.print(" ");
				
				//before the middle(1)
				for(int k = i ; k >= 1 ; k--)
					System.out.print(k + " ");
				
				//after the middle(1)			
				for(int k = 2 ; k <= i ; k++)
					System.out.print(k + " ");

				spaceOut -= 2;
				System.out.println();
			}
		}
		input.close();
	}
}