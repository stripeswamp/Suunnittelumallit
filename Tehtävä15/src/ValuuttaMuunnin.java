/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class ValuuttaMuunnin implements ValuuttaMuunninInterface {
    private Valuutta valuutta;
    
    public ValuuttaMuunnin(Valuutta inputValuutta)
    {
        this.valuutta = inputValuutta;
    }
    
    @Override
    public double getArvo()
    {
        return eurotMarkoiksi(valuutta.getArvo());
    }
    
    private double eurotMarkoiksi(double value)
    {
        return value *  5.94573;
    }
}
