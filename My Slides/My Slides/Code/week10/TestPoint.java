package week10;

public class TestPoint
{
	public static void main(String[] args)
	{
		//A
		/*
		Point p1 = new Point();
		System.out.println(p1.x + "," + p1.y + ":" + p1.count); //Point.count
		*/
		
		//B
		/*
		Point p1 = new Point();
		p1.x = 5; p1.y = 3; p1.count = 2;
		Point p2 = new Point();
		p2.x = 3; p2.y = 5; p2.count = 1;
		System.out.println(p1.x + "," + p1.y + ":" + p1.count);
		*/
		//C
		/*
		Point p1 = new Point ();
		p1.x = 5; p1.y = 3; p1.count = 1;
		Point p2 = new Point ();
		p2.x = p1.y; p2.y = p1.x; p2.count = 1;
		System.out.println(p2.x + "," + p2.y + ":" + p2.count);
		*/
		
		//D
		/*
		 	Point p=null;
			for (int i=1; i <= 5; i++) {
				p = new Point ();
				p.x = i; p.y = 2*i*i+2;
				p.count++;
			}
			System.out.println(p.x + "," + p.y + ":" + p.count);
		 */
	
		//E
		/*
		 Point p1=null, p2=null;
				for (int i=1; i <= 5; i++) {
				p1 = new Point();
				p2 = new Point();
				p1.x = i; p1.y = 2*i+1; p1.count++;
				p2.x = i; p2.y = 3*i-1; p2.count++;
				}
				System.out.println(p1.count++);
		 */

		/*
		Point p = null;
		System.out.println(p.count);
		System.out.println(p.x); //Null pointer Exception
	*/
		/*
		Point p;
		System.out.println(p.count); //Compile error
		System.out.println(p.x);
	*/
		
		/*
		System.out.println(Point.count);
		Point p = new Point();
		System.out.println(p.x);
		System.out.println(Point.x); //Cannot make a static reference to the non-static field Point.x
		*/
		
		/*
		Point p;
		
		for (int i = 1 ; i <= 5 ; i++) 
		{
			p = new Point ();
			p.x = i; p.y = 2*i*i+2;
		}
		
		System.out.println(p.x);
		*/
		
		/*
		Point p = null;
		
		for (int i = 11 ; i <= 5 ; i++) 
		{
			p = new Point ();
			p.x = i; p.y = 2*i*i+2;
		}
		
		System.out.println(p.x);
*/
		
	}
}