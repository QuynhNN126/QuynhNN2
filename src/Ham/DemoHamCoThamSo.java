package Ham;

public class DemoHamCoThamSo {
    String name = "Quynh";
    int age = 24;
    String address = "ngo 51 Lang Yen";
    int a = 10;
    int b = 20;
    //Khai bao ham co tra ve
    public String getName(){
        return name;
    }
    //Truyen Tham So
    public int Cong2So(int a, int b){

        return a + b;
    }
    public double Nhan3So(int a, int b, double c) {
        return a * b * c;
    }
    public int GetTotalCustomer() {
        int total = 501;
        return total;
    }
    public void setEmail (String Email){
        System.out.println("Email của tôi là: " + Email);
    }
    public static void main(String[] args) {
        DemoHamCoThamSo object1 = new DemoHamCoThamSo();
        System.out.println("Cong 2 so: " + object1.Cong2So(5,8)); //ham tinh toan nen phai goi in ra qua sout
        System.out.println("Nhan 3 so: " + object1.Nhan3So(8,4,2.6));

        object1.setEmail("quynh@gmail.com");
    }
}