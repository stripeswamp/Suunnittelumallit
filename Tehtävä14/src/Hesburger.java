
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Hesburger extends Hambuilder {
    
    List<Object> hesBurger;
    
    @Override
    public void initiateBurger()
    {
        this.hesBurger = new ArrayList<>();
    }
    
    @Override
    public void addToBurger()
    {
    }
    
    @Override
    public Object getBurger()
    {
        return this.hesBurger;
    }
    
   
}
