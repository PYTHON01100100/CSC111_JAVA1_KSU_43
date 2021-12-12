import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class RIDE2 {
//if(member.equalsIgnoreCase("Y")||member.equalsIgnoreCase("N"))
//cashier
	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		char ride,extra;
 		String seat, snaks, selfood,member;
 		double price=0;
 		int age;
 		int round;
 		double dis;
 		double total;
 		System.out.println("Please enter national ID:");
 		int id=input.nextInt();
 		while(id!=-1) {
 			System.out.println("Please enter your age:");
 			age=input.nextInt();
 			
 			if(age>5) {
 				System.out.println("Please Select choice of animal ride {Horse {H} or Elephant {E} Camel{C}}:");
 				ride=input.next().charAt(0);
 				System.out.println("Would you like extra rounds? (Y/N)");
 				extra=input.next().charAt(0);
 				if(extra == 'y'||extra == 'Y') {
 					if(age>15) {
 					if(ride=='H'||ride=='h')
 						price=20;
 					else if(ride=='e'||ride=='E')
 						price=25;
 					else if(ride=='C'||ride=='c')
 						price=30;
 					}
 					else {
 					if(ride=='H'||ride=='h')
 						price=10;
 					else if(ride=='e'||ride=='E')
 						price=15;
 					else if(ride=='c'||ride=='C')
 						price=20;
 					}
 				}
 				else if(extra == 'N'||extra == 'n') {
 					if(age>15) {
 					if(ride=='H'||ride=='h')
 						price=25;
 					else if(ride=='e'||ride=='E')
 						price=30;
 					else if(ride=='C'||ride=='c')
 						price=35;
 					}
 				else {
 					if(ride=='H'||ride=='h')
 						price=15;
 					else if(ride=='e'||ride=='E')
 						price=20;
 					else if(ride=='c'||ride=='C')
 						price=25;
 					}
 				}
 				System.out.println("enter nomber of rounds");
 				round=input.nextInt();
 				total=round*price;
 				if(round>5)
 				{
 					System.out.println("the total before discount is "+(total));
 					System.out.println("the total after discount is "+(total-(total*0.10/100)));
 				}
 				else {
 					System.out.println("the total before discount is "+(total));
 				}
 				
 				
 				
 			}
 				else {
 					System.out.println("Not allowed! !");
 				}
 				
 				System.out.println("Please enter national ID:");
 	 				id=input.nextInt();
 	 				
 		}
 		System.out.println("good bye");
	}
}