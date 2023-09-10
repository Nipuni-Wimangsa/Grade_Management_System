
package gradebook.application;

import java.util.ArrayList;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class EditStudentFormMain extends javax.swing.JInternalFrame {
    private String indexNo;
     
    public EditStudentFormMain() {
        initComponents();
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        panelMain = new javax.swing.JPanel();
        textFieldIndex = new javax.swing.JTextField();
        labelIndex = new javax.swing.JLabel();
        checkBoxIndex = new javax.swing.JCheckBox();
        checkBoxFullName = new javax.swing.JCheckBox();
        checkBoxAddress = new javax.swing.JCheckBox();
        checkBoxBirthday = new javax.swing.JCheckBox();
        checkBoxPhone = new javax.swing.JCheckBox();
        checkBoxParentName = new javax.swing.JCheckBox();
        checkBoxGender = new javax.swing.JCheckBox();
        checkBoxGrade = new javax.swing.JCheckBox();
        checkBoxClass = new javax.swing.JCheckBox();
        checkBoxBloodGroup = new javax.swing.JCheckBox();
        labelEditFields = new javax.swing.JLabel();
        buttonSearch = new gradebook.application.components.Button();

        desktopPane.setBackground(new java.awt.Color(231, 233, 243));

        panelMain.setBackground(new java.awt.Color(231, 233, 243));

        textFieldIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldIndex.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));

        labelIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelIndex.setText("Index No: ");

        checkBoxIndex.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxIndex.setText("Index No");
        checkBoxIndex.setFocusable(false);

        checkBoxFullName.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxFullName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxFullName.setText("Full Name");
        checkBoxFullName.setFocusable(false);

        checkBoxAddress.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxAddress.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxAddress.setText("Address");
        checkBoxAddress.setFocusable(false);

        checkBoxBirthday.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxBirthday.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxBirthday.setText("Birthday");
        checkBoxBirthday.setFocusable(false);

        checkBoxPhone.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxPhone.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxPhone.setText("Phone No");
        checkBoxPhone.setFocusable(false);

        checkBoxParentName.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxParentName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxParentName.setText("Parent Name");
        checkBoxParentName.setFocusable(false);

        checkBoxGender.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxGender.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxGender.setText("Gender");
        checkBoxGender.setFocusable(false);

        checkBoxGrade.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxGrade.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxGrade.setText("Grade");
        checkBoxGrade.setFocusable(false);

        checkBoxClass.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxClass.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxClass.setText("Class");
        checkBoxClass.setFocusable(false);

        checkBoxBloodGroup.setBackground(new java.awt.Color(231, 233, 243));
        checkBoxBloodGroup.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        checkBoxBloodGroup.setText("Blood Group");
        checkBoxBloodGroup.setFocusable(false);

        labelEditFields.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelEditFields.setText("Fields to Edit: ");

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEditFields, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIndex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxPhone)
                                    .addComponent(checkBoxIndex)
                                    .addComponent(checkBoxClass))
                                .addGap(24, 24, 24)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxParentName)
                                    .addComponent(checkBoxFullName)
                                    .addComponent(checkBoxBloodGroup))
                                .addGap(26, 26, 26)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxAddress)
                                    .addComponent(checkBoxGender))
                                .addGap(39, 39, 39)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxGrade)
                                    .addComponent(checkBoxBirthday)))
                            .addComponent(textFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIndex))
                .addGap(50, 50, 50)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxIndex)
                    .addComponent(checkBoxFullName)
                    .addComponent(checkBoxAddress)
                    .addComponent(checkBoxBirthday)
                    .addComponent(labelEditFields))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxPhone)
                    .addComponent(checkBoxParentName)
                    .addComponent(checkBoxGender)
                    .addComponent(checkBoxGrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxClass)
                    .addComponent(checkBoxBloodGroup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
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
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String[] fieldsToEdit = selectionCheck();
        
        EditStudent frame = new EditStudent(fieldsToEdit, indexNo);
        desktopPane.add(frame).setVisible(true);
    }//GEN-LAST:event_buttonSearchActionPerformed

    private String[] selectionCheck() {
        ArrayList<String> array = new ArrayList<String>();
        
        if(checkBoxIndex.isSelected()) {
          array.add("Index_No");
          checkBoxIndex.setSelected(false);
        }
            
        if(checkBoxFullName.isSelected()) {
            array.add("Full_Name");
            checkBoxFullName.setSelected(false);
        }
            
        if(checkBoxAddress.isSelected()) {
            array.add("Address");
            checkBoxAddress.setSelected(false);
        }
            
        if(checkBoxBirthday.isSelected()) {
           array.add("Birthday");
           checkBoxBirthday.setSelected(false);
        }
            
        if(checkBoxPhone.isSelected()) {
            array.add("Phone_No");
            checkBoxPhone.setSelected(false);
        }
            
        if(checkBoxParentName.isSelected()) {
            array.add("Parent_Name");
            checkBoxParentName.setSelected(false);
        }
            
        if(checkBoxGender.isSelected()) {
            array.add("Gender");
            checkBoxGender.setSelected(false);
        }
            
        if(checkBoxGrade.isSelected()) {
            array.add("Grade");
            checkBoxGrade.setSelected(false);
        }
            
        if(checkBoxClass.isSelected()) {
            array.add("Class");
            checkBoxClass.setSelected(false);
        }
            
        if(checkBoxBloodGroup.isSelected()) {
            array.add("Blood_Group");
            checkBoxBloodGroup.setSelected(false);
        }
            
        indexNo = textFieldIndex.getText();
        textFieldIndex.setText("");
        
        String[] fieldsToEdit = new String[array.size()];
        fieldsToEdit = array.toArray(fieldsToEdit);
        
        return fieldsToEdit;        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gradebook.application.components.Button buttonSearch;
    private javax.swing.JCheckBox checkBoxAddress;
    private javax.swing.JCheckBox checkBoxBirthday;
    private javax.swing.JCheckBox checkBoxBloodGroup;
    private javax.swing.JCheckBox checkBoxClass;
    private javax.swing.JCheckBox checkBoxFullName;
    private javax.swing.JCheckBox checkBoxGender;
    private javax.swing.JCheckBox checkBoxGrade;
    private javax.swing.JCheckBox checkBoxIndex;
    private javax.swing.JCheckBox checkBoxParentName;
    private javax.swing.JCheckBox checkBoxPhone;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel labelEditFields;
    private javax.swing.JLabel labelIndex;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField textFieldIndex;
    // End of variables declaration//GEN-END:variables
}
