
package gradebook.application;

import gradebook.application.logic.Database;
import java.awt.print.PrinterJob;

public class Report extends javax.swing.JFrame {
    String index;
    
    public Report(String index) {
        this.index = index;
        initComponents();
        loadData();
    }

    private Report() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        labelReport = new javax.swing.JLabel();
        labelIndex = new javax.swing.JLabel();
        labelIndexFill = new javax.swing.JLabel();
        labelFullName = new javax.swing.JLabel();
        labelFullNameFill = new javax.swing.JLabel();
        labelMaths = new javax.swing.JLabel();
        labelMathsFill = new javax.swing.JLabel();
        labelScienceFill = new javax.swing.JLabel();
        labelScience = new javax.swing.JLabel();
        labelEnglish = new javax.swing.JLabel();
        labelEnglishFill = new javax.swing.JLabel();
        labelSinhala = new javax.swing.JLabel();
        labelSinhalaFill = new javax.swing.JLabel();
        labelICT = new javax.swing.JLabel();
        labelAverage = new javax.swing.JLabel();
        labelAverageFill = new javax.swing.JLabel();
        labelRank = new javax.swing.JLabel();
        labelRankFill = new javax.swing.JLabel();
        buttonPrint = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        labelICTFill = new javax.swing.JLabel();
        labelCommerce = new javax.swing.JLabel();
        labelCommerceFill = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        labelReport.setFont(new java.awt.Font("Cambria", 0, 23)); // NOI18N
        labelReport.setText("Student Grade Report");

        labelIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelIndex.setText("Index No: ");

        labelIndexFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelFullName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelFullName.setText("Full Name: ");

        labelFullNameFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelMaths.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelMaths.setText("Maths: ");

        labelMathsFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelScienceFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelScience.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelScience.setText("Science: ");

        labelEnglish.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelEnglish.setText("English: ");

        labelEnglishFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelSinhala.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelSinhala.setText("Sinhala: ");

        labelSinhalaFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelICT.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelICT.setText("ICT: ");

        labelAverage.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelAverage.setText("Average: ");

        labelAverageFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelRank.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelRank.setText("Rank: ");

        labelRankFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        buttonPrint.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        buttonPrint.setText("Print");
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });

        buttonExit.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        labelICTFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelCommerce.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelCommerce.setText("Commerce: ");

        labelCommerceFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFullName)
                            .addComponent(labelIndex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIndexFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFullNameFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelICT, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSinhala)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(labelAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAverageFill)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(labelRank, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelRankFill, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEnglish)
                                    .addComponent(labelMaths)
                                    .addComponent(labelScience)
                                    .addComponent(labelCommerce, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCommerceFill, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEnglishFill, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMathsFill, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelScienceFill, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSinhalaFill, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelICTFill, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 155, Short.MAX_VALUE))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelReport)
                        .addGap(28, 28, 28)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelIndex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelIndexFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelFullNameFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelMaths)
                            .addComponent(labelMathsFill))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelScience)
                            .addComponent(labelScienceFill))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEnglish)
                            .addComponent(labelEnglishFill))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSinhala)
                            .addComponent(labelSinhalaFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelICT))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelICTFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCommerce)
                    .addComponent(labelCommerceFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAverage)
                    .addComponent(labelAverageFill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRank)
                    .addComponent(labelRankFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPrint)
                    .addComponent(buttonExit))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
        PrinterJob printer = PrinterJob.getPrinterJob();
        printer.printDialog();
    }//GEN-LAST:event_buttonPrintActionPerformed

    
    private void loadData() {
        Database database = new Database();
        String sql = "";
        
        sql = "select Full_Name from students where Index_No = '"+index+"'";
        String[] fullName = {"Full_Name"};
        String[] dataSet = database.getData(sql, fullName);
        
        labelIndexFill.setText(index);
        labelFullNameFill.setText(dataSet[0]);
        
        
        sql = "select Maths, Science, English, Sinhala, ICT, Commerce, Average from grades where Index_No = '"+index+"'";
        String[] gradesColumns = {"Maths", "Science", "English", "Sinhala", "ICT", "Commerce", "Average"};
        String[] grades = database.getData(sql, gradesColumns);
        
        labelMathsFill.setText(grades[0]);
        labelScienceFill.setText(grades[1]);
        labelEnglishFill.setText(grades[2]);
        labelSinhalaFill.setText(grades[3]);
        labelICTFill.setText(grades[4]);
        labelCommerceFill.setText(grades[5]);
        labelAverageFill.setText(grades[6]);
        
        sql = "select Class_Rank from ranks where Index_No = '"+index+"'";
        String[] rankColumn = {"Class_Rank"};
        String[] rank = database.getData(sql, rankColumn);
        
        labelRankFill.setText(rank[0]);
    }
   
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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JLabel labelAverage;
    private javax.swing.JLabel labelAverageFill;
    private javax.swing.JLabel labelCommerce;
    private javax.swing.JLabel labelCommerceFill;
    private javax.swing.JLabel labelEnglish;
    private javax.swing.JLabel labelEnglishFill;
    private javax.swing.JLabel labelFullName;
    private javax.swing.JLabel labelFullNameFill;
    private javax.swing.JLabel labelICT;
    private javax.swing.JLabel labelICTFill;
    private javax.swing.JLabel labelIndex;
    private javax.swing.JLabel labelIndexFill;
    private javax.swing.JLabel labelMaths;
    private javax.swing.JLabel labelMathsFill;
    private javax.swing.JLabel labelRank;
    private javax.swing.JLabel labelRankFill;
    private javax.swing.JLabel labelReport;
    private javax.swing.JLabel labelScience;
    private javax.swing.JLabel labelScienceFill;
    private javax.swing.JLabel labelSinhala;
    private javax.swing.JLabel labelSinhalaFill;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
