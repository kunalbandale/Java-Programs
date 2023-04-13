//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

public class Std {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "John";
        st.rollNo = 2;
        System.out.println(st.name + " " + st.rollNo);

    }

}
class Student {
    String name;
    int rollNo;
}
