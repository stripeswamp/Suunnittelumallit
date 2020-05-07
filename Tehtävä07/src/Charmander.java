
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Charmander implements PokemonState{
   
    @Override
    public void kick()
    {
        System.out.println("Single kick!");
    }

    @Override
    public void jump()
    {
        System.out.println("Jump 1m high!");
    }

    @Override
    public void punch()
    {
        System.out.println("Single punch!");
    }
    
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName();
    }
}
