package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int price=0;
		int sum=0;
		do {
			System.out.println("enter pro: ");
			price=input.nextInt();
			sum=sum+price;
			
		}while(price!=0);
		System.out.println("sum ="+sum+"$");
 		}
 	}