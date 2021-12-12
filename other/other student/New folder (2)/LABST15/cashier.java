import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class cashier {
//if(member.equalsIgnoreCase("Y")||member.equalsIgnoreCase("N"))
//cashier
	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		String name;
 		//String seat, snaks, selfood,member;
 		double price=0;
 		double total =0;
 		int quan;
 		double subtotal=0;
 		System.out.println("Welcome to the cashier system\n===============================================================================================================================\n ");
 		System.out.println("Please enter Product name: ");
 		 name=input.next();
 		while(!name.equalsIgnoreCase("Stop")) {
 			System.out.println("Please enter price(In SR): ");
 			price=input.nextDouble();
 			System.out.println("Please enter quantity: ");
 			quan=input.nextInt();
 			subtotal=price*quan;
 			total=subtotal+total;
 			System.out.println("Subtotal is ="+subtotal+"SR");
 			System.out.println("Please enter Product name::");
 	 		 name=input.next();
 	 				
 		}
 		System.out.println("*********************************************************************************************************************************************");
 		System.out.println("The total bill is "+total+"SR");
 		System.out.println("good bye");
 		System.out.println("*********************************************************************************************************************************************");
	
	}
}
 	 				