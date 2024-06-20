/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg305_projectv2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alano
 */
public  class regestration extends javax.swing.JFrame 
    {
private Pateint p ;

    /** Creates new form P1 */
    public regestration() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
   RegestrationPanel = new javax.swing.JPanel();
        PhoneNumber = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        Passwordlabel = new javax.swing.JLabel();
        RegesterBottun = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        Email = new javax.swing.JTextField();
        regestrationTitle2 = new javax.swing.JLabel();
        PasswordGuidLine = new javax.swing.JLabel();
        regestrationTitle = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(254, 242, 244));

        RegestrationPanel.setBackground(new java.awt.Color(254, 242, 244));

        PhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(173, 69, 88));
        UsernameLabel.setText("Username ");

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(173, 69, 88));
        EmailLabel.setText("Email");

        PhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(173, 69, 88));
        PhoneLabel.setText("Phone number ");

        Passwordlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Passwordlabel.setForeground(new java.awt.Color(173, 69, 88));
        Passwordlabel.setText("Password");

        RegesterBottun.setBackground(new java.awt.Color(229, 94, 118));
        RegesterBottun.setForeground(new java.awt.Color(255, 255, 255));
        RegesterBottun.setText("Register");
        RegesterBottun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    RegesterBottunActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(regestration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        regestrationTitle2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        regestrationTitle2.setForeground(new java.awt.Color(173, 69, 88));
        regestrationTitle2.setText("NEW REGISTRATION");

        PasswordGuidLine.setForeground(new java.awt.Color(173, 69, 88));
        PasswordGuidLine.setText("* Password should be more than 6 characters ");

        regestrationTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regestrationTitle.setForeground(new java.awt.Color(173, 69, 88));
        regestrationTitle.setText("Create new account");

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/museif.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        BackButton.setBackground(new java.awt.Color(254, 242, 244));
        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("<");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegestrationPanelLayout = new javax.swing.GroupLayout(RegestrationPanel);
        RegestrationPanel.setLayout(RegestrationPanelLayout);
        RegestrationPanelLayout.setHorizontalGroup(
            RegestrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegestrationPanelLayout.createSequentialGroup()
                .addGroup(RegestrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(RegestrationPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(RegestrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegestrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Passwordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField1)
                                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PasswordGuidLine, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegestrationPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(RegesterBottun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegestrationPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RegestrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regestrationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regestrationTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(80, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        RegestrationPanelLayout.setVerticalGroup(
            RegestrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegestrationPanelLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(RegestrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regestrationTitle2)
                    .addComponent(BackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(regestrationTitle)
                .addGap(37, 37, 37)
                .addComponent(UsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(EmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PhoneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Passwordlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordGuidLine)
                .addGap(56, 56, 56)
                .addComponent(RegesterBottun, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegestrationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegestrationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>          
    
    
//take phone number from gui
    private void PhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        String Phone = PhoneNumber.getText();
    }                                           

 //take password from gui   
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        String pw = jPasswordField1.getSelectedText();
    }                                               

//take email from gui    
    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        String email = Email.getText();
    }                                     
//take user name from gui
    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String username = Username.getText();
    } 
//method to go to  home(back) page when click on specific button    
     private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         P10 back = new  P10();
        back.setVisible(true);
        this.setVisible(false);
    } 
// this method make regestration when click on button
    private void RegesterBottunActionPerformed(java.awt.event.ActionEvent evt ) throws SQLException {                                               
        // TODO add your handling code here:
// get password to 
       char[] PW =jPasswordField1.getPassword();
        //convert he array to normal string
         password = "";
         for (char element : PW) {
               password += element ;
           }
         
//get the phone number from user and chack it is integer or not 
    phoneNO = 0 ;
   try {
        phoneNO=Integer.parseInt(PhoneNumber.getText());
   }catch (NumberFormatException e){
        dialog("Phone number NOT correct (should NOT contains charachters)"); 
   } 
        
         
        p= new Pateint(Username.getText(),Email.getText(),phoneNO,password );
        boolean doneInsert=InsertIntoDB( );
        if(doneInsert){
            
        
         P10 p = new P10();
         p.setVisible(true);
        this.setVisible(false);
         ;}
    }                                              

    /**
     * @param args the command line arguments
     */
    
    //this method check inputs and insert this input into database
    public static boolean InsertIntoDB( ) throws SQLException{
        boolean insert_done = false ;
                  
        String ConnectionURL = "jdbc:mysql://localhost:3306/Pateint";
        Connection con = DriverManager.getConnection(ConnectionURL,"root","2105088") ;
	Statement stat = con.createStatement();
        
    //Create database : 
    //stat.executeUpdate("CREATE DATABASE "+"Pateint");    
    //(1) - Create table 
    String createTable = "CREATE TABLE Pateint(" +" Username VARCHAR(255) NOT NULL, "+
     "Email VARCHAR(255)NOT NULL ," +"Password VARCHAR(255) NOT NULL," +"Phone VARCHAR(255) )";
    // stat.execute(createTable);
      //check the user data if its true or not
      if(!(Email.getText().contains("@")))
          dialog("Your Email is NOT correct");
     //check if password more than 6 charachters ?
      else if(!(password.length()>=6)){
         //this method for Error message dialog     
         dialog("Password Less than 6 charachters");
         }
      else if(!((Integer.toString(phoneNO)).length() ==9 )){
        
        //this method for Error message dialog 
            dialog("Phone number NOT correct (shoud be 10 numbers )");}
      else{  // Add records to the table :
        String records ="INSERT INTO Pateint("+" Username , Email , Password, Phone) VALUES( ' " + Username.getText() + " ',' "+
         Email.getText() +" ',' "+password + " ',' " + phoneNO + " ' )" ;
    
      stat.execute(records);
      
      P10.setUsername(Username.getText());
      P10.setpw(password);

      
    insert_done = true;
      }
        
        
      stat.close();
     return insert_done;  
    
 
    }
  
    
    //this method for dialog gui (error gui) for any error reason
    public static void dialog(String Error_message){
         JFrame frame = new JFrame("Main Window");
      
       JOptionPane.showMessageDialog(frame, Error_message ,"Error", JOptionPane.ERROR_MESSAGE);
 
       frame.setSize(350,350);
       frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
      
       
       //frame.setVisible(true);
    }
    
    
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regestration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              new regestration().setVisible(true);
                  //  System.out.println("regestration:" + P10.getPassword()+P10.getUserName());
              
            }
        });
    }


    // Variables declaration - do not modify                     
    private static javax.swing.JTextField Email;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel PasswordGuidLine;
    private javax.swing.JLabel Passwordlabel;
    private javax.swing.JLabel PhoneLabel;
    private static javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton RegesterBottun;
    private javax.swing.JPanel RegestrationPanel;
    private static  javax.swing.JTextField Username;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel regestrationTitle;
    private javax.swing.JLabel regestrationTitle2;
       private javax.swing.JButton BackButton;
       
     private  static String password;
     private static int phoneNO;
     
     
    
    // End of variables declaration                   







}
     
    

