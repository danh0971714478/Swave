package swave;

import Vu.ui.ForgotPass;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author NGUYEN VAN SI
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static MainFrame main;
    boolean viewPass = false;
    boolean forgot = false;
    private Login loginForm;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        txtUsername.setBackground(new Color(255, 255, 255, 0));
        txtPassword.setBackground(new Color(255, 255, 255, 0));
        simpleTitleBar1.init(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simpleTitleBar1 = new swing.javaswingdev.SimpleTitleBar();
        pnlMain = new javax.swing.JPanel();
        lblSwave = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlUsername = new javax.swing.JPanel();
        txtUsername = new model.input();
        lblPlaceholder = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        pnlPassword = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        lblPlaceholderPass = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblViewPass = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblForgot = new javax.swing.JLabel();
        lblCheckbox = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new component.Button();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblClick = new javax.swing.JLabel();
        btnSignupGG = new component.Button();
        btnSigup = new component.Button();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1530, 810));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1530, 810));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(simpleTitleBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, -1));

        pnlMain.setPreferredSize(new java.awt.Dimension(1532, 810));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSwave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/swave-project.png"))); // NOI18N
        lblSwave.setToolTipText("");
        pnlMain.add(lblSwave, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 91, -1, -1));

        pnlLogin.setOpaque(false);
        pnlLogin.setPreferredSize(new java.awt.Dimension(340, 477));
        pnlLogin.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginTitle.png"))); // NOI18N
        lblTitle.setPreferredSize(new java.awt.Dimension(314, 42));
        pnlLogin.add(lblTitle);

        pnlUsername.setBackground(new java.awt.Color(51, 51, 255));
        pnlUsername.setOpaque(false);
        pnlUsername.setPreferredSize(new java.awt.Dimension(317, 45));
        pnlUsername.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUsernameCaretUpdate(evt);
            }
        });
        pnlUsername.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 260, 45));

        lblPlaceholder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlaceholder.setForeground(new java.awt.Color(88, 88, 88));
        lblPlaceholder.setText("Tên tài khoản");
        pnlUsername.add(lblPlaceholder, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 15, 210, -1));

        lblUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtUsername_focus.png"))); // NOI18N
        lblUsername.setPreferredSize(new java.awt.Dimension(317, 45));
        pnlUsername.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlLogin.add(pnlUsername);

        pnlPassword.setBackground(new java.awt.Color(51, 51, 255));
        pnlPassword.setOpaque(false);
        pnlPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setToolTipText("");
        txtPassword.setBorder(null);
        txtPassword.setPreferredSize(new java.awt.Dimension(317, 45));
        txtPassword.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPasswordCaretUpdate(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        pnlPassword.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 240, -1));

        lblPlaceholderPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlaceholderPass.setForeground(new java.awt.Color(88, 88, 88));
        lblPlaceholderPass.setText("Mật khẩu");
        pnlPassword.add(lblPlaceholderPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 15, 210, -1));

        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtPasswordHover.png"))); // NOI18N
        lblPassword.setPreferredSize(new java.awt.Dimension(317, 45));
        pnlPassword.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblViewPass.setPreferredSize(new java.awt.Dimension(60, 35));
        lblViewPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewPassMouseClicked(evt);
            }
        });
        pnlPassword.add(lblViewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 5, 30, -1));

        pnlLogin.add(pnlPassword);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(317, 20));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblForgot.setForeground(new java.awt.Color(95, 95, 95));
        lblForgot.setText("Quên mật khẩu?");
        lblForgot.setPreferredSize(new java.awt.Dimension(87, 20));
        lblForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblForgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblForgotMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblForgotMousePressed(evt);
            }
        });
        jPanel1.add(lblForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, -1));

        lblCheckbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox_base.png"))); // NOI18N
        lblCheckbox.setText("jLabel2");
        lblCheckbox.setPreferredSize(new java.awt.Dimension(18, 16));
        lblCheckbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCheckboxMouseClicked(evt);
            }
        });
        jPanel1.add(lblCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 37, 82));
        jLabel2.setText("Nhớ mật khẩu");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 0, -1, -1));

        pnlLogin.add(jPanel1);

        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Đăng nhập");
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setPreferredSize(new java.awt.Dimension(317, 45));
        btnLogin.setSizeSpeed(8.0F);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/or.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(317, 20));
        pnlLogin.add(jLabel3);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(317, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 82, 82));
        jLabel5.setText("Điều khoản sử dụng?");
        jPanel2.add(jLabel5);

        lblClick.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblClick.setForeground(new java.awt.Color(255, 255, 255));
        lblClick.setText("Truy cập");
        lblClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClickMouseExited(evt);
            }
        });
        jPanel2.add(lblClick);

        pnlLogin.add(jPanel2);

        btnSignupGG.setForeground(new java.awt.Color(0, 0, 0));
        btnSignupGG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gg.png"))); // NOI18N
        btnSignupGG.setText("Đăng ký bằng Google");
        btnSignupGG.setColor1(new java.awt.Color(255, 255, 255));
        btnSignupGG.setColor2(new java.awt.Color(255, 255, 255));
        btnSignupGG.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSignupGG.setPreferredSize(new java.awt.Dimension(317, 45));
        btnSignupGG.setSizeSpeed(8.0F);
        btnSignupGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupGGActionPerformed(evt);
            }
        });
        pnlLogin.add(btnSignupGG);

        btnSigup.setForeground(new java.awt.Color(0, 0, 0));
        btnSigup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconswave.png"))); // NOI18N
        btnSigup.setText("Đăng ký");
        btnSigup.setColor1(new java.awt.Color(255, 255, 255));
        btnSigup.setColor2(new java.awt.Color(255, 255, 255));
        btnSigup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSigup.setPreferredSize(new java.awt.Dimension(317, 45));
        btnSigup.setSizeSpeed(8.0F);
        btnSigup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSigupMouseClicked(evt);
            }
        });
        btnSigup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigupActionPerformed(evt);
            }
        });
        pnlLogin.add(btnSigup);

        pnlMain.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(991, 149, 500, 580));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loginBackground.png"))); // NOI18N
        lblBackground.setPreferredSize(new java.awt.Dimension(1532, 810));
        pnlMain.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPasswordCaretUpdate
        if (!txtPassword.getText().equals("")) {
            lblPlaceholderPass.setText("");
        } else {
            lblPlaceholderPass.setText("Mật khẩu");
        }
    }//GEN-LAST:event_txtPasswordCaretUpdate

    private void lblViewPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewPassMouseClicked
        viewPass = !viewPass;
        if (viewPass == true) {
            lblPassword.setIcon(new ImageIcon(getClass().getResource("/img/rxrViewPass.png")));
            txtPassword.setEchoChar(((char) 0));
        } else {
            lblPassword.setIcon(new ImageIcon(getClass().getResource("/img/txtPasswordHover.png")));
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_lblViewPassMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSigupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSigupActionPerformed

    private void lblCheckboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckboxMouseClicked
        forgot = !forgot;
        if (forgot == true) {
            lblCheckbox.setIcon(new ImageIcon(getClass().getResource("/img/Checkbox.png")));
        } else {
            lblCheckbox.setIcon(new ImageIcon(getClass().getResource("/img/checkbox_base.png")));
        }
    }//GEN-LAST:event_lblCheckboxMouseClicked

    private void btnSignupGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupGGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignupGGActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblForgotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMousePressed

    }//GEN-LAST:event_lblForgotMousePressed

    private void lblForgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseEntered
        lblForgot.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblForgotMouseEntered

    private void lblForgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseExited
        lblForgot.setForeground(new Color(95, 95, 95));
    }//GEN-LAST:event_lblForgotMouseExited

    private void lblClickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClickMouseEntered
        lblClick.setForeground(new Color(233, 131, 255));
    }//GEN-LAST:event_lblClickMouseEntered

    private void lblClickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClickMouseExited
        lblClick.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblClickMouseExited

    private void txtUsernameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUsernameCaretUpdate
        if (!txtUsername.getText().equals("")) {
            lblPlaceholder.setText("");
        } else {
            lblPlaceholder.setText("Tên tài khoản");
        }
    }//GEN-LAST:event_txtUsernameCaretUpdate

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if ((txtUsername.getText().equals("nhom2")) && (txtPassword.getText().equals("nhom2"))) {
            DialogLoad loadPane = new DialogLoad(this, false, "Đang đăng nhập...");
            loadPane.setVisible(true);
            loginForm = this;
            Thread loadThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    main = new MainFrame();
                    main.setVisible(true);
                    loginForm.dispose();
                }
            });
            loadThread.start();
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnSigupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSigupMouseClicked
        new Signup(this).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSigupMouseClicked

    private void lblForgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotMouseClicked
        ForgotPass forgot = new ForgotPass(this, true);
        forgot.setVisible(true);
    }//GEN-LAST:event_lblForgotMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button btnLogin;
    private component.Button btnSignupGG;
    private component.Button btnSigup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCheckbox;
    private javax.swing.JLabel lblClick;
    private javax.swing.JLabel lblForgot;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPlaceholder;
    private javax.swing.JLabel lblPlaceholderPass;
    private javax.swing.JLabel lblSwave;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblViewPass;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPanel pnlUsername;
    private swing.javaswingdev.SimpleTitleBar simpleTitleBar1;
    private javax.swing.JPasswordField txtPassword;
    private model.input txtUsername;
    // End of variables declaration//GEN-END:variables
}
