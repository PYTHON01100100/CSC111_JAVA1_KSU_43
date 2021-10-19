package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int a =input.nextInt();
 		if(a%10==0) {
 			a=a+13;
			System.out.println("a"+(a+1));
			a=a+20;}
 		else if(a%10==1) {
 			System.out.println("a"+(a+1));
 			a=a+20;
 		}
 		else if(a%10==2) {
 			a++;
 			System.out.println("a"+a);
 			a *=2;
 		}
 		System.out.println("a "+a);
 			

 		}
 		} 