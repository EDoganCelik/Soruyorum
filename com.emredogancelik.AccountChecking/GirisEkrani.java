package AccountChecking;

import DatabaseChecking.DBClass;
import Animation.ClosedAnimation;
import SoruSor.AnaEkran;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dialog;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class GirisEkrani extends javax.swing.JFrame {

    private char c;
    private int xSize, ySize, x, y;
    private boolean isCorrect = true;
    private DBClass db;
    private ClosedAnimation close;
    private String password = "";
    private MyProfile myProfile;

    public GirisEkrani() {
        UISetup();
        initComponents();
        initSetup();
        c = userPassText.getEchoChar();
    }

    private void UISetup() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        UIManager.put("Button.arc", 750);
    }

    private void initSetup() {
        myProfile = new MyProfile();
        db = new DBClass(myProfile);

        myProfile.setDb(db); 

        close = new ClosedAnimation(this.closedIMG);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        userNameText = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userPassText = new javax.swing.JPasswordField();
        loginButton1 = new javax.swing.JButton();
        errorText = new javax.swing.JLabel();
        closedIMG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameText.setText("EmreDogan");
        userNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userNameTextKeyReleased(evt);
            }
        });
        jPanel1.add(userNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 96, 322, 42));

        loginButton.setBackground(new java.awt.Color(255, 165, 0));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Giriş Yap");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 218, 158, 41));

        jCheckBox1.setText("Şifreyi Göster");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1İtemStateChanged(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 167, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kullanıcı Adı");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 73, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Şifre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 144, 90, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Öğretiyorum - Yanında");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 21, 360, 34));

        userPassText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userPassText.setText("qwer123qwer");
        userPassText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPassTextMouseClicked(evt);
            }
        });
        userPassText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userPassTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userPassTextKeyTyped(evt);
            }
        });
        jPanel1.add(userPassText, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 167, 322, 40));

        loginButton1.setBackground(new java.awt.Color(255, 165, 0));
        loginButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginButton1.setText("Kayıt Ol");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 218, 158, 41));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 145, 427, 270));

        errorText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        errorText.setForeground(new java.awt.Color(255, 255, 255));
        errorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(errorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 430, 420, 50));

        closedIMG.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        closedIMG.setForeground(new java.awt.Color(255, 255, 255));
        closedIMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closedIMG.setText("X");
        jPanel2.add(closedIMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 0, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        loginControl();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginControl() {
        password = String.valueOf(userPassText.getPassword());
        if (db.veri_cek(userNameText.getText(), password)) {
            this.dispose();
            new AnaEkran(db).setVisible(true);
        } else {
            loginAnimation();
        }
    }

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        x = evt.getXOnScreen() - xSize;
        y = evt.getYOnScreen() - ySize;
        this.setLocation(x, y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xSize = evt.getX();
        ySize = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        new KayitOl(db).setVisible(true);
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void jCheckBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1İtemStateChanged
        if (jCheckBox1.isSelected()) {
            userPassText.setEchoChar((char) 0); //password = JPasswordField
        } else {
            userPassText.setEchoChar(c);
        }
    }//GEN-LAST:event_jCheckBox1İtemStateChanged
    private boolean isFirst = true;
    private void userPassTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPassTextMouseClicked
        if (isFirst) {
            userPassText.setText("");
            isFirst = false;
        }
    }//GEN-LAST:event_userPassTextMouseClicked

    private void userPassTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userPassTextKeyTyped
        if (isFirst) {
            isFirst = false;
        }
    }//GEN-LAST:event_userPassTextKeyTyped

    private void userPassTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userPassTextKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginControl();
        }
    }//GEN-LAST:event_userPassTextKeyReleased

    private void userNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameTextKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginControl();
        }
    }//GEN-LAST:event_userNameTextKeyReleased
    private void loginAnimation() {
        if (isCorrect) {
            isCorrect = false;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    errorText.setText("Şifre ya da Kullanıcı adı hatalı");
                    try {
                        Thread.sleep(3000);
                        errorText.setText("");
                    } catch (Exception e) {
                    }
                }
            }).start();
            isCorrect = true;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closedIMG;
    private javax.swing.JLabel errorText;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JTextField userNameText;
    private javax.swing.JPasswordField userPassText;
    // End of variables declaration//GEN-END:variables

}
