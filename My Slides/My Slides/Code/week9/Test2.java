package week9;

public class Test2
{

	public static void main(String[] args)
	{
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		s1.setName("Huda");
		s1.setGpa(4.0);
		s1.print();
		
		s2.setName("Muna");
		s2.setGpa(3.9);
		s2.print();

		if (s1.betterGPA(s2)) //this is s1, s (Parameter of betterGPA) is s2
			System.out.println(s1.getName());
		else
			System.out.println(s2.getName());

		if (s2.betterGPA(s1)) //this is s2, s (Parameter of betterGPA) is s1
			System.out.println(s1.getName());
		else
			System.out.println(s2.getName());

		if (s2.betterGPA(null)) //this is s2, s (Parameter of betterGPA) is s1
			System.out.println(s1.getName());
		else
			System.out.println(s2.getName());

		/*
		if (s1.getGpa() > s2.getGpa())
			System.out.println(s1.getName());
		else
			System.out.println(s2.getName());
		*/
	}

}
