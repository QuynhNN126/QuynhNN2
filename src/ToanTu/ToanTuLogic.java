package ToanTu;

public class ToanTuLogic {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        //Kiem tra dieu kien AND dau &&
        System.out.println("Dap an la: " + ((a > b) && (b > c)) );
        System.out.println( (a < b) || (b > c) );

        System.out.println(a == b); //so sanh a có = b k?
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}
