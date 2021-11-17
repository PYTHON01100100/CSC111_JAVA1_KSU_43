import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		System.out.println("Please enter three Numbers:");
 		
 		int total=0;
 		for(int i=0;i<3;i++)
 		{
 			int n=input.nextInt();
 			total+=n;
 		}
 		System.out.println("the total of three Numbers is  "+total);
	}
}
