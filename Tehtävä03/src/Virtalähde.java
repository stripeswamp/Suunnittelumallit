/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Virtalähde implements Laiteosa {
    
    private float hinta;
    
    public Virtalähde(float inputHinta)
    {
        this.hinta = inputHinta;
    }
    
    public float getHinta()
    {
        return this.hinta;
    }
}
