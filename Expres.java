import java.uti.Scanner;
import java.lang.*;

public class Expres {
	public static void main(String args[]) {
		// s = a + b + c
		// Math.sqrt(s*(s-a)*(s-b)*(s-c))
		int a , b , c;
		double s , area;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three side a | b | c ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		s = (a + b + c);
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle: " + area);
	}
}