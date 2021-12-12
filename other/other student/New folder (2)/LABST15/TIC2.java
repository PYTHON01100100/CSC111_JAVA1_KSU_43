import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class TIC2 {
//if(member.equalsIgnoreCase("Y")||member.equalsIgnoreCase("N"))

	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		String moviename;
 		String seat, snaks, selfood,member;
 		double price=0;
 		
 		System.out.println("Please enter national ID:");
 		int id=input.nextInt();
 		while(id!=-1) {
 			System.out.println("Please Select the movie{M1 or M2 or M3}:");
 			moviename=input.next();
 				System.out.println("Please Select choice of the seat {Normal {N} or Deluxe {D} }:");
 				seat=input.next();
 			if(seat.equalsIgnoreCase("N"))
 	 				if(moviename.equalsIgnoreCase("M1")||moviename.equalsIgnoreCase("M2"))
 	 					price+=75;
 	 				else
 	 					price+=80;
 	 			else if(seat.equalsIgnoreCase("D"))
 	 				if(moviename.equalsIgnoreCase("M1")||moviename.equalsIgnoreCase("M3"))
 	 					price+=140;
 	 				else
 	 					price+=75;
 			
 	 				System.out.println("Would you like to have snacks? (Y/N):");
 	 				snaks=input.next();
 	 				
 	 				if(snaks.equalsIgnoreCase("Y")) {
 	 					System.out.println("Please selsect snaks package{s1 or s2 or s3}:");
 	 					selfood=input.next();
 	 					if(selfood.equalsIgnoreCase("S1")||selfood.equalsIgnoreCase("S3")||selfood.equalsIgnoreCase("S2"))
 	 					{
 	 						if(selfood.equalsIgnoreCase("S1"))
 	 							price+=8;
 	 						else if(selfood.equalsIgnoreCase("S2"))
 	 							price+=15;
 	 						else if(selfood.equalsIgnoreCase("S3"))
 	 							price+=5;
 	 						}
						System.out.println("Do you have a membership whith us? (Y/N):");
						member=input.next();
	 	 				
	 	 				if(member.equalsIgnoreCase("Y")) {
	 	 					price=price-(price*20.0/100);
	 	 					System.out.println("Thank yoy, Please pay your total amount: "+price);
	 	 					}
	 	 				else if (member.equalsIgnoreCase("N")) {
	 	 					System.out.println("Thank yoy, Please pay your total amount: "+price);
	 	 					}


 	 				}

 	 				else if(snaks.equalsIgnoreCase("N"))
 	 						{
	 						System.out.println("Do you have a membership whith us? (Y/N):");
	 						member=input.next();
	 	 	 				
	 	 	 				if(member.equalsIgnoreCase("Y")) {
	 	 	 					price=price-(price*20.0/100);
	 	 	 					System.out.println("Thank yoy, Please pay your total amount: "+price);
	 	 	 					}
	 	 	 				else if (member.equalsIgnoreCase("N")) {
	 	 	 					System.out.println("Thank yoy, Please pay your total amount: "+price);
	 	 	 					}

 	 				}
 	 		 		System.out.println("Please enter national ID:");
 	 				id=input.nextInt();
 	 				
 		}
 		System.out.println("good bye");
	}
}
 	 				