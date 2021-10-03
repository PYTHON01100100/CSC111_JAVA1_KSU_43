import java.util.Scanner;
public class MinsToYearsDays {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		
		int minutes = input.nextInt();
		
		int Years = (minutes/60/24/365);
		int Days = minutes % (60 *24 * 365)/60/24;
		
		System.out.println(minutes + " minutes is approximately " + Years + " years and " + Days + " days");
		


	}
	

}
