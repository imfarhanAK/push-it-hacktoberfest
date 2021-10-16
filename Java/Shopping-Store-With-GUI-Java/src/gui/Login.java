/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import assignment.Admin;
import assignment.Buyer;
import assignment.MyReader;
import assignment.Seller;
import gui.AdminFrame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author xxhackerxx
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static int currUserId;
    public Login() {
        initComponents();
    }

    public void groupButton() {
        ButtonGroup group = new ButtonGroup(); //
        group.add(adminBut); //
        group.add(buyerBut);//
        group.add(sellerBut);//
    }

    public int login() {
        int test = 0;
        int a = 0;
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        ArrayList<Seller> sellers = MyReader.getSellers();
        ArrayList<Seller> mySeller = new ArrayList<Seller>();
        // can be called without an object since it's a static type
        // System.out.println(admins.size());
        for (Seller seller : sellers) {
            if (seller.getUsername().equals(username) && seller.getPassword().equals(password)) {
                new SellerFrame((seller));
                test++;
                this.setVisible(false);

            }
        }
        if (test == 0) {
            JOptionPane.showMessageDialog(this, "Incorrect username or password", "Access denied", JOptionPane.ERROR_MESSAGE);
        }
        return a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        adminBut = new javax.swing.JRadioButton();
        buyerBut = new javax.swing.JRadioButton();
        sellerBut = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trading System");
        setLocation(new java.awt.Point(380, 180));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Montserrat Black", 0, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("ONLINE SHOPPING STORE");

        jLabel5.setFont(new java.awt.Font("HelveticaNeueLT Std", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("HelveticaNeueLT Std Blk", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sign Up");

        adminBut.setBackground(new java.awt.Color(51, 51, 255));
        adminBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminBut.setForeground(new java.awt.Color(255, 255, 255));
        adminBut.setSelected(true);
        adminBut.setText("Admin");
        adminBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButActionPerformed(evt);
            }
        });

        buyerBut.setBackground(new java.awt.Color(51, 51, 255));
        buyerBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buyerBut.setForeground(new java.awt.Color(255, 255, 255));
        buyerBut.setText("Buyer");
        buyerBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyerButActionPerformed(evt);
            }
        });

        sellerBut.setBackground(new java.awt.Color(51, 51, 255));
        sellerBut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sellerBut.setForeground(new java.awt.Color(255, 255, 255));
        sellerBut.setText("Seller");
        sellerBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerButActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Create Buyer Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("Create Seller Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(adminBut)
                                        .addGap(40, 40, 40)
                                        .addComponent(buyerBut)
                                        .addGap(33, 33, 33)
                                        .addComponent(sellerBut))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton3)
                                .addComponent(jButton2))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adminBut)
                        .addComponent(buyerBut)
                        .addComponent(sellerBut))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.getAccessibleContext().setAccessibleName("label 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed

    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username;
        String password;
        BufferedReader br;
        int test = 0;
        
        username = usernameField.getText();
        password = new String(passwordField.getPassword());
        if (adminBut.isSelected()) {

            try {
                ArrayList<Admin> admins = MyReader.getAdmins(); // can be called without an object since it's a static type

                for (Admin admin : admins) {

                    if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                        test++;
                        this.setVisible(false);
                        new AdminFrame(admin);
                    }
                }
                if (test == 0) {
                    JOptionPane.showMessageDialog(this, "Incorrect username or password", "Access denied", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("ERORR: " + e);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

        else if (sellerBut.isSelected()) {
       

        ArrayList<Seller> sellers = MyReader.getSellers();
        ArrayList<Seller> mySeller = new ArrayList<Seller>();
        // can be called without an object since it's a static type
        // System.out.println(admins.size());
        for (Seller seller : sellers) {
            if (seller.getUsername().equals(username) && seller.getPassword().equals(password)) {
                new SellerFrame((seller));
                test++;
                this.setVisible(false);

            }
        }
        if (test == 0) {
            JOptionPane.showMessageDialog(this, "Incorrect username or password", "Access denied", JOptionPane.ERROR_MESSAGE);
        }
        } else {

            ArrayList<Buyer> buyers = MyReader.getBuyers(); // can be called without an object since it's a static type
            
            for (Buyer buyer : buyers) {
                if (buyer.getUsername().equals(username) && buyer.getPassword().equals(password)) {
                    new BuyerFrame(buyer);
                    currUserId = Integer.parseInt(buyer.getId());
                    
                    test++;
                    this.setVisible(false);
                    
                }
            }
            if (test == 0) {
                JOptionPane.showMessageDialog(this, "Incorrect username or password", "Access denied", JOptionPane.ERROR_MESSAGE);
            }

        }

    }
    private void adminButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButActionPerformed
        //********
        groupButton();
        //******** This block of code force the user to select only one radio button


    }//GEN-LAST:event_adminButActionPerformed

    private void buyerButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyerButActionPerformed
        groupButton();
    }//GEN-LAST:event_buyerButActionPerformed

    private void sellerButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerButActionPerformed
        groupButton();
    }//GEN-LAST:event_sellerButActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SellerSignUp newUser = new SellerSignUp();
        this.setVisible(false);
        newUser.setSize(600, 400);
        newUser.setVisible(true);
        newUser.setLocationRelativeTo(null);
        
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            BuyerSignUp bs = new BuyerSignUp();
            this.setVisible(false);
            bs.setVisible(true);
            bs.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminBut;
    private javax.swing.JRadioButton buyerBut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JRadioButton sellerBut;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
