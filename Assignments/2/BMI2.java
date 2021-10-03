import java.util.Scanner;
import java.util.Locale;
public class BMI2 {
	public static void main(String[] args) { // we want to calculate the BMI (Body Mass Unit)
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter weight in pounds: ");
		
		double pounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		
		double inch = input.nextDouble();
		
		double kg = pounds * 0.45359237; // pound to KiloGram
		double m = inch * 0.0254; // Inch to Meter
		
		double equation = (kg / Math.pow(m , 2)); // the BMI equation 
		
		System.out.print("BMI is " + equation);
	}
}