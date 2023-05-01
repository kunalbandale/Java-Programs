class M {
    public void show1() {
        System.out.println("In M class");
    }
}
class N extends M {
    public void show2() {
        System.out.println("In N class");
    }
}


public class UpCasringInJava {
    public static void main(String[] args) {

        // upcasting
        M obj = new N();
        obj.show1();

        //downcasting
        N obj1 = (N) obj;
        obj1.show2();

    }
}
