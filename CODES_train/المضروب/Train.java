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
 		long fact;
 		
 		for( n=1;n<=20;n++) {
 			fact=1;
 			for(int i=1;i<=n;i++)
 			{
 				fact=fact*i;
 				}
 			System.out.println(n+"!= "+fact);
 			}
 		input.close();
 		
 		
 		
 	}}