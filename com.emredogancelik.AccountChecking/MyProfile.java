package AccountChecking;

import DatabaseChecking.DBClass;
import SoruSor.AnaEkran;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.UIManager;

public class MyProfile extends javax.swing.JPanel {

    private DBClass db;
    private int ders = 0;
    private String account_username;
    private String account_name;
    private String account_surname;
    private int id;
    private String unvan;
    private int is_teacher = 0;

    public void setDb(DBClass db) {
        this.db = db;
    }

    public int getIs_teacher() {
        return is_teacher;
    }

    public int getDers() {
        return ders;
    }

    public void setDers(int ders) {
        this.ders = ders;
    }

    public void setIs_teacher(int is_teacher) {
        this.is_teacher = is_teacher;
    }

    public MyProfile() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 25);
            UIManager.put("Component.focusWidth", 1);
            setSize(825, 507);
        } catch (Exception e) {
            e.printStackTrace();
        }
        initComponents();
        c = eskiSifre.getEchoChar();
    }

    public void setTexts() {
        adi_text.setText(getAccount_name());
        soyadi_text.setText(getAccount_Surname());
        kullaniciAdi_text.setText(getAccount_username());
        id_text.setText(""+id);
        unvan_text.setText(unvan);

    }

    public String getAccount_username() {
        return account_username;
    }

    public void setAccount_username(String account_username) {
        this.account_username = account_username;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_Surname() {
        return account_surname;
    }

    public void setAccount_Surname(String surname) {
        this.account_surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        kullaniciAdi_text = new javax.swing.JLabel();
        soyadi_text = new javax.swing.JLabel();
        adi_text = new javax.swing.JLabel();
        unvan_text = new javax.swing.JLabel();
        id_text = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        yeniSifre = new javax.swing.JPasswordField();
        eskiSifre = new javax.swing.JPasswordField();
        changeButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 165, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton1.setBackground(new java.awt.Color(0, 35, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Hesabımı Sil");
        jButton1.setBorderPainted(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Adı :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Soyadı :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Unvanı :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Hesap ID :");

        jButton2.setBackground(new java.awt.Color(0, 35, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ana Menüye Dön");
        jButton2.setBorderPainted(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Dünyayı daha iyi yer yapmayan kişi insan değildir.");

        kullaniciAdi_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        soyadi_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        adi_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        unvan_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        id_text.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Şifre değiştirmek için:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Eski Şifreniz");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Yeni şifreniz:");

        yeniSifre.setText("yenisifre");
        yeniSifre.setOpaque(false);
        yeniSifre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yeniSifreMouseClicked(evt);
            }
        });

        eskiSifre.setText("eskisifre");
        eskiSifre.setOpaque(false);
        eskiSifre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eskiSifreMouseClicked(evt);
            }
        });

        changeButton.setBackground(new java.awt.Color(0, 35, 102));
        changeButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        changeButton.setForeground(new java.awt.Color(255, 255, 255));
        changeButton.setText("Şifreyi değiştir");
        changeButton.setBorderPainted(false);
        changeButton.setFocusable(false);
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Şifreleri göster");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1İtemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addComponent(kullaniciAdi_text, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)
                        .addGap(160, 160, 160)
                        .addComponent(adi_text, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addGap(118, 118, 118)
                        .addComponent(soyadi_text, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4)
                        .addGap(115, 115, 115)
                        .addComponent(unvan_text, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel5)
                        .addGap(88, 88, 88)
                        .addComponent(id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(11, 11, 11)
                                                    .addComponent(eskiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(130, 130, 130)
                                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(kullaniciAdi_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(adi_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(soyadi_text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(unvan_text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eskiSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(yeniSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jCheckBox1)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
       
        String password = String.valueOf(eskiSifre.getPassword());//Eski şifreyi getirir
        String newPassword = String.valueOf(yeniSifre.getPassword());//Yeni şifreyi getirir
        try {
            db.passChange(password, newPassword);//Şifre kontrolü yapar
            AnaEkran.haberVerici.setText("Şifre değiştirildi");//Bilgi verir
            AnaEkran.haberDialog.setVisible(true);//Diyalog Açılır
        } catch (SQLException ex) {
            ex.printStackTrace();//Hata mesajı alınır
            AnaEkran.haberVerici.setText("Girilen Şifre Hatalı");//Bilgi verir
            AnaEkran.haberDialog.setVisible(true);//Diyalog Açılır
        }
    }//GEN-LAST:event_changeButtonActionPerformed

    private void jCheckBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1İtemStateChanged
        if (jCheckBox1.isSelected()) {
            eskiSifre.setEchoChar((char) 0); //password = JPasswordField
            yeniSifre.setEchoChar((char) 0); //password = JPasswordField

        } else {
            eskiSifre.setEchoChar(c); //password = JPasswordField
            yeniSifre.setEchoChar(c); //password = JPasswordField
        }
    }//GEN-LAST:event_jCheckBox1İtemStateChanged

    private void eskiSifreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eskiSifreMouseClicked
        if (isFirstEski) {
            eskiSifre.setText("");
            isFirstEski = false;
        }
    }//GEN-LAST:event_eskiSifreMouseClicked

    private void yeniSifreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yeniSifreMouseClicked
        if (isFirstYeni) {
            yeniSifre.setText("");
            isFirstYeni = false;
        }
    }//GEN-LAST:event_yeniSifreMouseClicked
    private boolean isFirstEski = true;
    private boolean isFirstYeni = true;

    public JButton getjButton1() {
        return jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }
    private char c;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adi_text;
    public javax.swing.JButton changeButton;
    private javax.swing.JPasswordField eskiSifre;
    private javax.swing.JLabel id_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel kullaniciAdi_text;
    private javax.swing.JLabel soyadi_text;
    private javax.swing.JLabel unvan_text;
    private javax.swing.JPasswordField yeniSifre;
    // End of variables declaration//GEN-END:variables
}
