import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Array_List {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array list thay giong vector trong C++
        // luu kieu giu lieu Wrapper
        List<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        // them ptu vao
        arr.add(1);// 1
        arr.add(2);// 1 2
        arr.add(3); // 1 2 3;

        // size
        System.out.println(arr.size());
        // duyet
        for (int i = 0; i < arr.size(); i++) {
            // truy cap
            arr.get(i); // chi cha ve
        }
        // for each
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // clear don sach ptu
        // isEmpty(): kiem tra xem co reong hay khong
        // contains() : kiem tra su ton tai cua 1 gtri

        // set(chi so, gia tri sua)
        arr.set(2, 100);

        // remove(index) xoa gia tri co chi so index
        arr.remove(2);
        // remove(Object) xoa gia tri
        arr.remove((Object) 1);

        // indexOf() : cha ve chi so dau tien co 1 ptu neu no xua hien neu ko tra ve -1

        // toArray(): tra va mang chua cac object tuong ung trong mang thay giong auto
        Object[] b = arr.toArray();

        // sap xep ptu trong arraylist
        arr.sort(null);// sep xep tang dan

        Collections.sort(arr, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }
}