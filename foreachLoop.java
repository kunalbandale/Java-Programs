public class foreachLoop {
    public static void main(String[] args) {
        int num[] = new int[4];
        num[0] = 4;
        num[1] = 5;
        num[2] = 7;
        num[3] = 8;

        for(int n : num) {
            System.out.println(n);
        }

    }
}
