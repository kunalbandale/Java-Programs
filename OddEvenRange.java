import java.util.Scanner;

public class OddEvenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number of Range:");
        int num1 = sc.nextInt();

        System.out.println("Enter Ending Number of Range:");
        int num2 = sc.nextInt();

        for(int i = num1 ; i <=num2 ; i++) {
            if(i % 2 == 0) {
                System.out.println( i + "even");
            } else {
                System.out.println( i + "odd");
            }

        }
    }
}
