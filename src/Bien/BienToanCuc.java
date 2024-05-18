package Bien;

public class BienToanCuc {
    //bien toan cuc
    String address ="Hanoi";

    public String getName() {
        String name = "Quynh"; //bien local
        System.out.println(address);
        return name;
    }
    public void showInfor(){
        String name = "Hai";
        System.out.println(name);
        System.out.println(address);
    }
    public void Login(){
        String email ="";
        String pass = "";
        System.out.println(address);
    }

    public static void main(String[] args) {

    }
}
