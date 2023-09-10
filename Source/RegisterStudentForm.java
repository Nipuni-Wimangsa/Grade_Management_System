package gradebook.application;

import gradebook.application.logic.Student;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class RegisterStudentForm extends javax.swing.JInternalFrame {
    String imagePath;
    
    public RegisterStudentForm() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        textFieldFullName = new javax.swing.JTextField();
        textFieldAddress = new javax.swing.JTextField();
        textFieldBirthday = new javax.swing.JTextField();
        textFieldIndex = new javax.swing.JTextField();
        textFieldPhone = new javax.swing.JTextField();
        textFieldParentName = new javax.swing.JTextField();
        labelGender = new javax.swing.JLabel();
        radioButtonMale = new javax.swing.JRadioButton();
        radioButtonFemale = new javax.swing.JRadioButton();
        labelGrade = new javax.swing.JLabel();
        labelPhoto = new javax.swing.JLabel();
        labelUploadPhoto = new javax.swing.JLabel();
        labelHintBirthday = new javax.swing.JLabel();
        labelHintIndex = new javax.swing.JLabel();
        comboBoxGrade = new javax.swing.JComboBox<>();
        labelClass = new javax.swing.JLabel();
        comboBoxClass = new javax.swing.JComboBox<>();
        labelBloodGroup = new javax.swing.JLabel();
        comboBoxBloodGroup = new javax.swing.JComboBox<>();
        labelPhotoName = new javax.swing.JLabel();
        buttonClear = new gradebook.application.components.Button();
        buttonSubmit = new gradebook.application.components.Button();
        buttonExit = new gradebook.application.components.Button();

        setPreferredSize(new java.awt.Dimension(771, 611));

        panelMain.setBackground(new java.awt.Color(231, 233, 243));
        panelMain.setPreferredSize(new java.awt.Dimension(771, 611));

        textFieldFullName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldFullName.setText("Full Name: ");
        textFieldFullName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));
        textFieldFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldFullNameMouseClicked(evt);
            }
        });

        textFieldAddress.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldAddress.setText("Address: ");
        textFieldAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));
        textFieldAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldAddressMouseClicked(evt);
            }
        });

        textFieldBirthday.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldBirthday.setText("Birthday: ");
        textFieldBirthday.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));
        textFieldBirthday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldBirthdayMouseClicked(evt);
            }
        });

        textFieldIndex.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldIndex.setText("Index No: ");
        textFieldIndex.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));
        textFieldIndex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldIndexMouseClicked(evt);
            }
        });

        textFieldPhone.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldPhone.setText("Phone No: ");
        textFieldPhone.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));
        textFieldPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldPhoneMouseClicked(evt);
            }
        });

        textFieldParentName.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldParentName.setText("Parent Name: ");
        textFieldParentName.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));
        textFieldParentName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldParentNameMouseClicked(evt);
            }
        });

        labelGender.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelGender.setText("Gender: ");

        buttonGroupGender.add(radioButtonMale);
        radioButtonMale.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        radioButtonMale.setText("Male");
        radioButtonMale.setOpaque(false);

        buttonGroupGender.add(radioButtonFemale);
        radioButtonFemale.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        radioButtonFemale.setText("Female");
        radioButtonFemale.setOpaque(false);

        labelGrade.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelGrade.setText("Grade: ");

        labelPhoto.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelPhoto.setText("Photo: ");

        labelUploadPhoto.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        labelUploadPhoto.setForeground(new java.awt.Color(0, 102, 204));
        labelUploadPhoto.setText("Upload a passport size photo");
        labelUploadPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelUploadPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUploadPhotoMouseClicked(evt);
            }
        });

        labelHintBirthday.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        labelHintBirthday.setForeground(new java.awt.Color(102, 102, 102));
        labelHintBirthday.setText("Hint: YYYY-MM-DD");

        labelHintIndex.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        labelHintIndex.setForeground(new java.awt.Color(102, 102, 102));
        labelHintIndex.setText("Hint: 07-917");

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

        labelPhotoName.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        labelPhotoName.setForeground(new java.awt.Color(102, 102, 102));

        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(comboBoxBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(labelGender)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonMale)
                                .addGap(18, 18, 18)
                                .addComponent(radioButtonFemale))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(labelPhoto)
                                .addGap(27, 27, 27)
                                .addComponent(labelUploadPhoto)
                                .addGap(37, 37, 37)
                                .addComponent(labelPhotoName, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldParentName))
                            .addComponent(textFieldAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldFullName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelHintBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldIndex)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addGap(0, 11, Short.MAX_VALUE)
                                        .addComponent(labelHintIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(25, 25, 25))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(textFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(textFieldBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(labelHintBirthday))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(textFieldIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(labelHintIndex)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldParentName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGender)
                    .addComponent(radioButtonMale)
                    .addComponent(radioButtonFemale))
                .addGap(28, 28, 28)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGrade)
                    .addComponent(comboBoxGrade)
                    .addComponent(labelClass)
                    .addComponent(comboBoxClass)
                    .addComponent(labelBloodGroup)
                    .addComponent(comboBoxBloodGroup))
                .addGap(35, 35, 35)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPhoto)
                    .addComponent(labelUploadPhoto)
                    .addComponent(labelPhotoName))
                .addGap(53, 53, 53)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldFullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldFullNameMouseClicked
        if(textFieldFullName.getCaretPosition() < 11)
            textFieldFullName.setCaretPosition(11);
    }//GEN-LAST:event_textFieldFullNameMouseClicked

    private void textFieldAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldAddressMouseClicked
        if(textFieldAddress.getCaretPosition() < 9)
            textFieldAddress.setCaretPosition(9);
    }//GEN-LAST:event_textFieldAddressMouseClicked

    private void textFieldBirthdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldBirthdayMouseClicked
        if(textFieldBirthday.getCaretPosition() < 10)
            textFieldBirthday.setCaretPosition(10);
    }//GEN-LAST:event_textFieldBirthdayMouseClicked

    private void textFieldIndexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldIndexMouseClicked
        if(textFieldIndex.getCaretPosition() < 10)
            textFieldIndex.setCaretPosition(10);
    }//GEN-LAST:event_textFieldIndexMouseClicked

    private void textFieldPhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldPhoneMouseClicked
        if(textFieldPhone.getCaretPosition() < 10)
            textFieldPhone.setCaretPosition(10);
    }//GEN-LAST:event_textFieldPhoneMouseClicked

    private void textFieldParentNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldParentNameMouseClicked
        if(textFieldParentName.getCaretPosition() < 13)
            textFieldParentName.setCaretPosition(13);
    }//GEN-LAST:event_textFieldParentNameMouseClicked

    private void labelUploadPhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUploadPhotoMouseClicked
        JFileChooser browse  = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        
        browse.addChoosableFileFilter(filter);
        browse.showOpenDialog(null);
        
        File file = browse.getSelectedFile();
        imagePath = file.getAbsolutePath();
        String name = file.getName();
        labelPhotoName.setText(name);
        
//        ImageIcon icon = new ImageIcon(imagePath);
//        Image image = icon.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
//        jLabel1.setIcon(new ImageIcon(image));
//        
    }//GEN-LAST:event_labelUploadPhotoMouseClicked

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
       textFieldFullName.setText("Full Name: ");
       textFieldAddress.setText("Address: ");
       textFieldBirthday.setText("Birthday: ");
       textFieldIndex.setText("Index No: ");
       textFieldPhone.setText("Phone No: ");
       textFieldParentName.setText("Parent Name: ");
       buttonGroupGender.clearSelection();
       comboBoxGrade.setSelectedIndex(0);
       comboBoxClass.setSelectedIndex(0);
       comboBoxBloodGroup.setSelectedIndex(0);
       labelPhotoName.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        String gender = "";
        if(radioButtonFemale.isSelected())
            gender = "Female";
        else if(radioButtonMale.isSelected())
            gender = "Male";
         
        
        Student student = new Student(
            getFieldData(textFieldFullName.getText(), "Full Name: "),
            getFieldData(textFieldAddress.getText(), "Address: "),
            getFieldData(textFieldBirthday.getText(), "Birthday: "),
            getFieldData(textFieldIndex.getText(), "Index No: "),
            getFieldData(textFieldPhone.getText(), "Phone No: "),
            getFieldData(textFieldParentName.getText(), "Parent Name: "),
            gender,
            comboBoxGrade.getItemAt(comboBoxGrade.getSelectedIndex()),
            comboBoxClass.getItemAt(comboBoxClass.getSelectedIndex()),
            comboBoxBloodGroup.getItemAt(comboBoxBloodGroup.getSelectedIndex()),
            imagePath
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
            
            textFieldFullName.setText("Full Name: ");
            textFieldAddress.setText("Address: ");
            textFieldBirthday.setText("Birthday: ");
            textFieldIndex.setText("Index No: ");
            textFieldPhone.setText("Phone No: ");
            textFieldParentName.setText("Parent Name: ");
            buttonGroupGender.clearSelection();
            comboBoxGrade.setSelectedIndex(0);
            comboBoxClass.setSelectedIndex(0);
            comboBoxBloodGroup.setSelectedIndex(0);
            labelPhotoName.setText("");
        }
     
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private String getFieldData(String originalString, String substringToRemove){
        return originalString.replace(substringToRemove, "");
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gradebook.application.components.Button buttonClear;
    private gradebook.application.components.Button buttonExit;
    private javax.swing.ButtonGroup buttonGroupGender;
    private gradebook.application.components.Button buttonSubmit;
    private javax.swing.JComboBox<String> comboBoxBloodGroup;
    private javax.swing.JComboBox<String> comboBoxClass;
    private javax.swing.JComboBox<String> comboBoxGrade;
    private javax.swing.JLabel labelBloodGroup;
    private javax.swing.JLabel labelClass;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelGrade;
    private javax.swing.JLabel labelHintBirthday;
    private javax.swing.JLabel labelHintIndex;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelPhotoName;
    private javax.swing.JLabel labelUploadPhoto;
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
