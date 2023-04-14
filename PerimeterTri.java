//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
// units by creating a class named 'Triangle' without any parameter in its constructor.
public class PerimeterTri {
    public static void main(String[] args) {
        Traingle t = new Traingle();
        t.a = 3;
        t.b = 4;
        t.c = 5;
        System.out.println("Area of triangle" +" "+t.getArea());
        System.out.println(("Perimeter of triangle" + " "+ t.getPerimeter()));

    }
}

class Traingle {
    double a,b,c;
    double getArea() {
        double s = (a + b + c);
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    double getPerimeter() {
        return (a+b+c)/2.0;
    }
}