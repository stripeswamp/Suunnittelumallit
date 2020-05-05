/**
 *
 * @author stripeswamp
 */
public class Prosessori implements Laiteosa {
    private float hinta;
    
    public Prosessori(float inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    @Override
    public float getHinta()
    {
        return this.hinta;
    }
}
