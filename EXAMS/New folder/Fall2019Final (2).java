package week15;

public class Fall2019Final
{
	public static void main(String[] args)
	{
		//int i = 1;

		/*
		do {
			i++;
		}while(false);
		
		System.out.println(i);
		*/
		/*
		i++;
		System.out.println(i);
*/
		//while(false)
//			i++; /Unreachable code
		
		/*
		int x = 3;
		int y = 5;
		x = y = x;
		System.out.println(x);
		*/
		
		if (true)
		{
			int i = 1;
			System.out.print(i);
		}
		else
			System.out.print(3); //Dead code
			//System.out.print(i++); //Dead code
	}
}