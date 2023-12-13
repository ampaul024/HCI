package pack;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseGUI {
    
      public static void main(String[] args) {
        
        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.setSize(new Dimension(200, 100));
        f.setTitle("This is a frame");

        JLabel Label = new JLabel();
        Label.setText("Move the mouse over me");
        f.add(Label);

        MouseGUI ML =  new MouseGUI();
        
        Label.addMouseListener((MouseListener) ML);
        Label.addMouseMotionListener((MouseMotionListener) ML);


        f.setVisible(true);

}
}