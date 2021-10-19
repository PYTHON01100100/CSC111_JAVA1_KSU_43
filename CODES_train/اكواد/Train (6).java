package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class Train {
 	public static void main(String[] args) {
 		Scanner input=new Scanner(System.in).useLocale(Locale.US);
 		int a=1,b=2,c=3;
 		if(++a>b++||a-->0)
 			c++;
 		else
 			c--;
 		System.out.println(a+""+b+""+c);
 		}
 	}