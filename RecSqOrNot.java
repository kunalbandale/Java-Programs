import java.util.Scanner;

//Take values of length and breadth of a rectangle from user and check if it is square or not
public class RecSqOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        float AreaOfRectangle = length * breadth;

        System.out.println("Area of Rectangle:" + " " + AreaOfRectangle);

        if(length == breadth) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }
    }
}
