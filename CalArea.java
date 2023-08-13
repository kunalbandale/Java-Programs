import java.util.Scanner;
import java.lang.*;

public class CalArea {
	public static void main (String args[]) {
		// area , base , height
		float area , base , height;

		System.out.println("Enter Base and Height ");
		Scanner input = new Scanner(System.in);

		base = input.nextFloat();
		height = input.nextFloat();

		// area = (1f/2f * base * height);
		area = base * height * 2;

		System.out.println("Area of Triangle :" + area);
	}
}