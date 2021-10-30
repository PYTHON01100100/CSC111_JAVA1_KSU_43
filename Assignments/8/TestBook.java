import java.util.Scanner;
public class TestBook {
public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	Book o = new Book();
	System.out.println("Please, enter the book details #ISBN,author, title, and genre.");
	o.ISBN = kb.nextInt();
	o.author = kb.next();
	o.title = kb.next();
	o.genre = kb.next();
	boolean Y = o.verifyISBN(o.ISBN);
	if (Y) {
		System.out.println(o.toString());
		System.out.println("The book reference is :" +o.generateReference());
}
	else
	System.out.println("Invalid ISBN");
}
}