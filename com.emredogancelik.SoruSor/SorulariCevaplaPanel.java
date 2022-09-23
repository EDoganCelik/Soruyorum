package SoruSor;

import Animation.ImageResizer;
import DatabaseChecking.DBClass;
import DatabaseChecking.QuestionClass;
import FilesFolder.FileSelect;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class SorulariCevaplaPanel extends javax.swing.JPanel {

    private DefaultListModel<String> model = new DefaultListModel<String>();
    private DBClass db;
    private int soru_id;
    private ImageIcon icon;
    private Image scaleImage;
    private int mouseWidth = 1;
    private ImageResizer imgResizer;
    private QuestionClass qc;
    private String dosya = "";
    private FileSelect files;

    public SorulariCevaplaPanel(DBClass db) {
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

        //db.initList(model, true);
        files = new FileSelect();
        cevap.setDropTarget(new DropTarget() {
            public synchronized void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                    List<File> droppedFiles = (List<File>) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
                    for (File file : droppedFiles) {
                        dosya = file.getPath();
                        qc = null;
                        imgResizer = null;
                        imgResizer = new ImageResizer(cevap, new ImageIcon(dosya));
                        cevap.setIcon(new ImageIcon(dosya)); // NOI18N
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
        jScrollPane1 = new javax.swing.JScrollPane();
        cevap_metni = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        geriDon = new javax.swing.JButton();

        list1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jSplitPane1.setBackground(new java.awt.Color(0, 0, 0));
        jSplitPane1.setDividerLocation(255);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 18));
        jPanel3.setPreferredSize(new java.awt.Dimension(641, 200));

        soru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addPic.png"))); // NOI18N
        soru.setText(" ");
        soru.setMinimumSize(new java.awt.Dimension(621, 18));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(soru, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2, Short.MAX_VALUE))
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

        cevap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cevap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addAnswer.png"))); // NOI18N
        cevap.setMaximumSize(new java.awt.Dimension(30000, 30008));
        cevap.setMinimumSize(new java.awt.Dimension(614, 10));
        cevap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cevapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cevap, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cevap, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel4);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setOpaque(false);

        soru_metni.setEditable(false);
        soru_metni.setColumns(20);
        soru_metni.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        soru_metni.setLineWrap(true);
        soru_metni.setRows(5);
        soru_metni.setWrapStyleWord(true);
        jScrollPane2.setViewportView(soru_metni);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Soru Metni", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        cevap_metni.setColumns(20);
        cevap_metni.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        cevap_metni.setRows(5);
        jScrollPane1.setViewportView(cevap_metni);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cevap Metnin", jPanel5);

        jButton1.setBackground(new java.awt.Color(0, 35, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Soruyu Cevapla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jList1.setModel(model);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        geriDon.setBackground(new java.awt.Color(0, 35, 102));
        geriDon.setForeground(new java.awt.Color(255, 255, 255));
        geriDon.setText("Geri Dön");
        geriDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(geriDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(geriDon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
        soru_id = Integer.valueOf(list1.getSelectedItem().substring(10, list1.getSelectedItem().length()));
        initImage(soru_id);
        soru_metni.setText(db.getSoru_metni());
    }//GEN-LAST:event_list1MouseClicked

    private void cevapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cevapMouseClicked
        qc = null;
        imgResizer = null;
        dosya = files.dosyaSec();
        imgResizer = new ImageResizer(cevap, new ImageIcon(dosya));
        cevap.setIcon(new ImageIcon(dosya)); // NOI18N
        qc = new QuestionClass(db, dosya);        // TODO add your handling code here:
    }//GEN-LAST:event_cevapMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            qc.answerQuery(cevap_metni.getText(), dosya, soru_id);
            AnaEkran.haberVerici.setText("Sorunuz Başarıyla Silindi");
            AnaEkran.haberDialog.setVisible(true);
        } catch (SQLException ex) {
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void geriDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_geriDonActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         soru_id = Integer.valueOf(jList1.getSelectedValue().substring(10, jList1.getSelectedValue().length()));
        initImage(soru_id);
        soru_metni.setText(db.getSoru_metni());
    }//GEN-LAST:event_jList1MouseClicked
    private void initImage(int index) {
        db.queryImage(index);
        soru.setIcon(db.getIconQuestion()); // NOI18N
        imgResizer = null;
        imgResizer = new ImageResizer(soru, db.getIconQuestion());
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
