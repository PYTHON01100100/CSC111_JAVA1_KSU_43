import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Enter weight in pounds:  ");
		double Weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double Height = input.nextDouble();
		double Killo = Weight*0.45359237;
		double M = Height* 0.0254;
		double Pow = Math.pow(M, 2);
		double BMI=Killo/Pow;
		System.out.println("BMI is "+ BMI);
		//System.out.println(Pow);
		}}