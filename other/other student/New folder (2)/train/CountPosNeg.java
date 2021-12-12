package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class CountPosNeg {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
		int count=0, total=0, countpos=0,countneg=0;
		System.out.println("Enter INT ending with zero(0):  ");
		int num =input.nextInt();
		while(num!=0) {
			if(num>0)
				countpos++;
			else if(num<0)
				countneg++;
			
			total +=num;
			count++;
			
			num=input.nextInt();
				
		}
		if(count==0)
			System.out.println("No numbers are enterd except 0 ");
		else {
			System.out.println("The nomber of + is " +countpos);
			System.out.println("The nomber of - is " +countneg);
			System.out.println("Total is " +total);
			System.out.println("The Avrege  is " +(double)total/count);
			
			
			
			
		}

	}

}
