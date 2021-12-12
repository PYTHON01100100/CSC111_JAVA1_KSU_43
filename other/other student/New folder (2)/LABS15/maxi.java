import java.util.Locale;
import java.util.Scanner;
public class maxi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("how many Numbers do you have: ");
		int hm = input.nextInt();
		int max=0;
		int no;
		int total=0;
		System.out.println("enter The Numbers: ");
		for(;hm>0;hm--) {
			no=input.nextInt();
			if(no>max)
				max=no;
			
			total +=no;
		}
		System.out.println("the max is "+ max);
		System.out.println("the total is "+ total);
		
		
		
 }
}