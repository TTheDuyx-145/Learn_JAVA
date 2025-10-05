import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout {
    // BorderLayout: chia Frame thanh 5 phan
    // NORTH, SOUTH, EAST,WEST, CENTER
    // co phap frame.setLayout(new BorderLayout())
    // frame.add(pn, BorderLayout.(huong))

    // GridLayout : chia frame thanh so hanh va so cot
    // cu phap frame.setLayout(new GridLayout(hang, cot))
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton[] btn = new JButton[64];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                btn[i * 8 + j] = new JButton();
                if ((i + j) % 2 == 0) {
                    btn[i * 8 + j].setBackground(Color.BLACK);
                } else {
                    btn[i * 8 + j].setBackground(Color.WHITE);
                }
            }
        }

        frame.setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 64; i++) {
            frame.add(btn[i]);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
