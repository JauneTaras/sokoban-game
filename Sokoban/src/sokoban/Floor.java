/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;


public class Floor  extends MapElement  {
    int xCoord;
     int yCoord;
  
    
    Floor(int x , int y ) throws FileNotFoundException{
    super(x,y);
    xCoord = x;
    yCoord = y;
      
    }
}
