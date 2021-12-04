import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class student {
	Scanner input = new Scanner(System.in).useLocale(Locale.US);
	Random r=new Random();
	private int id;
	private String name;
	private double gpa;
	
	//cons
	public student() {
		id=0;
		name="NA";
		gpa=0.0;
	}
		public student(int id, String name, double gpa) {
			this.id = id;
			this.name = name;
			this.gpa = gpa;
		}
		
		
	
	//getters setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void read() {
		System.out.println("-----------------------------------||#ENTER THE YOUR INFORMATION#||-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

		System.out.println("PLEASE ENTER ID: ");
		this.id=input.nextInt();
		System.out.println("ENTER GPA: ");
		this.gpa=input.nextDouble();
		setGpa(gpa);
		System.out.println("ENTER GPA: ");
		this.name=input.next();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("=======================================================================================================================");
		input.close();
	}
	public void print() {
		System.out.println("-----------------------------------||#THE STUDENT INFORMATION#||-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("THE STUDENT NAME IS "+name);
		System.out.println("THE STUDENT ID IS "+id);
		System.out.println("THE STUDENT GPA IS "+gpa);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("=======================================================================================================================");
	}
	public String toString() {
		return name+", "+id+", "+", "+gpa;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
