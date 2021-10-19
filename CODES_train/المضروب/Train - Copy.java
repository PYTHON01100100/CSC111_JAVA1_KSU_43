package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		long n;
 		do {
 		System.out.println("enter no");
 		n=input.nextInt();
 			
 		}while(n<=0);
 		
 		for(int i=1;i<=n;i++) 
 		{
 			long fact=1;
 			for(i=1;i<=n;) {
 				fact=fact*i;
 				System.out.println(i+"!= "+fact);//all no you want
 				i++;
 				}
 			//System.out.println(i+"!= "+fact);//only one no you want
 		}
 		
 		System.out.println("finish");
 		input.close();
 		}
 	}