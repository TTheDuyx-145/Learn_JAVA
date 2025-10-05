import java.util.Scanner;

public class MangMotChieu {

    public static int maxn = 1001;
    public static int[] a = new int[maxn];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n]; // -> khoi tao bang 0 :  tao mot mang cap phat dong
        // bien tham chieu 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i : a)
            System.out.print(i + " ");
    }
}
