package SoruSor;

import AccountChecking.GirisEkrani;
import Animation.EditLabel;
import Animation.EditPanel;
import DatabaseChecking.DBClass;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class AnaEkran extends javax.swing.JFrame {

    private int xSize, ySize, x, y;
    private DBClass db;
    private boolean isShow = true;

    public AnaEkran(DBClass db) {
        this.db = db;   
        lookAndFeelSetup(db);
        initPanel(db);
    }

    private void lookAndFeelSetup(DBClass db1) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 5);
            UIManager.put("Component.focusWidth", 1);
            UIManager.put("TabbedPane.showTabSeparators", true);
            UIManager.put("TabbedPane.tabSeparatorsFullHeight", true);
            db1.getProfile().setVisible(false);
            db1.getProfile().setSize(0, 542);
            add(db1.getProfile());
        } catch (Exception e) {
        }
    }

    private void initPanel(DBClass db1) {
        initComponents();
        jLabel19.setText("Versiyon : " + DBClass.PROGRAM_VERSION);
        ProfilePanelSetup(db1);
        movePanel(db1);
    }

    private void ProfilePanelSetup(DBClass db1) {
        db1.getProfile().getjButton2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isShow) {
                    closePanel(db1.getProfile());
                    jPanel1.setVisible(true);
                }
            }
        });
        db1.getProfile().getjButton1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (db1.getProfile().getIs_teacher() == 0) {
                    deletingAccountImg();
                }
                hesapSilme.setVisible(true);
            }
        });
    }

    private void movePanel(DBClass db1) {
        db1.getProfile().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                xSize = e.getX();
                ySize = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        db1.getProfile().addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                x = e.getXOnScreen() - xSize;
                y = e.getYOnScreen() - ySize;
                setLocation(x, y);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });

    }

    private void deletingAccountImg() {
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sad1.gif"))); // NOI18N
    }

    private void silinenSql() {
        db.addUpdateQuery(String.format("insert into Silinen values('%s','%s')", silindiText.getText(), DBClass.PROGRAM_VERSION));
    }

    private void deleteAccount() {

        if (db.getProfile().getIs_teacher() == 1) {
            db.addUpdateQuery("delete from Hesap where hesap_id=" + db.getProfile().getId());// Öğretmeni Silecek 
        } else {
            db.addUpdateQuery("delete from Hesap where hesap_id=" + db.getProfile().getId());//Öğrenciyi Silecek
        }
        silinenSql();//Silinen tablomuza niye sildiklerini yazacak
        //Cascade kullandığımız için hesaplardan sildiğimiz şeyler diğer tablolardan direk bir şekilde silinecektir.
        hesapSilme.setVisible(false);
        new GirisEkrani().setVisible(true);
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog(this,ModalityType.DOCUMENT_MODAL);
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        haberDialog = new javax.swing.JDialog();
        haberVerici = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        hesapSilme = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        silindiText = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        bilgiPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new EditPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new EditPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new EditPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new EditPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new EditPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new EditPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new EditLabel();
        jLabel18 = new EditLabel();
        jLabel19 = new EditLabel();

        jDialog1.setSize(457, 176);
        jDialog1.setLocationRelativeTo(null);
        jDialog1.setUndecorated(true);
        jDialog1.setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Değerli  öğretmenimiz, bu kısım sadece öğrenciler içindir.");

        jButton2.setText("Kapat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        haberDialog.setResizable(false);
        haberDialog.setSize(432, 176);
        haberDialog.setLocationRelativeTo(null);

        haberVerici.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        haberVerici.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        haberVerici.setText("null");

        jButton3.setBackground(new java.awt.Color(0, 35, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Tamam");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout haberDialogLayout = new javax.swing.GroupLayout(haberDialog.getContentPane());
        haberDialog.getContentPane().setLayout(haberDialogLayout);
        haberDialogLayout.setHorizontalGroup(
            haberDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(haberDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(haberVerici, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, haberDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        haberDialogLayout.setVerticalGroup(
            haberDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(haberDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(haberVerici, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        hesapSilme.setSize(570, 500);
        hesapSilme.setLocationRelativeTo(null);
        hesapSilme.setTitle("                                              Gittiğin yerde sevilirsin umarım.");
        hesapSilme.setAlwaysOnTop(true);
        hesapSilme.setUndecorated(true);
        hesapSilme.setResizable(false);
        hesapSilme.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.gif"))); // NOI18N
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Hesabınız Siliniyor ve bu geri dönüşümü olmayan bir yoldur");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Hesabınızı neden siliyorsunuz : ");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 164, 45));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Vazgeçtim");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 153, 45));

        silindiText.setColumns(20);
        silindiText.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        silindiText.setLineWrap(true);
        silindiText.setRows(5);
        silindiText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(silindiText);

        jPanel11.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 348, 94));

        hesapSilme.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 500));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bilgiPanel.setBackground(new java.awt.Color(255, 255, 255));
        bilgiPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bilgiPanel.setVisible(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Veritabanı Yönetimi Sistemleri Ödevi\n\nEmre Doğan Çelik\nEmir Çip\nİlayda Gülaçar \n\nMS - SQL ve Java Kullanılarak Yapıldı.\n\n");
        jScrollPane2.setViewportView(jTextArea1);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Gizle");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bilgiPanelLayout = new javax.swing.GroupLayout(bilgiPanel);
        bilgiPanel.setLayout(bilgiPanelLayout);
        bilgiPanelLayout.setHorizontalGroup(
            bilgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bilgiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(bilgiPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        bilgiPanelLayout.setVerticalGroup(
            bilgiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bilgiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(bilgiPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 470, 400));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 0, 0)));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edu.png"))); // NOI18N
        jLabel3.setText(" ");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Daha Fazla Ayrıntı");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Biz birlikte güzeliz. Sorularınız emin ellerde.");

        jLabel5.setBackground(new java.awt.Color(182, 220, 254));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 136, 199));
        jLabel5.setText("Öğretiyorum Yanında");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 850, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setOpaque(false);
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/soru_sor.png"))); // NOI18N
        jLabel1.setText(" ");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 165, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Soru Sor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 236, 170));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sorularim.png"))); // NOI18N
        jLabel7.setText(" ");

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 165, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sorularım");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 237, 170));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_profile.png"))); // NOI18N
        jLabel9.setText(" ");

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 165, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Profilim");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 237, 170));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/community.png"))); // NOI18N
        jLabel11.setText(" ");

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 165, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Topluluk");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 237, 170));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settings.png"))); // NOI18N
        jLabel13.setText(" ");

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 165, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ayarlar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 237, 170));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        jLabel15.setText(" ");

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 25)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 165, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Hesabı kapat");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 237, 170));

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Diğer Uygulamalar");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Geliştiriciler");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel18);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Versiyon:3.15.92");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel10.add(jLabel19);

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 460, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xSize = evt.getX();
        ySize = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        x = evt.getXOnScreen() - xSize;
        y = evt.getYOnScreen() - ySize;
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        if (!db.isShow()) {

            if (db.getProfile().getIs_teacher() == 1) {
                jDialog1.setVisible(true);
            } else {
                db.setShow(true);
                new SoruSorma(db).setVisible(true);
            }
        }
        /*if (db.getProfile().getIs_teacher() == 1) {
            jDialog1.setVisible(true);
        } else {
            if (isShow && isFirst) {
                isFirst = false;
                nbc.setVisible(true);
                animationpanel(nbc);
            }
        }*/

    }//GEN-LAST:event_jPanel2MouseClicked
    private boolean isFirst = true;
    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        if (isShow && isFirst) {
            isFirst = false;
            db.getProfile().setVisible(true);
            animationpanel(db.getProfile());
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        new GirisEkrani().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        if (db.getProfile().getIs_teacher() == 1 && !db.isShow()) {
            db.setShow(true);
            new SorulariCevapla(db).setVisible(true);
        } else if (!db.isShow()) {
            db.setShow(true);
            new Sorularim(db).setVisible(true);
        }
        /*if (db.getProfile().getIs_teacher() == 1 && !db.isShow()) {
            soruCevaplaPanel.setVisible(true);
            animationpanel(soruCevaplaPanel);
        } else if (!db.isShow()) {
            if (isShow && isFirst) {
                isFirst = false;
                sorularimPanel.setVisible(true);
                animationpanel(sorularimPanel);
            }
        }*/

    }//GEN-LAST:event_jPanel3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        haberDialog.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        deleteAccount();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        hesapSilme.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://ceng4u.com/topluluk"));
        } catch (IOException ex) {
            Logger.getLogger(AnaEkran.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jPanel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        bilgiPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        bilgiPanel.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xSize = evt.getX();
        ySize = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        x = evt.getXOnScreen() - xSize;
        y = evt.getYOnScreen() - ySize;
        this.setLocation(x, y);
    }//GEN-LAST:event_formMouseDragged
    private void animationpanel(JPanel panel) {

        int c = 851;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int a = 0; a < c; a += 10) {
                    if (a < 851) {
                        panel.setSize(a, panel.getHeight());
                    } else {
                        panel.setSize(851, panel.getHeight());
                    }

                    try {
                        Thread.sleep(3);
                    } catch (Exception e) {
                    }
                }
                jPanel1.setVisible(false);
                isShow = false;
                isFirst = true;
            }
        }).start();

    }

    private void closePanel(JPanel panel) {
        int c = 851;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int a = 0; a < c; a += 10) {

                    panel.setSize(852 - a, panel.getHeight());
                    try {
                        Thread.sleep(3);
                    } catch (Exception e) {
                    }
                }
                isShow = true;
                panel.setVisible(false);
            }
        }).start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bilgiPanel;
    public static javax.swing.JDialog haberDialog;
    public static javax.swing.JLabel haberVerici;
    private javax.swing.JDialog hesapSilme;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea silindiText;
    // End of variables declaration//GEN-END:variables
}
