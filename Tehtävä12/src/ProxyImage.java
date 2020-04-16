/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ProxyImage implements Image {
    private final String filename;
    private RealImage image;
    
    public ProxyImage(String filename)
    {
        this.filename = filename;
    }
    
    @Override
    public void displayImage()
    {
        if(this.image == null)
        {
            image = new RealImage(this.filename);
        }
        this.image.displayImage();
    }
}
