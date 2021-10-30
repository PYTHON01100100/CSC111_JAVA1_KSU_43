public class TestMyRectangle {
	 public static void main(String[] args)
	 {
		 MyRectangle R1 = new MyRectangle();
		 R1.width = 4;
		 R1.height = 8 ;
		 R1.area = R1.width * R1.height ;
		 R1.perimeter = (R1.width + R1.height)*2;
		 System.out.println("The area of a rectangle with width "+R1.width +" and height "+R1.height +" is "+ R1.area);
		 System.out.println("The Perimeter of rectangle is "+ R1.perimeter);
		 MyRectangle R2 = new MyRectangle();
		 R2.width = 3.5;
		 R2.height = 35.9;
		 R2.area = R2.width * R2.height ;
		 R2.perimeter = (R2.width + R2.height)*2;
		 System.out.println("The area of a rectangle with width "+R2.width +" and height "+R2.height +" is " + R2.area);
		 System.out.println("The Perimeter of a rectangle is "+R2.perimeter);
		 R1.printRectangle();

 }
}