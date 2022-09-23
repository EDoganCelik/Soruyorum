package AccountChecking;

import DatabaseChecking.DBClass;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Component;
import java.awt.Dialog;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class KayitOl extends javax.swing.JDialog {

    private DBClass db;
    private char c;

    public KayitOl(DBClass db) {
        this.db = db;
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 750);
            setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
            initComponents();
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        c = sifreText.getEchoChar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        error = new javax.swing.JTextField();
        errorAd = new javax.swing.JTextField();
        errorSoyad = new javax.swing.JTextField();
        errorSifre = new javax.swing.JTextField();
        adText = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        soyadText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        isOgretmen = new javax.swing.JComboBox<>();
        dersCombo = new javax.swing.JComboBox<>();
        kayitBasarili = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        kullaniciText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sifreText = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(299, 490));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(299, 490));
        setSize(new java.awt.Dimension(299, 490));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        error.setEditable(false);
        error.setVisible(false);
        error.setBackground(new java.awt.Color(255, 0, 0));
        error.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        error.setForeground(new java.awt.Color(255, 255, 255));
        error.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        error.setOpaque(false);
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 30));

        errorAd.setEditable(false);
        errorAd.setVisible(false);
        errorAd.setBackground(new java.awt.Color(255, 0, 0));
        errorAd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorAd.setForeground(new java.awt.Color(255, 255, 255));
        errorAd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorAd.setOpaque(false);
        getContentPane().add(errorAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 30));

        errorSoyad.setEditable(false);
        errorSoyad.setVisible(false);
        errorSoyad.setBackground(new java.awt.Color(255, 0, 0));
        errorSoyad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorSoyad.setForeground(new java.awt.Color(255, 255, 255));
        errorSoyad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorSoyad.setOpaque(false);
        getContentPane().add(errorSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 30));

        errorSifre.setEditable(false);
        errorSifre.setVisible(false);
        errorSifre.setBackground(new java.awt.Color(255, 0, 0));
        errorSifre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorSifre.setForeground(new java.awt.Color(255, 255, 255));
        errorSifre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        errorSifre.setOpaque(false);
        getContentPane().add(errorSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 30));

        adText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(adText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 30));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Gizle");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1İtemStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 50, 30));

        jLabel1.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, -1));

        soyadText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(soyadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 260, -1));

        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Soyad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, -1));

        isOgretmen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Öğretmen", "Öğrenci" }));
        isOgretmen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                isOgretmenİtemStateChanged(evt);
            }
        });
        getContentPane().add(isOgretmen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 260, 36));

        dersCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematik", "Fizik", "Kimya", "Türk Dili ve Edebiyatı", "Tarih", "Coğrafya", "Geometri", "Biyoloji" }));
        getContentPane().add(dersCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 260, 36));

        kayitBasarili.setEditable(false);
        kayitBasarili.setVisible(false);
        kayitBasarili.setBackground(new java.awt.Color(255, 165, 0));
        kayitBasarili.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayitBasarili.setForeground(new java.awt.Color(0, 35, 102));
        kayitBasarili.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kayitBasarili.setText("jTextField1");
        getContentPane().add(kayitBasarili, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 130));

        jButton1.setBackground(new java.awt.Color(255, 165, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kaydımı Tamamla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 194, 53));

        jLabel4.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sifre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 260, -1));

        kullaniciText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(kullaniciText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 260, 30));

        jLabel5.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Kullanıcı Adı");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 260, -1));

        sifreText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sifreText.setText("EmreDoganTarafından");
        sifreText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreTextMouseClicked(evt);
            }
        });
        getContentPane().add(sifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 260, 30));

        jButton2.setBackground(new java.awt.Color(255, 165, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Kapat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 100, 53));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.png"))); // NOI18N
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        girisKontrol();
        kayitYapici();
    }//GEN-LAST:event_jButton1ActionPerformed
    private String password = "";

    private void girisKontrol() {
        String text = "[a-zA-Z&&[^ üğçöÜĞİŞÇÖ-]]";

        for (int i = 0; i < kullaniciText.getText().length(); i++) {
            String check = "" + kullaniciText.getText().charAt(i);
            System.out.println(check);
            if (check.matches(text)||check.matches("[0-9]")) {
                control = true;
                System.out.println("Başarılı");
            } else {
                control = false;
                hataAnimasyon(" üğçöÜĞİŞÇÖ- içeremez", kullaniciText, error, 2500);
                break;
            }
            check = null;
        }
        if (kullaniciText.getText().length() < 1) {
            control = false;
            hataAnimasyon("Kullanıcı Adı Boş Değer İçeremez", kullaniciText, error, 2750);
        }
        if (adText.getText().length() < 1) {
            control = false;
            hataAnimasyon("Ad Boş Değer İçeremez", adText, errorAd, 2000);
        }
        if (soyadText.getText().length() < 1) {
            control = false;
            hataAnimasyon("Soyad Boş Değer İçeremez", soyadText, errorSoyad, 2250);
        }
        if (String.valueOf(sifreText.getPassword()).contains(" ")) {
            control = false;
            hataAnimasyon("Şifre boş değer içeremez", sifreText, errorSifre, 2500);
        }

        if (String.valueOf(sifreText.getPassword()).length() < 1) {
            control = false;
            hataAnimasyon("Şifre boş değer içeremez", sifreText, errorSifre, 2500);
        }

    }

    private void hataAnimasyon(String text, Component comp, JTextField textview, int delay) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    textview.setVisible(true);
                    textview.setLocation(textview.getX(), comp.getY() + comp.getHeight());
                    textview.setText(text);
                    Thread.sleep(delay);
                    textview.setText("");
                    textview.setVisible(false);
                    if (text.contains("Kayıt")) {
                        dispose();
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }).start();

    }

    private void kayitYapici() {
        if (control) {
            if (isOgretmen.getSelectedIndex() == 0) {
                try {
                    if (db.hesapKayit(kullaniciText.getText(), adText.getText(), soyadText.getText(), String.valueOf(sifreText.getPassword()), dersCombo.getSelectedIndex() + 1, true)) {
                        System.out.println("success");
                        hataAnimasyon("Kayıt başarılı, giriş yapabilirsiniz.", dersCombo, kayitBasarili, 2750);

                    } else {
                        hataAnimasyon("Kullanıcı adı daha önce alınmış", kullaniciText, error, 2750);
                    }

                } catch (Exception e) {
                }
            } else {
                try {
                    if (db.hesapKayit(kullaniciText.getText(), adText.getText(), soyadText.getText(), String.valueOf(sifreText.getPassword()), 0, false)) {
                        System.out.println("success");
                        hataAnimasyon("Kayıt başarılı, giriş yapabilirsiniz", jButton1, kayitBasarili, 2750);

                    } else {
                        hataAnimasyon("Kullanıcı adı daha önce alınmış", kullaniciText, error, 2750);
                    }

                } catch (Exception e) {
                    //   hataAnimasyon("Kullanıcı adı daha önce alınmış", kullaniciText, error, 2750);
                }
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void isOgretmenİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_isOgretmenİtemStateChanged
        if (isOgretmen.getSelectedIndex() == 0) {
            dersCombo.setVisible(true);
        } else {
            dersCombo.setVisible(false);
        }

    }//GEN-LAST:event_isOgretmenİtemStateChanged

    private void jCheckBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1İtemStateChanged
        if (!jCheckBox1.isSelected()) {
            sifreText.setEchoChar((char) 0); //password = JPasswordField
        } else {
            sifreText.setEchoChar(c);
        }
    }//GEN-LAST:event_jCheckBox1İtemStateChanged
    private boolean isFirst = true;
    private void sifreTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreTextMouseClicked
        if (isFirst) {
            isFirst = false;
            sifreText.setText("");
        }
    }//GEN-LAST:event_sifreTextMouseClicked
    boolean control = true;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitOl(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adText;
    private javax.swing.JComboBox<String> dersCombo;
    private javax.swing.JTextField error;
    private javax.swing.JTextField errorAd;
    private javax.swing.JTextField errorSifre;
    private javax.swing.JTextField errorSoyad;
    private javax.swing.JComboBox<String> isOgretmen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kayitBasarili;
    private javax.swing.JTextField kullaniciText;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JTextField soyadText;
    // End of variables declaration//GEN-END:variables
}
