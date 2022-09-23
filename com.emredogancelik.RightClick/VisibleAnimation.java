package RightClick;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPanel;

public class VisibleAnimation {

    private int x = 150, y = 255;
    private JPanel panel;

    public JPanel getPanel() {
        return panel;
    }

    public VisibleAnimation(JPanel panel) {
        this.panel = panel;
        this.panel.setSize(x, y);
        this.panel.setVisible(true);

    }

    public void animation() {
        this.panel.setVisible(true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < x; i += 4) {
                    panel.setSize(i, y);
                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {
                    }
                }
            }
        }).start();

    }

}
