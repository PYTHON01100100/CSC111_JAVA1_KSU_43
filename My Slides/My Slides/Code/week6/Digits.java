package week6;

import java.util.Random;

public class Digits
{

	public static void main(String[] args)
	{
		Random r = new Random();
		
			int n = r.nextInt(100000);
			
			System.out.println("N = " + n);
			int count = 0;
			int x;
			int temp = n;
			
			while(n != 0)
			{
				x = n % 10;
				System.out.println(x);
				n = n / 10;
				
				count++;
			}
			
			System.out.println(temp + " has " + count + " digits");
	}

}
