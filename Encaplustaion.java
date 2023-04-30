class  Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encaplustaion {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(12);
        h1.setName("ramdasi");

        System.out.println(h1.getAge());
        System.out.println(h1.getName());

    }
}
