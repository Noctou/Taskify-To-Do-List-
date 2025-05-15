package src;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register extends javax.swing.JFrame {
    
    ImageIcon showToggle = new ImageIcon("src\\images\\showPassword.png");
    ImageIcon hideToggle = new ImageIcon("src\\images\\hidePassword.png");
    ImageIcon logoIcon;

    public Register() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Register");
        
        try {
            String imagePath = "src\\images\\logo.png"; 
            logoIcon = new ImageIcon(imagePath);
            if (logoIcon.getImageLoadStatus() == MediaTracker.COMPLETE) {
                int originalWidth = logoIcon.getIconWidth();
                int originalHeight = logoIcon.getIconHeight();

                int scaledWidth = 200;
                int scaledHeight = (int)((double)originalHeight/originalWidth * scaledWidth);

                Image scaledImage = logoIcon.getImage().getScaledInstance(
                    scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
                logo.setIcon(new ImageIcon(scaledImage));
                logo.setText("");

                logo.setPreferredSize(new Dimension(scaledWidth, scaledHeight));
            }
        } catch (Exception e) {
            System.err.println("Error loading logo: " + e.getMessage());
            logo.setText("Logo");
        }
        
        goBackLinkActionPerformed();
        togglePasswordVisibility();
        passwordFieldFocusListener();
        passwordFieldKeyListener();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        registerUserField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        registerPasswordField = new javax.swing.JPasswordField();
        toggleVisibility = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        goBackLink = new javax.swing.JLabel();
        goBackLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        container.setBackground(new java.awt.Color(51, 51, 51));
        container.setForeground(new java.awt.Color(255, 255, 255));

        usernameLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");

        registerUserField.setBackground(new java.awt.Color(102, 102, 102));
        registerUserField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        registerUserField.setForeground(new java.awt.Color(255, 255, 255));

        passwordLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password");

        registerPasswordField.setBackground(new java.awt.Color(102, 102, 102));
        registerPasswordField.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        registerPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        registerPasswordField.setText("enterpassword");

        registerButton.setBackground(new java.awt.Color(102, 0, 102));
        registerButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        goBackLink.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        goBackLink.setForeground(new java.awt.Color(153, 0, 153));
        goBackLink.setText("log in");

        goBackLabel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        goBackLabel.setForeground(new java.awt.Color(255, 255, 255));
        goBackLabel.setText("Click on");

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("to go back");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel)
                            .addComponent(registerUserField)
                            .addComponent(registerPasswordField)
                            .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(toggleVisibility)
                        .addGap(51, 51, 51))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(goBackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goBackLink)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(119, Short.MAX_VALUE))))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(usernameLabel)
                .addGap(19, 19, 19)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(registerUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(passwordLabel)
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toggleVisibility, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goBackLabel)
                            .addComponent(goBackLink)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
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

    public void passwordFieldFocusListener() {
        registerPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                registerPasswordField.selectAll();
            }
        });
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
                if (registerPasswordField.getEchoChar() == (char) 0) {
                    registerPasswordField.setEchoChar('*');
                    toggleVisibility.setIcon(hideToggle);
                } else {
                    registerPasswordField.setEchoChar((char) 0);
                    toggleVisibility.setIcon(showToggle);
                }
            }
        });
    }
    
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String user = registerUserField.getText();
        String pass = new String(registerPasswordField.getPassword());

        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //String hashedPassword = PasswordHashing.hashPassword(pass);
            //InsertToDatabase.InsertUserData(user, hashedPassword);
            InsertUserToDatabase.InsertUserData(user, pass);
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        
        this.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }//GEN-LAST:event_registerButtonActionPerformed

    public void goBackLinkActionPerformed() {
        goBackLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        goBackLink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LogIn logInWindow = new LogIn();
                logInWindow.setVisible(true);
                Register.this.dispose();
            } @Override
            public void mouseEntered(MouseEvent e) {
                goBackLink.setText("<html><u>log in</u></html>");
            } @Override
            public void mouseExited(MouseEvent e) {
                goBackLink.setText("log in");
            }
        });
    }
    
    public void passwordFieldKeyListener() {
        registerPasswordField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                registerButton.doClick();
                }
            }
        });
    }
    
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel goBackLabel;
    private javax.swing.JLabel goBackLink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JTextField registerUserField;
    private javax.swing.JLabel toggleVisibility;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
