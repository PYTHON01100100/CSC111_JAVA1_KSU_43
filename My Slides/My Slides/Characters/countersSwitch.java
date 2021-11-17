package others;

import java.util.Scanner;

public class countersSwitch
{
	public static void main(String[] args)
	{
		int countCapitols = 0, countSpace = 0, countLine = 1, countA = 0, countDigit = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your text...");
		String str = input.next();
		
		int i = 0;

		while (str.charAt(i) != '$')
		{
			switch (str.charAt(i))
			{
				case '\n':	countLine++;
							break;

				case ' ':	countSpace++;
							break;

				case 'a':	countA++;
							break;
				default:	if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
							{
								if (str.charAt(i) == 'A')
									countA++;

								countCapitols++;
							} 
							else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
								countDigit++;
			}

			i++;
		}

		System.out.println("Number of Lines    : " + countLine);
		System.out.println("Number of Digits   : " + countDigit);
		System.out.println("Number of Capitols : " + countCapitols);
		System.out.println("Number of Spaces   : " + countSpace);
		System.out.println("Number of A's      : " + countA);
	
		input.close();
	}
}