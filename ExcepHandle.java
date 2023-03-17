public class ExcepHandle {
    public static  void  main(String[] args) {
        int a[] = new int[3];

        try {
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error!!");
            System.out.println(e.getLocalizedMessage());
        }
    }
}
