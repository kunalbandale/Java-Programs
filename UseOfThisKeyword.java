class Student {
    int roll;
    String name;
    float fees;

    Student(int roll , String name , float fees) {
        this.roll = roll;
        this.name = name;
        this.fees = fees;
    }
    void dispaly() {
        System.out.println(roll + " " + name + " " + fees);
    }
}

public class UseOfThisKeyword {
    public static void main(String[] args) {

        Student s1= new Student(1,"kunal",10000f);
        Student s2 = new Student(2,"Akash",20000f);

        s1.dispaly();
        s2.dispaly();

    }
}
