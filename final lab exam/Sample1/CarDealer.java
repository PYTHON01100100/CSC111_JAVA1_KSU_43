package week15;

public class CarDealer
{
	private Car cars[];
	private int nCars;
	public static final int MAX_SIZE = 100;
	
	public CarDealer()
	{
		cars = new Car[MAX_SIZE];
		nCars = 0;
	}

	public int getnCars()
	{	
		return nCars;
	}
	
	public int findCar(int i)
	{
		for(int k = 0 ; k < nCars ; k++)
		{
			if (cars[k].getId() == i)
				return k;
		}

		return -1; //not found
	}
	
	//Not in the Exam
	public int findCar(String m)
	{
		for(int k = 0 ; k < nCars ; k++)
		{
			if (cars[k].getModel().equalsIgnoreCase(m))
				return k;
		}

		return -1; //not found
	}

	public void addCar(int id, String model, int year, double price)
	{
		if (nCars < MAX_SIZE)
		{
			int index = findCar(id);
			
			if (index == -1) //Car is not found 
			{
				cars[nCars] = new Car(id,model,year,price);
				nCars++;

				System.out.println("Car is added");
			}
			else
				System.out.println("Cannot add this car because the id is already in the list");
		}
		else
			System.out.println("ERROR ADDING LIST IS FULL");
	}
	
	public boolean addCarB(int id, String model, int year, double price)
	{
		if (nCars < MAX_SIZE)
		{
			int index = findCar(id);
			
			if (index == -1) //Car is not found 
			{
				cars[nCars] = new Car(id,model,year,price);
				nCars++;

				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public boolean addCarB2(int id, String model, int year, double price)
	{
		if (nCars < MAX_SIZE)
		{
			int index = findCar(id);
			
			if (index == -1) //Car is not found 
			{
				cars[nCars] = new Car(id,model,year,price);
				nCars++;

				return true;
			}
		}

		return false;
	}

	public int addCarint(int id, String model, int year, double price)
	{
		if (nCars < MAX_SIZE)
		{
			int index = findCar(id);
			
			if (index == -1) //Car is not found 
			{
				cars[nCars] = new Car(id,model,year,price);
				nCars++;

				return 1;
			}
			else
				return -1; //already in the array
		}
		else
			return -2; //no space in the array
	}

	public int findMaxPrice()
	{
		if (nCars == 0)
			return -1;

		int max = 0; //i assume index of max is 0
		
		for(int i = 1 ; i < nCars ; i++)
		{
			if (cars[i].getPrice() > cars[max].getPrice())
				max = i;
		}
		
		return max;
	}

	//Return te value of maximum price (Not in the exam)
	public double findMaxPriceMax()
	{
		double max = cars[0].getPrice();
		
		for(int i = 1 ; i < nCars ; i++)
		{
			if (cars[i].getPrice() > max)
				max = cars[i].getPrice();
		}
		
		return max;
	}

	public int findMinByModel (String model)
	{
		if (nCars == 0)
			return -1;

		int min = -1;
		
		for(int i = 0 ; i < nCars ; i++)
		{
			if (cars[i].getModel().equalsIgnoreCase(model))
			{
				if (min == -1 || cars[i].getPrice() < cars[min].getPrice())
					min = i;
			}
		}

		return min;		
	}
	
	public int findMinByModel2(String model)
	{
		if (nCars == 0)
			return -1;

		int max = -1;

		for(int i = 0 ; i < nCars ; i++)
		{
			if (cars[i].getModel().equalsIgnoreCase(model))
			{
				max = i;
				break;
			}
		}
		
		if (max != -1)
		{
			for(int i = 1 ; i < nCars ; i++)
			{
				if (cars[i].getModel().equalsIgnoreCase(model))
				{
					if (cars[i].getPrice() > cars[max].getPrice())
						max = i;
				}
			}
			
			return max;
		}
		else
			return -1;
	}

	public Car findMinByModelCar(String model)
	{
		if (nCars == 0)
			return null;

		Car max = null;
		
		for(int i = 0 ; i < nCars ; i++)
		{
			if (cars[i].getModel().equalsIgnoreCase(model))
			{
				if (max == null || cars[i].getPrice() > max.getPrice())
					max = cars[i];
			}
		}
		
		return max;		
	}
	 public void display(int i) //i is an index of a car
	 {
		 if(i < 0 || i >= nCars)
			 System.out.println("ERROR");
		 else
		 {
			 /*
			 System.out.println("ID    : " + cars[i].getId());
			 System.out.println("Year  : " + cars[i].getYear());
			 System.out.println("Model : " + cars[i].getModel());
			 System.out.println("Price : " + cars[i].getPrice());
			 System.out.println("-----------------------------------");
			 */
			 //or
			 cars[i].dispaly();
		 }
	 }
	 
	 //Not in the exam
	 public void display2(int id)
	 {
		 int index = findCar(id);
		 
		 if(index == -1) //not found
			 System.out.println("ERROR");
		 else
		 {
			 /*
			 System.out.println("ID    : " + cars[i].getId());
			 System.out.println("Year  : " + cars[i].getYear());
			 System.out.println("Model : " + cars[i].getModel());
			 System.out.println("Price : " + cars[i].getPrice());
			 System.out.println("-----------------------------------");
			 */
			 //or
			 cars[index].dispaly();
		 }
	 }
}