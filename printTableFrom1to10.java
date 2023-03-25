import java.util.Scanner;

public class printTableFrom1to10 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Print Tables from 1 to 10");
        System.out.println("=========================");

        for (int i = 1 ; i<=10 ; i ++) {
            for (int j = 1 ; j<=10 ; j ++) {
                System.out.println(i*j);
            }
            System.out.println("=========================");
        }
    }
}
