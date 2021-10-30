public class Book {
int ISBN;
String author , genre , title ;
public String generateReference()
{
	return String.valueOf(author.charAt(0)) +String.valueOf(author.charAt(1)) + "-"+ String.valueOf(genre.charAt(0)) +String.valueOf(genre.charAt(1));
}
public boolean verifyISBN(int isbn) {
	int n1, n2, n3, n4, z;
	n1 = isbn / 1000;
	isbn = isbn % 1000;
	n2 = isbn / 100;
	isbn = isbn % 100;
	n3 = isbn / 10;
	isbn = isbn % 10;
	n4 = isbn % 10;
	z = (n1 * 3 + n2 * 2 + n3 * 1) % 4;
	if (z == n4)
		return true;
	else
		return false;
	}
public String toString()
{
	return "Title:" + title + "\n" + "Author:" + author + "\n"+ "ISBN: " + ISBN + " - Reference Code :"+ generateReference() + "\n" + "Genre:" + genre;
}
}