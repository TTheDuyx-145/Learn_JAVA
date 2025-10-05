import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SapXep {
    public static int tcs(int n){
        int res = 0;
        while(n != 0){
            res += n % 10;
            n /= 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // Arays.sort
        Arrays.sort(a); //tang dan
        // trong doan
        Arrays.sort(a,0, n);

        // dung cmp -> chi ap  dung voi  kieu  du lieu  Wrapper(doi tuong)
        Integer[] b = new Integer[n];
        Arrays.sort(b, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                // -1 neu muon o1  truoc o2
                // 1 neu muon o1 sau o2
                if(tcs(o1) > tcs(o2)) return -1;
                return 1;
            }
        });
        // neu cung tieu chi  thi giu nguyen thu tu ban dau 
        
    }
}
