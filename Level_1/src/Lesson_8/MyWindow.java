package Lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        JButton btn1 = new JButton("Кнопка 1");
        JButton btn2 = new JButton("Кнопка 2");
        JButton btn3 = new JButton("Кнопка 3");

        JPanel btnPnl = new JPanel(new GridLayout(3,1));
        btnPnl.add(btn1);
        btnPnl.add(btn2);
        btnPnl.add(btn3);
        add(btnPnl, BorderLayout.SOUTH);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кнопка 1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кнопка 2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кнопка 3");
            }
        });

//        add (btn1, BorderLayout.SOUTH);
//        add(btn2,BorderLayout.NORTH);

/*        JButton[] jbs = new JButton[5];
        for (int i = 0; i < 5; i++) {
            jbs[i] = new JButton("#" + i);
        }
//        setLayout(new BorderLayout());   // выбор компоновщика элементов
        add(jbs[0], BorderLayout.CENTER); // добавление кнопки на форму
        add(jbs[1], BorderLayout.WEST);
        add(jbs[2], BorderLayout.SOUTH);
        add(jbs[3], BorderLayout.NORTH);
        add(jbs[4], BorderLayout.EAST);*/

        setVisible(true);
    }
}
