/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
abstract class KorotusHandler {
    protected static final double PERUS = 0;
    protected KorotusHandler seuraaja;
    
    abstract protected double haeSallittu();
    abstract protected String haeRooli();
    
    public void asetaSeuraaja(KorotusHandler seuraaja)
    {
        this.seuraaja = seuraaja;
    }
    
    public void käsitteleKorotus(KorotusPyyntö pyyntö)
    {
        if(pyyntö.haeKorotus() < this.haeSallittu())
        {
            System.out.println(this.haeRooli() + " hyväksyy " + pyyntö.haeKorotus() + "% korotuksen.");
        }
        else if(this.seuraaja != null)
        {
            seuraaja.käsitteleKorotus(pyyntö);
        }
    }
}
