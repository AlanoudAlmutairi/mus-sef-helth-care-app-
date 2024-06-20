/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg305_projectv2;

/**
 *
 * @author alano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make 2 threads each one for diffrent user

        Pateint p = new Pateint();
        Pateint p2 = new Pateint();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();

        // TODO code application logic here
    }

}
