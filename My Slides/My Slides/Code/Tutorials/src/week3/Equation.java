package week3;

public class Equation 
{
	public static void main(String[] args)
	{
		int x,y,z;
		x = 7;
		y = 2;
		
		z = x + y;
		System.out.println("7 + 2 = " + z);
		z = x - y;
		System.out.println("7 - 2 = " + z);
		z = x * y;
		System.out.println("7 * 2 = " + z);
		z = x % y;
		System.out.println("7 % 2 = " + z);
		
		z = x / y;
		System.out.println("7 / 2 = " + z);
		
		/*
		z = 35725 / 3600;
		System.out.println(z);
		System.out.println(z * 3600);
		*/
		System.out.println("------------------------------");
		double r,s,t;
		
		r = 7.0;
		s = 2;
		System.out.println("r = " + r);
		System.out.println("s = " + s);
	
		t = r/s;
		System.out.println("7.0 / 2.0 = " + t);

		System.out.println("------------------------------");
		t = x / y;
		System.out.println("7 / 2 = " + t);
		
		t = x / s;
		System.out.println("7 / 2.0 = " + t); //3.5
		System.out.println("------------------------------");
		
		//z = r/s;  Type mismatch: cannot convert from double to int

		z = (int) 2.9; // (int) casting
		System.out.println(z);
		System.out.println("------------------------------");
		
		t = (double)x/y; // 3.5
		System.out.println("(double)x / y = " + t);
		
		t = x/(double)y; // 3.5
		System.out.println("x / (double)y = " + t);

		t = (double)x/(double)y; // 3.5
		System.out.println("(double)x / (double)y = " + t);

		t = (double)(x/y); // 3.0
		System.out.println("(double)(x / y) = " + t);	
	}
}