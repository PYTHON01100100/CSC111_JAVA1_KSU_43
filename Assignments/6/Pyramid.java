import java.util.Locale;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		int line;
		System.out.print("Enter the number of lines: ");
		line = input.nextInt();
		for (int i=1; i<=line; i++) {
			for(int j=0; j<=(line-i); j++) {
				if ( j== (line-i)) {
					System.out.print(" ");
					}
				else {
					System.out.print(" ");}
				}
			for (int j=i ; j>=1 ; j--) {
				if(i==1) {
					System.out.print(j);}
		else {
		System.out.print(j+ " ");
		}
				}
			for(int j=2; j<i+1; j++) {
				if (j==i) {
					System.out.print(j);
					}
		else {
		System.out.print(j+ " ");
		}
				}
		System.out.println();
		}

	}

}
