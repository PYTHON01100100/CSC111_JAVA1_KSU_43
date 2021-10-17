package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		System.out.println("enter s1 and s2");
 		String s1=input.next();
 		String s2=input.next();
 		System.out.println("[1]sne \t [2]insen");
 		System.out.println("options:");
 		int nop=input.nextInt();
 		boolean b=true;
 		do {
 			if(nop!=1&&nop!=2) {
 				System.out.println("wrong choice try again");
 		 		System.out.println("[1]sne \t [2]insen");
 		 		System.out.println("options:");
 		 		nop=input.nextInt();
 		 		
 			}
 			if(nop==1) {
 				if(s1.equals(s2)) {
 					System.out.println("equals");
 					}
 				else {
 					System.out.println("not equals");
 				    }
 				}
 			else if(nop==2) {
 				if(s1.equalsIgnoreCase(s2)) {
 					System.out.println("equals");
 					}
 				else{
 					System.out.println("not equals");
 				   }
 				}
 			
 			System.out.println("do you want try again?  :");
		 		System.out.println("[1]YES \t [2]NO");
		 		System.out.println("options:");
 			nop=input.nextInt();
 			if(nop==1) {
 				b=true;
 		 		System.out.println("reenter s1 and s2");
 		 		s1=input.next();
 		 		s2=input.next();
 		 		System.out.println("[1]sne \t [2]insen");
 		 		System.out.println("options:");
 		 		nop=input.nextInt();
 				}
 			else if(nop==2) {
 				b=false;
 				}
 			else {
 				b=true;
 				System.out.println("wrong choice try again");
 		 		System.out.println("[1]sne \t [2]insen");
 		 		System.out.println("options:");
 		 		nop=input.nextInt();
 				
 			}

 		}while(b);
 		}
 	}