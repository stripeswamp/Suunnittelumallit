/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Talonmies
{
    Arvuuttaja arvuuttaja;
    
    public Object liityPeliin(Arvuuttaja arvuuttaja)
    {
        this.arvuuttaja = arvuuttaja;
        return this.arvuuttaja.liityPeliin();
    }
    
    public boolean arvaus(Object asiakas, int arvaus)
    {
        return this.arvuuttaja.arvaus(asiakas, arvaus);
    }
}
