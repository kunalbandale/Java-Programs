import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(34);
        list.add(500);
        list.add(12);
        list.add(7);
        list.add(28);
        list.add(90);
        list.add(77);
        list.add(65);
        list.add(9);

        System.out.println(list.contains(77));
        System.out.println(list);
        list.set(0,121);
        list.remove(4);

        System.out.println(list);
    }
}
