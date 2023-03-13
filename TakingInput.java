import java.util.Scanner;

// Taking input in java
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = sc.next();

        System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        System.out.println("Enter your Height");
        float height = sc.nextFloat();

        System.out.println("Enter Your Mobile Number:");
        long mob = sc.nextLong();

        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Height: " + height + "\'");
        System.out.println("Mobile Number: " + "+91" + mob);

    }
}
