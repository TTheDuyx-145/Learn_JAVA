import java.util.Date;
// Đa hình cho phép
// bạn tham chiếu một biến thuộc kiểu dữ liệu của lớp cơ sở
// tới đối tượng của một lớp con.

// +phuong thuc thuc truu tuong bat buoc phai nam trong lop truu tuong
// +lop truu tuong co the ko can co phuong thuc truu tuong
// +lop con ke thua tu lop cha la lop truu tuong bat buoc
// phai cai dat cac phuong thuc truu tuong cua lop cha "mot cach cu the"

// note : Trong thiết kế lớp với UML lớp trừu tượng và phương thức trừu tượng được in nghiêng.
abstract class GeometricOject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricOject() {
    }

    public GeometricOject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date(System.currentTimeMillis());
    }

    // hai phuon thuc truu tuong - dien tich va chu vi
    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends GeometricOject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    // cai dat phuong thuc truu tuong tu lop cha
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}

class Rectangle extends GeometricOject {
    private double width, height;

    public Rectangle() {
    };

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}

// interface
// dac diem:
// + Interface trong Java có cấu trúc tương tự như một lớp nhưng
// "chỉ chứa các hằng số và phương thức trừu tượng"
// + Interface có vai trò tạo ra những phương thức, hành vi
// chung cho các lớp tương tự như Lớp trừu tượng.
// + Bạn không thể tạo ra một đối tượng từ interface thông qua
// toán tử new.
// + Mối quan hệ giữa lớp và interface được gọi là kế thừa
// interface, để một lớp kế thừa interface ta sử dụng từ khóa implements.

// note: Khi một lớp cài đặt một interface thì mối quan hệ này được biểu diễn
// bởi
// mũi tên nét đứt từ lớp tới interface.

interface DrawBle {
    public abstract String howToEat();
}

class Dog implements DrawBle {
    @Override
    public String howToEat() {
        return "Dog Eat";
    }
}

// Da ke thua : Trong Java không hỗ trợ đa kế thừa thông qua lớp nhưng có thể thông qua
// interface, một lớp có thể cài đặt được nhiều interface.

interface Flyable{
    public abstract void fly();
}
interface Runable{
    public abstract void run();
}

class Birt implements Flyable, Runable{
    @Override
    public void fly(){
        System.out.println("Bay");
    }
    @Override
    public void run(){
        System.out.println("Chay");
    }
}
public class DaHinh {
    public static boolean equalArea(GeometricOject o1, GeometricOject o2) {
        return o1.getArea() == o2.getArea();
    }

    public static void display(GeometricOject o) {
        System.out.println(o.getArea() + " " + o.getPerimeter());
    }

    public static void main(String[] args) {
        GeometricOject p1 = new Circle("red", true, 5);
        GeometricOject p2 = new Rectangle("Green", true, 3, 4);
        System.out.println(equalArea(p1, p2));
        display(p1);
        display(p2);
    }

}