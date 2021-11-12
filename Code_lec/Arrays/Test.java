package arrays;

public class Test
{

	public static void main(String[] args)
	{
		PlayWithArray a = new PlayWithArray(10);
		//PlayWithArray b = new PlayWithArray(-10);
		
		//a.print();
		a.read();
		a.print();
		//System.out.println("Average: " + a.avg());
		//System.out.println("Max: " + a.maximum());
		//System.out.println("Max: " + a.maximumIndex());
		//int m = a.maximumIndex();
		//System.out.println("Index is: " + m);
		//System.out.println("Max value is : " + a.getValue(25));
		
		System.out.println(a.search(40));
		//System.out.println("Max: " + a.maximumIndex2());
		
		//a.printEvenValues();
		//a.printEvenIndex();
		//a.printReverse();
		//b.print();
	}
}