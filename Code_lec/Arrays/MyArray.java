package arrays;

//import java.util.Scanner;

public class MyArray
{
	public static void main(String[] args)
	{
		//int x[] = new int[10];
		//int a[] = new int[-10]; //run time error : NegativeArraySizeException
		//int a[] = new int[0];
		
		/*
		int x[];
		
		x = new int[10];
		*/
		
		//int []x = new int[10];
		int []x,y,z;
		x = new int[10];
		y = new int[5];
		z = new int[20];
		
		x = y = z = new int[10];
		//System.out.println(x.length()); Cannot invoke length() on the array type int[]
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println(z.length);
		x[0] = 99;
		System.out.println(x[0]);
		System.out.println(y[0]);
		System.out.println(z[0]);

		/*
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = s.nextInt();
		//int n = s.nextShort();
		
		int a[] = new int[n];
		//long n = s.nextLong();
		//int a[] = new int[n]; //Type mismatch: cannot convert from long to int
		System.out.println(a.length);
		
		String names[] = new String[10];
		double gpas[] = new double[22];
		char ch[] = new char[100];
	
		String grades[] = {"A+","A","B+","B","C+","C","D+","D","F",};
		*/
	}
}