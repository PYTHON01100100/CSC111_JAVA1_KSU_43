package arraysOfObjects;

public class Course
{
	private String name;
	private int hrs;
	
	private Student st[];
	private int nbS;
	
	public Course()
	{
		name = "NA";
		hrs = 3;
		
		st = new Student[25]; //st is an array with 25 students
		nbS = 0;
	}

	public Course(String name,int hrs,int size)
	{
		this.name = name;
		this.hrs = hrs;
		
		st = new Student[size]; //st is an array with 25 students
		nbS = 0;
	}

	public String getName()
	{
	
		return name;
	}

	public void setName(String name)
	{
	
		this.name = name;
	}

	public int getHrs()
	{
	
		return hrs;
	}

	public void setHrs(int hrs)
	{
	
		this.hrs = hrs;
	}

	public int getNbS()
	{
	
		return nbS;
	}
	
	public Student getStudent(int index)
	{
		if (index >= 0 && index < nbS)
			return st[index];
		else
			return null;
	}
	
	public int search(int id)
	{
		for(int i = 0 ; i < nbS ; i++)
		{
			if (st[i].getId() == id)
				return i;
		}
		
		return -1;
	}
	
	public Student searchStudent(int id)
	{
		for(int i = 0 ; i < nbS ; i++)
		{
			if (st[i].getId() == id)
				return st[i];
		}

		//return -1; Type mismatch: cannot convert from int to Student
		return null;
	}
	
	public int search(String name)
	{
		for(int i = 0 ; i < nbS ; i++)
		{
			if (st[i].getName().equalsIgnoreCase(name))
				return i;
		}

		return -1;
	}
	
	public void printArray()
	{
		System.out.println("Course Name : " + name);
		System.out.println("Course Hours: " + hrs);
		System.out.println("List of Students: ");
		
		for (int i = 0 ; i < nbS ; i++)
		{
			st[i].print();
		}
	}
	
	public void printArrayToString()
	{
		System.out.println("Course Name : " + name);
		System.out.println("Course Hours: " + hrs);
		System.out.println("List of Students: ");
		
		for (int i = 0 ; i < nbS ; i++)
		{
			System.out.println(st[i]);
		}
	}
	
	public boolean add(Student s)
	{
		if (nbS < st.length)
		{
			st[nbS] = s;
			nbS++;
			
			return true;
		}
		else
			return false;
	}
	
	public boolean addUni(Student s)
	{
		if (nbS < st.length) //make sure we have space
		{
			int index = search(s.getId());

			if (index == -1)  //Not found, go ahead and add this student
			{
				st[nbS] = s;
				nbS++;
				
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public boolean delete(int id)
	{
		int index = search(id); //search for the student we want to delete
		
		if (index == -1) //id not found, no delete
			return false;
		else
		{
			st[index] = st[nbS - 1];
			nbS--;

			return true;
		}
	}
}