enum Set1 {
    Running , Failed , Pending , Sucess;
}



public class EnumSwtich {
    public static void main(String[] args) {

        Set1 s = Set1.Sucess;

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Sucess:
                System.out.println("Great!!");
                break;
            default:
                System.out.println("Work..");
        }

    }
}
