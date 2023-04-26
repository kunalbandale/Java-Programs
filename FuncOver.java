class Calculator {
    public int add(int n1 , int n2, int n3) {
        return n1+n2+n3;
    }
    public int add(int n1 , int n2) {
        return n1+n2;
    }
    public int add(int n1 , int n2, int n3 , int n4) {
        return n1+n2+n3+n4;
    }
}
public class FuncOver {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(2,3,4));
        System.out.println(c1.add(2,3));
        System.out.println(c1.add(2,3,4,5));

    }
}
