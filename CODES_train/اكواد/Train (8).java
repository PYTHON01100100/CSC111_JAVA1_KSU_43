package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int cho=input.nextInt();
 		if(cho==1) {
 			System.out.println("one");
 			System.out.println("two");
 		}
 		else if(cho==2) {
 			System.out.println("two");
 		}
 		else if(cho==3) {
 			System.out.println("three");
 			System.out.println("invalid entry");
 		}
 		else {
 			System.out.println("invalid entry");
 		}
 		}
 		}