package IF_ELSE;

public class DEMO_IF_ELSE {
    public static void main(String[] args) {
        String gender = "Nu";
        int age = 20;

        if(age >= 18 && gender.equals("Nam"))
        {
            System.out.println("Được duyệt");
        }
        else {
            System.out.println("Không duyệt");
        }
    }
}
