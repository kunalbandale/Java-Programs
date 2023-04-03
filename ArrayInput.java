import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter Any 5 Numbers:");
        for (int i = 0;  i < numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Entered Number in Array are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
