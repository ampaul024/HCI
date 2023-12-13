package SSG;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class setA implements ActionListener {

    private JFrame frame;
    private JButton UC;
    private JButton LC;
    private JTextField txt;

    public setA(){
    txt = new JTextField(1);
    UC = new JButton("Upper Case");
    LC = new JButton("Lower Case");

    JPanel panel = new JPanel(new GridLayout(3,1));
    panel.add(UC);
    panel.add(txt);
    panel.add(LC);

    UC.setSize(20,200);

    frame = new JFrame("Silly String Game");
    frame.setTitle("Silly String Game");
    frame.setSize(500,500);
    frame.add(panel);
    frame.setVisible(true);

    frame.pack();

    UC.addActionListener((ActionListener)this);
    LC.addActionListener((ActionListener)this);  
    
}

public void actionPerformed(ActionEvent event){

    String UpperCase = UC.getText();
    String toUpperCase (UpperCase);

}
public static void main (String args[]){
    new setA();
}

}

