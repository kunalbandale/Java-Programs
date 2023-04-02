import java.util.Scanner;



public class FibUsingRecursion {

   static int fib(int n) {
        if (n==0) {
            return  0;
        }
        if (n==1 || n==2) {
            return 1;
        }
        if (n>2) {
            return  fib(n-1) + fib(n-2);
        }
        return 0;

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
       int x= fib(6);
        System.out.println(x);





    }
}
