/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
class Päällikkö extends KorotusHandler{
    protected double haeSallittu()
    {
        return PERUS+5;
    }
    
    protected String haeRooli()
    {
        return "Päällikkö";
    }
}
