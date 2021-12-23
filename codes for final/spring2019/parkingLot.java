public class parkingLot {
	private parkingSpot[] parkingLot;
	private int numAvailableSpot;
	public parkingLot(int sizeOfParkingLot) {
		parkingLot=new parkingSpot[sizeOfParkingLot];
		for(int i=0;i<parkingLot.length;i++)
			parkingLot[i]= new parkingSpot();
		
		
		numAvailableSpot=sizeOfParkingLot;
	}
	public boolean parkCar(String Lpate) {
		for(int i=0;i<parkingLot.length;i++) {
			if(parkingLot[i].isAvailable()) {
				parkingLot[i].occupy(Lpate);
				numAvailableSpot--;
			return true;
			}
		}
		return false;
		
		
		
		
	}
	public boolean unParkCar(String Lpate){
	
		int index=searchCar(Lpate);
		
		if(index==-1)
			return false;
		else
		{
			parkingLot[index].vacate();
			numAvailableSpot++;
			return true;
		}
		
	}
	
	
 	
	public int searchCar(String Lpate){
		if(isEmpty()){return -1;}
		for(int i=0;i<parkingLot.length;i++) {
			if(! parkingLot[i].isAvailable()) {
				if(parkingLot[i].getCar().getLicensePlate().equalsIgnoreCase(Lpate))
				return i;
			}
		}
		return -1;
	} 
	public parkingSpot mostUsedSpot() {
		parkingSpot max=parkingLot[0];
		for(int i=1;i<parkingLot.length;i++) {
			
			if(parkingLot[i].getSpotNumber()>max.getNumOfCarsSoFar()) {
				max=parkingLot[i];
			}
		}
	
		return max;
	}
	
	
	
	
	
	
	public void display() {
		for(int i=0;i<parkingLot.length;i++) {
			if(! parkingLot[i].isAvailable() )
			{
				parkingLot[i].display() ;
				System.out.println("=====================================================================");
		}
			else
				System.out.println("This spot is not occupied");
				System.out.println("=====================================================================");
					
				
		}
	}
	public int getNumAvailableSpot() {
		return numAvailableSpot;
	}
	public boolean isFull() {
		return numAvailableSpot==0;
	}
	public boolean isEmpty() { 
		return numAvailableSpot==parkingLot.length;
	}
}