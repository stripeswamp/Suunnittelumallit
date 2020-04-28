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
      
        Student oppilas1 = new Student("Pekka", "matematiikka");
        Student oppilas2 = oppilas1.clone();
       
        System.out.println(oppilas1.getName());
        System.out.println(oppilas2.getName());
        
        System.out.println(oppilas1.getSubj().getName());
        System.out.println(oppilas2.getSubj().getName());
        
        System.out.println("------");
    
     Kello kello1 = new Kello(1, 15);
     Kello kello2 = kello1.clone();   

        System.out.println(kello1.haeTunti() + "." + kello1.haeMinuutti());
        System.out.println(kello2.haeTunti() + "." + kello2.haeMinuutti());
    }
    
}
