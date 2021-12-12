package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Tips {

	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		System.out.println("Enter subtotal and gratuity rate: ");
 		double subtotal=input.nextDouble();
 		double rate =input.nextDouble();
 		System.out.println("The gratuity is "+(subtotal *rate/100)+" total is "+(subtotal+(subtotal*rate/100)));

	}

}
