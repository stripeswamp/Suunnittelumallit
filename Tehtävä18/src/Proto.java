/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Proto implements Cloneable {
    
    public Proto()
    {

    }
    
    public Object clone()
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException poikkeus)
        {
            poikkeus.printStackTrace();
        }
        return null;
    }
    
}
