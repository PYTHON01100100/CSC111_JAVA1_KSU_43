import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class TEST1 {

	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		System.out.println("Please enter your name:");
 		String userName=input.next();
 		System.out.println("Hi "+userName);
 		

	}

}
