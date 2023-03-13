// demonstration of else-if ladder
public class GradeCal {
    public static void main(String[] args) {
        char grade = 'D';

        if(grade == 'A') {
            System.out.println("Your grade is very good");
        } else if (grade == 'B') {
            System.out.println("very good , keep learning");
        } else if (grade == 'D') {
            System.out.println("keep improving");
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
