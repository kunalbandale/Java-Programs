public class ArraysInJava {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 23;
        marks[1] = 12;
        marks[2] = 45;
        marks[3] = 23;
        marks[4] = 21;


        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
        System.out.println("---------");

//        other method
            int marks1[] = {23, 45, 33, 78, 98};

            for (int j = 0; j < marks1.length; j++) {
                System.out.println(marks1[j]);

            }
        }
    }
