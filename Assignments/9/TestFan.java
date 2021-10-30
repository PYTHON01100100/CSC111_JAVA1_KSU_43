public class TestFan {
public static void main(String[] args) {
	Fan Fan1= new Fan();
	Fan Fan2= new Fan();
	Fan1.increaseSpeed();
	Fan1.increaseSpeed();
	Fan1.increaseSpeed();
	Fan2.decreaseSpeed();
	System.out.println("-------------");
	Fan1.changeColor("yellow");
	Fan1.changeRadius(10);
	Fan1.turnOn();
	System.out.println(Fan1.toString());
	System.out.println("-------------");
	System.out.println(Fan2.toString());
}
}