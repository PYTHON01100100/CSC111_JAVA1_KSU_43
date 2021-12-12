package train;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.math.*;
import java.lang.Math;
public class HighScore {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in).useLocale(Locale.US);
		int count=0;
		String name,name1, name2;
		int score,score1, score2;
		score=0;
		name="";
		System.out.println("enter no of stu");
		int NOS=input.nextInt();
		do {
			System.out.println("enter student name and its score");
			name1=input.next();
			score1=input.nextInt();
			count++;
			System.out.println("enter student name and its score");
			name2=input.next();
			score2=input.nextInt();
			count++;
			if(score<score1||score<score2) {
			if(score1>score2) {
			score=score1;
			name=name1;
			}
			else if(score2>score1) {
				score=score2;
				name=name2;
			}
			}
		}while(count!=NOS);
		System.out.println("hist is " + score+" and name is "+ name);

	}

}
