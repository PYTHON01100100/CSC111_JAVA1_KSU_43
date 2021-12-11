package finalLabExamSpring2021;

import java.util.Scanner;

public class TestEmployee
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double salary[] = new double[3];
		String department[] = new String[3];
		
		//1. Ask the user to type in 3 employee’s salaries and departments.
		System.out.println("Enter 3 employees' salaries and departments: ");
		
		for (int i = 0 ; i < 3 ; i++)
		{
			salary[i]     = input.nextDouble();
			department[i] = input.next();			
		}

		//2. Create 3 Employee objects (use NULL as their manager).
		Employee e1 = new Employee(salary[0], department[0], null);
		Employee e2 = new Employee(salary[1], department[1], null);
		Employee e3 = new Employee(salary[2], department[2], null);

		//3. Perform 3 yearlyRaise() on the first employee 
		//(ask the user to type the performance for each year).
		double performance;

		for (int i = 0 ; i < 3 ; i++)
		{
			System.out.print("Enter the first employee yearly performance " + (i+1) + " : ");
			performance = input.nextDouble();
			e1.yearlyRaise(performance);
		}

		//4. Try to make the first employee the manager of the other 2 employees.
		e2.changeManager(e1);
		e3.changeManager(e1);

		//5. Perform 1 yearlyRaise() on the second and third employee
		//(ask the user to type the performance for each employee).
		System.out.print("Enter the second employee yearly performance: ");
		performance = input.nextDouble();
		e2.yearlyRaise(performance);

		System.out.print("Enter the third employee yearly performance: ");
		performance = input.nextDouble();
		e3.yearlyRaise(performance);

		//6. Print the information of all 3 employees
		System.out.println("The first employee: " + e1);
		System.out.println("The second employee: " + e2);
		System.out.println("The third employee: " + e3);

		input.close();
	}
}