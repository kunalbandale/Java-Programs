class A {
    public A() {
        System.out.println("object created");
    }
    public void show() {
        System.out.println("In a show");
    }
}

public class AnonomyosObject {
    public static void main(String[] args) {
        new A().show(); // anonoymns object

    }
}
