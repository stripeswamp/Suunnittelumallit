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
    
    private Thread kelloThread = null;
    private Proto proto;
    private Tunti tunti;
    private Minuutti minuutti;
    
    public Kello(int tunti, int minuutti)
    {
        this.proto = new Proto();
        this.tunti = new Tunti(tunti);
        this.minuutti = new Minuutti(minuutti);
    }

    public void asetaTunti(int tunti)
    {
        this.tunti.asetaTunti(tunti);
    }
    
    public int haeTunti()
    {
        return this.tunti.haeTunti();
    }
    
    public void asetaMinuutti(int minuutti)
    {
        this.minuutti.asetaMinuutti(minuutti);
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
            kello.proto = (Proto) proto.clone();
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
         this.minuutti.asetaMinuutti(this.minuutti.haeMinuutti() + 1);
         System.out.println(this.haeTunti() + ":" + this.haeMinuutti());
    }
}
