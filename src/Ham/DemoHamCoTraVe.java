package Ham;

public class DemoHamCoTraVe {
    String name = "Quynh";
    int age = 24;
    String address = "ngo 51 Lang Yen";
    int a = 10;
    int b = 20;
    //Khai bao ham co tra ve
    public String getName(){
        return name;
    }
    public int Cong2So(){
        return a + b;
    }
    public double Nhan3So() {
        return a * b * 2;
    }
    public int GetTotalCustomer() {
        int total = 501;
        return total;
    }
    public static void main(String[] args) {
        DemoHamCoTraVe object1 = new DemoHamCoTraVe();
        System.out.println(object1.Cong2So()); //ham tinh toan nen phai goi in ra qua sout
        System.out.println(object1.Nhan3So() + object1.Cong2So());
    }
}