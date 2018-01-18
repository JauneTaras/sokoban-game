/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;


public class Floor  extends MapElement  {
    
     String imageLocation = "SokobanImages/Floor.jpg";
    
    public String getImageLocation(){
    
    return imageLocation;
    }
    
    Floor(int x, int y) throws FileNotFoundException{
    
        int xCoord = x;
        int yCoord = y;
    }
}
