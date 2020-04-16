/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class RealImage implements Image {
    private final String filename;
    
    public RealImage(String filename)
    {
        this.filename = filename;
        loadImageFromDisk();
    }
    
    private void loadImageFromDisk()
    {
        System.out.println("Loading " + this.filename);
    }
    
    @Override
    public void displayImage()
    {
        System.out.println("Displaying " + this.filename);
    }
    
    @Override
    public String showData()
    {
        return ("Filename " + this.filename);
    }
}
