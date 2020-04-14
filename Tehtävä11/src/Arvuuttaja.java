/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Arvuuttaja
{
    public Object liityPeliin()
    {
        int arpa = (int) Math.random()*10+1;
        return new Memento(arpa);
    }
    
    public boolean arvaus(Memento asiakas, int arvaus)
    {
        if(asiakas.haeArvaus() == arvaus)
        {
            return true;
        }
        return false;
    }
    
    private static class Memento
    {
        private final int arvaus;
        
        public Memento(int setArvaus)
        {
            this.arvaus = setArvaus;
        }
        
        private int haeArvaus()
        {
            return this.arvaus;
        }
    }
}
