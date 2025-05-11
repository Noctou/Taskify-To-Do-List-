package src.PromptWindows;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import src.InsertUserToDatabase;
import javax.swing.event.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class EditUserDetails extends javax.swing.JFrame {
    
    ImageIcon showToggle = new ImageIcon("src\\images\\showPassword.png");
    ImageIcon hideToggle = new ImageIcon("src\\images\\hidePassword.png");
    
    private String currentUser;

    public EditUserDetails(String username) {
        this.currentUser = username;
        initComponents();
        DocumentListener passwordCheckListener = new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { checkPasswords(); }
            public void removeUpdate(DocumentEvent e) { checkPasswords(); }
            public void changedUpdate(DocumentEvent e) { checkPasswords(); }
        };

        passwordField.getDocument().addDocumentListener(passwordCheckListener);
        confirmPasswordField.getDocument().addDocumentListener(passwordCheckListener);

        setLocationRelativeTo(null);
        setTitle("Update user details");
        setResizable(false);
        togglePasswordVisibility();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        newUsername = new javax.swing.JLabel();
        newPassword = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        confirmPassword = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        passwordMatchLabel = new javax.swing.JLabel();
        toggleVisibility = new javax.swing.JLabel();
        toggleVisibilityConfirm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newUsername.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        newUsername.setForeground(new java.awt.Color(255, 255, 255));
        newUsername.setText("New Username:");

        newPassword.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        newPassword.setForeground(new java.awt.Color(255, 255, 255));
        newPassword.setText("New Password:");

        passwordField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("jPasswordField1");

        usernameField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));

        cancelButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        confirmButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setText("Confirm Update");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        confirmPassword.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        confirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassword.setText("Confirm Password:");

        confirmPasswordField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordField.setText("jPasswordField1");

        toggleVisibility.setText("jLabel1");

        toggleVisibilityConfirm.setText("jLabel2");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPassword)
                            .addComponent(newUsername)
                            .addComponent(confirmPassword))
                        .addGap(28, 28, 28)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordMatchLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(usernameField)
                            .addComponent(confirmPasswordField))
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toggleVisibility)
                            .addComponent(toggleVisibilityConfirm))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newUsername)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newPassword)
                    .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toggleVisibility)))
                .addGap(37, 37, 37)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassword)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toggleVisibilityConfirm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordMatchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(confirmButton))
                .addGap(114, 114, 114))
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
        String newUsername = usernameField.getText().trim();
        String newPassword = new String(passwordField.getPassword()).trim();

        if (newUsername.isEmpty() || newPassword.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Fields cannot be empty.");
            return;
        }

        boolean success = InsertUserToDatabase.updateUserData(currentUser, newUsername, newPassword);

        if (success) {
            javax.swing.JOptionPane.showMessageDialog(this, "User details updated successfully.");
            this.dispose();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Update failed. Try again.");
        }
    }//GEN-LAST:event_confirmButtonActionPerformed
  
    private void checkPasswords() {
        String pass = new String(passwordField.getPassword());
        String confirm = new String(confirmPasswordField.getPassword());

        if (pass.equals(confirm) && !pass.isEmpty()) {
            passwordMatchLabel.setText("Passwords match!");
            passwordMatchLabel.setForeground(Color.GREEN);
            confirmButton.setEnabled(true);
        } else {
            passwordMatchLabel.setText("Passwords do not match.");
            passwordMatchLabel.setForeground(Color.RED);
            confirmButton.setEnabled(false);
        }
    }
    
    public void togglePasswordVisibility() {
        Image showImage = showToggle.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        Image hideImage = hideToggle.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);

        showToggle = new ImageIcon(showImage);
        hideToggle = new ImageIcon(hideImage);
        
        toggleVisibility.setIcon(hideToggle);
        toggleVisibility.setText(null);
        
        toggleVisibility.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        toggleVisibility.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (passwordField.getEchoChar() == (char) 0) {
                    passwordField.setEchoChar('*');
                    toggleVisibility.setIcon(hideToggle);
                } else {
                    passwordField.setEchoChar((char) 0);
                    toggleVisibility.setIcon(showToggle);
                }
            }
        });
        
        toggleVisibilityConfirm.setIcon(hideToggle);
        toggleVisibilityConfirm.setText(null);
        
        toggleVisibilityConfirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        toggleVisibilityConfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (confirmPasswordField.getEchoChar() == (char) 0) {
                    confirmPasswordField.setEchoChar('*');
                    toggleVisibilityConfirm.setIcon(hideToggle);
                } else {
                    confirmPasswordField.setEchoChar((char) 0);
                    toggleVisibilityConfirm.setIcon(showToggle);
                }
            }
        });
    }
    
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
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JPanel container;
    private javax.swing.JLabel newPassword;
    private javax.swing.JLabel newUsername;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordMatchLabel;
    private javax.swing.JLabel toggleVisibility;
    private javax.swing.JLabel toggleVisibilityConfirm;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
