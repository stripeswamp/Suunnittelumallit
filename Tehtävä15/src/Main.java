/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Valuutta eurot = new Euro(475);
       ValuuttaMuunnin muunnin = new ValuuttaMuunnin(eurot);
       System.out.println(muunnin.getArvo());
    }
    
}
