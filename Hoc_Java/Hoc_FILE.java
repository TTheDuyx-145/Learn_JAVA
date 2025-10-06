import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hoc_FILE {
    public static void main(String[] args) {
        // Khoi tao:
        // File file = new File("input.txt");
        try {
            // if (file.createNewFile()) {
            // System.out.println("File vua dc tao");
            // } else {
            // System.out.println("File da co san");
            // }

            // ghi file
            FileWriter wirter = new FileWriter("input.txt");
            wirter.write("Hoc lap trinh java");
            wirter.close();

            // doc file
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);
            String s = sc.nextLine();
            System.out.println(s);
            sc.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

        

    }
}
