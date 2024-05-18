package Mang;

public class DemoMang {
    public static void main(String[] args) {
        //Mang rong
        String mangName [] = new String[5];
        //gan mang
        mangName[0] = "Quỳnh";
        mangName[1] = "Hải";
        mangName[2] = "Minh";
        mangName[3] = "Huyền";
        mangName[4] = "Hạnh";
        //mangName[5] = "Thành";
        //duyet gia tri trong mang
        //dung vong lap for
        for(int i = 0; i < mangName.length; i++){
            System.out.println("My name is " + mangName[i]);
        }
        System.out.println("===================================");
        for(String name : mangName){
            System.out.println("WO SHI " + name);
        }
    }
}
