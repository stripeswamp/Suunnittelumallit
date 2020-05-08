/**
 *
 * @author stripeswamp
 */
public class Muistipiiri implements Laiteosa {
    
    private double hinta;
    
    public Muistipiiri(float inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    @Override
    public double getHinta()
    {
        return this.hinta;
    }
}
