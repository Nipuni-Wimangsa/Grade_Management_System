package gradebook.application;

import gradebook.application.logic.Database;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GradeCalculation extends javax.swing.JInternalFrame {

    Database database = new Database();
    String[] indexes;
    DefaultTableModel model;
    
    private String url = "jdbc:mysql://localhost:3306/gradebook";
    private String user = "root";
    private String password = "nipuni";
    
    public GradeCalculation() {
        initComponents();
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        model = (DefaultTableModel)table.getModel();
        tableStyles();
    }
    
    private void tableStyles() {
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);

   
        table.getTableHeader().setFont(new java.awt.Font("Candara", 0, 18));
        
        DefaultTableCellRenderer head_render = new DefaultTableCellRenderer(); 
        head_render.setBackground(new Color(165,178,209));
        
        table.getTableHeader().setDefaultRenderer(head_render);        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelButton = new javax.swing.JPanel();
        labelBackIcon = new javax.swing.JLabel();
        labelMainMenu = new javax.swing.JLabel();
        textFieldGrade = new javax.swing.JTextField();
        buttonSearch = new gradebook.application.components.Button();
        labelTitle = new javax.swing.JLabel();
        seperatorTitle = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buttonCalculate = new gradebook.application.components.Button();

        panelMain.setBackground(new java.awt.Color(231, 233, 243));
        panelMain.setPreferredSize(new java.awt.Dimension(1061, 611));

        panelButton.setBackground(new java.awt.Color(231, 233, 243));
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

        textFieldGrade.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        textFieldGrade.setText("Grade & Class: ");
        textFieldGrade.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 1, 1));
        textFieldGrade.setPreferredSize(new java.awt.Dimension(89, 30));
        textFieldGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldGradeMouseClicked(evt);
            }
        });

        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        labelTitle.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        labelTitle.setText("Grade Calculation");

        seperatorTitle.setBackground(new java.awt.Color(0, 0, 0));
        seperatorTitle.setForeground(new java.awt.Color(0, 0, 0));
        seperatorTitle.setOpaque(true);

        table.setBackground(new java.awt.Color(231, 233, 243));
        table.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.setFillsViewportHeight(true);
        table.setGridColor(new java.awt.Color(51, 51, 51));
        table.setRowHeight(30);
        table.setSelectionBackground(new java.awt.Color(203, 215, 252));
        table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);

        buttonCalculate.setText("Calculate & Update");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMainLayout.createSequentialGroup()
                                        .addComponent(seperatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 25, Short.MAX_VALUE))
                                    .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(284, 284, 284)
                                .addComponent(textFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(labelTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seperatorTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
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

    private void textFieldGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldGradeMouseClicked
        if(textFieldGrade.getCaretPosition() < 15)
            textFieldGrade.setCaretPosition(15);
    }//GEN-LAST:event_textFieldGradeMouseClicked

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String input = textFieldGrade.getText();
        
        if(input.isEmpty())
            JOptionPane.showMessageDialog(null, "Invalid input", "Warning", JOptionPane.WARNING_MESSAGE);

        
        int length = input.length();
        String grade = input.substring(15, 17);
        String classroom = input.substring(length-1, length).toUpperCase();
        
        String sql = "select Index_No from students where grade = '"+grade+"' and class = '"+classroom+"'";
        
        indexes = database.getMultipleData(sql, "Index_No");             
        model.addColumn("Index", indexes);
        
        String[] mathMarks = new String[indexes.length];
        model.addColumn("Maths", mathMarks);
       
        String[] scienceMarks = new String[indexes.length];
        model.addColumn("Science", scienceMarks);
       
        String[] englishMarks = new String[indexes.length];
        model.addColumn("English", englishMarks);
       
        String[] sinhalaMarks = new String[indexes.length];
        model.addColumn("Sinhala", sinhalaMarks);
       
        String[] ictMarks = new String[indexes.length];
        model.addColumn("ICT", ictMarks);
       
        String[] commerceMarks = new String[indexes.length];
        model.addColumn("Commerce", commerceMarks);
       
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
        int[] marks = new int[6];
        float total = 0;
        Float[] averages = new Float[indexes.length];
                
        for(int indexRow = 0; indexRow < indexes.length; indexRow++) {
            for(int markColumn = 1; markColumn <= 6; markColumn++) {
                String mark = (String)table.getValueAt(indexRow, markColumn);
                marks[markColumn-1] = Integer.parseInt(mark);
                total += marks[markColumn-1];
            }
            
            float average = total/6;
            average = (float) (Math.round(average * 100.0) / 100.0);           
            averages[indexRow] = average;
            
            try {
                Connection connection = DriverManager.getConnection(url,user,password);
                PreparedStatement statement = connection.prepareStatement(
                        "insert into grades(Index_No, Maths, Science, English, Sinhala, ICT, Commerce, Average) values(?, ?, ?, ?, ?, ?, ?, ?)"
                );

                statement.setString(1, indexes[indexRow]);
                statement.setInt(2, marks[0]);
                statement.setInt(3, marks[1]);
                statement.setInt(4, marks[2]);
                statement.setInt(5, marks[3]);
                statement.setInt(6, marks[4]);
                statement.setInt(7, marks[5]);
                statement.setFloat(8, average);
                
                statement.executeUpdate();
                connection.close();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            total = 0;       
        }
        
        
        JOptionPane.showMessageDialog(null, "Data successfully updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
      
        model.setRowCount(0);
        model.setColumnCount(0);
        
        
        float max = 0;
        int maxIndex = 0;
        int rank = 1;
        
        for(int i = 0; i < indexes.length; i++) {
            for(int j = 0; j < averages.length; j++) {
                if(averages[j] > max) {
                    max = averages[j];
                    maxIndex = j;
                }
            }
            database.updateData("insert into ranks(Index_No, Class_Rank) values('"+indexes[maxIndex]+"', "+rank+")");
            rank++;
            max = 0; 
            averages[maxIndex] = (float)0;
        }
        
        
    }//GEN-LAST:event_buttonCalculateActionPerformed
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gradebook.application.components.Button buttonCalculate;
    private gradebook.application.components.Button buttonSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBackIcon;
    private javax.swing.JLabel labelMainMenu;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelMain;
    private javax.swing.JSeparator seperatorTitle;
    private javax.swing.JTable table;
    private javax.swing.JTextField textFieldGrade;
    // End of variables declaration//GEN-END:variables
}
