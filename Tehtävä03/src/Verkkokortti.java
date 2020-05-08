/**
 *
 * @author stripeswamp
 */
public class Verkkokortti implements Laiteosa {
    private double hinta;
    
    public Verkkokortti(float inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    @Override
    public double getHinta()
    {
        return this.hinta;
    }
}
