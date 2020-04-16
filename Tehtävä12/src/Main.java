
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Image image1 = new ProxyImage("HiRes_10MB_Photo1");
       // Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        ArrayList<Image> images = new ArrayList<>();
        images.add(new ProxyImage("HiRes_10MB_Photo1"));
        images.add(new ProxyImage("HiRes_10MB_Photo2"));
        
        for(Image i : images)
        {
            System.out.println(i.showData());
        }
       
        
        /*image1.showData();
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
        */
    }
    
}
