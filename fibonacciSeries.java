import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = sc.nextInt();

        int x=0 , y=1 ;
        System.out.println(x);
        System.out.println(y);

        for (int i = 2 ; i <= number;i ++) {
            int next = x + y;
            System.out.println(next);
            x = y;
            y = next;
        }

    }
}
