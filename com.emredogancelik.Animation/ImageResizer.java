package Animation;

import java.awt.Image;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageResizer {

    private Image image;
    private ImageIcon icon;
    private int mouseWidth = 1;
    private JLabel label;
    private boolean resized = true;

    public ImageResizer(JLabel getLabel, ImageIcon file) {
        icon = file;
        image = icon.getImage();
        label = getLabel;
        this.label.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (image != null && resized) {
                            resized = false;
                            if (e.getWheelRotation() < 0) {
                                for (int i = 3; i > 0; i--) {
                                    mouseWidth -=2;
                                    image = icon.getImage().getScaledInstance(icon.getIconWidth() - icon.getIconWidth() * mouseWidth / 100, icon.getIconHeight() - icon.getIconHeight() * mouseWidth / 100, Image.SCALE_AREA_AVERAGING);
                                    try {
                                        Thread.sleep(7);
                                    } catch (Exception e) {
                                    }
                                }

                            } else {
                                for (int i = 3; i > 0; i--) {
                                    if (mouseWidth < 100) {
                                        mouseWidth +=2;
                                        if (mouseWidth > 100) {
                                            mouseWidth = 99;
                                        }
                                    }
                                    image = icon.getImage().getScaledInstance(icon.getIconWidth() - icon.getIconWidth() * mouseWidth / 100, icon.getIconHeight() - icon.getIconHeight() * mouseWidth / 100, Image.SCALE_AREA_AVERAGING);
                                }
                                try {
                                    Thread.sleep(7);
                                } catch (Exception e) {
                                }
                            }
                            resized = true;
                        }
                        if (image != null) {
                            label.setIcon(new javax.swing.ImageIcon(image));
                        }
                    }
                }).start();
            }
        });
    }
}
