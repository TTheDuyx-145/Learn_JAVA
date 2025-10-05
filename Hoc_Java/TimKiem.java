import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TimKiem {

    // Binary Search : ap dung cho mang tang dan
    public static boolean binarySearch(int n, int x, ArrayList<Integer> arr) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x)
                return true;
            else if (arr.get(mid) > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }

        });
        // Binary Search : Ham co san (.) java -> Arrays.binarySearch(a[], key)
        System.out.println(binarySearch(n, 10, arr));
        
    }
}
