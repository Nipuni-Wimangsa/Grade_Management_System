package gradebook.application;

import java.awt.Color;

public class Dashboard extends javax.swing.JFrame {
    private Color defaultColor,hoverColor;
    
    public Dashboard() {
        initComponents();
        defaultColor = new Color(203,215,252);
        hoverColor = Color.WHITE;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        panelMain = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        panelStudent = new javax.swing.JPanel();
        labelStudent = new javax.swing.JLabel();
        labelStudentIcon = new javax.swing.JLabel();
        panelGrades = new javax.swing.JPanel();
        labelGrades = new javax.swing.JLabel();
        labelGradesIcon = new javax.swing.JLabel();
        panelReport = new javax.swing.JPanel();
        labelReport = new javax.swing.JLabel();
        labelReportIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gradebook");
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(231, 233, 243));

        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/gradebook.png"))); // NOI18N

        panelStudent.setBackground(new java.awt.Color(203, 215, 252));
        panelStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 128, 175), 2, true));
        panelStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelStudent.setPreferredSize(new java.awt.Dimension(200, 200));
        panelStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelStudentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelStudentMouseExited(evt);
            }
        });

        labelStudent.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        labelStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStudent.setText("Student Registration");

        labelStudentIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStudentIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/student.png"))); // NOI18N

        javax.swing.GroupLayout panelStudentLayout = new javax.swing.GroupLayout(panelStudent);
        panelStudent.setLayout(panelStudentLayout);
        panelStudentLayout.setHorizontalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addComponent(labelStudentIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(labelStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelStudentLayout.setVerticalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(labelStudentIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStudent)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panelGrades.setBackground(new java.awt.Color(203, 215, 252));
        panelGrades.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 128, 175), 2, true));
        panelGrades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelGrades.setPreferredSize(new java.awt.Dimension(200, 200));
        panelGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGradesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelGradesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelGradesMouseExited(evt);
            }
        });

        labelGrades.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        labelGrades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGrades.setText("Grade Calculation");

        labelGradesIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGradesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/grade.png"))); // NOI18N

        javax.swing.GroupLayout panelGradesLayout = new javax.swing.GroupLayout(panelGrades);
        panelGrades.setLayout(panelGradesLayout);
        panelGradesLayout.setHorizontalGroup(
            panelGradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradesLayout.createSequentialGroup()
                .addComponent(labelGradesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(labelGrades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelGradesLayout.setVerticalGroup(
            panelGradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGradesLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(labelGradesIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelGrades)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panelReport.setBackground(new java.awt.Color(203, 215, 252));
        panelReport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 128, 175), 2, true));
        panelReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelReport.setPreferredSize(new java.awt.Dimension(200, 200));
        panelReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelReportMouseExited(evt);
            }
        });

        labelReport.setFont(new java.awt.Font("Candara", 0, 22)); // NOI18N
        labelReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReport.setText("Reports & Records ");

        labelReportIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReportIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradebook/application/icons/report.png"))); // NOI18N

        javax.swing.GroupLayout panelReportLayout = new javax.swing.GroupLayout(panelReport);
        panelReport.setLayout(panelReportLayout);
        panelReportLayout.setHorizontalGroup(
            panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportLayout.createSequentialGroup()
                .addComponent(labelReportIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(labelReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelReportLayout.setVerticalGroup(
            panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(labelReportIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelReport)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(panelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(panelGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGrades, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );

        desktopPane.setLayer(panelMain, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelStudentMouseEntered
        panelStudent.setBackground(hoverColor);
    }//GEN-LAST:event_panelStudentMouseEntered

    private void panelStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelStudentMouseExited
        panelStudent.setBackground(defaultColor);
    }//GEN-LAST:event_panelStudentMouseExited

    private void panelGradesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradesMouseEntered
        panelGrades.setBackground(hoverColor);
    }//GEN-LAST:event_panelGradesMouseEntered

    private void panelGradesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradesMouseExited
         panelGrades.setBackground(defaultColor);
    }//GEN-LAST:event_panelGradesMouseExited

    private void panelReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReportMouseEntered
        panelReport.setBackground(hoverColor);
    }//GEN-LAST:event_panelReportMouseEntered

    private void panelReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReportMouseExited
        panelReport.setBackground(defaultColor);
    }//GEN-LAST:event_panelReportMouseExited

    private void panelStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelStudentMouseClicked
        StudentRegistration frame = new StudentRegistration();
        desktopPane.add(frame).setVisible(true); 
    }//GEN-LAST:event_panelStudentMouseClicked

    private void panelGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradesMouseClicked
        GradeCalculation frame = new GradeCalculation();
        desktopPane.add(frame).setVisible(true); 
    }//GEN-LAST:event_panelGradesMouseClicked

    private void panelReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReportMouseClicked
        ReportsAndRecords frame = new ReportsAndRecords();
        desktopPane.add(frame).setVisible(true); 
    }//GEN-LAST:event_panelReportMouseClicked


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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelGrades;
    private javax.swing.JLabel labelGradesIcon;
    private javax.swing.JLabel labelReport;
    private javax.swing.JLabel labelReportIcon;
    private javax.swing.JLabel labelStudent;
    private javax.swing.JLabel labelStudentIcon;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelGrades;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelReport;
    private javax.swing.JPanel panelStudent;
    // End of variables declaration//GEN-END:variables
}
