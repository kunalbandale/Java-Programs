enum Set {
    Running , Failed , Pending , Sucess;
}

public class EnumIf {
    public static void main(String[] args) {
        Set s = Set.Running;

        if(s == Set.Running)
            System.out.println("All Good");
        else if(s == Set.Failed)
            System.out.println("Try Again...");
        else if (s == Set.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
    }
}
