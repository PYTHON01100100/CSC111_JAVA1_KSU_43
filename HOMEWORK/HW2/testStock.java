/*
 * ID: 
 * NAME:ABDULRAHMAN ALMAYMAN
 * DAY4
 * CSC111
 * HW2
 */
import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Locale;
public class testStock {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Stock stock = new Stock();
		System.out.print("Enter symbol of stock:");
		stock.setSymbol(input.next());
		System.out.print("Enter company name:");
		stock.setName(input.next());
		System.out.print("Enter previous closing price:");
		double prevPrice = input.nextDouble();
		stock.setPreviousClosingPrice(prevPrice);
		System.out.print("Enter curret price:");
		double currentPrice = input.nextDouble();
		stock.setCurrentPrice(currentPrice);
		System.out.println("############################################## THE INFORMATION ##############################################################################");
		// Display stock info
		System.out.println("For the stock "+stock.getSymbol()+" of the company "+stock.getName()+" :");
		System.out.println("Previous Closing Price: "+ stock.getPreviousClosingPrice());
		System.out.println("Current Price: " + stock.getCurrentPrice());
		System.out.println("Price Change: " + stock.getChangePercent() * 100 + "%");
		}

	}