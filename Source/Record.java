
package gradebook.application;

import gradebook.application.logic.Database;
import java.awt.print.PrinterJob;

public class Record extends javax.swing.JFrame {
    String index;
    
    public Record(String index) {
        this.index = index;
        initComponents();
        loadData();
    }

    private Record() {
        
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
        buttonPrint = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        labelAddressFill = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelBirthdayFill = new javax.swing.JLabel();
        labelBirthday = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        labelPhoneFill = new javax.swing.JLabel();
        labelParent = new javax.swing.JLabel();
        labelParentFill = new javax.swing.JLabel();
        labelGenderFill = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        labelGrade = new javax.swing.JLabel();
        labelGradeFill = new javax.swing.JLabel();
        labelClass = new javax.swing.JLabel();
        labelClassFill = new javax.swing.JLabel();
        labelBlood = new javax.swing.JLabel();
        labelBloodFill = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        labelReport.setFont(new java.awt.Font("Cambria", 0, 23)); // NOI18N
        labelReport.setText("Student Record");

        labelIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelIndex.setText("Index No: ");

        labelIndexFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelFullName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelFullName.setText("Full Name: ");

        labelFullNameFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

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

        labelAddressFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelAddress.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelAddress.setText("Address: ");

        labelBirthdayFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelBirthday.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelBirthday.setText("Birthday: ");

        labelPhone.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelPhone.setText("Phone: ");

        labelPhoneFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelParent.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelParent.setText("Parent: ");

        labelParentFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelGenderFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelGender.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelGender.setText("Gender: ");

        labelGrade.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelGrade.setText("Grade: ");

        labelGradeFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelClass.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelClass.setText("Class: ");

        labelClassFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        labelBlood.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelBlood.setText("Blood: ");

        labelBloodFill.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(buttonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelReport, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(170, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(labelPhone)
                                .addGap(36, 36, 36)
                                .addComponent(labelPhoneFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFullName)
                                    .addComponent(labelIndex)
                                    .addComponent(labelAddress)
                                    .addComponent(labelBirthday))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBirthdayFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelAddressFill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelIndexFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelFullNameFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelParent)
                                    .addComponent(labelGender)
                                    .addComponent(labelGrade)
                                    .addComponent(labelClass)
                                    .addComponent(labelBlood))
                                .addGap(31, 31, 31)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBloodFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelClassFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelGradeFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelGenderFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelParentFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(22, 22, 22))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(16, 16, 16)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAddressFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBirthdayFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPhoneFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelParent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelParentFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelGenderFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelGradeFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelClassFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelBlood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBloodFill, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
        
        sql = "select Full_Name, Address, Birthday, Phone_No, Parent_Name, Gender, Grade, Class, Blood_Group from students where Index_No = '"+index+"'";
        String[] columns = {"Full_Name", "Address", "Birthday", "Phone_No", "Parent_Name", "Gender", "Grade", "Class", "Blood_Group"};
        String[] dataSet = database.getData(sql, columns);
        
        labelIndexFill.setText(index);
        labelFullNameFill.setText(dataSet[0]);
        labelAddressFill.setText(dataSet[1]);
        labelBirthdayFill.setText(dataSet[2]);        
        labelPhoneFill.setText(dataSet[3]);
        labelParentFill.setText(dataSet[4]);
        labelGenderFill.setText(dataSet[5]);
        labelGradeFill.setText(dataSet[6]);
        labelClassFill.setText(dataSet[7]);
        labelBloodFill.setText(dataSet[8]);
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
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelAddressFill;
    private javax.swing.JLabel labelBirthday;
    private javax.swing.JLabel labelBirthdayFill;
    private javax.swing.JLabel labelBlood;
    private javax.swing.JLabel labelBloodFill;
    private javax.swing.JLabel labelClass;
    private javax.swing.JLabel labelClassFill;
    private javax.swing.JLabel labelFullName;
    private javax.swing.JLabel labelFullNameFill;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelGenderFill;
    private javax.swing.JLabel labelGrade;
    private javax.swing.JLabel labelGradeFill;
    private javax.swing.JLabel labelIndex;
    private javax.swing.JLabel labelIndexFill;
    private javax.swing.JLabel labelParent;
    private javax.swing.JLabel labelParentFill;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelPhoneFill;
    private javax.swing.JLabel labelReport;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
