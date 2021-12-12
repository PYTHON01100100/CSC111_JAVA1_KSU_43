package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;


public class GameStore2 {
	
	
		public static void main(String[] args) {
	 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
	 		double dis=(20.0/100);
	 		int id=0;
	 		int price;
	 		double total=0;
	 		System.out.println("Welcome to Gaming Center :) \n-------------------------------------------------------------------------------------------------------------------------------------");
	 		while(id!=-1) {
	 			System.out.println("Please, enter game id:  ");
	 			id=input.nextInt();
	 			if(id!=-1) {
	 			System.out.println("Please, enter the price of next game: ");
	 			price=input.nextInt();
	 			total +=price;
	 			
	 		}
	 			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
	 		}
	 		System.out.println("finished");
	 		System.out.println("Total price before discount: "+total+"$");
	 		System.out.println("Your discount is:  "+(total*dis)+"$");
	 		System.out.println("Total price after discount: "+(total-(total*dis))+"$");
	 		
	 		
	}

}
