import java.util.Scanner;

public class CheckVotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Your are Eligible for Voting.");
        } else {
            System.out.println("You are Not Eligible for Voting17");
        }

    }

}
