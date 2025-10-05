
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JframeExample {
    public static void main(String[] args) {
        // tao frame
        JFrame jframe = new JFrame("JFrame Example");

        // tao botton
        JButton button = new JButton("Click");
        button.setBounds(100, 150, 80, 30);

        // tao label
        // JLabel lable = new JLabel("XIN CHAO GUI");
        // lable.setBounds(100, 50, 100, 30);

        // jtextfield : hien thi , chinh sua noi dung tren 1 dong
        JTextField used = new JTextField("");
        JTextField pass = new JTextField();
        used.setBounds(100, 50, 100, 30);
        pass.setBounds(100, 100, 100, 30);

        // them su kien cho button
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(used.getText());
                System.out.println(pass.getText());
            }

        });

        //Area : hien thi chinh sua nd tren nhieu dong
        JTextArea jta = new JTextArea();
        jta.setBounds(100,200,100, 50);;
        jta.setLineWrap(true); // tu dong xuong dong
        jta.setWrapStyleWord(true); // goi tu khi xuong dong


        // PassWordField : password -> truyen thanh dau *
        JPasswordField jpw = new JPasswordField();
        jpw.setBounds(50, 50, 50, 30); 
        jpw.getPassword();// lay nd tu pw char ve mang char
        // chuen thanh String
        //-> String.valueof(char[])

        // OptionPane : hien thi thong bao
        // JOptionPane.showMessageDialog(frame, "thong bao muon hien");


        // them..
        jframe.add(button);
        // jframe.add(lable);
        jframe.add(used);
        jframe.add(pass);

        // chinh sua cho frame
        jframe.setSize(300, 200); // dinh dang chiều rông va chiều cao
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ket thuc chuong trinh
        jframe.setLocationRelativeTo(null); // hien thi gui o giua man hinh
        jframe.setLayout(null);
        jframe.setVisible(true);// hien thi
    }
}