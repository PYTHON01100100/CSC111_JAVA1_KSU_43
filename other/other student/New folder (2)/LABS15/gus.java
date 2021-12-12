import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class gus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int count=0;
		String gday;
		System.out.println("Player 1:");
		String secw=input.next();
		boolean stop=false;
		System.out.println("player 2:");
		System.out.println("enter your guess: ");
		gday=input.next();
		while(!stop) {
			if(gday.equalsIgnoreCase(secw)) {
				System.out.println("You are correct. it was "+secw+"! it took you "+count +" guesses");
				stop=true;
		}
			else {
				System.out.println("wrong gurss again:");
				gday=input.next();
				count++;
			}
	}
		System.out.println("Good bye! Thanks for playing");
		System.out.println("finished");
		input.close();
	

}
}