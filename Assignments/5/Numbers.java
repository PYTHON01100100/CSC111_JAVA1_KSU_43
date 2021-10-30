import java.util.Scanner;
public class Numbers {
public static void main(String[] args ) {
	Scanner input = new Scanner(System.in);
	int n1 , n2 ;
	int m = 0 ;
	System.out.print(" Please enter two integer numbers n1, n2:");
	n1 = input.nextInt();
	n2 = input.nextInt();
	do{
		if ((n1%5)== 0) {
			m++ ;
			if (m == 10)
				System.out.print(n1);
			else
				System.out.print(n1 + ",");
			}
		else if ((n1%6) == 0) {
			m++;
			if (m == 10)
				System.out.print(n1);
			else
				System.out.print(n1 + ",");
			}
		n1++;
}

	while ((m != 10) && (n1<=n2));
}
}