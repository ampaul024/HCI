package SSG;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.*;

public class setA {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Silly String Game");

        JPanel p = new JPanel();

        JButton UC = new JButton("Upper Case");
        JTextField txt = new JTextField(10);
        JButton LC = new JButton("Lower Case");

        frame.setSize(250, 125);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        p.setLayout(new BorderLayout());

        UC.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                String text = txt.getText();
                txt.setText(text.toUpperCase());
            }

        });

        LC.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                String text1 = txt.getText();
                txt.setText(text1.toLowerCase());
            }
        });

        frame.add(p);
        p.add(UC, BorderLayout.NORTH);
        p.add(txt, BorderLayout.CENTER);
        p.add(LC, BorderLayout.SOUTH);

    }

}
