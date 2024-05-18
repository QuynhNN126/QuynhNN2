package SWITCH_CASE;

public class DEMO_SWITCH_CASE {
    public static void main(String[] args) {

        String browser = "SAFARI";
        switch(browser) {
            case "CHROME":
                System.out.println("Chay test voi trinh duyet Chorme");
                break;
            case "SAFARI":
                System.out.println("Chay test voi trinh duyet Safari");
                break;
            default:
                System.out.println("Chay test voi trinh duyet mặc định");
                break;
        }
    }
}
