
import java.util.Observable;
import java.util.Observer;

public class DigitalClock extends ClockTimer {
    
    private ClockTimer digikello;
    
    public DigitalClock(ClockTimer clockTimer)
    {
        this.digikello = clockTimer;
    }
    
    private void paljoKello(Object objekti)
    {
        System.out.println(objekti);
    }
    
    public void aloita(Observable obs)
    {
        if(obs == this.digikello)
        {
            this.digikello.addObserver(new Observer() {
                @Override
                public void update(Observable o, Object arg) {
                    paljoKello(arg);
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
             new Thread(digikello).start();
        }
    }
}
