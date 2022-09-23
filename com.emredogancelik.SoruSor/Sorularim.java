package SoruSor;

import Animation.ImageResizer;
import DatabaseChecking.DBClass;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class Sorularim extends javax.swing.JFrame {

    private DBClass db;
    private int soru_id;
    private ImageResizer imgResizer;
    private ImageResizer imgAnswer;

    public Sorularim(DBClass db) {
        this.db = db;
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        UIManager.put("Button.arc", 25);
        initComponents();
        db.initList(list1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        list1 = new java.awt.List();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        soru = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cevap = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        soru_metni = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cevap_metni = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        list1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane1.setDividerLocation(255);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(641, 200));

        soru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addPic.png"))); // NOI18N
        soru.setText(" ");
        soru.setMinimumSize(new java.awt.Dimension(111, 100));
        soru.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                soruMouseDragged(evt);
            }
        });
        soru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                soruMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(soru);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
        );

        jSplitPane1.setTopComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 10));

        cevap.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cevap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cevap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/noCevap.png"))); // NOI18N
        cevap.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cevapMouseDragged(evt);
            }
        });
        cevap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cevapMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(cevap);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jSplitPane1.setRightComponent(jPanel4);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setOpaque(false);

        soru_metni.setEditable(false);
        soru_metni.setColumns(20);
        soru_metni.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        soru_metni.setLineWrap(true);
        soru_metni.setRows(5);
        soru_metni.setWrapStyleWord(true);
        soru_metni.setOpaque(false);
        jScrollPane2.setViewportView(soru_metni);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Soru Metnin", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setOpaque(false);

        cevap_metni.setEditable(false);
        cevap_metni.setColumns(20);
        cevap_metni.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        cevap_metni.setLineWrap(true);
        cevap_metni.setRows(5);
        cevap_metni.setWrapStyleWord(true);
        cevap_metni.setOpaque(false);
        jScrollPane3.setViewportView(cevap_metni);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cevap Metni", jPanel5);

        jButton1.setBackground(new java.awt.Color(0, 35, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Seçili soruyu anladım silebilirsin.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jSplitPane1)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        soru_id = Integer.valueOf(list1.getSelectedItem().substring(10, list1.getSelectedItem().length()));
        initImage(soru_id);
        soru_metni.setText(db.getSoru_metni());
        cevap_metni.setText(db.getCevap_metni());
    }//GEN-LAST:event_list1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int id = Integer.valueOf(list1.getSelectedItem().substring(10, list1.getSelectedItem().length()));
            db.addUpdateQuery("delete from Cevaplar where cevap_id=" + id);//cevabı siliyor
            db.addUpdateQuery("delete from Soru where soru_id=" + id);//soruyu siliyor
            list1.remove(list1.getSelectedIndex());//listeden siliyor
            AnaEkran.haberVerici.setText("Seçilen soru silindi.");//silindiğini bildiriyor
            AnaEkran.haberDialog.setVisible(true);//dialog çıkıyor.
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        db.setShow(false);
    }//GEN-LAST:event_formWindowClosing

    private void soruMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soruMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_soruMousePressed

    private void soruMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soruMouseDragged
        if (x > evt.getX()) {
            jScrollPane1.getHorizontalScrollBar().setValue(getHorizontalValue(true, jScrollPane1));
        } else if (x < evt.getX()) {
            jScrollPane1.getHorizontalScrollBar().setValue(getHorizontalValue(false, jScrollPane1));
        } else {
            jScrollPane1.getHorizontalScrollBar().setValue(jScrollPane2.getHorizontalScrollBar().getValue());
        }
        if (y > evt.getY()) {
            jScrollPane1.getVerticalScrollBar().setValue(getVerticalValue(true, jScrollPane1));
        } else if (y < evt.getY()) {
            jScrollPane1.getVerticalScrollBar().setValue(getVerticalValue(false, jScrollPane1));
        } else {
            jScrollPane1.getVerticalScrollBar().setValue(jScrollPane2.getVerticalScrollBar().getValue());
        }
    }//GEN-LAST:event_soruMouseDragged

    private void cevapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cevapMousePressed
        /*xCevap = evt.getX();
        yCevap = evt.getY();*/
    }//GEN-LAST:event_cevapMousePressed

    private void cevapMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cevapMouseDragged
        System.out.println(xCevap + " : " + evt.getX());

        if (xCevap < evt.getX()) {
            jScrollPane4.getHorizontalScrollBar().setValue(getHorizontalValue(true, jScrollPane4));
        } else if (xCevap > evt.getX()) {
            jScrollPane4.getHorizontalScrollBar().setValue(getHorizontalValue(false, jScrollPane4));
        } else {
            jScrollPane4.getHorizontalScrollBar().setValue(jScrollPane2.getHorizontalScrollBar().getValue());
        }
        if (yCevap < evt.getY()) {
            jScrollPane4.getVerticalScrollBar().setValue(getVerticalValue(true, jScrollPane4));
        } else if (yCevap > evt.getY()) {
            jScrollPane4.getVerticalScrollBar().setValue(getVerticalValue(false, jScrollPane4));
        } else {
            jScrollPane4.getVerticalScrollBar().setValue(jScrollPane2.getVerticalScrollBar().getValue());
        }
        xCevap = evt.getX();
        yCevap = evt.getY();
    }//GEN-LAST:event_cevapMouseDragged
    private int getVerticalValue(boolean upper, JScrollPane pane) {
        if (upper) {
            return pane.getVerticalScrollBar().getValue() + 2;
        } else {
            return pane.getVerticalScrollBar().getValue() - 2;
        }
    }

    private int getHorizontalValue(boolean upper, JScrollPane pane) {
        if (upper) {
            return pane.getHorizontalScrollBar().getValue() + 2;
        } else {
            return pane.getHorizontalScrollBar().getValue() - 2;
        }
    }
    private int x, y, xCevap, yCevap;

    private void initImage(int index) {
        db.queryImage(index);
        db.queryImageForAnswer(index);
        soru.setIcon(db.getIconQuestion());
        imgResizer = null;
        imgResizer = new ImageResizer(soru, db.getIconQuestion());
        if (db.getIconAnswer() != null) {
            cevap.setText("");
            cevap.setIcon(db.getIconAnswer());
            imgAnswer = null;
            imgAnswer = new ImageResizer(cevap, db.getIconAnswer());
        } else {
            System.out.println("null değer");
            cevap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/noCevap.png"))); // NOI18N

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cevap;
    private javax.swing.JTextArea cevap_metni;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.List list1;
    private javax.swing.JLabel soru;
    private javax.swing.JTextArea soru_metni;
    // End of variables declaration//GEN-END:variables
}
