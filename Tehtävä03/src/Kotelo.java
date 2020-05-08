
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Kotelo implements Laiteosa {
    private double hinta;
    private List<Laiteosa> kotelonOsa;
    
    public Kotelo(double inputHinta)
    {
        this.hinta = inputHinta;
        this.kotelonOsa = new ArrayList<>();
    }
    
    public void lisääOsa(Laiteosa osa)
    {
        this.kotelonOsa.add(osa);
    }
    
    @Override
    public double getHinta()
    {
        for(Laiteosa osa : this.kotelonOsa)
        {
            this.hinta += osa.getHinta();
        }
        
        return this.hinta;
    }
}
