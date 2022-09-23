 
package SoruSor;

import Animation.ImageResizer;
import DatabaseChecking.DBClass;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.DefaultListModel;
import javax.swing.UIManager;

 
public class SorularimPanel extends javax.swing.JPanel {

    private DBClass db;
    private int soru_id;
    private ImageResizer imgResizer;
    private ImageResizer imgAnswer;
    private DefaultListModel<String> model = new DefaultListModel<>();

    public SorularimPanel(DBClass db) {
        setSize(851, 542);
        setVisible(false);
        this.db = db;
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        UIManager.put("Button.arc", 25);
        initComponents();
        
        //db.initList(model);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        soru = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cevap = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        soru_metni = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cevap_metni = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        geriDon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        list1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane1.setDividerLocation(255);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(641, 200));

        soru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addPic.png"))); // NOI18N
        soru.setText(" ");
        soru.setMinimumSize(new java.awt.Dimension(111, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soru, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(soru, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jSplitPane1.setTopComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 10));

        cevap.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        cevap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cevap.setText("Cevap Bulunamadı.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cevap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cevap, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel4);

        jPanel1.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 11, 590, 519));

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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cevap Metni", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 224, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 35, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Soruyu Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 484, 114, 46));

        geriDon.setBackground(new java.awt.Color(0, 35, 102));
        geriDon.setForeground(new java.awt.Color(255, 255, 255));
        geriDon.setText("Geri Dön");
        geriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonActionPerformed(evt);
            }
        });
        jPanel1.add(geriDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 484, 114, 46));

        jList1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jList1.setModel(model);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 235, 207));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void geriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonActionPerformed

    }//GEN-LAST:event_geriDonActionPerformed

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        soru_id = Integer.valueOf(list1.getSelectedItem().substring(10, list1.getSelectedItem().length()));
        initImage(soru_id);
        soru_metni.setText(db.getSoru_metni());
        cevap_metni.setText(db.getCevap_metni());
    }//GEN-LAST:event_list1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        soru_id = Integer.valueOf(jList1.getSelectedValue().substring(10, jList1.getSelectedValue().length()));
        initImage(soru_id);
        soru_metni.setText(db.getSoru_metni());
        cevap_metni.setText(db.getCevap_metni());
    }//GEN-LAST:event_jList1MouseClicked

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
            cevap.setText("Cevap Bulunamadı.");
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cevap;
    private javax.swing.JTextArea cevap_metni;
    public javax.swing.JButton geriDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.List list1;
    private javax.swing.JLabel soru;
    private javax.swing.JTextArea soru_metni;
    // End of variables declaration//GEN-END:variables
}
