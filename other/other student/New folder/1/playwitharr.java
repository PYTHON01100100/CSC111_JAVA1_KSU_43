import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class playwitharr {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	Random r=new Random();
	int x[];
	double y[];
	String names[]; 
	//double total=0;
	public playwitharr() {
		x=new int[10];
		y=new double[10];
		names=new String[10];
	}
	
	public playwitharr(int size) {
		if(size<0)
			size=-size;
		x=new int[size];
		y=new double[size];
		names=new String[size];
	}
	public void rebyr() {
		for(int i =0;i<x.length;i++) {
			x[i]=1+r.nextInt(100);
		}
			
	}
	
	public void print() {
		for(int i =0;i<x.length;i++) 
		System.out.println(x[i]+", "+y[i]+" , "+names[i]);
		
				System.out.println("--------------------------------");

		
	}
	public void print1() {
		for(int i =0;i<x.length;i++) 
			System.out.print("|"+i+":"+x[i]+"|, ");
		

			System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		
	}
	public void printReverse() {
		for(int i =x.length-1;i>=0;i--) 
		System.out.print("|"+i+":"+x[i]+"|, ");
		
		
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		
	}
	public void printEven() {
		for(int i =0;i<x.length;i++) {
			if(x[i]%2==0) {
		System.out.print("|"+i+":"+x[i]+"|, ");
			}
			}
		
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		
	}
	public void printOdd() {
		for(int i =0;i<x.length;i++) {
			if(x[i]%2!=0) {
		System.out.print("|"+i+":"+x[i]+"|, ");
			}
			}
		
		System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


	}
	
	public void printEvenIndex() {
		for(int i =0;i<x.length  ;i+=2) {
			if(i%2==0)
		System.out.print("|"+i+":"+x[i]+"|, ");
		}
		
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		
	}
	public void printOddIndex() {
		for(int i =1;i<x.length;i+=2) {
			if(i%2!=0)
		System.out.print("|"+i+":"+x[i]+"|, ");
		}
		
		System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		
	}
	public double avg() {
		double total=0;
		for(int i =1;i<x.length;i++) {
			total+=x[i];
		}
		if(x.length!=0)
		return total= total/x.length;
		else
			return 0;
	}
	public int max() {
		int maxi=x[0];
		for(int i =1;i<x.length;i++) {
			if(x[i]>maxi)
				maxi=x[i];
		}
		
		return maxi;
	}
	public int min() {
		int mini=x[0];
		for(int i =1;i<x.length;i++) {
			if(x[i]<mini)
				mini=x[i];
		}
		
		return mini;
	}
	public int maxloc() {
		int maxi=x[0];
		int maxln=0;
		for(int i =1;i<x.length;i++) {
			if(x[i]>maxi) {
				maxi=x[i];
			maxln=i;
			}
		}
		
		return maxln;
	}
	public int minloc() {
		int mini=x[0];
		int minlo=0;
		for(int i =1;i<x.length;i++) {
			if(x[i]<mini) {
				mini=x[i];
				minlo=i;
			}
		}
		
		return minlo;
	}
	public int getValue(int index) {
		if(index>=0&&index<x.length)
			return x[index];
		else
			return -1;
	}
	public int search(int t) {
		for(int i =1;i<x.length;i++) {
			if(x[i]==t)
				return i;
		}
		return 0;
	}
} 
