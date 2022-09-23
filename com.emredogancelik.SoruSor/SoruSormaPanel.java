package SoruSor;

import Animation.ImageResizer;
import DatabaseChecking.DBClass;
import DatabaseChecking.QuestionClass;
import FilesFolder.FileSelect;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Insets;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SoruSormaPanel extends javax.swing.JPanel {

    private DBClass db;
    private boolean isFirst = true;
    private FileSelect files;
    private String dosya = "";
    private ImageResizer imgResizer;
    private QuestionClass qc;

    public SoruSormaPanel(DBClass db) {
        setSize(851, 542);
        setVisible(false);
        try {

            UIManager.put("Button.arc", 25);
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("ScrollBar.thumbArc", 5);
            UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));
            UIManager.put("ScrollBar.width", 13);

        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        this.db = db;

        initComponents();

        jScrollPane2.getVerticalScrollBar().setUnitIncrement(16);

        files = new FileSelect();
        resimEkle.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                    List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
                    for (File file : droppedFiles) {
                        dosya = file.getPath();
                        qc = null;
                        imgResizer = null;
                        imgResizer = new ImageResizer(resimEkle, new ImageIcon(dosya));
                        resimEkle.setIcon(new ImageIcon(dosya)); // NOI18N
                        qc = new QuestionClass(db, dosya);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        geriDon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resimEkle = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jSplitPane1.setBackground(new java.awt.Color(0, 35, 102));
        jSplitPane1.setDividerLocation(600);

        jPanel2.setMinimumSize(new java.awt.Dimension(10, 10));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Soruyla ilgili metninizi lütfen buraya yazınız.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(0, 35, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Soru Sor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematik", "Fizik", "Kimya", "Türk Dili ve Edebiyatı", "Tarih", "Coğrafya", "Geometri", "Biyoloji" }));

        geriDon.setBackground(new java.awt.Color(0, 35, 102));
        geriDon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        geriDon.setForeground(new java.awt.Color(255, 255, 255));
        geriDon.setText("Geri dön");
        geriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(geriDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jSplitPane1.setRightComponent(jPanel2);

        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jScrollPane2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseDragged(evt);
            }
        });

        resimEkle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resimEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addPic.png"))); // NOI18N
        resimEkle.setText(" ");
        resimEkle.setMinimumSize(new java.awt.Dimension(10, 10));
        resimEkle.setName(""); // NOI18N
        resimEkle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                resimEkleMouseDragged(evt);
            }
        });
        resimEkle.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                resimEkleMouseWheelMoved(evt);
            }
        });
        resimEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resimEkleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                resimEkleMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(resimEkle);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resimEkleMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_resimEkleMouseWheelMoved
        /*if (scaleImage != null) {
            if (evt.getWheelRotation() < 0) {

                if (mouseWidth > 0) {
                    mouseWidth -= 5;
                    if (mouseWidth < 0) {
                        mouseWidth = 0;
                    }
                }
                System.out.println(icon.getIconWidth() * mouseWidth / 100);
                scaleImage = icon.getImage().getScaledInstance(icon.getIconWidth() - icon.getIconWidth() * mouseWidth / 100, icon.getIconHeight() - icon.getIconHeight() * mouseWidth / 100, Image.SCALE_AREA_AVERAGING);
            } else {

                if (mouseWidth < 100) {
                    mouseWidth += 5;
                    if (mouseWidth > 100) {
                        mouseWidth = 100;
                    }
                }
                scaleImage = icon.getImage().getScaledInstance(icon.getIconWidth() - icon.getIconWidth() * mouseWidth / 100, icon.getIconHeight() - icon.getIconHeight() * mouseWidth / 100, Image.SCALE_AREA_AVERAGING);
            }
        }
        if (scaleImage != null)
        resimEkle.setIcon(new javax.swing.ImageIcon(scaleImage));*/
    }//GEN-LAST:event_resimEkleMouseWheelMoved

    private void resimEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resimEkleMouseClicked
        qc = null;
        imgResizer = null;
        dosya = files.dosyaSec();
        imgResizer = new ImageResizer(resimEkle, new ImageIcon(dosya));
        resimEkle.setIcon(new ImageIcon(dosya)); // NOI18N
        qc = new QuestionClass(db, dosya);
    }//GEN-LAST:event_resimEkleMouseClicked

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        if (isFirst) {
            jTextArea1.setText("");
            isFirst = false;
        }
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
        if (jTextArea1.getText().length() == 0) {
            jTextArea1.setText("Soruyla ilgili metninizi lütfen buraya yazınız.");
            isFirst = true;
        }
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            qc.questionQuery(jTextArea1.getText(), dosya, jComboBox1.getSelectedIndex() + 1, db.getProfile().getId());
            AnaEkran.haberVerici.setText("Sorunuz Başarıyla Eklendi");
            AnaEkran.haberDialog.setVisible(true);
        } catch (IOException ex) {
            AnaEkran.haberVerici.setText("Lütfen resim seçim işlemini doğru yapınız.");
            AnaEkran.haberDialog.setVisible(true);
        } catch (SQLException ex) {
        } catch (NullPointerException ex) {
            AnaEkran.haberVerici.setText("Lütfen tüm kısımları doldurunuz.");
            AnaEkran.haberDialog.setVisible(true);
        }
        resetIcon();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetIcon() {
        jTextArea1.setText("");
        resimEkle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addPic.png"))); // NOI18N
    }

    private void geriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonActionPerformed
        db.setShow(false);
    }//GEN-LAST:event_geriDonActionPerformed

    private void jScrollPane2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseDragged
        //System.out.println("test");
    }//GEN-LAST:event_jScrollPane2MouseDragged

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        System.out.println("test");
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved

    }//GEN-LAST:event_jPanel1MouseMoved

    private void resimEkleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resimEkleMouseDragged
        if (x >evt.getX()) {
            jScrollPane2.getHorizontalScrollBar().setValue(getHorizontalValue(true));
        } else if (x < evt.getX()) {
            jScrollPane2.getHorizontalScrollBar().setValue(getHorizontalValue(false));
        } else {
            jScrollPane2.getHorizontalScrollBar().setValue(jScrollPane2.getHorizontalScrollBar().getValue());
        }
        if (y > evt.getY()) {
            jScrollPane2.getVerticalScrollBar().setValue(getVerticalValue(true));
        } else if (y < evt.getY()) {
            jScrollPane2.getVerticalScrollBar().setValue(getVerticalValue(false));
        } else {
            jScrollPane2.getVerticalScrollBar().setValue(jScrollPane2.getVerticalScrollBar().getValue());
        }

    }//GEN-LAST:event_resimEkleMouseDragged

    private void resimEkleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resimEkleMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_resimEkleMousePressed
    private int x, y;

    private int getVerticalValue(boolean upper) {
        if (upper) {
            return jScrollPane2.getVerticalScrollBar().getValue() + 10;
        } else {
            return jScrollPane2.getVerticalScrollBar().getValue() - 10;
        }
    }

    private int getHorizontalValue(boolean upper) {
        if (upper) {
            return jScrollPane2.getHorizontalScrollBar().getValue() + 10;
        } else {
            return jScrollPane2.getHorizontalScrollBar().getValue() - 10;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton geriDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel resimEkle;
    // End of variables declaration//GEN-END:variables
}
