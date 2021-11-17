package week7;

public class Ex1
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		int c = 3;
		
		if(++a > b++ || a-- > 0)
		{
			c++;
			//System.out.println("AAAAA");
		}
		else
			c--;
	
		System.out.println(a+" "+b+" "+c);
	}
}