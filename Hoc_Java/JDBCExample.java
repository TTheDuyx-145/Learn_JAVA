import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCExample {
    // url, name,password
    private static String url = "jdbc:mysql://localhost:3306/northwind?autoReconnect=true&useSSL=false";
    private static String username = "root";
    private static String password = "Khunglong25$";
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        // nap Driver
        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver mới
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner sc = new Scanner(System.in);
        Connection con = getConnection();
        if (con != null) {
           Statement stmt = con.createStatement();
//
//            // Thêm bản ghi mới
           int row = stmt.executeUpdate(
               "INSERT INTO Customers (CustomerID, CustomerName, ContactName, Address, City, PostalCode, Country) " +
               "VALUES (9999,'Nguyen Van Nam','Nam','Hai Duong','Hai Duong',2003,'VN')"
           );
//            // Xoa ban ghi
           int row1 = stmt.executeUpdate("DELETE FROM Customers WHERE CustomerID = 9999");
           System.out.println("Rows inserted: " + row1);
//
//            // Truy vấn dữ liệu
           ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");
           while (rs.next()) {
               System.out.println(
                   rs.getInt(1) + " " +
                   rs.getString(2) + " " +
                   rs.getString(3) + " " +
                   rs.getString(4) + " " +
                   rs.getString("City")
               );
           }
            
            
            // Pro up: Co the truyen du lieu can vao hoac nhap tu ban phim
           PreparedStatement stmt1 = con.prepareStatement("SELECT * FROM Customers WHERE CustomerID >= ? AND Country = ?");
           stmt1.setInt(1, 50 );
           stmt1.setString(2,"USA");
            // Nhap tu ban phim:
            PreparedStatement stmt1 = con.prepareStatement("INSERT INTO Customers VALUES(?,?,?,?,?,?,?)");
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < n; i++){
                int id = Integer.parseInt(sc.nextLine());
                String name = sc.nextLine();
                String ContactName = sc.nextLine();
                String address = sc.nextLine();
                String City = sc.nextLine();
                String code = sc.nextLine();
                String country = sc.nextLine();
                stmt1.setInt(1, id);
                stmt1.setString(2, name);
                stmt1.setString(3, ContactName);
                stmt1.setString(4, address);
                stmt1.setString(5, City);
                stmt1.setString(6, code);
                stmt1.setString(7, country);
                stmt1.executeUpdate();
            }
            ResultSet rs1 = stmt1.executeQuery();
            while (rs1.next()) {
                System.out.println(
                    rs1.getInt(1) + " " +
                    rs1.getString(2) + " " +
                    rs1.getString(3) + " " +
                    rs1.getString(4) + " " +
                    rs1.getString("City") + " " +
                    rs1.getString("Country")
                );
            }
            
            // Đóng tài nguyên
            rs1.close();
            stmt1.close();
            con.close();
        } else {
            System.out.println("Failed to connect!");
        }
    }
}
