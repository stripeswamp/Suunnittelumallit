/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Charizard implements PokemonState {
   
   @Override
   public void kick()
   {
       System.out.println("Triple kick!");
   }
   
   @Override
   public void jump()
   {
       System.out.println("Jump 3m high!");
   }
   
   @Override
   public void punch()
   {
       System.out.println("Triple punch!");
   }
   
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public void accept(Visitor visitor)
    {
    
    }
   
    @Override
    public PokemonState nextState()
    {
        return null;
    }
    
    @Override
    public void setPoints(int points)
    {
        
    }
    
    @Override
    public int getPoints()
    {
        return 1;
    }
}
