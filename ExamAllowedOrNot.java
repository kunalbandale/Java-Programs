import java.util.Scanner;

//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//        Take following input from user
//        Number of classes held
//        Number of classes attended.
//        And print
//        percentage of class attended
//Is student is allowed to sit in exam or not.
public class ExamAllowedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of classes attended");
        int noOfClassesAttended = sc.nextInt();

        System.out.println("Number of classes Held");
        int noOfClassesHeld = sc.nextInt();

        int yourAttedance = (noOfClassesAttended * 100 ) /noOfClassesHeld;
        System.out.println("Your Attendance is :" + yourAttedance + "%");

        if (yourAttedance <= 75) {
            System.out.println("You are not eligible for writing exam");
        } else {
            System.out.println("You are eligible for writing exam");
        }
    }
}
