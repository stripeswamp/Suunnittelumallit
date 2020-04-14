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
        // TODO code application logic here
        Talonmies talonmies = new Talonmies();
        
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        
        Runnable runnable1 = () -> {
            Object o = talonmies.liityPeliin(arvuuttaja);
            for (int i = 0; i <= 100; i++) {
                if (talonmies.arvaus(o, i)) {
                    System.out.println("Thread 1: " + i + ", oikein!");
                    break;
                } else {
                    System.out.println("Thread 1: " + i + ", väärin.");
                }
            }
        };
        
        Thread t1 = new Thread(runnable1);
        t1.start();
    }
}
