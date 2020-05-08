
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stripeswamp
 * Emolevy-luokka on compositeluokka eli käytännössä kerätään vaan rajapintatietotyyppinen lista ja itse emolevyllä on toki myös hinta
 */
public class Emolevy implements Laiteosa {
    
    private float hinta;
    private List<Laiteosa> laiteOsat;
    
    public Emolevy(float inputHinta)
    {
        this.hinta = inputHinta;
        this.laiteOsat = new ArrayList<>();
    }
    
    public void lisääOsa(Laiteosa osa)
    {
        this.laiteOsat.add(osa);
    }
    
    @Override
    public double getHinta()
    {
        for(Laiteosa osa : this.laiteOsat)
        {
            this.hinta += osa.getHinta();
        }
        
        return this.hinta;
    }
}
