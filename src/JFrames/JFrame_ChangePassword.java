/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Connection.DatabaseConnection;
import static JFrames.Objects.con;
import static JFrames.Objects.pst;

/**
 *
 * @author Joshua C. Magoliman
 */
public class JFrame_ChangePassword extends javax.swing.JFrame {

    public static String usernameGetter, passwordGetter;

    /**
     * Creates new form JFrame_ChangePassword
     */
    public JFrame_ChangePassword() {
        initComponents();
        DatabaseConnection dbc = DatabaseConnection.getDatabaseConnection();
        con = dbc.getConnection();
        SetIcon();
        Reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        lblCurrentPassword = new javax.swing.JLabel();
        txtCurrentPassword = new javax.swing.JPasswordField();
        chckbox_ShowPassword1 = new javax.swing.JCheckBox();
        txtNewPassword = new javax.swing.JPasswordField();
        lblNewPassword = new javax.swing.JLabel();
        txtConfirmNewPassword = new javax.swing.JPasswordField();
        lblConfirmNewPassword = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        chckbox_ShowPassword2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHANGE PASSWORD ?");
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(51, 0, 102));
        jPanel.setForeground(new java.awt.Color(255, 255, 255));

        btnBack.setText("BACK");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCurrentPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentPassword.setText("CURRENT PASSWORD");

        txtCurrentPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCurrentPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCurrentPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCurrentPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurrentPasswordKeyTyped(evt);
            }
        });

        chckbox_ShowPassword1.setBackground(new java.awt.Color(51, 0, 102));
        chckbox_ShowPassword1.setForeground(new java.awt.Color(255, 255, 255));
        chckbox_ShowPassword1.setText("SHOW PASSWORD");
        chckbox_ShowPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chckbox_ShowPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckbox_ShowPassword1ActionPerformed(evt);
            }
        });

        txtNewPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNewPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyTyped(evt);
            }
        });

        lblNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblNewPassword.setText("NEW PASSWORD");

        txtConfirmNewPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtConfirmNewPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmNewPasswordKeyTyped(evt);
            }
        });

        lblConfirmNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmNewPassword.setText("CONFIRM NEW PASSWORD");

        btnChangePassword.setText("CHANGE");
        btnChangePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        chckbox_ShowPassword2.setBackground(new java.awt.Color(51, 0, 102));
        chckbox_ShowPassword2.setForeground(new java.awt.Color(255, 255, 255));
        chckbox_ShowPassword2.setText("SHOW PASSWORD");
        chckbox_ShowPassword2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chckbox_ShowPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckbox_ShowPassword2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCurrentPassword)
                            .addComponent(lblNewPassword)
                            .addComponent(lblConfirmNewPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNewPassword)
                            .addComponent(chckbox_ShowPassword1)
                            .addComponent(txtCurrentPassword)
                            .addComponent(txtConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chckbox_ShowPassword2))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPassword)
                    .addComponent(txtCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chckbox_ShowPassword1)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmNewPassword)
                    .addComponent(txtConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chckbox_ShowPassword2)
                .addGap(63, 63, 63)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private void Reset() {
        txtCurrentPassword.setText("");
        txtNewPassword.setText("");
        txtConfirmNewPassword.setText("");
        chckbox_ShowPassword1.setSelected(false);
        chckbox_ShowPassword2.setSelected(false);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (btnBack.getText().equals("BACK")) {
            this.hide();
            Reset();
            new JFrame_Main().setVisible(true);
        } else {
            int P = JOptionPane.showConfirmDialog(null, " Are you sure want to cancel ?", "ATTENTION", JOptionPane.YES_NO_OPTION);
            if (P == JOptionPane.YES_OPTION) {
                this.hide();
                Reset();
                new JFrame_Main().setVisible(true);
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed
    private void chckbox_ShowPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckbox_ShowPassword1ActionPerformed
        if (chckbox_ShowPassword1.isSelected()) {
            txtCurrentPassword.setEchoChar((char) 0);
        } else {
            txtCurrentPassword.setEchoChar('*');
        }
        this.lblCurrentPassword.requestFocus();
    }//GEN-LAST:event_chckbox_ShowPassword1ActionPerformed
    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        if (txtCurrentPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No Current Password!", "ATTENTION", JOptionPane.ERROR_MESSAGE);
            txtCurrentPassword.requestFocus();
        } else if (txtNewPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No New Password!", "ATTENTION", JOptionPane.ERROR_MESSAGE);
            txtNewPassword.requestFocus();
        } else if (txtConfirmNewPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No Confirm New Password!", "ATTENTION", JOptionPane.ERROR_MESSAGE);
            txtConfirmNewPassword.requestFocus();
        } else {
            if (!passwordGetter.equals(txtCurrentPassword.getText())) {
                JOptionPane.showMessageDialog(this, "You're Current Password is invalid!", "ATTENTION", JOptionPane.ERROR_MESSAGE);
            } else {
                Reading();
            }
        }
    }//GEN-LAST:event_btnChangePasswordActionPerformed
    private void Reading() {
        if (!txtNewPassword.getText().equals(txtConfirmNewPassword.getText())) {
            JOptionPane.showMessageDialog(this, "Your New Password and Confirm New Password are not the same !", "ATTENTION", JOptionPane.ERROR_MESSAGE);
        } else if (txtCurrentPassword.getText().equals(txtConfirmNewPassword.getText())) {
            JOptionPane.showMessageDialog(this, "Your Password is current used !", "ATTENTION", JOptionPane.ERROR_MESSAGE);
        } else {
            Updating();
        }
    }

    private void Updating() {
        try {
            pst = con.prepareStatement("UPDATE tbl_Users set Password = ? WHERE Username = ?");
            pst.setString(1, txtConfirmNewPassword.getText());
            pst.setString(2, usernameGetter);
            pst.execute();
            JOptionPane.showMessageDialog(this, "SUCCESSFULY UPDATED !", "ATTENTION", JOptionPane.INFORMATION_MESSAGE);
            passwordGetter = txtConfirmNewPassword.getText();
            Reset();
            this.hide();
            new JFrame_Main().setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void chckbox_ShowPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckbox_ShowPassword2ActionPerformed
        if (chckbox_ShowPassword2.isSelected()) {
            txtNewPassword.setEchoChar((char) 0);
            txtConfirmNewPassword.setEchoChar((char) 0);
        } else {
            txtNewPassword.setEchoChar('*');
            txtConfirmNewPassword.setEchoChar('*');
        }
        this.lblCurrentPassword.requestFocus();
    }//GEN-LAST:event_chckbox_ShowPassword2ActionPerformed
    private void txtCurrentPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurrentPasswordKeyReleased
        if (!txtCurrentPassword.getText().equals("")) {
            btnBack.setText("CANCEL");
        } else {
            btnBack.setText("BACK");
        }
    }//GEN-LAST:event_txtCurrentPasswordKeyReleased
    private void txtCurrentPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurrentPasswordKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (txtCurrentPassword.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCurrentPasswordKeyTyped
    private void txtNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (txtNewPassword.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNewPasswordKeyTyped
    private void txtConfirmNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmNewPasswordKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || Character.isDigit(c) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (txtConfirmNewPassword.getText().length() >= 12) {
            evt.consume();
        }
    }//GEN-LAST:event_txtConfirmNewPasswordKeyTyped
    private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGOICON.png")));
    }

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
            java.util.logging.Logger.getLogger(JFrame_ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JCheckBox chckbox_ShowPassword1;
    private javax.swing.JCheckBox chckbox_ShowPassword2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel lblConfirmNewPassword;
    private javax.swing.JLabel lblCurrentPassword;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JPasswordField txtConfirmNewPassword;
    private javax.swing.JPasswordField txtCurrentPassword;
    private javax.swing.JPasswordField txtNewPassword;
    // End of variables declaration//GEN-END:variables
}
