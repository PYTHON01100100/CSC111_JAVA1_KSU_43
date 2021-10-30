import java.util.Locale;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		System.out.print("Is "+ num + " divisible by 5 and 6? ");
		if ( num%5 == 0 && num%6 == 0 ) {
		System.out.println("true");
		}
		else {
		System.out.println("false");
		}
		System.out.print("Is "+ num + " divisible by 5 or 6? ");
		if ( num % 5 == 0 || num % 6 == 0 ) {
		System.out.println("true");
		}
		else {
		System.out.println("false");
		}
		

		System.out.print("Is "+ num + " divisible by 5 or 6, but not both? ");
				if (num % 5 == 0) {
				if (num % 6 == 0)
				System.out.println("false");
				else
				System.out.println("true");
				}
				else if (num % 6 == 0) {
				if (num % 6 == 0)
				System.out.println("false");
				else
				System.out.println("true");
				}
				else {
				System.out.println("false");
				}
		
		
		
		
		
	}
}