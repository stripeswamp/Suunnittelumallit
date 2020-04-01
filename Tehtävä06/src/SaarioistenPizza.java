/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SaarioistenPizza implements Pizza
{
    @Override
    public String teePizza()
    {
        return "Hyvä pizza";
    }
    
    @Override
    public int annaHinta()
    {
        return 10;
    }
}
