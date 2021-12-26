public class Item {
	private int id;
	private static  int itemCount;
	private String name;
	private int UPC;
	public Item() {
		itemCount++;
		itemCount=id;
	}
	public Item(String name,int UPC) {
		itemCount++;
		itemCount=id;
		this.name=name;
		this.UPC=UPC;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUPC() {
		return UPC;
	}
	public void setUPC(int uPC) {
		UPC = uPC;
	}
	public int getId() {
		return id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
