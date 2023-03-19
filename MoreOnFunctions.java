public class MoreOnFunctions {
    public static void main(String args[]) {
        Person1 p1 = new Person1();
        p1.age = 20;
        p1.name = "kunal";

        Person1 p2 = new Person1();
        p2.age = 30;
        p2.name = "Anuj";

        System.out.println(p1.age + " " + p1.name);
        p1.eat();
        System.out.println(p2.age + " " + p2.name);
        p2.walk(2);


    }
}

class Person1 {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking");
    }
    void eat() {
        System.out.println(name + " is eating");
    }
    void walk(int steps) {
        System.out.println(name + " walked " + steps);
    }


}