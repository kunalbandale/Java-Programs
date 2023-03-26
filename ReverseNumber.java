import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int digit;
                int sum=0;
                System.out.println("Enter any number:");
                int num = sc.nextInt();

                while (num > 0) {
                    digit = num % 10;
                    System.out.print(digit);
                    num = num/10;

                }


            }
        }

