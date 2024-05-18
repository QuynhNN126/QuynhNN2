package StaticTrongJava;

public class Student {

    public String phone = "0987872700";

    public static String name = "Quynh Tester";

    public static void ShowInfor(){
        Student sv = new Student();
        System.out.println(sv.name);
    }
    public void testLoginCRM(){

        System.out.println(Company.URL);
        System.out.println(Company.email);
        System.out.println(Company.password);

    }
    public static void main(String[] args) {

        Student sv = new Student();
        //System.out.println(sv.phone);
        //System.out.println(Company.CompanyName);
       // System.out.println(Company.CompanyAddress);
        //ShowInfor(); //cach goi ham static trong cung 1 class
       // sv.testLoginCRM(); //ko phai static cần gọi qua việc khởi tạo đối tượng

        Company.ShowInfor();//cach goi ham static hàm và class khác nhau
    }
}
