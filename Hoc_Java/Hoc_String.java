import java.util.Scanner;
import java.util.StringTokenizer;

public class Hoc_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // *
        // doc mot tu
        String s = sc.next();
        // doc mot chuoi
        String str = sc.nextLine();
        // xly troi lenh
        sc.nextLine();
        // Tra ve sl
        str.length();
        // truy cap
        str.charAt(2); // chuy cap vao ktu co chi so 2 trong xau
        // duyet bang for each
        for (char c : str.toCharArray()) {
            System.out.println(c);
        }
        // chuyen tat ca thanh in hoa
        str = str.toUpperCase();
        // chuyen tat ca thanh in thuong
        str = str.toLowerCase();
        // noi 2 xau
        str = str.concat(s);
        str += s;
        // Ham compareTo() and compareToIgnoreCase()
        // compareTo(): ss hai xau theo thu tu dien
        // bang nhau tra ve 0 va tra ve so am neu xau hien tai nho hon sau ss
        // compareToIgnoreCase(): bo qua in hoa va in thuong khi ss
        str.compareTo(s);
        str.compareToIgnoreCase(s);
        // subString : tra ve xau con
        str = str.substring(5);// tin tu chi so 5 -> cuoi day
        str = str.substring(2, 5);
        // chua (check xau con)
        str.contains("s");
        // **
        // tach cac tu trong xau
        // +) split tach cac tu trong xau theo "dau cach"
        // ham tra ve mot mang chua cac tu trong xau
        // +) nhieu dau cach split("\\s+");
        // khoi tao:
        String[] arr = str.split(" ");
        String[] a = str.split("\\s+"); // neu co nhieu dau cach
        // duyet
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String st : arr) {
            System.out.println(st);
        }
        // replace('x', 'y') thay the all ktu x thanh ktu y
        str.replace('x', 'y');
        // StringTokenizer
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            // lay tu ra st.nextToken
            System.out.println(st.nextToken());
        }

        // StringBilder
        StringBuilder sb = new StringBuilder(str);
        // append : nd vao xau
        sb.toString(); // chuyen thanh sb thanh string
        sb.deleteCharAt(0); // xoa mot vtri bat ky trong xau

        // chuyen xau thanh so
        Integer.parseInt(str);
        Long.parseLong(str);
    }
}
