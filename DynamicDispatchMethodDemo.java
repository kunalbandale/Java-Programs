class x  {
    public void show() {
        System.out.println("X in show");
    }
}
class y extends x {
    public void show() {
        System.out.println("Y in show");
    }
}
class z extends x {
    public void show() {
        System.out.println("z in show");
    }
}


public class DynamicDispatchMethodDemo {
    public static void main(String[] args) {

        x obj = new x();
        obj.show();

        obj = new y();
        obj.show();

        obj = new z();
        obj.show();



    }
}
