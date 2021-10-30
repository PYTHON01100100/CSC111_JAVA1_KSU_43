import java.util.Locale;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int number , num,j ;
		// you can use is by do while
		System.out.print("Enter a number ( -1 to end): ");
		num= input.nextInt();
		while (num != -1) {
			j = 1;// give it  a value
		//nasted while	
		while ( num > 0) {
		number= num%10; //take last no from R.H.S
		System.out.println("Digit" + j++ + " = " + number); // will print j 1 then add no 1
		num = num/10; // to remove last no from R.H.S
		}
		System.out.print("Enter a number: ");
		//j = 1 ;// GIVE THE NEW NO AFTER THE LOOP
		num = input.nextInt();//GIVE IT NO AND WILL CHEAK IS IT NUM !=1
		}

	}

}
