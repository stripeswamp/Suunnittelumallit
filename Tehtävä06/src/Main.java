/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Main
{

    public static void main(String[] args)
    {
        Pizza tilaus = new SaarioistenPizza();
        
        tilaus = new Kinkku(tilaus);
        tilaus = new Juusto(tilaus);
        
        System.out.println(tilaus.annaHinta());
        System.out.println(tilaus.teePizza());
    }
}
