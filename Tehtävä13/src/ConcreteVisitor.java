/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class ConcreteVisitor implements Visitor {
    
    @Override
    public void visit(Charmander pokemonState)
    {
        pokemonState.addPoints(10);
    }
    
    @Override
    public void visit(Charmeleon pokemonState)
    {
        pokemonState.addPoints(20);
    }
    
    @Override
    public void visit(Charizard pokemonState)
    {
        pokemonState.addPoints(30);
    }
}
