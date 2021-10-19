package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int sum=0,n=0,i,m;
 		System.out.println("Enter No: ");
 		i=input.nextInt();
 		while(i!=0) {
 			m=i%10;
 			i=i/10;
 			sum=sum+m;
 		    n++;
 		}
 		System.out.println("avg ="+sum/n);
 		System.out.println("sum="+sum);
 		
 		}
 		} 