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
         Tarjoilija tarjoilija = new Tarjoilija();
        
        Hambuilder mäkkäri = new McDonalds();
        
        tarjoilija.setHambuilder(mäkkäri);
        tarjoilija.makeBurger();
        
        System.out.println(tarjoilija.getBurger());
    }
    
}
