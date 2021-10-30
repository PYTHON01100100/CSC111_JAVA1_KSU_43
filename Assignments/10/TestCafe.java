import java.util.Scanner;
public class TestCafe {
public static void main(String[] args) {
// TODO Auto-generated method stub
	Scanner x = new Scanner(System.in);
	int s;
	double t=0.0;
	Cafe c1 =new Cafe(5.50,3.50,2.25,100,100,50,10);
	do{
		System.out.println("**********************************************************************");
System.out.println("* Welcome to Cafe :) *");
System.out.println("* --------------------------- *");
System.out.println("* Please enter one of the following options: *");
System.out.println("* 1) order ==> this allows you to order a game *");
System.out.println("* 2) quit ==> to end this program *");
System.out.println("**");
System.out.println("**********************************************************************");
System.out.print("Enter your option :> ");
s = x.nextInt();
if (s==1){System.out.print("Please, enter order (#cups of coffee, #cups of tea and #donuts: ");
c1.order(x.nextInt(), x.nextInt(), x.nextInt());
t+= c1.gettotal();}
}while(!(s==2));
System.out.println("Total sales = "+t);
System.out.println("Thanks. Goodbye!");
}
}