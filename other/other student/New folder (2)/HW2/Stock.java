/*
 * ID:
 * NAME:ABDULRAHMAN ALMAYMAN
 * DAY4
 * CSC111
 * HW2
 */
public class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	// Methods
	public void setSymbol(String newSymbol){
	symbol = newSymbol;
	}
	public String getSymbol() {
	return symbol;
	}
	public void setName(String newName){
	name = newName;
	}
	public String getName() {
	return name;
	}
	public void setCurrentPrice(double newCurrentPrice) {
	currentPrice = newCurrentPrice;
	}
	public void setPreviousClosingPrice(double newPreviousClosingPrice) {
	previousClosingPrice = newPreviousClosingPrice;
	}
	public double getChangePercent() {
	return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}
	public double getPreviousClosingPrice() {
	return previousClosingPrice;
	}
	public double getCurrentPrice() {
	return currentPrice;
	}



}
