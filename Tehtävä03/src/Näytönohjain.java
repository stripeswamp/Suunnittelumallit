/**
 *
 * @author stripeswamp
 */
public class Näytönohjain implements Laiteosa {
    
    private double hinta;
    
    public Näytönohjain(float inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    @Override
    public double getHinta()
    {
        return this.hinta;
    }
}
