package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int sum=0;
 		int i=0;
 		int n;
 		while(i>=0) {
 		System.out.println("enter no: ");
 		n=input.nextInt();
 		sum=sum+n;
 		System.out.println("do you want to con to sum?\nif yes enter positive \nif no enter nigitive ");
 		i=input.nextInt();
 		
 		}
 		System.out.println("The sum is "+sum);
 	
 	}
}
