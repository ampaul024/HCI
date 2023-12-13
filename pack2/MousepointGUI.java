package pack2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;


public class MousepointGUI extends MouseInputAdapter{
    private JFrame frame;
    private JLabel label;
    
    public static void main(String[] args) {
        MousepointGUI gui = new MousepointGUI();
        
        
       
    }
    
    public MousepointGUI(){
        
        label = new JLabel ("Move the mouse over me");
        
        label.addMouseListener(this);
        label.addMouseMotionListener(this);
        
        ClickListen cListener = new ClickListen();
        
        label.addMouseListener(cListener);
        label.addMouseMotionListener(cListener);
        
        frame = new JFrame ("Mouse Listen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension (200,100));
        frame.add(label);
        frame.setVisible(true);
        
      
      
        
    }
    
    
    @Override
    public void mouseMoved(MouseEvent event){
        
        label.setText("(" + event.getX() + "." + event.getY() + ")");
        
    }
    
}