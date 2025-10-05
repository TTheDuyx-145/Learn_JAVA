import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Hoc_Set {
    public static HashSet<Integer> set1 = new HashSet<>();
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HashSet: chi chua cac phan tu khac nhau
        // tim kiem patu -> o(1);
        // khong co thu tu
        // luu cac phan tu kieu doi tuong Wrapper
        // Khai bao:
        // Set<dataType> set1 = new HashSet<>();
        // HashSet<dataType> set2 = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        // add() them ptu vao
        // remove() xoa ptu
        // size() kthuoc cua set
        // contains() -> kiem tra su ton tai cua 1 ptu (.) set
        // clear() don set
        // isEmpty() xem co rong khong
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(200);
        System.out.println(set.contains(0));
        System.out.println(set.size()); // sl
        for (int i : set)
            System.out.print(i + " ");
        if (set.contains(200)) // ktra xem co ton tai trong set ko
            set.remove(200);// ptu phai co trong set nguoc lai se loi
        for (int i : set)
            System.out.print(i + " ");
        
        // LinkedHashSet : luu theo thu tu ban them vao - con lai giong HashSet
        // khoi tao:
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        // TreeSet: thu tu tang dan - con lai  giong HashSet
        // tim kiem - xoa log(N);
        TreeSet<Integer> set3 = new TreeSet<>();
        // Mot o ham thong dung trong TreeSet:
        // floor(x) tra ve ptu <= x, ko ton tai tra ve null
        // ceiling(x) tra ve ptu >= x, ko ton tai tra ve null
        // first() tra ve ptu dau tien 
        // last() tra ve ptu cuoi  cung
        // lower(x) tra ve ptu lon nhat nho hon x, ko ton tai tra ve null
        // higher(x) tra ve ptu nho nhat lon hon x, ko ton tai tra ve null

    }

}