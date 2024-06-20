/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg305_projectv2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author alano
 */
// WELCOME PAGE //
public class P10 extends javax.swing.JFrame {

    /**
     * Creates new form P10
     */
    public P10() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        CreateAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        
        WelcomLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 242, 244));

        LoginButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LoginButton.setText("LOG IN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
          
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               LoginButtonActionPerformed(evt);
            }
        });

        CreateAccount.setBackground(new java.awt.Color(255, 255, 255));
        CreateAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CreateAccount.setText("Create Account");
        CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/museif.png"))); // NOI18N

     
        

        WelcomLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        WelcomLabel.setForeground(new java.awt.Color(192, 83, 102));
        WelcomLabel.setText("WELCOME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(WelcomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                       ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(WelcomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(CreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
               
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

   
    
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        logInDialog();
        // TODO add your handling code here:
    }     
      

    private void CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
        
     regestration p1 = new regestration();
       p1.setVisible(true);
       this.setVisible(false);
        
    }                                                    
 //log in gui      
    public  void logInDialog(){
        JFrame frame = new JFrame();
        frame.setSize(350 , 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        JLabel userL = new JLabel("User name");
        userL.setBounds(10 ,20 ,80 ,25);
        panel.add(userL);
        
        userText = new JTextField();
        userText.setBounds(100 , 20 , 165 ,25);
        panel.add(userText);
        
        JLabel passwordL = new JLabel("Password");
        passwordL.setBounds(10,50,80,25);
        panel.add(passwordL);
        
        passwordText = new JPasswordField();
        passwordText.setBounds(100 , 50 , 165 ,25);
        panel.add(passwordText);
      
       
         logInButton1 = new JButton("Log in ");
        logInButton1.setBounds(10 , 80 , 80 , 25);
          panel.add(logInButton1);
        logInButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
                try {
                    
                    logInButton1ActionPerformed(evt);
                } catch (SQLException ex) {
                         ex.printStackTrace();
                    Logger.getLogger(P10.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            }
        });
        
        
    
          
        frame.setVisible(true);
        
    }
     
//check log in info is correct + go to next page(user frofile)    
        private  void logInButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                                     
         
        un = userText.getText();
         char [] pass =passwordText.getPassword();
         password=" ";
         for (int i = 0 ; i < pass.length ;i++) {
               password+= pass[i];
           }
         
      
        setUsername(un);
        setpw(password);
                   
        if(medicalFile.searchDB()){
         UserProfile UP = new UserProfile();
         UP.setVisible(true);
         this.setVisible(false);
         this.setVisible(false);
        }
         
  
        
    } 
           
//gui dialg for error messages         
        public static void dialog(String Error_message){
         JFrame frame = new JFrame("Main Window");
      
       JOptionPane.showMessageDialog(frame, Error_message ,"Error", JOptionPane.ERROR_MESSAGE);
 
       frame.setSize(350,350);
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
       
       //frame.setVisible(true);
    }
//setters an getters        
        public static String getUserName(){
            System.out.println(Name);
            return Name;
        }
        public static String getPassword(){
            System.out.println(pw);
            return pw;
        }
        
       public static void setUsername(String username){
           System.out.println("setname done");
        Name = username;
       }
       
       public static void setpw(String passw){
           System.out.println("setpw done");
           pw = passw ;
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
            java.util.logging.Logger.getLogger(P10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
           new P10().setVisible(true);
          
        });
    }
    
    

    // Variables declaration - do not modify                     
    
    private javax.swing.JLabel WelcomLabel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton CreateAccount;
    private static JPasswordField passwordText;
    private static  JTextField userText;
    private static JButton logInButton1 ;
    
    public String password = " " ;
    static String un;
    public static String Name ;
    public static String pw;
    // End of variables declaration    
    

    
}