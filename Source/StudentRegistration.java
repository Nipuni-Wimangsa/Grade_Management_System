package gradebook.application;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class StudentRegistration extends javax.swing.JInternalFrame {
    private Color hoverColor, defaultColor, clickedColor;

    public StudentRegistration() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        clickedColor = Color.WHITE;
        defaultColor = new Color(165,178,209);
        hoverColor = new Color(126,143,183);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelDashboard = new javax.swing.JPanel();
        labelDashboardTitle = new javax.swing.JLabel();
        seperatorDashboardTitle = new javax.swing.JSeparator();
        labelRegister = new javax.swing.JLabel();
        labelEdit = new javax.swing.JLabel();
        labelDelete = new javax.swing.JLabel();
        panelButton = new javax.swing.JPanel();
        labelBackIcon = new javax.swing.JLabel();
        labelMainMenu = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        panelForms = new javax.swing.JPanel();
        labelRegisterStudentIcon = new javax.swing.JLabel();
        labelStudent = new javax.swing.JLabel();

        panelMain.setBackground(new java.awt.Color(231, 233, 243));
        panelMain.setPreferredSize(new java.awt.Dimension(1061, 611));

        panelDashboard.setBackground(new java.awt.Color(165, 178, 209));

        labelDashboardTitle.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        labelDashboardTitle.setText("Student Registration");

        seperatorDashboardTitle.setBackground(new java.awt.Color(0, 0, 0));
        seperatorDashboardTitle.setForeground(new java.awt.Color(0, 0, 0));
        seperatorDashboardTitle.setOpaque(true);

        labelRegister.setBackground(new java.awt.Color(165, 178, 209));
        labelRegister.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        labelRegister.setText("     Register");
        labelRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRegister.setOpaque(true);
        labelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRegisterMouseExited(evt);
            }
        });

        labelEdit.setBackground(new java.awt.Color(165, 178, 209));
        labelEdit.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        labelEdit.setText("     Edit");
        labelEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEdit.setOpaque(true);
        labelEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelEditMouseExited(evt);
            }
        });

        labelDelete.setBackground(new java.awt.Color(165, 178, 209));
        labelDelete.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        labelDelete.setText("     Delete");
        labelDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelDelete.setOpaque(true);
        labelDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelDeleteMouseExited(evt);
            }
        });

        panelButton.setBackground(new java.awt.Color(165, 178, 209));
        panelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelButtonMouseExited(evt);
            }
        });

        labelBackIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/back-1.png"))); // NOI18N

        labelMainMenu.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        labelMainMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMainMenu.setText("Main Menu");
        labelMainMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 1, 1));

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labelBackIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonLayout.createSequentialGroup()
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBackIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout panelDashboardLayout = new javax.swing.GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDashboardLayout.createSequentialGroup()
                        .addComponent(seperatorDashboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(labelDashboardTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelDashboardLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelDashboardTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperatorDashboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        panelForms.setBackground(new java.awt.Color(231, 233, 243));

        labelRegisterStudentIcon.setBackground(new java.awt.Color(0, 102, 102));
        labelRegisterStudentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/student-big.png"))); // NOI18N
        labelRegisterStudentIcon.setRequestFocusEnabled(false);

        labelStudent.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        labelStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStudent.setText("Student Registration");

        javax.swing.GroupLayout panelFormsLayout = new javax.swing.GroupLayout(panelForms);
        panelForms.setLayout(panelFormsLayout);
        panelFormsLayout.setHorizontalGroup(
            panelFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFormsLayout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(labelRegisterStudentIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        panelFormsLayout.setVerticalGroup(
            panelFormsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormsLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(labelRegisterStudentIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStudent)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        desktopPane.setLayer(panelForms, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desktopPane))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegisterMouseEntered
        labelRegister.setBackground(hoverColor);
    }//GEN-LAST:event_labelRegisterMouseEntered

    private void labelRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegisterMouseExited
        labelRegister.setBackground(defaultColor);
    }//GEN-LAST:event_labelRegisterMouseExited

    private void labelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegisterMouseClicked
        labelRegister.setForeground(clickedColor);
        labelRegister.setFont(new java.awt.Font("Cambria", 1, 20));
        
        labelEdit.setForeground(Color.black);
        labelEdit.setFont(new java.awt.Font("Cambria", 0, 20));
        
        labelDelete.setForeground(Color.black);
        labelDelete.setFont(new java.awt.Font("Cambria", 0, 20));
        
        
        RegisterStudentForm frame = new RegisterStudentForm();
        desktopPane.add(frame).setVisible(true); 
    }//GEN-LAST:event_labelRegisterMouseClicked

    private void labelEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEditMouseExited
        labelEdit.setBackground(defaultColor);
    }//GEN-LAST:event_labelEditMouseExited

    private void labelEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEditMouseClicked
        labelRegister.setForeground(Color.black);
        labelRegister.setFont(new java.awt.Font("Cambria",0, 20));
        
        labelEdit.setForeground(clickedColor);
        labelEdit.setFont(new java.awt.Font("Cambria", 1, 20));
        
        labelDelete.setForeground(Color.black);
        labelDelete.setFont(new java.awt.Font("Cambria", 0, 20));
        
        EditStudentFormMain frame = new EditStudentFormMain();
        desktopPane.add(frame).setVisible(true); 
    }//GEN-LAST:event_labelEditMouseClicked

    private void labelEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEditMouseEntered
        labelEdit.setBackground(hoverColor);
    }//GEN-LAST:event_labelEditMouseEntered

    private void labelDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseClicked
        labelRegister.setForeground(Color.black);
        labelRegister.setFont(new java.awt.Font("Cambria", 0, 20));
        
        labelEdit.setForeground(Color.black);
        labelEdit.setFont(new java.awt.Font("Cambria", 0, 20));
        
        labelDelete.setForeground(clickedColor);
        labelDelete.setFont(new java.awt.Font("Cambria", 1, 20));
        
        DeleteStudentForm frame = new DeleteStudentForm();
        desktopPane.add(frame).setVisible(true); 
    }//GEN-LAST:event_labelDeleteMouseClicked

    private void labelDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseExited
        labelDelete.setBackground(defaultColor);
    }//GEN-LAST:event_labelDeleteMouseExited

    private void labelDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDeleteMouseEntered
        labelDelete.setBackground(hoverColor);
    }//GEN-LAST:event_labelDeleteMouseEntered

    private void panelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonMouseClicked
        dispose();
    }//GEN-LAST:event_panelButtonMouseClicked

    private void panelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonMouseEntered
        labelMainMenu.setFont(new java.awt.Font("Candara", 0, 25));
    }//GEN-LAST:event_panelButtonMouseEntered

    private void panelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonMouseExited
        labelMainMenu.setFont(new java.awt.Font("Candara", 0, 22));
    }//GEN-LAST:event_panelButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelBackIcon;
    private javax.swing.JLabel labelDashboardTitle;
    private javax.swing.JLabel labelDelete;
    private javax.swing.JLabel labelEdit;
    private javax.swing.JLabel labelMainMenu;
    private javax.swing.JLabel labelRegister;
    private javax.swing.JLabel labelRegisterStudentIcon;
    private javax.swing.JLabel labelStudent;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPanel panelForms;
    private javax.swing.JPanel panelMain;
    private javax.swing.JSeparator seperatorDashboardTitle;
    // End of variables declaration//GEN-END:variables
}
