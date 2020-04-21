/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class McDonalds extends Hambuilder {
    
    private StringBuilder McBurger;
    
    @Override
    public void initiateBurger()
    {
        this.McBurger = new StringBuilder();
    }
    
    @Override
    public Object getBurger()
    {
        return this.McBurger;
    }
    
    @Override
    public void addToBurger()
    {
        this.McBurger.append("Kanapihvi");
        this.McBurger.append("Emmental-juusto");
        this.McBurger.append("Perussalaatti");
    }
}
