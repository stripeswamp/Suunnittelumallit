/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Arvuuttaja {
    private int arvaus;
    
    public static class Memento
    {
        private final int arvaus;
        
        public Memento(int setArvaus)
        {
            this.arvaus = setArvaus; //this viittaa Memento-sisäluokan arvaus-muuttujaan
        }
    }
    
    private int haeArvaus()
    {
        return this.arvaus;
    }
}
