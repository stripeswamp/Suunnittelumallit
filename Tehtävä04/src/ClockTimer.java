import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {
    
    private int tunti;
    private int minuutti;
    private int sekunti;
    
    public ClockTimer()
    {
        this.tunti = 0;
        this.minuutti = 0;
        this.sekunti = 0;
    }
    
    public void asetaTunti(int input)
    {
        this.tunti = input;
    }
    
    public void asetaminuutti(int input)
    {
        this.minuutti = input;
    }
    
    public void asetaSekunti(int input)
    {
        this.sekunti = input;
    }
    
    public int haeTunti()
    {
        return this.tunti;
    }
    
    public int haeMinuutti()
    {
        return this.minuutti;
    }
    
    public int haeSekunti()
    {
        return this.sekunti;
    }
    
     @Override
    public void run()
    {
         this.sekunti += 1;
         
         try
         {
             Thread.sleep(1000);
         }
         catch (InterruptedException poikkeus)
         {
             poikkeus.printStackTrace();
         }
         
         setChanged();
         notifyObservers(this.tunti + ":" + this.minuutti + ":" + this.sekunti);
         System.out.println(Thread.currentThread().getName() + ": " + this.tunti + "." + this.minuutti + "." + this.sekunti);
    };
    
}
