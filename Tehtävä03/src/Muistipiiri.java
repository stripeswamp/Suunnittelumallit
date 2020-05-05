/**
 *
 * @author stripeswamp
 */
public class Muistipiiri implements Laiteosa {
    
    private float hinta;
    
    public Muistipiiri(float inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    @Override
    public float getHinta()
    {
        return this.hinta;
    }
}
