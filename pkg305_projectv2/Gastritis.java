/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg305_projectv2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alano
 */
public class Gastritis extends javax.swing.JFrame {

    /**
     * Creates new form P5
     /**
     * Creates new form P3
     */
    public Gastritis() throws FileNotFoundException, IOException {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
     //method contain all set up properties for gui component
    private void initComponents() throws FileNotFoundException, IOException {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TypesSection = new javax.swing.JPanel();
        type = new javax.swing.JLabel();
        treatmentSection = new javax.swing.JPanel();
        treatment = new javax.swing.JLabel();
        reasonSection = new javax.swing.JPanel();
        reason = new javax.swing.JLabel();
        SymptomsSection = new javax.swing.JPanel();
        Symptoms = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        
        reason1 =new javax.swing.JLabel();
        reason1.setText(readFileContent_Reason());
        
        type1 =new javax.swing.JLabel();
        type1.setText(readFileContent_Types());
        
        Symptoms1 =new javax.swing.JLabel();
        Symptoms1.setText(readFileContent_Symptoms());
        
        treatment1 =new javax.swing.JLabel();
        treatment1.setText(readFileContent_Treatment());
        
    

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gastiritis");

        jPanel5.setBackground(new java.awt.Color(254, 242, 244));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(192, 83, 102));
        jLabel1.setText("Gastiritis");

        TypesSection.setBackground(new java.awt.Color(255, 255, 255));

        type.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type.setForeground(new java.awt.Color(192, 83, 102));
        type.setText("Types");

         javax.swing.GroupLayout TypesSectionLayout = new javax.swing.GroupLayout(TypesSection);
        TypesSection.setLayout(TypesSectionLayout);
        TypesSectionLayout.setHorizontalGroup(
            TypesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypesSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TypesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TypesSectionLayout.createSequentialGroup()
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 171, Short.MAX_VALUE))
                    .addComponent(type1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TypesSectionLayout.setVerticalGroup(
            TypesSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TypesSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        treatmentSection.setBackground(new java.awt.Color(255, 255, 255));

        treatment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        treatment.setForeground(new java.awt.Color(192, 83, 102));
        treatment.setText("Treatment");

            javax.swing.GroupLayout treatmentSectionLayout = new javax.swing.GroupLayout(treatmentSection);
        treatmentSection.setLayout(treatmentSectionLayout);
        treatmentSectionLayout.setHorizontalGroup(
            treatmentSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treatmentSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treatment, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(treatmentSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(treatmentSectionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(treatment1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        treatmentSectionLayout.setVerticalGroup(
            treatmentSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treatmentSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treatment)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(treatmentSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(treatmentSectionLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(treatment1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        reasonSection.setBackground(new java.awt.Color(255, 255, 255));

        reason.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reason.setForeground(new java.awt.Color(192, 83, 102));
        reason.setText("Reasons");
        
      
          javax.swing.GroupLayout reasonSectionLayout = new javax.swing.GroupLayout(reasonSection);
        reasonSection.setLayout(reasonSectionLayout);
        reasonSectionLayout.setHorizontalGroup(
            reasonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reasonSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reasonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reasonSectionLayout.createSequentialGroup()
                        .addComponent(reason, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 188, Short.MAX_VALUE))
                    .addComponent(reason1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        reasonSectionLayout.setVerticalGroup(
            reasonSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reasonSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reason)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reason1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        SymptomsSection.setBackground(new java.awt.Color(255, 255, 255));

        Symptoms.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Symptoms.setForeground(new java.awt.Color(192, 83, 102));
        Symptoms.setText("Symptoms");

         javax.swing.GroupLayout SymptomsSectionLayout = new javax.swing.GroupLayout(SymptomsSection);
        SymptomsSection.setLayout(SymptomsSectionLayout);
        SymptomsSectionLayout.setHorizontalGroup(
            SymptomsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SymptomsSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Symptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(SymptomsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SymptomsSectionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Symptoms1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        SymptomsSectionLayout.setVerticalGroup(
            SymptomsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SymptomsSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Symptoms)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(SymptomsSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SymptomsSectionLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(Symptoms1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        BackButton.setBackground(new java.awt.Color(254, 242, 244));
        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("<");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackButton)
                .addGap(96, 96, 96)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reasonSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypesSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SymptomsSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(treatmentSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(reasonSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TypesSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SymptomsSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(treatmentSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold> 
        
    //preform back movment to prevois page
private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         Medical_Encyclopedia back = new  Medical_Encyclopedia();
        back.setVisible(true);
        this.setVisible(false);
    }                                          
//get types info from file and return it to print it in gui
   private static String readFileContent_Types() throws FileNotFoundException{
        
    StringBuilder content =new StringBuilder();
    String s=null;
    
    try{
        FileReader fr = new FileReader("Gastritis.txt");
        BufferedReader br = new BufferedReader(fr);
        
        while(br.ready()){
             if((s=br.readLine()).equalsIgnoreCase("Types")) { 
            while(!((s=br.readLine()).equalsIgnoreCase("Symptoms"))){ 
                 s+= "  "+"\n" ;
                  
                  content.append(s);
                 //content.append(s).append("\n");
                
          
            }  }
          else if((s.equalsIgnoreCase("Symptoms"))){
              break;
          }
            
            
        }
           br.close();
        fr.close();
    }catch(IOException ex) {
           ex.printStackTrace();}
    
    
    return content.toString();
    }
   
  //get reasons info from file and return it to print it in gui 
   private static String readFileContent_Reason(){
     
    StringBuilder content =new StringBuilder();
    String s=null;
    
    try{
        FileReader fr = new FileReader("Gastritis.txt");
        BufferedReader br = new BufferedReader(fr);
        
        while(br.ready()){
             if(!(s=br.readLine()).equalsIgnoreCase("Types"))  
               {
                 s+= "  "+"\n" ;
                  
                  //content.append(s);
                 content.append(s).append("\n");
                
          
            
           
             
           }
          else if((s.equalsIgnoreCase("Types"))){
              break;
          }
            
            
        }
        br.close();
        fr.close();
    }catch(IOException ex) {
           ex.printStackTrace();}
    
    
    return content.toString();
   }

  //get symptoms info from file and return it to print it in gui 
private static String readFileContent_Symptoms() throws FileNotFoundException, IOException
{
   
    StringBuilder content =new StringBuilder();
    String s=null;
    
    try{
        FileReader fr = new FileReader("Gastritis.txt");
        BufferedReader br = new BufferedReader(fr);
        
        while(br.ready()){
             if((s=br.readLine()).equalsIgnoreCase("Symptoms")) { 
            while(!((s=br.readLine()).equalsIgnoreCase("Treatments"))){ 
                 s+= "  "+"\n" ;
                  
                  content.append(s);
               
                
          
            }
           
             
           }
          else if((s.equalsIgnoreCase("Treatments"))){
              break;
          }
            
            
        }
           br.close();
        fr.close();
    }catch(IOException ex) {
           ex.printStackTrace();}
    
    
    return content.toString();
}

  //get traemtment info from file and return it to print it in gui 
private static String readFileContent_Treatment(){
    StringBuilder content =new StringBuilder();
    String s=null;
    int i=0;
    
    try{
        FileReader fr = new FileReader("Gastritis.txt");
        BufferedReader br = new BufferedReader(fr);
        
        
              
              while(br.ready()){
             if((s=br.readLine()).equalsIgnoreCase("Treatments")) { 
            while(!((s=br.readLine()).equalsIgnoreCase("end"))){ 
                 s+= "  "+"\n" ;
                 content.append(s).append("\n");
               
             
            }}
         }
        
        br.close();
        fr.close();
    }catch(IOException ex) {
           ex.printStackTrace();}
    
    
    return content.toString();
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
            java.util.logging.Logger.getLogger(Headache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Headache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Headache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Headache.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Gastritis().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Headache.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Headache.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    readFileContent_Types();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Headache.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Symptoms;
    private javax.swing.JPanel SymptomsSection;
    private javax.swing.JPanel TypesSection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel reason;
    private static javax.swing.JPanel reasonSection;
    private javax.swing.JLabel treatment;
    private javax.swing.JPanel treatmentSection;
    private javax.swing.JLabel type;
    
    
    private javax.swing.JLabel reason1;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel Symptoms1;
        private javax.swing.JLabel treatment1;
    // End of variables declaration                   
}