package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		System.out.println("\\");
 		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
 		int num = 10; int x = 3;
 		while (num != 2) {
 		if (num %4 == 0) {
 		x = num;
 		num--;
 		}
 		else
 		num--;
 		System.out.println(num);
 		}
 		System.out.print(x);
 		System.out.println();
 		String a = "about";
 		char b = a.charAt(2-2%2);
 		System.out.println(2-2%2);
 		System.out.println("BBBB is " + b);
 		
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
 		String aA = "123";
 		char $1 = '1';
 		//System.out.println(aA.charAt(0).equals($1));
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

 		int n=3;
 		n-=1;
 		System.out.println(n);
 		boolean v1=false;
 		boolean v2=true;
 		if(v1)
 			System.out.println(v1);
 		else
 			System.out.println(v2);
 		
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
 		int x4=5;
 		double y=4.5;
 		x4=x4+(int)y;
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
 		int i1=1;
 		System.out.println(i1+++i1); //
 		double Pi=3.14159;
 		System.out.println("Pi is \" + Pi ");
 		double grade=89.6;
 		double bonus= grade++ +-1;
 		System.out.println((int)bonus);
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
 		int x6 = 7 , y5 = 10;
 		if(!(x6<7&& y5 == 3))// !true =false and ! false true
 		System.out.println("we are here");
 		else
 		System.out.println("we are not here");
 		
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
 		if(5>10);
 		else
 			System.out.println("5");
 		
 		
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
 		
 		
 		
 		int n5=input.nextInt();
 		do {
 			System.out.println("CSC111");
 			n5--;
 		}while(n5>0);
 		int x10=4,y10=10,z10=9;
 		x10=5;y10=6;z10=8;
 		// x=4,y=9,z=10; is not allow
 		 System.out.println(4+3/5-7);
 		 
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

 		
 		
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
 		String u="csc111";
 		String u2="CSC111";
 		System.out.println(u.equalsIgnoreCase(u2));
 		System.out.println(u.equals(u2));
 		
 		
 		System.out.println("11\\55\n5");
 		
 	
 		int i8=5;
 		while(i8>0) {
 			if(i8%2!=0)
 				System.out.println(i8);
 			i8--;
 		
 		}
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
 		int i20=1;
 		while (i20<10) 
 		i20+=2;
 		System.out.print(i20+" ");
 		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");	
 	}
}
