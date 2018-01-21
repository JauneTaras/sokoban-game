/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Wall extends MapElement {
    
  /*   BufferedImage wallIcon = null; 
    
    String imageLocation = "SokobanImages/Wall.jpg";
    
   public void CreateImage(){
           
   try{
   wallIcon = ImageIO.read(new File(imageLocation));
   }catch(IOException e){   }
       
    }
   
   public BufferedImage returnImage(){
   return wallIcon;   
   }*/
   
    Wall(String name)throws FileNotFoundException{
     super(name);
    
    }
    
}
