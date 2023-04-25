public class TypeCasting {
    public static void main(String[] args) {
        //type casting and promotion
        byte b = 125;
        int a = b;
        System.out.println(a);

        byte k = (byte) a;
        System.out.println(k);

        float f = 5.6f;
        int  t = (int)f;
        System.out.println(t);

        //type promotion
        byte b1 = 20;
        byte b2 = 10;

        int result = b1 * b2;
        System.out.println(result);

    }
}
