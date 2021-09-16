package week3;

import java.util.Scanner;

public class Ex1 
{
	public static void main(String[] args)
	{
		/*
		int x = 10;
		int y; //Declaration
		y = 10; //give a value
		final int s = 90;
		//s = 3 + x - y + 87; //The final local variable s cannot be assigned. 
		
		final double PI = 3.14;
		final String UNIVERISTYNAME = "KSU";
		
		String name = "Khaled";

		System.out.println(name.charAt(0));
	
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE + " Bits");

		double d1;
		
		d1 = 123.456 % 12.3;
		System.out.println(d1);
		
		*/
		
		/*
		int a,b,c;
		double r;
		
		a = 7;
		b = 3;
		r = (double) a/b;
		*/
		
		int x = 10;
		int y = 10;
		boolean b = true; 
		System.out.println(b); //true
		b = false;
		System.out.println(b);//false
		b = x >= y;
		System.out.println(b);
		
		b = x + 1 >= y;
		
		//b = x; //error x is number and b is boolean (Mismatch)
		boolean c = true;
		b = c;
		System.out.println(b); //true
		
		b = x == y;
		System.out.println(b);
		
		b = x > y && y != 0;
		b = x > y && 1 == 0;

		Scanner input = new Scanner(System.in);
		x = input.nextInt(); //get information from the keyboard
		
		
		//System.out.print("Enter character: ");
		//char ch = input.next().charAt(0);  //get first character from the string we read

		//System.out.println("CH = " + ch);
		
		String name = "Salam Waleed jkdhsf l;aj v;fdlvjm,xcnv,rislhgfxbn";
		System.out.println(name.length());
		System.out.println(name.charAt(11));
		System.out.println(name.charAt(name.length() - 1));
		//System.out.println(name.charAt(100 - 1)); //out of range
		name = name.toLowerCase();
		System.out.println(name);
		
		//String name1 = "aaa";
		String name1 = new String("Kamal");

		input.close();
	}
}