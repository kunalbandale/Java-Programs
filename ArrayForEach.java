import java.util.Scanner;

public class ArrayForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        System.out.println("Enter 5 numbers in array");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }


        System.out.println("5 number you entered are:");

        for (int i:num) {
            System.out.println(i);

        }
    }
}
