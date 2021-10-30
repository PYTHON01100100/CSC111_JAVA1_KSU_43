public class QuadraticEquation {
	public double a;
	public double b;
	public double c;
	public double calcDiscriminant(){
		double dis = b*b - 4 * a * c;
		return dis;
		}
	public double calcRoot1(){
		if(calcDiscriminant() < 0){
			return 0;
			}
		else
			return (-b + Math.sqrt(calcDiscriminant()) ) /(2*a);
		}
public double calcRoot2(){
	if(calcDiscriminant() < 0){
		return 0;}
	else
		return (-b - Math.sqrt(calcDiscriminant()) ) /(2*a);
	}
}