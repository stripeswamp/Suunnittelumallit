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
    
    private StringBuilder McDonalds;
    
    @Override
    public void initiateBurger()
    {
        this.McDonalds = new StringBuilder();
    }
    
    @Override
    public void addToBurger()
    {
        this.McDonalds.append("Emmental-juusto");
        this.McDonalds.append("Kanapihvi");
        this.McDonalds.append("Perussalaatti");
    }
    
    @Override
    public Object getBurger()
    {
        return this.McDonalds;
    }
}
