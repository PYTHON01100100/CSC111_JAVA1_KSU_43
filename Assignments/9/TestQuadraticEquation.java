import java.util.Scanner;
public class TestQuadraticEquation {
public static void main(String[] args) {
	QuadraticEquation q1 = new QuadraticEquation();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a, b, c: ");
	q1.a = input.nextDouble();
	q1.b = input.nextDouble();
	q1.c = input.nextDouble();
	double x = q1.calcDiscriminant();
	if(x > 0){
		System.out.print("The roots are "+q1.calcRoot1()+" and "+q1.calcRoot2());
}else if(x == 0){
	System.out.print("The root is "+q1.calcRoot2());
}else
	System.out.print("The equation has no roots");
}
}