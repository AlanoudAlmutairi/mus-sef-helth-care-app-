/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg305_projectv2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author alano
 */
public class Server {
  
    
     public static void main(String[] args)  throws Exception {
   
       // (1) Create ServerSocket obj.
         ServerSocket s = new ServerSocket(8800);
          
          
      
             showMessageDialog(null, "Server waiting Connection...", "Server", INFORMATION_MESSAGE);
        
        // (2) Accept Socket 
        Socket incoming = s.accept();
        
        
        //(3) Return the IP address for the local host
      
        showMessageDialog(null, "Client connect via:"+ incoming.getLocalPort(), "Server", INFORMATION_MESSAGE);
        

        // (4) Create input stream obj(Scanner)
        InputStream input = incoming.getInputStream();
        Scanner in = new Scanner (input);
        
        // (5) Create output stream obj (PrintWriter)
        OutputStream output = incoming.getOutputStream();
        PrintWriter out = new PrintWriter(output, true);
        
        
       //another way: while(chtingPage.backStat){  
       while (true) {
          
           // System.out.println("Client says: " + chatingPage.getmsg());
           
            out.println("WELCOME ,you will be assigned to a doctor availableAs soon as possible");
            //another way : if(chatingPage.backState)
            if (chatingPage.getmsg().equalsIgnoreCase("bye")){
                
                break;}
     
            
        }
        // (6) close the socket
        s.close();
        
    }
        
    }
     
     
  
