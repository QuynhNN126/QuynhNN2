package DemoCollections;
import java.util.Map;
import java.util.HashMap;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        hashMap.remove("Language1");
        System.out.println(hashMap.containsKey("Language2"));
        System.out.println(hashMap.containsValue(".Net")); //false vì đã xoá bên trên
        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap + "\n");

        // doc data cho file excel và json
        // thiet lạp config cho driver trong selenium
        System.out.println("-----");
        //Truy xuất giá trị theo từng key
        System.out.println(hashMap.get("Windows"));
        System.out.println("-----");
        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
