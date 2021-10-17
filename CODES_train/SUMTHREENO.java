package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int n;
 		int sum=0;
 		int dig=0;
 		System.out.println("please enter no between 0-999:");
 		n=input.nextInt();
 		
 		System.out.println("_____________________________________________________");
 		while(n!=0 && n<1000) {	
 			int b=n%10; // ÑÇÍ íÇÎÐ ÇáÇÍÇÏ ÇáÇÑÞÇã
 			int subno=n;
 			sum=b+sum;
 			n=n/10;
 			int re=b;
 			System.out.println("divid by 10 | \t  |module by 10");
 			System.out.println(subno+"/10= "+n+" | \t  |"+ subno + "%10 = "+re);
 			System.out.println("_____________________________________________________");
 			dig++;
 		}
 		System.out.println("\nthe result ="+sum);
 		System.out.println("no of dig ="+dig);
 		
 		}}