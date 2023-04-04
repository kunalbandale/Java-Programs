import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 Numbers");
        for (int i = 0; i < 5 ; i++) {
            list.add(sc.nextInt());
        };
        System.out.println(list);
    }
}
