
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author COMLAB101
 */
public class TP {
    private JFrame frame;
    public JTextField field_num1;
    public JTextField field_num2;
    public JButton button_operation;
    public JButton button_clear;
    public JLabel label;

    public TP() {
        frame = new JFrame("MegaCalc");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(new Dimension(500, 300));
        frame.setLocationRelativeTo(null);

        field_num1 = new JTextField();
        frame.add(field_num1);
        field_num1.setSize(100, 50);
        field_num1.setLocation(80, 80);

        field_num2 = new JTextField();
        frame.add(field_num2);
        field_num2.setSize(100, 50);
        field_num2.setLocation(300, 80);

        button_operation = new JButton("+");
        frame.add(button_operation);
        button_operation.setSize(80, 50);
        button_operation.setLocation(200, 80);

        button_clear = new JButton("clear");
        frame.add(button_clear);
        button_clear.setSize(500, 20);
        button_clear.setLocation(0, 220);

        label = new JLabel("");
        label.setSize(100, 100);
        label.setLocation(0, 100);
        frame.add(label);

        frame.setVisible(true);

        button_operation.addActionListener(new compute());
        button_clear.addActionListener(new clear());
    }

    class compute implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            int test = (Integer.parseInt(field_num1.getText()) + Integer.parseInt(field_num2.getText()));
            label.setText(String.valueOf(test));
        }

    }

    class clear implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("");
            field_num1.setText("0");
            field_num2.setText("0");
        }

    }

    public static void main(String[] args) {
        TP tp = new TP();
    }

}
