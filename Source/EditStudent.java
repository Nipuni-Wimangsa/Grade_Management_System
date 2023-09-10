package gradebook.application;

import gradebook.application.logic.Database;
import gradebook.application.logic.Student;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class EditStudent extends javax.swing.JInternalFrame {
    private String[] data;
    private String[] fieldsToEdit;
    private String[] columnNames = {"Index_No", "Full_Name", "Address", "Birthday", "Phone_No", "Parent_Name", 
        "Gender", "Grade", "Class", "Blood_Group", "Photo_Path"};
    private String photoPath;
    
    private String indexNo;

    public EditStudent(String[] filedsToEdit, String indexNo) {
        initComponents();
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        this.fieldsToEdit = filedsToEdit;
        this.indexNo = indexNo;
        
        String sql = "SELECT * FROM students WHERE Index_No = '"+indexNo+"'";
        
        Database database = new Database();
        data = database.getData(sql, columnNames);
        
        photoPath = data[10];
        autoFillData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        labelFullName = new javax.swing.JLabel();
        textFieldFullName = new javax.swing.JTextField();
        labelAddress = new javax.swing.JLabel();
        textFieldAddress = new javax.swing.JTextField();
        labelBirthday = new javax.swing.JLabel();
        textFieldBirthday = new javax.swing.JTextField();
        labelIndexNo = new javax.swing.JLabel();
        textFieldIndex = new javax.swing.JTextField();
        labelPhoneNo = new javax.swing.JLabel();
        textFieldPhone = new javax.swing.JTextField();
        labelParentName = new javax.swing.JLabel();
        textFieldParentName = new javax.swing.JTextField();
        labelGender = new javax.swing.JLabel();
        radioButtonMale = new javax.swing.JRadioButton();
        radioButtonFemale = new javax.swing.JRadioButton();
        labelGrade = new javax.swing.JLabel();
        comboBoxGrade = new javax.swing.JComboBox<>();
        labelClass = new javax.swing.JLabel();
        comboBoxClass = new javax.swing.JComboBox<>();
        labelBloodGroup = new javax.swing.JLabel();
        comboBoxBloodGroup = new javax.swing.JComboBox<>();
        buttonEditNew = new gradebook.application.components.Button();
        buttonSubmit = new gradebook.application.components.Button();
        buttonExit = new gradebook.application.components.Button();

        panelMain.setBackground(new java.awt.Color(231, 233, 243));
        panelMain.setPreferredSize(new java.awt.Dimension(771, 611));

        labelFullName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelFullName.setText("Full Name: ");

        textFieldFullName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldFullName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));

        labelAddress.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelAddress.setText("Address: ");

        textFieldAddress.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));

        labelBirthday.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelBirthday.setText("Birthday: ");

        textFieldBirthday.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldBirthday.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));

        labelIndexNo.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelIndexNo.setText("Index No:");

        textFieldIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldIndex.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));

        labelPhoneNo.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelPhoneNo.setText("Phone No:");

        textFieldPhone.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldPhone.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));

        labelParentName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelParentName.setText("Parent Name: ");

        textFieldParentName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldParentName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));

        labelGender.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelGender.setText("Gender: ");

        buttonGroup.add(radioButtonMale);
        radioButtonMale.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        radioButtonMale.setText("Male");
        radioButtonMale.setOpaque(false);

        buttonGroup.add(radioButtonFemale);
        radioButtonFemale.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        radioButtonFemale.setText("Female");
        radioButtonFemale.setOpaque(false);

        labelGrade.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelGrade.setText("Grade: ");

        comboBoxGrade.setBackground(new java.awt.Color(231, 233, 243));
        comboBoxGrade.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        comboBoxGrade.setMaximumRowCount(5);
        comboBoxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "06", "07", "08", "09", "10", "11" }));
        comboBoxGrade.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 1, 1));
        comboBoxGrade.setFocusable(false);

        labelClass.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelClass.setText("Class: ");

        comboBoxClass.setBackground(new java.awt.Color(231, 233, 243));
        comboBoxClass.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        comboBoxClass.setMaximumRowCount(5);
        comboBoxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A", "B", "C", "D" }));
        comboBoxClass.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 1, 1));
        comboBoxClass.setFocusable(false);

        labelBloodGroup.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelBloodGroup.setText("Blood Group: ");

        comboBoxBloodGroup.setBackground(new java.awt.Color(231, 233, 243));
        comboBoxBloodGroup.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        comboBoxBloodGroup.setMaximumRowCount(5);
        comboBoxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-" }));
        comboBoxBloodGroup.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 1, 1));
        comboBoxBloodGroup.setFocusable(false);

        buttonEditNew.setText("Edit New Record");
        buttonEditNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditNewActionPerformed(evt);
            }
        });

        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(labelGender)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonMale)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonFemale))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(labelGrade)
                                .addGap(27, 27, 27)
                                .addComponent(comboBoxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(labelClass)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(labelBloodGroup)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(buttonEditNew, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldFullName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldParentName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelBirthday)
                                    .addComponent(labelPhoneNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldIndex)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelParentName)
                                            .addComponent(labelIndexNo))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(labelFullName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAddress, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelFullName)
                .addGap(0, 0, 0)
                .addComponent(textFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAddress)
                .addGap(0, 0, 0)
                .addComponent(textFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBirthday)
                    .addComponent(labelIndexNo))
                .addGap(0, 0, 0)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhoneNo)
                    .addComponent(labelParentName))
                .addGap(0, 0, 0)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGender)
                    .addComponent(radioButtonMale)
                    .addComponent(radioButtonFemale))
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGrade)
                    .addComponent(comboBoxGrade)
                    .addComponent(labelClass)
                    .addComponent(comboBoxClass)
                    .addComponent(labelBloodGroup)
                    .addComponent(comboBoxBloodGroup))
                .addGap(68, 68, 68)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditNew, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
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

    private void buttonEditNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditNewActionPerformed
        dispose();
    }//GEN-LAST:event_buttonEditNewActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        Database database = new Database();
        database.updateData("DELETE FROM students WHERE Index_No = '"+indexNo+"'");
        
        
        String gender = "";
        if(radioButtonFemale.isSelected())
        gender = "Female";
        else if(radioButtonMale.isSelected())
        gender = "Male";

        Student student = new Student(
            textFieldFullName.getText(),
            textFieldAddress.getText(),
            textFieldBirthday.getText(),
            textFieldIndex.getText(),
            textFieldPhone.getText(),
            textFieldParentName.getText(),
            gender,
            comboBoxGrade.getItemAt(comboBoxGrade.getSelectedIndex()),
            comboBoxClass.getItemAt(comboBoxClass.getSelectedIndex()),
            comboBoxBloodGroup.getItemAt(comboBoxBloodGroup.getSelectedIndex()),
            photoPath
        );

        if(student.errorsDetected()) {
            ArrayList<String> errorFields = student.getErrorFields();
            String errorMessage = "Fields that contains errors:\n[";

            for(int counter = 0; counter < errorFields.size(); counter++) {
                errorMessage = errorMessage + errorFields.get(counter) + ", ";
            }

            errorMessage = errorMessage.substring(0, errorMessage.length()-2);
            errorMessage += "]";

            JOptionPane.showMessageDialog(null, errorMessage, "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Data successfully updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void autoFillData() {
        textFieldIndex.setText(data[0]);
        if(!Arrays.asList(fieldsToEdit).contains("Index_No"))
            textFieldIndex.setEnabled(false);
            
        
        textFieldFullName.setText(data[1]);
        if(!Arrays.asList(fieldsToEdit).contains("Full_Name"))
            textFieldFullName.setEnabled(false);
        
        textFieldAddress.setText(data[2]);
        if(!Arrays.asList(fieldsToEdit).contains("Address"))
            textFieldAddress.setEnabled(false);
        
        textFieldBirthday.setText(data[3]);
        if(!Arrays.asList(fieldsToEdit).contains("Birthday"))
            textFieldBirthday.setEnabled(false);
        
        textFieldPhone.setText(data[4]);
        if(!Arrays.asList(fieldsToEdit).contains("Phone_No"))
            textFieldPhone.setEnabled(false);
        
        textFieldParentName.setText(data[5]);
        if(!Arrays.asList(fieldsToEdit).contains("Parent_Name"))
            textFieldParentName.setEnabled(false);
        
        
        if(data[6].equals("Female"))
            radioButtonFemale.setSelected(true);
        else if(data[6].equals("Male"))
            radioButtonMale.setSelected(true);
        
        if(!Arrays.asList(fieldsToEdit).contains("Gender")) {
            radioButtonFemale.setEnabled(false);
            radioButtonMale.setEnabled(false);
        }
        
        
        comboBoxGrade.setSelectedItem(data[7]);
        comboBoxClass.setSelectedItem(data[8]);
        comboBoxBloodGroup.setSelectedItem(data[9]);
        
        if(!Arrays.asList(fieldsToEdit).contains("Grade"))
            comboBoxGrade.setEnabled(false);  
        
        if(!Arrays.asList(fieldsToEdit).contains("Class"))
            comboBoxClass.setEnabled(false);  
        
        if(!Arrays.asList(fieldsToEdit).contains("Blood_Group"))
            comboBoxBloodGroup.setEnabled(false);  
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gradebook.application.components.Button buttonEditNew;
    private gradebook.application.components.Button buttonExit;
    private javax.swing.ButtonGroup buttonGroup;
    private gradebook.application.components.Button buttonSubmit;
    private javax.swing.JComboBox<String> comboBoxBloodGroup;
    private javax.swing.JComboBox<String> comboBoxClass;
    private javax.swing.JComboBox<String> comboBoxGrade;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelBirthday;
    private javax.swing.JLabel labelBloodGroup;
    private javax.swing.JLabel labelClass;
    private javax.swing.JLabel labelFullName;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelGrade;
    private javax.swing.JLabel labelIndexNo;
    private javax.swing.JLabel labelParentName;
    private javax.swing.JLabel labelPhoneNo;
    private javax.swing.JPanel panelMain;
    private javax.swing.JRadioButton radioButtonFemale;
    private javax.swing.JRadioButton radioButtonMale;
    private javax.swing.JTextField textFieldAddress;
    private javax.swing.JTextField textFieldBirthday;
    private javax.swing.JTextField textFieldFullName;
    private javax.swing.JTextField textFieldIndex;
    private javax.swing.JTextField textFieldParentName;
    private javax.swing.JTextField textFieldPhone;
    // End of variables declaration//GEN-END:variables
}
