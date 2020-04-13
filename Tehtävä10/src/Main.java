
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    public static void main(String[] args)
    {
      Esimies esimies = new Esimies();
      
        try {
            while (true) {
                System.out.println("Montako prosenttia haluat lisää palkkaa?");
                System.out.print("> ");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                esimies.käsitteleKorotus(new KorotusPyyntö(d));
           }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}
