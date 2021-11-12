package arrays;

import java.util.Random;

public class PlayWithArray
{
	private int x[];
	double y[];
	String names[];
	boolean bs[];
	
	public PlayWithArray()
	{
		x = new int[10];
		y = new double[10];
		names = new String[10];
		bs = new boolean[10];
	}

	public PlayWithArray(int size)
	{
		if (size < 0)
			size = -size;

		x = new int[size];
		y = new double[size];
		names = new String[size];
		bs = new boolean[size];
	}

	public void read()
	{
		Random r = new Random();
		
		for (int i = 0 ; i < x.length ; i++)
		{
			x[i] = 1 + r.nextInt(100);
		}
	}

	public void print()
	{
		//for (int i = 0 ; i <= x.length ; i++) java.lang.ArrayIndexOutOfBoundsException:
		//for (int i = 0 ; i <= x.length-1 ; i++)
		for (int i = 0 ; i < x.length ; i++)
			System.out.print(x[i] + " ");
		
		System.out.println("\n----------------------------");
	}
	
	public void printReverse()
	{
		for (int i = x.length-1 ; i >= 0 ; i--)
			System.out.print(x[i] + " ");
		
		System.out.println("\n----------------------------");
	}

	public void printEvenValues()
	{
		for (int i = 0 ; i < x.length ; i++)
		{
			if (x[i] % 2 == 0)
				System.out.print(x[i] + " ");
		}
		System.out.println();
	}

	public void printEvenIndex()
	{
		for (int i = 0 ; i < x.length ; i+=2)
		{
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
	}

	public void printEvenIndexWrongLogic()
	{
		for (int i = 0 ; i < x.length ; i++)
		{
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	public void printOddIndexWrongLogic()
	{
		for (int i = 1 ; i < x.length ; i++)
		{
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	public double avg()
	{
		double total = 0;
		
		for (int i = 0 ; i < x.length ; i++)
			total += x[i];

		if (x.length != 0)
			return total/x.length;
		else
			return 0;
	}
	
	public int maximum()
	{
		int max = x[0];
		
		for (int i = 1 ; i < x.length ; i++)
		{
			if (x[i] > max)
				max = x[i];
		}
		
		return max;
	}
	
	public int maximumIndex()
	{
		int max = x[0];
		int maxLoc = 0;
		
		for (int i = 1 ; i < x.length ; i++)
		{
			if (x[i] > max)
			{
				max = x[i];
				maxLoc = i;
			}
		}

		return maxLoc;
	}

	public int maximumIndex2()
	{
		int maxLoc = 0;
		
		for (int i = 1 ; i < x.length ; i++)
		{
			if (x[i] > x[maxLoc])
				maxLoc = i;
		}

		return maxLoc;
	}
	
	public int getValue(int index)
	{
		if (index >= 0 && index < x.length)
			return x[index];
		else
			return -1;
	}
	
	public int search(int target)
	{
		for(int i = 0 ; i < x.length ; i++)
		{
			if(x[i] == target)
				return i;
		}
		
		return 0;
	}
	/*
	public void print()
	{
		for (int i = 0 ; i < x.length ; i++)
			System.out.println(x[i] + " , " + y[i] + " , " + names[i] + " , " + bs[i]);
		
		System.out.println("----------------------------");
	}
	*/
}