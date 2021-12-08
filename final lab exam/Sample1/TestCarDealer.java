package week15;

import java.util.Scanner;

public class TestCarDealer
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Create a CarDealer object
		CarDealer cd = new CarDealer();
		
		//Ask the user to enter Car information or -1 to exit
		
		int id;
		double price;
		int year;
		String model;
		/*
		//read first id to go inside the while

		System.out.print("Please enter car id (or -1 to exit): ");
		id = input.nextInt();

		while(id != -1)
		{
			System.out.print("Please enter the car model: ");
			model = input.next();

			System.out.print("Please enter the year of the car: ");
			year = input.nextInt();
			
			System.out.print("Please enter the price of the car: ");
			price = input.nextDouble();
			
			cd.addCar(id, model, year, price);
			
			//read next id
			System.out.print("Please enter car id (or -1 to exit): ");
			id = input.nextInt();			
		}
		*/

		cd.addCar(1, "H", 2020, 70000);
		cd.addCar(2, "T", 2019, 80000);
		cd.addCar(6, "G", 2019, 80000);
		cd.addCar(3, "H", 2010, 120000);
		cd.addCar(4, "T", 2020, 50000);
		cd.addCar(5, "H", 2021, 60000);
		cd.addCar(7, "T", 2019, 90000);

		if (cd.addCarB(11,"W",2020,150000))
			System.out.println("Added");
		else
			System.out.println("Problem in add");

		for (int i = 0 ; i < cd.getnCars() ; i++)
			cd.display(i);

		//Display the Maximum price Car details
		int maxIndex = cd.findMaxPrice();
		
		if (maxIndex == -1)
			System.out.println("No cars");
		else
		{
			System.out.println("The car with maximum price is:");
			cd.display(maxIndex);
		}
	
		System.out.print("Enter Model: ");
		model = input.next();
		
		int index = cd.findMinByModel(model);

		if (index == -1)
			System.out.println("No cars");
		else
		{
			System.out.println("The car with maximum price is:");
			cd.display(index);
		}
		
		input.close();
	}
}