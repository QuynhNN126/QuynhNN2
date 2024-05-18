package DemoCollections;

import java.util.HashSet;
import java.util.Set;
//ko duoc phep luu trung
public class DemoSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");

        System.out.println("Số phần tử: " + hashSet.size());
        hashSet.remove("C++"); //XOA PHAN TU THEO GIA TRI
        System.out.println("Kiểm tra chứa " + hashSet.contains("Python"));
        //hashSet.removeAll(hashSet);
        System.out.println("Các phần tử của ArrayList:");
        System.out.print("\t" + hashSet + "\n");


        // duyet data theo for cai tien
        System.out.println();
        for (String obj : hashSet) {
            System.out.print(obj + ", ");
        }

    }
}
