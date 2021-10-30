import java.util.Locale;
import java.util.Scanner;
public class Shipping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Enter package weight: ");
		double weight;
		weight = input.nextDouble();
		if (weight > 0 && weight <= 1)
		System.out.print("The shipping cost is $3.5");
		else if
		 (weight > 1 && weight <= 3)
		System.out.print("The shipping cost is $5.5");
		else if
		(weight > 3 && weight <= 10)
		System.out.print("The shipping cost is $8.5");
		else if
		(weight > 10 && weight <= 20)
		System.out.print("The shipping cost is $10.5");
		else if
		(weight > 20)
		System.out.print("the package cannot be shipped.");

	}

}
