//class and objects in java
public class ClassObj {
    public static void main(String args[]) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "kunal";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "Anuj";

        System.out.println(p1.age + " " + p1.name);
        p1.eat();
        System.out.println(p2.age + " " + p2.name);
        p2.walk();


    }
}

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking");
    }
    void eat() {
        System.out.println(name + " is eating");
    }


}