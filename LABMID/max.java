import java.util.Locale;
import java.util.Scanner;
public class max {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("how many Numbers do you have: ");
		int num = input.nextInt();
		int numToAvg=num;
		int max= Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int no;
		double avg;
		double total=0;
		System.out.println("enter The Numbers: ");
		for(;num>0;num--) {
			no=input.nextInt();
			if(no > max)
	         {
	            max = no;
	         }
	         if(no < min)
	         {
	             min= no;
	         }
	        
			
			total +=no;
		}
		System.out.println("the Maximum is "+ max);
		System.out.println("the Minimum is "+ min);
		System.out.println("the Total is "+ total);
		System.out.println("the Average is "+ total/numToAvg);
		
		
		
 }
}