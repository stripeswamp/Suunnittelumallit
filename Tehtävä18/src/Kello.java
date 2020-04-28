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
    private Sekunti sekunti;
    
    public Kello(int tunti, int minuutti, int sekunti)
    {
        this.proto = new Proto();
        this.tunti = new Tunti(tunti);
        this.minuutti = new Minuutti(minuutti);
        this.sekunti = new Sekunti(sekunti);
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
    
    public void asetaSekunti(int sekunti)
    {
        this.sekunti.asetaSekunti(sekunti);
    }
    
    public int haeSekunti()
    {
        return this.sekunti.haeSekunti();
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
         this.sekunti.asetaSekunti(this.sekunti.haeSekunti() + 1);
         try
         {
             Thread.sleep(1000);
         }
         catch (InterruptedException poikkeus)
         {
             poikkeus.printStackTrace();
         }
         
         System.out.println(Thread.currentThread().getName() + ": " + this.tunti.haeTunti() + "." + this.minuutti.haeMinuutti() + "." + this.sekunti.haeSekunti());
    }
}
