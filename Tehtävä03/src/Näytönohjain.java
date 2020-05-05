/**
 *
 * @author stripeswamp
 */
public class Näytönohjain implements Laiteosa {
    
    private float hinta;
    
    public Näytönohjain(float inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    @Override
    public float getHinta()
    {
        return this.hinta;
    }
}
