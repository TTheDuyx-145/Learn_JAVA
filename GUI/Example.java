import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel");
        // panel
        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        JButton btn1 = new JButton("Panel1");
        JButton btn2 = new JButton("Panel2");
        btn1.setBounds(50, 50, 80, 30);
        btn2.setBounds(50, 50, 100, 30);
        pn1.setBounds(50, 50, 200, 200);
        pn2.setBounds(260, 50, 200, 200);

        // BorderLayout(chia Frame thanh 4 phan SOUTH, EAST, WEST, NORTH)
        // cu phap
        frame.add(btn1, BorderLayout.SOUTH);
        pn1.setBackground(Color.RED);
        pn2.setBackground(Color.GREEN);
        pn1.add(btn1);
        pn2.add(btn2);
        frame.add(pn1);
        frame.add(pn2);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
