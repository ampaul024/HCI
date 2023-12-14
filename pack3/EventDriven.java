package pack3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDriven extends JFrame {

    // made a 2 frame for the input and output UI
    JFrame frame = new JFrame("Input");
    JFrame frame2 = new JFrame("Output");

    // two panels for the Outputs
    JPanel pan = new JPanel();
    JPanel pan2 = new JPanel();

    // made 2 sets of label for the input and output
    JLabel lab1 = new JLabel("First Name:");
    JLabel lab2 = new JLabel("Last Name:");
    JLabel lab3 = new JLabel("Middle Name");
    JLabel lab4 = new JLabel("Mobile Number");
    JLabel lab5 = new JLabel("Email Address");

    JLabel lab6 = new JLabel("First Name:");
    JLabel lab7 = new JLabel("Last Name:");
    JLabel lab8 = new JLabel("Middle Name:");
    JLabel lab9 = new JLabel("Mobile Number:");
    JLabel lab10 = new JLabel("Email Address:");

    // Label for each textfields i will use for the user
    JLabel Fname = new JLabel();
    JLabel Lname = new JLabel();
    JLabel Mname = new JLabel();
    JLabel Num = new JLabel();
    JLabel Add = new JLabel();

    // this is the textfield i made so the user can input
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    JTextField txt4 = new JTextField();
    JTextField txt5 = new JTextField();

    // the three buttons of my programs
    JButton Sub = new JButton("Submit");
    JButton CA = new JButton("Clear All");
    JButton OK = new JButton("Okay");

    public EventDriven() {
        // sets all the txtfield and labels on the middle with same sizes
        txt1.setPreferredSize(new Dimension(200, 24));
        txt2.setPreferredSize(new Dimension(200, 24));
        txt3.setPreferredSize(new Dimension(200, 24));
        txt4.setPreferredSize(new Dimension(200, 24));
        txt5.setPreferredSize(new Dimension(200, 24));

        Fname.setPreferredSize(new Dimension(200, 24));
        Lname.setPreferredSize(new Dimension(200, 24));
        Mname.setPreferredSize(new Dimension(200, 24));
        Num.setPreferredSize(new Dimension(200, 24));
        Add.setPreferredSize(new Dimension(200, 24));

        // give a varName for my button so i can implements them and give function
        Sub b1 = new Sub();
        CA b2 = new CA();
        OK b3 = new OK();

        Sub.addActionListener(b1);
        CA.addActionListener(b2);
        OK.addActionListener(b3);

        // this part all i do is add them to my panels
        pan.setLayout(new FlowLayout());
        pan.add(lab1);
        pan.add(txt1);
        pan.add(lab2);
        pan.add(txt2);
        pan.add(lab3);
        pan.add(txt3);
        pan.add(lab4);
        pan.add(txt4);
        pan.add(lab5);
        pan.add(txt5);
        pan.add(Sub);
        pan.add(CA);

        // using frame i add the panels
        frame.add(pan);
        frame.setSize(250, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // same as i do on the first panel
        pan2.setLayout(new FlowLayout());
        pan2.add(lab6);
        pan2.add(Fname);
        pan2.add(lab7);
        pan2.add(Lname);
        pan2.add(lab8);
        pan2.add(Mname);
        pan2.add(lab9);
        pan2.add(Num);
        pan2.add(lab10);
        pan2.add(Add);
        pan2.add(OK);

        frame2.add(pan2);
        frame2.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // this time i implements all the button, like i said to give them a
    // functionable programs
    private class Sub implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String Fn = txt1.getText();
            Fname.setText(Fn);

            String Ln = txt2.getText();
            Lname.setText(Ln);

            String Mn = txt3.getText();
            Mname.setText(Mn);

            String Nb = txt4.getText();
            Num.setText(Nb);

            String ad = txt5.getText();
            Add.setText(ad);

            Sub.setEnabled(false);
            frame2.setVisible(true);
        }
    }

    private class CA implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Clear();
        }
    }

    private class OK implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Clear();
            Sub.setEnabled(true);
            frame2.dispose();

        }
    }

    public void Clear(){
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
        txt4.setText(null);
        txt5.setText(null);
    }