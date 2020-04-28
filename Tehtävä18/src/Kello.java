/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Kello implements Cloneable, Runnable {
    
    private Proto proto;
    Tunti tunti;
    Minuutti minuutti;
    
    public Kello(int tunti, int minuutti)
    {
        this.tunti = new Tunti(tunti);
        this.minuutti = new Minuutti(minuutti);
    }

    public int haeTunti()
    {
        return this.tunti.haeTunti();
    }
    
    public int haeMinuutti()
    {
        return this.minuutti.haeMinuutti();
    }
    
    public Kello clone()
    {
        Kello kello = null;
        
        try
        {
            kello = (Kello) super.clone();
            
        }
        catch (CloneNotSupportedException virhe)
        {
               virhe.printStackTrace();
        }
        
        return kello;
    }
    
    @Override
    public void run()
    {
        
    }
}
