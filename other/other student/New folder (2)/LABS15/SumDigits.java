import java.util.Locale;
import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int total=0;
		int mol;
		int try1=0;
		do {
			System.out.println("Enter an integer between 0 and 1000:  ");
			int no=input.nextInt();
		if(no<1000&&no>0){
		while(no!=0) {
			total+=no%10;
			no=no/10;
			
		}
		System.out.println("The sum of all digits in 999 is "+ total);
		}
		else {
			System.out.println("wrong");
		}
		System.out.println("do you want try again?  ");
		System.out.println("[1] try again \t [2]exit \t defalt turn the program again");
		try1=input.nextInt();
		
		if(try1==2)
			System.out.println("Good bye and see you later and allah save you and make you happy\nfinished");
		
		}while(try1!=2);
	}

}
