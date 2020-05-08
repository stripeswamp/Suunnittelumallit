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
   void kick();
   void jump();
   void punch();
   
   // Visitor-mallin laajennus Pokemonstateen
   void accept(Visitor visitor);
   PokemonState nextState();
   void addPoints(int points);
   int getPoints();
}
