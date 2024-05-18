package Ham;

public class DemoHamKhongTraVe {
    String name = "Quynh";
    int age = 24;
    String address = "ngo 51 Lang Yen";
    //Khai bao ham ko tra ve
    public void ShowInfo(){
        System.out.println(name + " tuoi " + age + " o " + address );
    }

    public static void main(String[] args) {
        DemoHamKhongTraVe object1 = new DemoHamKhongTraVe();
        object1.ShowInfo();
    }
}
