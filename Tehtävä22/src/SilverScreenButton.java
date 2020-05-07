/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class SilverScreenButton {
    Command commando;
    
    public SilverScreenButton(Command inputValue)
    {
        this.commando = inputValue;
    }
    
    public void pushTheButton()
    {
        this.commando.execute();
    }
}
