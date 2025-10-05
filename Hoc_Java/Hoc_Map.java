import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

public class Hoc_Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //HashMap: luu cap phan tu theo cap(key, val) ko co thu tu
        // lu dang object -> Wrapper
        // Khoi tao
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Double, Integer> map1 = new HashMap<>();
        //...
        // cac ham : 
        map.put(5,1); // them cap key, value - Entry
        map.size(); // tra ve kthuoc cua map
        map.isEmpty(); // xem map co rong khong
        map.containsKey(5); // kiem tra xem x trong tap key
        map.containsValue(1); // kiem tra xem x trong tap value
        map.get(5); // tra ve value tuong ung voi key x
        map.replace(2,4); // thay the cap ptu (x,y)
        map.remove(5); // xoa cap ptu co key x khoi map
        map.clear();// don map

        // duyet map:
        // Lay ra cac Entry cua map
        // Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet(); tra ve cac ptu trong map
        Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer,Integer> entry: entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //LinkedHashMap : xep theo thu tu them vao
        // cac ham giong voi HashMap
        //Khai bao: 
        LinkedHashMap<Integer,Integer> map2 = new LinkedHashMap<Integer,Integer>();

        // TreeMap: xep key theo thu tu tang dan
        // tim kiem = log(N)
        //Khai bao:
        TreeMap<Integer,Integer> map3 = new TreeMap<Integer,Integer>();
    }
}
