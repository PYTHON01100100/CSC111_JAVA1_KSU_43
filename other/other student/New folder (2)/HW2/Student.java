/*
 * ID:
 * NAME:ABDULRAHMAN ALMAYMAN
 * DAY4
 * CSC111
 * HW2
 */
public class Student {
	//Attributes
	private String name;
	private int age;
	private double GPA;
	// Methods
	public Student() {
	}
	public Student(String name, int age, double GPA) {
	this.name = name;
	this.age = age;
	this.GPA = GPA;
	}
	public void setName(String name){
	this.name = name;
	}
	public String getName(){
	return name;
	}
	public void setAge(int age){
	this.age = age;
	}
	public int getAge(){
	return age;
	}
	public void setGPA(double GPA){
	this.GPA = GPA;
	}
	public double getGPA(){
	return GPA;
	}
	public void printInfo() {
		System.out.println("#****************************************************************************************************************************************************#");
	    System.out.println("-------------------------------------------------------------------THE STUDENT INFORMATION------------------------------------------------------------------------------------------------------------------------");
	    System.out.println("Student name: "+name);
	    System.out.println("Student age: "+age);
	    System.out.println("Student GPA: "+GPA);
	    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println("#****************************************************************************************************************************************************#");
	
	}
	}
