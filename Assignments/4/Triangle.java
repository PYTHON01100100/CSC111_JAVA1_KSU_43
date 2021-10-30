import java.util.Locale;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		double a , b , c , sum ;
		System.out.print("Enter three edges (length in double): ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		sum = a + b + c ;
		if (a + b < c || a + c < b || b + c < a) {
		System.out.println("Input is invalid");
		}
		else {
		System.out.println("The perimeter is " + sum);
		}
	}

}
