import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		System.out.println("Please enter three slides:");
 		int slide1=input.nextInt();
 		int slide2=input.nextInt();
 		int slide3=input.nextInt();
 		int sum = slide2 +slide1 + slide3 ;
		if (slide1 + slide2 < slide3 || slide1 + slide3 < slide2 || slide2 + slide3 < slide1) {
		System.out.println("Input is Invalid");
		}
		else {
		System.out.println("The Perimeter is " + sum);
		if (slide1*slide1 == (slide2*slide2) + (slide3*slide3)
				|| slide3*slide3 == (slide2*slide2) + (slide1*slide1)  
				|| slide2*slide2 == (slide1*slide1) + (slide3*slide3))
			{
				System.out.println(" it’s a right angle");
			}
			else {
			System.out.println(" it’s  not a right angle");
			}
	}

}
}