import java.util.Locale;
import java.util.Scanner;
public class Fuel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Enter the driving distance: ");
		double Distance = input.nextDouble();
		System.out.print("Enter kilos per liter:");
		double KPL = input.nextDouble();
		System.out.print("Enter price per liter: ");
		double PPL = input.nextDouble();
		double cost =(Distance/KPL)*PPL;
		System.out.println("The cost of driving is $"+cost);
		//System.out.println("The cost of driving is $"+((Distance/KPL))*PPL);
		
		
		
	}

}
