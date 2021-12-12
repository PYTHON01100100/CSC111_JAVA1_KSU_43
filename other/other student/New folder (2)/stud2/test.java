package stud2;
import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;
public abstract class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Student s1=new Student();
		//s1.id =22242;
		// ·¬‰Â »—«Ì› 
		//Because it is private
		// 
		//s1.gppaa=422;
		//gppaa cannot be resolved or is not a field
		//„» „ÊÃÊœ «”«”«
		s1.read();
		s1.print();
		System.out.println("-------------------------------------------------------------------------------------------------------");
		//double a = s1.getGpa();
		//System.out.println(a);
		s1.setName("ali");
		s1.setId(4411);
		s1.setGpa(5);
		System.out.println("------------------------------");
		s1.print();
		
		
		// it will print 0.0
		
	}

}
