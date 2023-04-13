//Assign and print the roll number, phone number and address of two students having names "roy" and "John"
// respectively by creating two objects of class 'Student'.

public class Details {
    public static void main(String[] args) {
        stdData roy = new stdData();
        roy.roll = 1;
        roy.phoneNumber = 123456;
        roy.add = "Nanded";
        System.out.println(roy.roll + " " +roy.phoneNumber + " " + roy.add);

        stdData john = new stdData();
        john.roll = 2;
        john.phoneNumber = 78901;
        john.add = "Nagpur";
        System.out.println(john.roll + " " +john.phoneNumber + " " + john.add);

    }
}

class stdData {
    int roll;
    String add;
    long phoneNumber;

}