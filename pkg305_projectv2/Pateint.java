/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg305_projectv2;

/**
 *
 * @author alano
 */

//thsi class contain all info fro pateint + it is a thread 
public class Pateint implements Runnable{
    
    private String name ; 
    private String email ;
    private int phoneNO;
    private String password ;
    
    
    
   public  Pateint(String name ,String email , int phoneNO , String password ){
       this.name = name ;
       this.email = email ;
       this.password = password; 
       this.phoneNO = phoneNO ;
   }
   
   public Pateint(){
           
      
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(int phoneNO) {
        this.phoneNO = phoneNO;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void run() {
    
      P10 r = new P10();
      r.setVisible(true);
    
    }
   
   
    
}
