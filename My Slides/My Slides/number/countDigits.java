package number;

import java.util.Scanner;

public class countDigits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int no, temp;
		int count0, count1, count2, count3, count4, count5, count6, count7, count8, count9;

		count0 = count1 = count2 = count3 = count4 = count5 = count6 = count7 = count8 = count9 = 0;

		do
		{
			System.out.println("enter number, to stop enter 0 : ");
			no = input.nextInt();

			if (no != 0)
			{
				temp = no;

				int x;

				while (temp != 0)
				{
					x = temp % 10;

					switch (x)
					{
						case 0:	count0++;
								break;
						case 1:	count1++;
								break;
						case 2:	count2++;
								break;
						case 3:	count3++;
								break;
						case 4:	count4++;
								break;
						case 5:	count5++;
								break;
						case 6:	count6++;
								break;
						case 7:	count7++;
								break;
						case 8:	count8++;
								break;
						case 9:	count9++;
					}

					temp /= 10;
				}
			}
		} while (no != 0);

		System.out.println("Count of 0's : " + count0);
		System.out.println("Count of 1's : " + count1);
		System.out.println("Count of 2's : " + count2);
		System.out.println("Count of 3's : " + count3);
		System.out.println("Count of 4's : " + count4);
		System.out.println("Count of 5's : " + count5);
		System.out.println("Count of 6's : " + count6);
		System.out.println("Count of 7's : " + count7);
		System.out.println("Count of 8's : " + count8);
		System.out.println("Count of 9's : " + count9);
		
		input.close();
	}
}