package DemoCollections;

import java.util.ArrayList;
import java.util.List;
//duoc phep luu trung
public class DemoArrayList {
    public static void main(String[] args) {
        List <String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("C++");

        System.out.println("Số phần tử: " + arrayList.size());
        arrayList.remove(1); //xoa theo vi tri
        System.out.println("Kiểm tra chứa " + arrayList.contains("Java"));
        //arrayList.removeAll(arrayList);
        System.out.println("Các phần tử của ArrayList:");
        System.out.print("\t" + arrayList + "\n");

        // duyet data theo for cai tien
        System.out.println();
        for (String obj : arrayList) {
            System.out.print(obj + ", ");
        }
        // duyet data theo for co ban
        System.out.println();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            System.out.print(arrayList.get(i) + ", ");
        }
    }
}
