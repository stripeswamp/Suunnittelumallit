/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public interface Visitor {
    void visit(Charmander pokemonState);
    void visit(Charmeleon pokemonState);
    void visit(Charizard pokemonState);
}
