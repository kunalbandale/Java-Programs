import java.util.Scanner;

public class CheckReverseStringIsPalimdrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any String");
        String name = sc.next();

        String rev = "";

        for (int i = name.length()-1; i >= 0 ; i-- ) {
            rev += name.charAt(i);
        }
        System.out.println(rev);
        if (rev.equals(name)) {
            System.out.println("The String is palindrome");
        } else {
            System.out.println("The given String is not palindrome");
        }

    }
}
