
package gradebook.application;

import gradebook.application.components.JPanelGradient;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.util.Arrays;

public class Login extends javax.swing.JFrame {
    

    public Login() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new JPanelGradient();
        buttonLogin = new javax.swing.JButton();
        labelAdminLogin = new javax.swing.JLabel();
        textFieldUsername = new gradebook.application.components.TextField();
        passwordField = new gradebook.application.components.PasswordField();
        labelErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelLogin.setBackground(new java.awt.Color(204, 204, 255));

        buttonLogin.setBackground(new java.awt.Color(139, 164, 225));
        buttonLogin.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        buttonLogin.setText("L O G I N");
        buttonLogin.setBorder(null);
        buttonLogin.setContentAreaFilled(false);
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.setOpaque(true);
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLoginMouseExited(evt);
            }
        });
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        labelAdminLogin.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        labelAdminLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAdminLogin.setText("A D M I N    L O G I N");

        textFieldUsername.setForeground(new java.awt.Color(102, 102, 102));
        textFieldUsername.setText("Username");
        textFieldUsername.setCaretPosition(0);
        textFieldUsername.setName(""); // NOI18N
        textFieldUsername.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/icon-user.png"))); // NOI18N
        textFieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldUsernameMouseClicked(evt);
            }
        });
        textFieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldUsernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldUsernameKeyReleased(evt);
            }
        });

        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setText("Password");
        passwordField.setEchoChar((char)0);
        passwordField.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/password-icon.png"))); // NOI18N
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });

        labelErrorMessage.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        labelErrorMessage.setForeground(new java.awt.Color(153, 0, 51));
        labelErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelAdminLogin)
                .addGap(8, 8, 8)
                .addComponent(textFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorMessage)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUsernameKeyPressed
        if(textFieldUsername.getForeground() != Color.BLACK && textFieldUsername.getText().equals("Username")) {
            textFieldUsername.setText("");
            textFieldUsername.setForeground(Color.BLACK);
        }
        
        labelErrorMessage.setText("");
    }//GEN-LAST:event_textFieldUsernameKeyPressed

    private void textFieldUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUsernameKeyReleased
        if(textFieldUsername.getText().isEmpty()) {
            textFieldUsername.setText("Username");
            textFieldUsername.setCaretPosition(0);
            textFieldUsername.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_textFieldUsernameKeyReleased

    private void textFieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldUsernameMouseClicked
        if(textFieldUsername.getForeground() != Color.BLACK && textFieldUsername.getText().equals("Username"))
            textFieldUsername.setCaretPosition(0);
    }//GEN-LAST:event_textFieldUsernameMouseClicked

    private boolean passwordEqualityCheck(String password) {
        char[] passwordArray = password.toCharArray();
        
        if (Arrays.equals(passwordField.getPassword(), passwordArray))
            return true;
            
        return false;
    }
    
    
    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(passwordField.getForeground() != Color.BLACK && passwordEqualityCheck("Password")) {
            passwordField.setText("");
            passwordField.setForeground(Color.BLACK);
            passwordField.setEchoChar('\u2022');
        }
        
        labelErrorMessage.setText("");
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
         if(passwordField.getPassword().length == 0) {
            passwordField.setEchoChar((char)0);
            passwordField.setText("Password");
            passwordField.setCaretPosition(0);
            passwordField.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_passwordFieldKeyReleased

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
        if(passwordField.getForeground() != Color.BLACK && passwordEqualityCheck("Password")) {
            passwordField.setCaretPosition(0);
        }
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        if(textFieldUsername.getText().equals("Admin") && passwordEqualityCheck("Admin")) {
            Dashboard dashboardFrame = new Dashboard();
            dashboardFrame.setVisible(true);
            dispose();
        }
        else {
            labelErrorMessage.setText("Username or password is incorrect, try again!");
        }
        
       
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseEntered
        buttonLogin.setBackground(new Color(196,223,255));
    }//GEN-LAST:event_buttonLoginMouseEntered

    private void buttonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseExited
        buttonLogin.setBackground(new Color(139,164,225));
    }//GEN-LAST:event_buttonLoginMouseExited

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
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel labelAdminLogin;
    private javax.swing.JLabel labelErrorMessage;
    private javax.swing.JPanel panelLogin;
    private gradebook.application.components.PasswordField passwordField;
    private gradebook.application.components.TextField textFieldUsername;
    // End of variables declaration//GEN-END:variables
}
