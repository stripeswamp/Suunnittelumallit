/**
 *
 * @author stripeswamp
 */
public class Verkkokortti implements Laiteosa {
    private float hinta;
    
    public Verkkokortti(float inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    public float getHinta()
    {
        return this.hinta;
    }
}
