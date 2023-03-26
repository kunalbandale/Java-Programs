import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;

        System.out.println("Enter Any Number to find factorial");
        int num = sc.nextInt();

        for (int i = 1 ; i<=num;i++) {
            fact = i * fact;
        }
        System.out.println(fact);

    }
}
