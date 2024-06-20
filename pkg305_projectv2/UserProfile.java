/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg305_projectv2;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alano
 */
public class UserProfile extends javax.swing.JFrame {

    /**
     * Creates new form P11
     */
    public UserProfile() throws SQLException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">         
    //setup all gui components 
    private void initComponents() throws SQLException {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        patentName = new javax.swing.JLabel();
        LogOutLabel = new javax.swing.JLabel();
        medicalFileButton = new javax.swing.JButton();
        medicalConsulationBUtton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ListButton = new javax.swing.JButton();
        profileButton = new javax.swing.JButton();
        chattingButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(254, 242, 244));

        patentName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        patentName.setForeground(new java.awt.Color(192, 83, 102));
        if(medicalFile.searchDB()){
           patentName.setText(P10.getUserName());}
        else{
            P10.dialog("You Do NOT have an account , Create your account please ");
        }

        LogOutLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LogOutLabel.setForeground(new java.awt.Color(255, 0, 0));
        LogOutLabel.setText("Log out");

        medicalFileButton.setBackground(new java.awt.Color(255, 255, 255));
        medicalFileButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        medicalFileButton.setText("medical File");
        medicalFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    medicalFileButtonActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(UserProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        medicalConsulationBUtton.setBackground(new java.awt.Color(255, 255, 255));
        medicalConsulationBUtton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        medicalConsulationBUtton.setText("medical consultation");
        medicalConsulationBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalConsulationBUttonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        ListButton.setBackground(new java.awt.Color(254, 242, 244));
        ListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/types.png"))); // NOI18N
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        profileButton.setBackground(new java.awt.Color(254, 242, 244));
        profileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/profile.png"))); // NOI18N
        profileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    profileButtonActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(UserProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        chattingButton.setBackground(new java.awt.Color(254, 242, 244));
        chattingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/chat.png"))); // NOI18N
        chattingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chattingButtonActionPerformed(evt);
            }
        });

        HomeButton.setBackground(new java.awt.Color(254, 242, 244));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.png"))); // NOI18N
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chattingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(profileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileButton)
                    .addComponent(chattingButton)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(medicalConsulationBUtton, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(medicalFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(patentName)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LogOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(patentName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(medicalFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(medicalConsulationBUtton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(LogOutLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

////method to go to  medicalFile page when click on specific button
    private void medicalFileButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                                  
        // TODO add your handling code here:
        medicalFile file = new medicalFile ();
       
        file.setVisible(true); 

        this.setVisible(false);
    }                                                 

////method to go to  chat(consult a doctor) page when click on specific button
    private void medicalConsulationBUttonActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
         Consult_a_doctor consult = new Consult_a_doctor();
        consult.setVisible(true);
        this.setVisible(false);
    
    }                                                        
////method to go to  list page when click on specific button
     private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        Medical_Encyclopedia p2 = new Medical_Encyclopedia ();
        p2.setVisible(true);
        this.setVisible(false);
    }                                          
////method to go to  profile page when click on specific button
    private void profileButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                              
        // TODO add your handling code here:
        UserProfile profile = new UserProfile();
        profile.setVisible(true);
        this.setVisible(false);
    }                                             
//method to go to  chat(consult a doctor) page when click on specific button
    private void chattingButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        Consult_a_doctor consult = new Consult_a_doctor();
        consult.setVisible(true);
        this.setVisible(false);
    }                                              
//method to go to home page when click on specific button
    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

        P10 p = new P10();
        p.setVisible(true);
        this.setVisible(false);
    }                                                

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserProfile().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton ListButton;
    private javax.swing.JLabel LogOutLabel;
    private javax.swing.JButton chattingButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton medicalConsulationBUtton;
    private javax.swing.JButton medicalFileButton;
    private javax.swing.JLabel patentName;
    private javax.swing.JButton profileButton;
    // End of variables declaration 
 
    
}
