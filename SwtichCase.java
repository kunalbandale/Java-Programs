import java.util.Scanner;
public class SwtichCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Grade:");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Your Grade is Very Good!");
                break;
            case 'B':
                System.out.println("YVery Good! keep learning");
                break;
            case 'C':
                System.out.println("Nice keep going");
                break;
            case 'D':
                System.out.println("Work Hard");
                break;
            case 'F':
                System.out.println("Work Very Hard!!");
                break;

            default:
                System.out.println("Invalid Grade");
        }
    }
}
