/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stripeswamp
 */
public class ScreenDownCommand implements Command {
    private SilverScreen silverScreen;
    
    public ScreenDownCommand(SilverScreen inputScreen)
    {
        this.silverScreen = inputScreen;
    }
    
    @Override
    public void execute()
    {
        silverScreen.DownWithTheScreen();
    }
}
