/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Euro implements Valuutta{
    
    private double euro;
    
    public Euro(double input)
    {
        this.euro = input;
    }
    
    @Override
    public double getArvo()
    {
        return this.euro;
    }
}
