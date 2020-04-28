/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Subject implements Cloneable {
    
    private String name;
    
    public Subject(String s) 
    {
        this.name = s;
    }
    
    public String getName()
    {
        return this.name;
    }

    public void setName(String s)
    {
        this.name = s;
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