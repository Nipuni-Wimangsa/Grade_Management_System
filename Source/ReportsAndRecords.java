package gradebook.application;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class ReportsAndRecords extends javax.swing.JInternalFrame {
    private Color hoverColor, defaultColor, clickedColor;
    
    public ReportsAndRecords() {
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
        panelButton = new javax.swing.JPanel();
        labelBackIcon = new javax.swing.JLabel();
        labelMainMenu = new javax.swing.JLabel();
        labelReports = new javax.swing.JLabel();
        labelRecords = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        panelForms = new javax.swing.JPanel();
        labelRegisterStudentIcon = new javax.swing.JLabel();
        labelStudent = new javax.swing.JLabel();

        panelMain.setBackground(new java.awt.Color(231, 233, 243));
        panelMain.setPreferredSize(new java.awt.Dimension(1061, 611));

        panelDashboard.setBackground(new java.awt.Color(165, 178, 209));
        panelDashboard.setPreferredSize(new java.awt.Dimension(290, 350));

        labelDashboardTitle.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        labelDashboardTitle.setText("Reports & Records");

        seperatorDashboardTitle.setBackground(new java.awt.Color(0, 0, 0));
        seperatorDashboardTitle.setForeground(new java.awt.Color(0, 0, 0));
        seperatorDashboardTitle.setOpaque(true);

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

        labelReports.setBackground(new java.awt.Color(165, 178, 209));
        labelReports.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        labelReports.setText("     Reports");
        labelReports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelReports.setOpaque(true);
        labelReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelReportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelReportsMouseExited(evt);
            }
        });

        labelRecords.setBackground(new java.awt.Color(165, 178, 209));
        labelRecords.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        labelRecords.setText("     Records");
        labelRecords.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRecords.setOpaque(true);
        labelRecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRecordsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRecordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRecordsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelDashboardLayout = new javax.swing.GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDashboardTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDashboardLayout.createSequentialGroup()
                        .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seperatorDashboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 25, Short.MAX_VALUE))))
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelReports, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRecords, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelDashboardTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperatorDashboardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelReports, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        panelForms.setBackground(new java.awt.Color(231, 233, 243));

        labelRegisterStudentIcon.setBackground(new java.awt.Color(0, 102, 102));
        labelRegisterStudentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/report-big.png"))); // NOI18N
        labelRegisterStudentIcon.setRequestFocusEnabled(false);

        labelStudent.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        labelStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStudent.setText("Reports & Records");

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonMouseClicked
        dispose();
    }//GEN-LAST:event_panelButtonMouseClicked

    private void panelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonMouseEntered
        labelMainMenu.setFont(new java.awt.Font("Candara", 0, 25));
    }//GEN-LAST:event_panelButtonMouseEntered

    private void panelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelButtonMouseExited
        labelMainMenu.setFont(new java.awt.Font("Candara", 0, 22));
    }//GEN-LAST:event_panelButtonMouseExited

    private void labelReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReportsMouseClicked
        labelReports.setForeground(clickedColor);
        labelReports.setFont(new java.awt.Font("Cambria", 1, 20));

        labelRecords.setForeground(Color.black);
        labelRecords.setFont(new java.awt.Font("Cambria", 0, 20));


        ReportsForm frame = new ReportsForm();
        desktopPane.add(frame).setVisible(true);
    }//GEN-LAST:event_labelReportsMouseClicked

    private void labelReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReportsMouseEntered
        labelReports.setBackground(hoverColor);
    }//GEN-LAST:event_labelReportsMouseEntered

    private void labelReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelReportsMouseExited
        labelReports.setBackground(defaultColor);
    }//GEN-LAST:event_labelReportsMouseExited

    private void labelRecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRecordsMouseClicked
        labelReports.setForeground(Color.black);
        labelReports.setFont(new java.awt.Font("Cambria",0, 20));

        labelRecords.setForeground(clickedColor);
        labelRecords.setFont(new java.awt.Font("Cambria", 1, 20));


        RecordForm frame = new RecordForm();
        desktopPane.add(frame).setVisible(true);
    }//GEN-LAST:event_labelRecordsMouseClicked

    private void labelRecordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRecordsMouseEntered
        labelRecords.setBackground(hoverColor);
    }//GEN-LAST:event_labelRecordsMouseEntered

    private void labelRecordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRecordsMouseExited
        labelRecords.setBackground(defaultColor);
    }//GEN-LAST:event_labelRecordsMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelBackIcon;
    private javax.swing.JLabel labelDashboardTitle;
    private javax.swing.JLabel labelMainMenu;
    private javax.swing.JLabel labelRecords;
    private javax.swing.JLabel labelRegisterStudentIcon;
    private javax.swing.JLabel labelReports;
    private javax.swing.JLabel labelStudent;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPanel panelForms;
    private javax.swing.JPanel panelMain;
    private javax.swing.JSeparator seperatorDashboardTitle;
    // End of variables declaration//GEN-END:variables
}
