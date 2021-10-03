package assi1;
import java.lang.Math;
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner N= new Scanner(System.in);
		// WE ASK USER TO ENTER 3 NO.
		System.out.print("Enter three numbers: ");
		int No1, No2, No3;
		No1 =N.nextInt();
		No2 =N.nextInt();
		No3 =N.nextInt();
		int  Mult = No1 * No2 * No3;
		double Pow = Math.pow(No1, No2);
		int Sum = No1 + No2 + No3;
		double Avr = Sum  / 3.0;
		System.out.println("Sum =" + Sum);
		System.out.println("Mult ="+ Mult);
		System.out.println("Avg =" + Avr);
		System.out.println("Pow =" + Pow);
		
		
		
		

	}
	
	

}
