import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Table");
        Object[][] row = {
                { "SV01", "Nguyen Van A", 3.1 },
                { "SV02", "Nuyen Van B", 3.2 },
                { "SV03", "Nguyen Van C", 3.8 }
        };
        Object[] cols = { "ID", "Ho ten", "GPA" };
        // table
        JTable table = new JTable(row, cols);
        // giup hien thi va cuon len xuong duoc
        JScrollPane SPane = new JScrollPane(table);
        // lay ra noi dung ra
        System.out.println(table.getValueAt(3, 1));
        // sua noi dung
        table.setValueAt("Nguyen Van Nam", 3, 1);
        jframe.add(SPane);
        jframe.setSize(300, 200); // dinh dang chiều rông va chiều cao
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ket thuc chuong trinh
        jframe.setLocationRelativeTo(null); // hien thi gui o giua man hinh
        jframe.setVisible(true);// hien thi
        // sap  xep
        table.setAutoCreateRowSorter(true);
        // duyet table
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                System.out.println(table.getValueAt(i, j));
            }
        }

    }
}
