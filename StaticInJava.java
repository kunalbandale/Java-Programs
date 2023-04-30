class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(name + " " + brand + " " + price);
    }
}

public class StaticInJava {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.price = 1200;
        m1.brand = "samsung";
        Mobile.name = "Smartphone";

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 1500;
        Mobile.name = "Smartphone";

        m1.show();
        m2.show();


    }
}
