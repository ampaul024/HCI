package pack2;


import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputAdapter;


public class ClickListen extends MouseInputAdapter {
    
    @Override
    public void mousePressed (MouseEvent event){
        
        JOptionPane.showMessageDialog(null, "Mouse pressed at position("+ event.getX()+ "," + event.getY());
        
    }
}