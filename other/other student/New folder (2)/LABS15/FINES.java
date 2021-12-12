import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class FINES {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int try1;
		int speed;
		do {
			System.out.println("PLEASE ENTER YOUR CAR SPEED IN KM:  ");
			speed=input.nextInt();
			if(speed>0 && speed<240) {
				if(speed<=100) 
					System.out.println("No fine");
				else if(speed>100 && speed<=113)
				System.out.println("YOUR FINE IS 300");
				else if(speed>113 && speed<=140)
				System.out.println("YOUR FINE IS 500");
				else if(speed>140)
				System.out.println("YOUR FINE IS 1000");
				
			}
			
			else {
				System.out.println("Speed nust be between 0 and 240");
			}
			
			
			
			
			System.out.println("do you want try again?\n[1]yes [2]no");
			try1=input.nextInt();
			}while(try1!=2);
		System.out.println("good bye");
	}

}
