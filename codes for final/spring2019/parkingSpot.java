
public class parkingSpot {
	private int spotNumber;
	private static int spotCount;
	private int numOfCarsSoFar;
	private car Car;
	public parkingSpot() {
		spotCount++;
		spotNumber=spotCount;
		numOfCarsSoFar=0;
		Car=null;
	}
	public int getSpotNumber() {
		return spotNumber;
	}
	public car getCar() {
		return Car;
	}
	public int getNumOfCarsSoFar() {
		return numOfCarsSoFar;
	}
	public boolean isAvailable() {
		if(Car==null)
		return true;
		else
			return false;
		/*
		  
		  return Car==null;
		 
		 */
	}
	public boolean occupy(String Lplate) {
		//String e=getCar().getLicensePlate();
		if(isAvailable()) {//i can park in this spot it is empty
			Car=new car(Lplate);
			numOfCarsSoFar++;
			return true;// car parked
		}
		else
			return false;
	}
	public void vacate() {
		Car=null;
		//car is out
	}
	public void display() {
		System.out.println("Spot number: "+spotNumber);
		if(! isAvailable()) {
			System.out.println("	Car license plate: "+getCar().getLicensePlate());
			}
		
		/*
		if(isAvailable()==true) {
		System.out.println("	Car license plate: "+getCar().getLicensePlate());
		}
		else {
			System.out.println("Not available");
		}
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
