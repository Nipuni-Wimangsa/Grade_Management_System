package gradebook.application;

import gradebook.application.logic.Database;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class DeleteStudentForm extends javax.swing.JInternalFrame {

    public DeleteStudentForm() {
        initComponents();
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        textFieldIndex = new javax.swing.JTextField();
        labelIndex = new javax.swing.JLabel();
        buttonDelete = new gradebook.application.components.Button();

        panelMain.setBackground(new java.awt.Color(231, 233, 243));
        panelMain.setPreferredSize(new java.awt.Dimension(771, 611));

        textFieldIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldIndex.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));
        textFieldIndex.setName(""); // NOI18N

        labelIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelIndex.setText("Index No: ");

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIndex)
                    .addComponent(textFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(labelIndex)
                .addGap(0, 0, 0)
                .addComponent(textFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
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

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        Database database = new Database();
        database.updateData("DELETE FROM students WHERE Index_No = '"+textFieldIndex.getText()+"'");
        
        JOptionPane.showMessageDialog(null, "Data successfully deleted!", "Success", JOptionPane.INFORMATION_MESSAGE);
        textFieldIndex.setText("");
    }//GEN-LAST:event_buttonDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gradebook.application.components.Button buttonDelete;
    private javax.swing.JLabel labelIndex;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldIndex;
    // End of variables declaration//GEN-END:variables
}
