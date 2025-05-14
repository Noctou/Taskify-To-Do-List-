package src.PromptWindows;

import com.formdev.flatlaf.FlatDarkLaf;

import src.Task;
import src.TaskDatabase;
import src.TaskifyApp;

import javax.swing.*;
import java.awt.*;

import java.util.Date;
import java.util.Calendar;

import java.text.SimpleDateFormat;

public class EditTaskWindow extends javax.swing.JFrame {

    private TaskifyApp taskifyApp;
    private Task task;
    
    public EditTaskWindow(TaskifyApp taskifyApp, Task task) {
        initComponents();
        setLocationRelativeTo(null);
        this.taskifyApp = taskifyApp;
        
        SpinnerDateModel timeModel = new SpinnerDateModel();
        timeSpinner.setModel(timeModel);
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinner, "hh:mm a");
        timeSpinner.setEditor(timeEditor);
        timeSpinner.setValue(new Date(task.getDeadline().getTime()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        descLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        descTextArea = new javax.swing.JTextArea();
        titleField = new javax.swing.JTextField();
        selectDeadline = new com.toedter.calendar.JDateChooser();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        selectTimeLabel = new javax.swing.JLabel();
        timeSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        titleLabel.setText("Task Title:");

        descLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        descLabel.setText("Description:");

        descTextArea.setColumns(20);
        descTextArea.setRows(5);
        scrollPane.setViewportView(descTextArea);

        cancelButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        selectTimeLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        selectTimeLabel.setText("Select Time:");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descLabel)
                    .addComponent(titleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(selectDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(selectTimeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(timeSpinner))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descLabel)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectTimeLabel)))
                .addGap(54, 54, 54)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(confirmButton))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        JTabbedPane taskEntries = taskifyApp.getTaskEntries();
        int selectedIndex = taskEntries.getSelectedIndex();

        String getTitle = titleField.getText();
        String getDescription = descTextArea.getText();
        Date deadline = selectDeadline.getDate();
        
        if(getTitle == null || getTitle.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Task title cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } if(deadline == null) {
            JOptionPane.showMessageDialog(this, "Please select a valid deadline date!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Calendar dateCal = Calendar.getInstance();
        dateCal.setTime(selectDeadline.getDate());

        Calendar timeCal = Calendar.getInstance();
        timeCal.setTime((Date) timeSpinner.getValue());

        dateCal.set(Calendar.HOUR_OF_DAY, timeCal.get(Calendar.HOUR_OF_DAY));
        dateCal.set(Calendar.MINUTE, timeCal.get(Calendar.MINUTE));
        dateCal.set(Calendar.SECOND, 0);

        Date finalDateTime = dateCal.getTime();

        
        String originalTitle = taskEntries.getTitleAt(selectedIndex);
        
        boolean success = TaskDatabase.updateTask(originalTitle, getTitle, getDescription, deadline);

        if(success) {
            taskEntries.setTitleAt(selectedIndex, getTitle);

            taskifyApp.removeTaskFromMaps(originalTitle);

            Task updatedTask = new Task(getTitle, getDescription, new java.sql.Timestamp(deadline.getTime()));
            taskifyApp.addTaskToMaps(updatedTask);

            JPanel taskPanel = (JPanel) taskEntries.getComponentAt(selectedIndex);

            for(Component comp : taskPanel.getComponents()) {
                if(comp instanceof JLabel) {
                    JLabel label = (JLabel) comp;
                    if("titleLabel".equals(comp.getName())) {
                        label.setText(getTitle);
                    } else if("deadlineLabel".equals(comp.getName())) {
                        String formattedDate = new SimpleDateFormat("dd/MM/yyyy").format(deadline);
                        label.setText(formattedDate);
                    }
                } else if(comp instanceof JTextArea && "descriptionArea".equals(comp.getName())) {
                    ((JTextArea) comp).setText(getDescription);
                }
            } taskifyApp.refreshCalendarHighlighting();

            taskPanel.revalidate();
            taskPanel.repaint();

            JOptionPane.showMessageDialog(this, "Task updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update task in the database.", "Error", JOptionPane.ERROR_MESSAGE);
        } this.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed
   
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel descLabel;
    private javax.swing.JTextArea descTextArea;
    private javax.swing.JScrollPane scrollPane;
    private com.toedter.calendar.JDateChooser selectDeadline;
    private javax.swing.JLabel selectTimeLabel;
    private javax.swing.JSpinner timeSpinner;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
