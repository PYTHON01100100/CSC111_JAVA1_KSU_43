import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class arr1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Random r=new Random();

		/*
		 
		 //part1
		//int x[]=new int [];
		//int x[]=new int[-10];
		//you can
		//int x[];
		//x=new int[10];
		//int []y=new int [10];
		int []x,y,z;
		//System.out.println(x.length);
		x=new int[10];//length=10
		z=new int[10];
		y=new int[10];
		System.out.println(x.length);
		//System.out.println(x.length());
		  // char and double and int and string 
		*/
		/*
		//part 2
		System.out.println("enter the array size: ");
		int n; 
		n=input.nextInt();
		 int a[]=new int[n];
		 System.out.println("The array size is "+a.length);
		*/
		/*
		 part2 
		 
		int []x,y,z;
		x=y=z=new int[10];
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println(z.length);
		x[0]=100;

		System.out.println(x[0]);
		System.out.println(y[0]);
		System.out.println(z[0]);
		
		System.out.println("----------------------------------------------------------------------------------");
		x=new int[25];
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println(z.length);
		*/
		System.out.println("enter the array size: ");
		int n; 
		playwitharr x;
		n=input.nextInt();
		 System.out.println("The array size is "+n);
		 System.out.println("#################################################THE OUTPUT (INDEX:NO)####################################################################################");
		//playwitharr a=new playwitharr(2);
		//playwitharr f=new playwitharr(-19); maybe run time
		playwitharr f=new playwitharr(-14);
		x=new playwitharr(n);
		//a.rebyr();
		x.print1();
		x.rebyr();
		//f.rebyr();
		//a.print();
		x.print1();
		x.printReverse();
		x.printEven();
		x.printOdd();
		x.printEvenIndex();
		x.printOddIndex();
		System.out.println("THE AVRAGE IS  "+x.avg());
		System.out.println("THE MAX AND ITS LOCATION |"+x.maxloc()+":"+x.max()+"|");
		System.out.println("THE MIN AND ITS LOCATION |"+x.minloc()+":"+x.min()+"|"); 
		int m=x.maxloc();
		System.out.println("THE LOCATION IS "+m);
		//
		System.out.println("THE VALUE IS "+x.getValue(m));
		int no;
		System.out.println("enter the no:");
		no=input.nextInt();
		System.out.println(x.search(no));
		//f.print();
		
		
		
		
		
		
		
	}

}
