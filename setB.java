
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class setB {

    private JFrame frame;
    public JTextField txt;
    public JButton UC;
    public JButton LC;
    public JLabel label;

    public setB() {

        frame = new JFrame("Silly String Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(new Dimension(275, 150));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        txt = new JTextField();
        frame.add(txt);
        txt.setSize(200, 20);
        txt.setLocation(10, 40);

        UC = new JButton("Upper Case");
        frame.add(UC);
        UC.setSize(150, 20);
        UC.setLocation(10, 15);

        LC = new JButton("LowerCase");
        frame.add(LC);
        LC.setSize(150, 20);
        LC.setLocation(10, 65);

        UC.addActionListener(new up());
        LC.addActionListener(new low());

    }

    class up implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String text = txt.getText();
            txt.setText(text.toUpperCase());
        }

    }

    class low implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String text1 = txt.getText();
            txt.setText(text1.toLowerCase());
        }

        public static void main(String[] args) {
            setB jp = new setB();
        }
    }
}