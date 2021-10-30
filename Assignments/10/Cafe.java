public class Cafe {
	private double coffeePrice;
	private double teaPrice;
	private double donutPrice;
	private int coffeeTotQty;
	private int teaTotQty;
	private int donutTotQty;
	private double discount;
	private double subtotal;
	private double discountedPrice;
	private double total;
	public Cafe() {

	}
	public Cafe(double cofp, double teap, double donp, int cofq, int teaq, int donq, double dis) {
setcoffeePrice(cofp);
setteaPrice(teap);
setdonutPrice(donp);
setcoffeeTotQty(cofq);
setteaTotQty(teaq);
setdonutTotQty(donq);
setdiscount(dis);
}
public double getcoffeePrice() {
	return coffeePrice;
	}
public double getteaPrice() {
	return teaPrice;
	}
public double getdonutPrice() {
	return donutPrice;
	}
public int getcoffeeTotQty() {
	return coffeeTotQty;
	}
public int getteaTotQty() {
	return teaTotQty;
	}
public int getdonutTotQty() {
	return donutTotQty;
	}
public double getdiscount() {
	return discount;
	}
public void setcoffeePrice(double coffeePrice) {
	if (coffeePrice < 0)
		coffeePrice *= -1;
	this.coffeePrice = coffeePrice;
}
public void setteaPrice(double teaPrice) {
	if (teaPrice < 0)
		teaPrice *= -1;
	this.teaPrice = teaPrice;
	}
public void setdonutPrice(double donutPrice) {
	if (donutPrice < 0)
		donutPrice *= -1;
	this.donutPrice = donutPrice;
	}
public double getsubtotal() {
	return subtotal;
	}
public double getdiscountedPrice() {
	return discountedPrice;
}
public double gettotal() {
	return total;
}
public void setcoffeeTotQty(int coffeeTotQty) {
	if (coffeeTotQty < 0)
		coffeeTotQty *= -1;
	this.coffeeTotQty = coffeeTotQty;
}
public void setteaTotQty(int teaTotQty) {
	if (teaTotQty < 0)
		teaTotQty *= -1;
	this.teaTotQty = teaTotQty;
}
public void setdonutTotQty(int donutTotQty) {
	if (donutTotQty < 0)
		donutTotQty *= -1;
	this.donutTotQty = donutTotQty;
}
public void setdiscount(double discount) {
	this.discount = discount / 100;
}
private void calcuateTotal(int cofq, int teaq, int donq) {
	subtotal = (getcoffeePrice() * cofq) + (getteaPrice() *teaq) + (getdonutPrice() * donq);
}
private void calculateTotal(int cofq, int teaq, int donq) {
	calcuateTotal(cofq, teaq, donq);
	total = subtotal - (subtotal * discount);
	discountedPrice = subtotal - total;
}
public double order(int cofq, int teaq, int donq) {
	if ((getcoffeeTotQty() < cofq) || (getteaTotQty() < teaq)|| (getdonutTotQty() < donq)) {
		System.out.print("Erorr: no enough cups and/or donuts");
		return 0;
		}
	else
	{
		calculateTotal(cofq, teaq, donq);
		display(cofq, teaq, donq);
		return total;
}
	}
private void display(int cofq, int teaq, int donq) 
{System.out.print("--------------------------------------------------------\n");
System.out.print("|Item|\tQuantity|\tPrice|\n");
System.out.print("--------------------------------------------------------\n");
System.out.print("coffee| " + cofq + " | \t |" + cofq * getcoffeePrice() + "| \n");
System.out.print("tea |" + teaq + "| \t |" + teaq * getteaPrice() + "| \n");
System.out.print("donut |" + donq + "| \t |" + donq * getdonutPrice() + "| \n");
System.out.print("--------------------------------------------------------\n");
System.out.print("sub total " + getsubtotal() + "\n");
System.out.print("Discount (%" + getdiscountedPrice() + ")\n");
System.out.print("--------------------------------------------------------\n");
System.out.print("total " + gettotal() + "\n");
System.out.print("--------------------------------------------------------\n");
}
}