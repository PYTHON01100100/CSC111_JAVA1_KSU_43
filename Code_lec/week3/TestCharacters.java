package week3;

public class TestCharacters 
{
	public static void main(String[] args) 
	{
		char myChar = 'W';
		//char myChar = 'Wq'; Invalid character constant
		//char myChar = ''; Can not leave the character empty
		
		System.out.println(myChar);
		myChar = '+';
		System.out.println(myChar);
		myChar = '1';
		System.out.println(myChar);
	
		//myChar = A; A cannot be resolved to a variable
		myChar = 'A';
		System.out.println(myChar);

		myChar = 88;
		System.out.println(myChar);

		myChar = 'W';
		System.out.println((int)myChar);
		
		System.out.println("-------------------------------------------");
		String name = "Ahmed";
		name = "A";
		name = "";
		System.out.println(name.length());
		name = " ";
		
		name = "Haya";
		System.out.println(name.length());
		
		System.out.println(name.charAt(1)); //prints first character
		System.out.println((int)name.charAt(1));
	}
}