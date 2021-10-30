import java.util.Scanner;
import java.util.Locale;
public class Max {
public static void main(String [] args ) {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	int x , y ;
	String a , a1 = "a";
	double as = 0, asq=0 ;
	System.out.print("Enter the number of students: ");
	x = input.nextInt();
	y = x-x ;
	while (x > y) {
		System.out.print("Enter a studint name : ");
		a = input.next();
		System.out.print("Enter a studint score : ");
		as = input.nextDouble();
		if (as > asq) {
			asq = as ;
			a1 = a ;
			}
		y++;
		}
 System.out.print("Top student " + a1 + "'s score is " +(asq));
}
}