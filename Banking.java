import java.util.Scanner;


public class Banking {
    int credit , debit;
    int total = 50000;
    void cashWithDraw(int amount) {

        if (amount >= 10000) {
            System.out.println("Limit Exceeded! Cannot withdraw " + amount);
        } else {
            total = total - amount;
            System.out.println("Amout debited " + amount);
        }
    }

    void Deposit(int amount) {
        if (amount >= 50000) {
            System.out.println("Amout cannot be debited");
        } else {
            total = total + amount;
            System.out.println("Amout credit " + amount);
        }


    }
    void checkBalance() {
        System.out.println("Your account balance is " + total);

    }

    void exit() {

    }


    public static void main(String[] args) {

        Banking b = new Banking();


        Scanner sc = new Scanner(System.in);

        while (true) {


            System.out.println("Enter Option!!");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter amount you want to withdraw");
                    int amount = sc.nextInt();
                    b.cashWithDraw(amount);
                    break;
                case 2:
                    System.out.println("Enter amount you want to withdraw");
                    int amount1 = sc.nextInt();
                    b.Deposit(amount1);
                    break;
                case 3:
                    b.checkBalance();
                    break;
                case 4:
                    b.exit();
                default:
                    System.out.println("Please Enter Correct Option");
            }
        }
    }
}
