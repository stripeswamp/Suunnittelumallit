/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
abstract class Dekoraattori implements Pizza 
{
    private final Pizza pizzaPohja;
    
    public Dekoraattori(Pizza pizzaPohja)
    {
        this.pizzaPohja = pizzaPohja;
    }
    
    @Override
    public String teePizza()
    {
        return this.pizzaPohja.teePizza();
    }
    
    @Override
    public int annaHinta()
    {
        return this.pizzaPohja.annaHinta();
    }
}
