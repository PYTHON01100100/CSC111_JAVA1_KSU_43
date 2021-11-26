package stud1;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
		student1 s1;
		//s1 is reference(pointer)[ﬁÌ„ Â ⁄»«—… ⁄‰ –«ﬂ—…]
		//s1.id=8888;  compile error
		//System.out.println(s1); syntax error
		s1 =null;
		//will print
		//·«  √‘—
		// «·«—ﬁ«„ €Ì— „”„ÊÕ… „⁄ «·—›—Ì‰”” 
		//
		//System.out.println("enter id(1)");  RUN TIME ERROR
		//s1.id=input.nextInt(); «‰  ﬁ·  ·«  √‘— ›ﬂÌ›  √‘— ⁄·Ï «·«ÌœÌ
		//System.out.println(s1.id);
		//System.out.println(s1);
		// [«‘— «·ﬂ«∆‰ »«·Œ·Ì… «·›·«‰Ì…]  
		s1= new student1();
		// will print its address.
		System.out.println("it address in the memory  is ["+s1+"]");
		System.out.println("--------------------BECAUSE THEY ARE ATTRIBUTS AND ATTRIBUTS HAS DEFALT VALUES-----------------------------------------");
		s1.printInfo();
		System.out.println("------------------------------------------------------------");
		System.out.println("enter id:");
		s1.id=input.nextInt();
		System.out.println("enter name:");
		s1.name=input.next();
		System.out.println("enter gpa");
		s1.gpa=input.nextDouble();
		System.out.println("are you married");
		s1.isMarried=input.nextBoolean();
		System.out.println("information:"+"\n"+s1.name+"\n"+s1.id+"\n"+s1.gpa+"\n"+s1.isMarried);
		//  link
		//   https://youtu.be/V1nvJCrv4_U?list=PLiOsrzh6MHoNQ8gw39lObOggLn-b0tSxV
	}

}
