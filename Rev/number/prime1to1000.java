package number;

public class prime1to1000
{
	public static void main(String[] args)
	{
		int no, i, count = 0;
		for (no = 1; no <= 1000; no++)
		{
			i = 2;

			while (i <= no / 2 && no % i != 0)
				i++;

			if (i > no / 2)
			{
				System.out.println(no + " is prime number");
				count++;
			}
		}

		System.out.println("Number of prime numbers : " + count);
	}
}