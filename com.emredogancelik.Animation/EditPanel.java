package Animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class EditPanel extends JPanel {

    public EditPanel() {
        setBackground(new Color(255, 255, 255));
        setOpaque(false);
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
                setBackground(new Color(237, 237, 237));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(new Color(255, 255, 255));
            }

        });
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Dimension arcs = new Dimension(25, 25); //Border corners arcs {width,height}, change this to whatever you want
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draws the rounded panel with borders.
        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width - 2, height - 2, arcs.width, arcs.height);//paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width - 2, height - 2, arcs.width, arcs.height);//paint border
    }

}
