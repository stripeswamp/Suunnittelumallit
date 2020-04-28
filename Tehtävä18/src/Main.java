/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Kello kello1 = new Kello(1, 15);
        Kello kello2 = kello1.clone();   
     
        System.out.println(kello1.haeTunti() + "." + kello1.haeMinuutti());
        System.out.println(kello2.haeTunti() + "." + kello2.haeMinuutti());
        
        new Thread((Runnable)kello1).start();
        new Thread((Runnable)kello2).start();
        
    }
    
}
