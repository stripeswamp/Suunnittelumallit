/**
 *
 * @author stripeswamp
 */
public class Prosessori implements Laiteosa {
    private double hinta;
    
    public Prosessori(double inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    @Override
    public double getHinta()
    {
        return this.hinta;
    }
}
