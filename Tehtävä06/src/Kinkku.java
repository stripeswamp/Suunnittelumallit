/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Kinkku extends Dekoraattori
{
    public Kinkku(Pizza pizzaPohja)
    {
        super(pizzaPohja);
    }
   
    @Override
    public String teePizza()
    {
        return super.teePizza() + " + kinkku";
    }
   
    @Override
    public int annaHinta()
    {
        return super.annaHinta() + 1;
    }
}
