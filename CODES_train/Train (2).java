package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int n;
 		System.out.println("Enter your name: ");
 		String name=input.next();
 		System.out.println();
 		do {
 				System.out.println("please enter no");
 			System.out.println("[1]print ecah char in line with ASCI NO \t [2]print last char \t [3]print first char \t[0]STOP");
 			System.out.println("choose:");
 			n=input.nextInt();
 		if(n==1) {	
 		for(int i=0;i<name.length();i++)
 			System.out.println(name.charAt(i)+"="+(int)name.charAt(i));
 		System.out.println();
 		}
 		else if(n==2) {
 			System.out.println("The last char is "+name.charAt(name.length()-1));
 			System.out.println();
 		}
 		else if(n==3) {
 			System.out.println("The first char is "+name.charAt(0));
 			System.out.println();
 		}
 		else if(n==0) {
 			System.out.println("are you sure");
 			System.out.println("[1]print ecah char in line \t [2]print last char \t [3]print first char \t[0]STOP");
 			System.out.println("choose:");
 			n=input.nextInt();
 			System.out.println();
 		}
 		else {
 			System.out.println("wrong try again");
 			System.out.println("[1]print ecah char in line \t [2]print last char \t [3]print first char \t[0]STOP");
 			System.out.println("choose:");
 			n=input.nextInt();
 			System.out.println();
 		}
 		}while(n!=0);
 		System.out.println("finished");
 		
 		}
}
