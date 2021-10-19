package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int l1,l2,w1,w2;

 		do {
 		System.out.println("enter lenth 1");
 		l1=input.nextInt();
 		System.out.println("enter width 2");
 		w1=input.nextInt(); 		
 		System.out.println("enter lenth 2");
 		l2=input.nextInt();
 		System.out.println("enter width 2");
 		w2=input.nextInt();
 		if(w2<0|| w1<0||l1<0||l2<0) {
 	 		System.out.println("_________________________________________________________________________________");
 			System.out.println("please enter positive no");
 		}
 		}while(w2<0|| w1<0||l1<0||l2<0); // do not use &&
 		System.out.println("_________________________________________________________________________________");
 		int area1, area2;
 		area1=l1*w1;
 		area2=l2*w2;
 		System.out.println(area1+"\n" +area2);
 		System.out.println("_________________________________________________________________________________");
 		
 		if(area1>area2)
 			System.out.println("area 1 is greater");
 		else if(area1<area2)
 			System.out.println("area 2 is greater");
 		else if(area1==area2)
 			System.out.println("they are equal");
 		
 		input.close();
 		}
 	}