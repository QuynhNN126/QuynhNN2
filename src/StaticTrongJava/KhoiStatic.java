package StaticTrongJava;

public class KhoiStatic {

    static String name;
    static{

        System.out.println("Khoi static: Hello");
        name = "Kendall";
    }

    public static void main(String[] args) {
        System.out.println("Main: Hello");
        System.out.println("Name: " + name);
    }
}
