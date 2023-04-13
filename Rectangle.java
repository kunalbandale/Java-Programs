//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
// First method named as 'setDim' takes length and breadth of rectangle as parameters and
// the second method named as 'getArea' returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        Area a = new Area();
        a.setDim(length,breadth);
        System.out.println("Area of Rectangle "+a.getArea());
    }
}

class Area {
    int length , breadth;
    void setDim(int l , int b) {
        this.length = l;
        this.breadth = b;
    }
    int getArea() {
        return length * breadth;
    }
}
