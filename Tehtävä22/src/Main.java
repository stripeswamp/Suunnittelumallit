/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SilverScreen screen = new SilverScreen();
        
        Command up = new ScreenUpCommand(screen);
        Command down = new ScreenDownCommand(screen);
        
        SilverScreenButton upButton = new SilverScreenButton(up);
        SilverScreenButton downButton = new SilverScreenButton(down);
        
        upButton.pushTheButton();
        downButton.pushTheButton();

    }
    
}
