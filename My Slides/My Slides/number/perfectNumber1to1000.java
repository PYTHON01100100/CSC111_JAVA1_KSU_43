package number;

public class perfectNumber1to1000
{
	public static void main(String[] args)
	{
		int no,i,sum;

		for (no = 1 ; no <= 1000 ; no++)
		{
			sum = 0;

			for (i = 1 ; i <= no/2 ; i++)
			{
				if (no % i == 0)
					sum += i;
			}

			if (no == sum)
				System.out.println(no + " is perfect number");
		}
	}
}