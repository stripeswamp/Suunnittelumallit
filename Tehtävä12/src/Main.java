
import java.io.BufferedReader;
import java.io.InputStreamReader;
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


public class Main{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        ArrayList<Image> images = new ArrayList<>();
        images.add(new ProxyImage("HiRes_10MB_Photo1"));
        images.add(new ProxyImage("HiRes_10MB_Photo2"));
        
        for(int c = 0; c < images.size(); c++)
        {
            System.out.println(c+1 + ": " + images.get(c).showData());
        }
       
        try
        {
            while (true)
            {
                System.out.print("> ");
                int d = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                images.get(d-1).displayImage();
           }
        }
        catch(Exception e)
        {
            System.exit(1);
        }
        
    }
    
}
