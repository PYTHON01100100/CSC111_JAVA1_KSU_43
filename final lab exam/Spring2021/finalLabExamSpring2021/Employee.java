package finalLabExamSpring2021;

public class Employee
{
	private double salary;
	private String department;
	private int years;
	private Employee manager;

	//Employee(salary: double, department: String, manager: Employee): 
	//the constructor that initializes the attributes. 
	//Sets years to 0. If the manager is not valid, set manager to NULL.
	public Employee(double salary, String department, Employee manager)
	{
		this.years = 0;
		this.department = department;
		this.salary = salary;

		if(isManagerValid(manager))
			this.manager = manager;
		else
			this.manager = null;
	}
	
	//returns the employee’s salary.
	public double getSalary()
	{
		return salary;
	}

	// returns the employee’s department name.
	public String getDepartment()
	{
		return department;
	}

	//returns the employee’s manager object.
	public Employee getManager()
	{
		return manager;
	}

	//replaces the employee’s current manager with newManager 
	//only if the newManager object is a valid manager 
	//(use isManagerValid to check). 
	//If newManager is valid, it prints “Manager has been changed correctly”
	//then returns true. Otherwise, it prints “Manager couldn’t be changed” and returns false.
	public boolean changeManager(Employee newManager)
	{
		if (isManagerValid(newManager))
		{
			this.manager = newManager;
			newManager.salary += 1000;

			System.out.println("Manager has been changed correctly");
			return true;
		}
		else
		{
			System.out.println("Manager couldn’t be changed");
			return false;
		}
	}
	
	//returns true if the employee doesn’t have a manager. 
	//Otherwise, it returns false.
	public boolean isManager()
	{
		if (this.manager == null)
			return true;
		else
			return false;
	}
	
	//returns true if the employee’s department name matches 
	//the manager’s department name and manager is a manager.
	//Otherwise, it returns false. It returns false if manager is NULL.
	private boolean isManagerValid(Employee manager)
	{
		if (manager == null)
			return false;
		
		if (this.department.equalsIgnoreCase(manager.department) && manager.manager == null)
			return true;
		else
			return false;
	}
	
	//change the employee’s salary based of the following table 
	//(Apply the performance table first then years table).
	//After that, it increases years by 1. A manager will have 1000 added to the salary
	//as a bonus. Then return true.
	//If performance is more than 100.0 or less than 0.0, return false.
	public boolean yearlyRaise(double performance)
	{
		if (performance < 0 || performance > 100)
			return false;

		if (performance >= 90 && performance <= 100)
			salary = salary * 1.15;
		else if (performance >= 75 && performance < 90)
			salary = salary * 1.1;
		else if (performance >= 50 && performance < 75)
			salary = salary * 1.05;
		else if (performance >= 25 && performance < 50)
			salary = salary * 1;
		else
			salary = salary * 0.95;

		if (years >= 0 && years <= 5)
			salary += 100;
		else if(years >= 6 && years <= 10)
			salary += 250;
		else if (years >= 11)
			salary += 500;
		
		years++;
		
		if (this.manager != null)
			salary += 1000;

		return true;
	}

	public String toString()
	{
		String t = "";
		
		if (this.manager == null)
		{
			t += "Manager of " + this.department + " department. Worked for ";
			t += years + " years. Salary: " + this.salary;
		}
		else
		{
			t += "Employee in " + this.department + " department. Worked for " + this.years;
			t += " years. Salary: " + this.salary;			
		}

		return t;
	}
}