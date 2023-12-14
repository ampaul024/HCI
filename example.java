import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Case Conversion Example");
        JPanel panel = new JPanel();

        JTextField textField = new JTextField(20);
        JButton uppercaseButton = new JButton("Uppercase");
        JButton lowercaseButton = new JButton("Lowercase");

        // ActionListener for Uppercase Button
        uppercaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText(text.toUpperCase());
            }
        });

        // ActionListener for Lowercase Button
        lowercaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText(text.toLowerCase());
            }
        });

        panel.add(textField);
        panel.add(uppercaseButton);
        panel.add(lowercaseButton);

        frame.add(panel);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}