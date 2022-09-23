package Animation;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class EditLabel extends JLabel {

    public EditLabel() {
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setForeground(new Color(90, 90, 90));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setForeground(new Color(0, 0, 0));
            }
        });
    }

}
