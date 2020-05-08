/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public interface PokemonState {
   public void kick();
   public void jump();
   public void punch();
   
   // Visitor-mallin laajennus Pokemonstateen
   public void accept(Visitor visitor);
   public PokemonState nextState();
   public void setPoints(int points);
   public int getPoints();
}
