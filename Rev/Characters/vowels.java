package others;

import java.util.Scanner;

public class vowels
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int countVowels = 0;

		System.out.println("Enter your text...");
		String str = input.nextLine();
		int i = 0;
		
		while(i < str.length())
		{
			switch(str.charAt(i))
			{
				case 'a' : 
				case 'A' :
				case 'e' : 
				case 'E' :
				case 'i' : 
				case 'I' :
				case 'o' : 
				case 'O' :
				case 'u' : 
				case 'U' : countVowels++;
			}

			i++;
		}

		System.out.println("Number of Vowels   : " + countVowels);

		input.close();
	}
}