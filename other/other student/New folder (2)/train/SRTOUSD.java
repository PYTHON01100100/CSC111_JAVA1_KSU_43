package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class SRTOUSD {

	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		double sum=0;
 		int i=0;
 		double n;
 		double d=0;
 		while(i>=0) {
 		System.out.println("enter price in ryial: ");
 		n=input.nextDouble();
 		d=n*0.267 ;
 		sum=sum+d;
 		System.out.println("do you want to con to sum?\nif yes enter positive \nif no enter nigitive ");
 		i=input.nextInt();
 		
 		}
 		System.out.println("The sum is "+sum);

	}

}
