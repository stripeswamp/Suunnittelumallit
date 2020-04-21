/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Tarjoilija {
    private Hambuilder hamBuilder;
    
    public void setHambuilder(Hambuilder hBuilder)
    {
        this.hamBuilder = hBuilder;
    }
    
    public Object getBurger()
    {
        return this.hamBuilder.getBurger();
    }
    
    public void makeBurger()
    {
        this.hamBuilder.initiateBurger();
        this.hamBuilder.addToBurger();
    }
}
