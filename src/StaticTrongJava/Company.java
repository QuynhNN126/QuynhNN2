package StaticTrongJava;

public class Company {
    //khai bao bien static
    public static String CompanyName = "DNSE";
    public static String CompanyAddress = "Ngo Thi Nham";

    //dung cho test auto
    public static String URL = "";
    public static String email = "quynh@gmail.com";
    public static String password = "123456";

    public static void ShowInfor (){
        System.out.println(CompanyName);
        System.out.println(CompanyAddress);
    }
}
