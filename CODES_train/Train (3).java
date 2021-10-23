package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);

 		
 		for(int i=1;i<=10;i++)
 			System.out.print(i+"|");
 		
 		System.out.println();
 		int j=1;
 		while(j<=10) {
 			System.out.print(j+"|");
 			j++;
 		}
 		System.out.println();
 		
 		int o=1;
 		do {
 			System.out.print(o+"|");
 			o++;
 			
 		}while(o<=10);
 		System.out.println();
 		
 		System.out.println("---------------------------------------------------------------------------------------\n another loop\n");
		for(int i=2;i<=100;i+=2)
 			System.out.print(i+"|");
 		
 		System.out.println();
 		int j2=2;
 		while(j2<=100) {
 			System.out.print(j2+"|");
 			j2+=2;
 		}
 		System.out.println();
 		int o2=2;
 		do {
 			System.out.print(o2+"|");
 			o2+=2;
 		}while(o2<=100);

 		System.out.println();
 		System.out.println("-------------------------------------------------------------------------------------------------\n another\n");
 		int vx;
 		int v1,v2,v3;
 		System.out.println("enter three no: ");
 		vx=input.nextInt();
 		v1=vx/100;
 		v2=(vx/10)%10;
 		v3=vx%10;
 		System.out.println(v1+"|"+v2+"|"+v3+"="+(v1+v2+v3));
 		
 		System.out.println("-----------------------------------------------------------------------------------------------\nanother\nenter NO TO SUM: ");
		int summ = 0, No1;
		int in=1;
		No1=input.nextInt();
		while(in <=No1) {
			summ = summ+in++;
		}
		System.out.println("sum="+summ);
		System.out.println("Done");
 		
 		}
}
