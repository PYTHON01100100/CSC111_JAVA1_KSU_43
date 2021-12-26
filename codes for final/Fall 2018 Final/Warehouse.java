
public class Warehouse {
	private Item item[];
	private int nOfItems;
	public Warehouse(int maxsize) {
		item=new Item[maxsize];
		nOfItems=0;
	}
	public void addItem(String name,int UPC) {		
		if(search(UPC)==-1) {
		if(nOfItems<item.length) {
			Item t=new Item(name,UPC);
			item[nOfItems]=t;
			nOfItems++;
			System.out.println("Not added, array is full");
		}
		else
			System.out.println("Not added, array is full");
		
		}
	}
	

public int search(int UPC) {
	for(int i=0;i<item.length;i++) {
		if(item[i].getUPC()==UPC)
			return i;
	}
	return -1;
}
	
public void deleteItem(int UPC) {		
	if(isEmpty())
		return;
	int i=search(UPC);
	if(i==-1) {
		System.out.println("Sorry not found the UPC: "+UPC);
	}
	else {
		item[i]=item[nOfItems-1];
		item[nOfItems-1]=null;
	}
}
public boolean isFull() {
	if(nOfItems==item.length)
		return true;
	else
		return false;
	
	//return nOfItems==item.length;
}
public boolean isEmpty() {
	return nOfItems==0;
}

	
	
	
	public void print() {
		System.out.println("=================#THE IFROMATION   #===========================================================================================================");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<item.length;i++) {
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("ID: "+item[i].getId());
			System.out.println("NAME: "+item[i].getName());
			System.out.println("UPC: "+item[i].getUPC());
		}
		
		System.out.println("============================================================================================================================");
		System.out.println(nOfItems);
	}
	
	
	public int getNOfItems() {
		return nOfItems;
	}
	
	public void sort() {
		
		Item t;
		for(int i=0;i<nOfItems;i++) {
			for(int j=i+1;j<nOfItems;j++) {
				if(item[j].getUPC()<item[i].getUPC()) {
					//swap two objs
					t=item[i];
					item[i]=item[j];
					item[j]=t;
				}
			
			
			}
		}
		
		
		
		
		
		
	}
	
	
}
