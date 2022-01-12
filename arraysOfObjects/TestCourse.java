package arraysOfObjects;

public class TestCourse
{
	public static void main(String[] args)
	{
		Course c1 = new Course();
		Course c2 = new Course("CSC111",4,10);
		//System.out.println("AAAAAA");
		//System.out.println(c2.getStudent(2));
		/*Student s = c1.getStudent(-2);

		if (s == null)
			System.out.println("Wrong Index");
		else
			System.out.println(s.getName());
		
		System.out.println("BBBBBB");
		*/
		//System.out.println(c1.search(123));

		c2.addUni(new Student(1,"Ali",3.9));
		c2.addUni(new Student(2,"Muna",4.2));
		c2.addUni(new Student(3,"Saad",5.0));
		c2.addUni(new Student(4,"Waleed",2.2));
		c2.addUni(new Student(3,"Saud",3.0));
		c2.printArrayToString();
	}
}
