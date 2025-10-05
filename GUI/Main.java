import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Tạo khung (JFrame)
        JFrame frame = new JFrame("Hello GUI in Java");

        // Nút bấm (JButton)
        JButton button = new JButton("Click me!");
        button.setBounds(100, 100, 120, 40);

        // Label
        JLabel label = new JLabel("Welcome to Java GUI!");
        label.setBounds(90, 50, 200, 30);

        // Thêm vào frame
        frame.add(button);
        frame.add(label);

        // Cài đặt frame
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
