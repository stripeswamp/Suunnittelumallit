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
      
        Kello kello1 = new Kello(1, 15, 10);
        Kello kello2 = kello1.clone();   
     
        System.out.println("Kello1: " + kello1.haeTunti() + "." + kello1.haeMinuutti() + "." + kello1.haeSekunti());
        System.out.println("Kello2: " + kello2.haeTunti() + "." + kello2.haeMinuutti() + "." + kello2.haeSekunti());
        
        System.out.println("----");
        
        Thread kelloThread1 = new Thread((Runnable)kello1);
        kelloThread1.setName("Kello1");

        Thread kelloThread2 = new Thread((Runnable)kello1);
        kelloThread2.setName("Kello2");
        
        kelloThread1.start();
        kelloThread2.start();
       
        
        
    }
    
}
