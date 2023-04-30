public class ArrayCreation {
    public static void main(String[] args) {
        int num[] = {4,5,6};
        num[1] = 10;
        System.out.println(num[1]);

//        dynamic array
        int nums[] = new int[4];
        nums[0] = 12;
        nums[1] = 2;
        nums[2] = 1;
        nums[3] = 34;

//        printing values
        for (int i = 0; i <= 3 ; i++) {
            System.out.println(nums[i]);
        }

//        2-D array
        int numbers[][] = new int[3][4];


        for (int i = 0 ; i < 3 ; i ++) {
            for (int j = 0 ; j<4 ; j ++) {
                numbers[i][j] = (int) (Math.random() * 100);
                System.out.println(numbers[i][j]);
            }
            }




            for (int i = 0 ; i < 3 ; i ++) {
            for (int j = 0 ; j<4 ; j ++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }


    }
}
