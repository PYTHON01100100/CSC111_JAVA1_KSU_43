package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		System.out.println(10+20 +" ten");
		System.out.println(" ten"+ (10+20));
		System.out.println(" ten"+ 10+20);
		System.out.println(" ten"+ 10*20);
		System.out.println(10*20+" ten");
		System.out.println(""+10+20+"ten");
		
		System.out.println(10+20 +" ten");
		System.out.println(" ten"+ (10+20));
		System.out.println(" ten"+ 10+20);
		System.out.println(" ten"+ 10*20);
		System.out.println(10*20+" ten");
		System.out.println(""+10+20+"ten");
		String s1="";
		System.out.println(s1+10+20 +"ten");
		System.out.println(10+20 +"ten"+s1);
		double tax = 5/100;
		double tax2 =5.0/100;
		double tax3 =5/100.0;
		System.out.println(tax+ ", "+tax2+", "+tax3);
 		}
 	}