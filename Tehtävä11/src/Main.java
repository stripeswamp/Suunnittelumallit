/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Main extends Thread {

    Talonmies talonmies = new Talonmies();
    Arvuuttaja arvuuttaja = new Arvuuttaja();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Main thredi1 = new Main();
        Main thredi2 = new Main();
        Main thredi3 = new Main();
        
        thredi1.start();
        thredi2.start();
        thredi3.start();
        
        
    }
    
    public void run()
    {
        Object asiakas = talonmies.liityPeliin(arvuuttaja);
       
        int c = 0;
        while(c<10)
        {
            if(talonmies.arvaus(asiakas, c))
            {
                System.out.println(Thread.currentThread().getName() + ": " + c + ", jes!");
                break;
            }
            else
            {
                 System.out.println(Thread.currentThread().getName() + ": " + c + ", ei onnea!");
            }
            c++;
        }
    }
}
