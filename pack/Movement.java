package pack;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputAdapter;

public class Movement extends MouseInputAdapter {

    @Override
    public void mouseEntered(MouseEvent event) {

        JOptionPane.showMessageDialog(null, "Mouse Entered");
    }
}