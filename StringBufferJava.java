public class StringBufferJava {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Kunal");
        sb.append("bandale");

        System.out.println(sb.capacity());
        System.out.println(sb);
         
        sb.insert(0,"Hello");
        System.out.println(sb);
    }
}
