package train;
import java.util.Locale;
import java.util.Scanner;
public class Str {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int try1;
		String name1;
		String name2;
		int cho;
		do {
			System.out.println("PLEASE ENTER FIRST STRING:  ");
			name1=input.next();
			System.out.println("PLEASE ENTER FIRST STRING:  ");
			name2=input.next();
			System.out.println("Choose your type of comprison: ");
			System.out.println("1)Case sensitive \t 2)Case Insensitive ");
			cho=input.nextInt();
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			if(cho==2|| cho==1) {
				if(cho==1)
					if(name1.equals(name2))
					System.out.println("The two string are equals\n-------------------------------------------------------------------------------------------------------------------------------------------");
					else
						System.out.println("They are not equals\n-------------------------------------------------------------------------------------------------------------------------------------------");
				if(cho==2)
					if(name1.equalsIgnoreCase(name2))
					System.out.println("The two string are equals\n-------------------------------------------------------------------------------------------------------------------------------------------");
					else
						System.out.println("They are not equals\n-------------------------------------------------------------------------------------------------------------------------------------------");
			}
			
			else {
				System.out.println("wrong type\n-------------------------------------------------------------------------------------------------------------------------------------------");
			}
			
			
			
			
			System.out.println("do you want try again?\n[1]yes [2]no");
			try1=input.nextInt();
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
			}while(try1!=2);
		System.out.println("good bye");
	}

}