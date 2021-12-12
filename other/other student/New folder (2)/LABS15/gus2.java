import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class gus2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int count=0;
		String gday;
		System.out.println("enter player 1 name:");
		String name1=input.next();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("enter player 2 name:");
		String name2=input.next();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Player "+ name1 +":");
		String secw=input.next();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
		boolean stop=false;
		System.out.println("player " +name2+":");
		System.out.println("enter your guess: ");
		
		gday=input.next();
		while(!stop) {
			if(gday.equalsIgnoreCase(secw)) {
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("well done "+ name2  + ". it was "+secw+"! it took you "+count +" guesses");
				stop=true;
				System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		}
			else {
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("wrong gurss again:");
				gday=input.next();
				count++;
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
			}
	}
		System.out.println("Good bye "+name1+" and  "+name2+" ! Thanks for playing ");
		System.out.println("finished");
		input.close();
	

}
}