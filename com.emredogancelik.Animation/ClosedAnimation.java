package Animation;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class ClosedAnimation {

    private JLabel label;
    private boolean isExited = false;
    private boolean isEntered = false;
    private int color = 255;

    public ClosedAnimation(JLabel label) {
        this.label = label;
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                isExited = false;
                isEntered = true;
                new Thread(() -> {
                    for (; color > 0; color -= 5) {
                        if (isExited) {
                            break;
                        }
                        label.setForeground(new Color(255, color, color));
                        try {
                            Thread.sleep(3);
                            if (color % 20 == 0) {
                                System.gc();
                            }
                        } catch (InterruptedException e1) {
                        }
                    }
                }).start();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                isEntered = false;
                isExited = true;
                new Thread(() -> {
                    for (; color < 255; color += 5) {
                        if (isEntered) {
                            break;
                        }
                        label.setForeground(new Color(255, color, color));
                        try {
                            Thread.sleep(3);
                            if (color % 20 == 0) {
                                System.gc();
                            } else {
                            }
                        } catch (InterruptedException e1) {
                        }
                    }
                }).start();
            }
        });
    }

}
