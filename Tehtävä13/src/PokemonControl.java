/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class PokemonControl implements PokemonState {
    
    PokemonState pokemon;
    
    public PokemonControl()
    {
        this.pokemon = new Charmander();
    }
    
    public void setPokemonState(PokemonState state)
    {
        this.pokemon = state;
    }
    
    @Override
    public void kick()
    {
        pokemon.kick();
    }
    
    @Override
    public void jump()
    {
        pokemon.jump();
    }
    
    @Override
    public void punch()
    {
        pokemon.punch();
    }
    
    @Override
    public String toString()
    {
        return pokemon.toString();
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
