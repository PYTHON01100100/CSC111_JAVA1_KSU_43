package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int prime;
 		System.out.println("enter no");
 		int n=input.nextInt();
 		int i=2;
 		while(i<= n-1 && n%i!=0) 
 			i++;
 		
 		
 		
 			if(i==n || n==1){
 				System.out.println(n+ " prime");
 			}
 			else {
 				System.out.println(n+" not prime");
 			}
 		}
 	}