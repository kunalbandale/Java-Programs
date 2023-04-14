public class StaticExample {
    static int a = 10;
    static int b;

    static {
        System.out.println("Hello this is a static block");
        b += a *5;
    }

    public static void main(String[] args) {
        StaticExample st = new StaticExample();
        System.out.println(StaticExample.a + " " + StaticExample.b);

        b += a *5;
        StaticExample st2 = new StaticExample();
        System.out.println(StaticExample.a + " " + StaticExample.b);


    }
}
