/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;



public class Diamond extends MapElement {
        int xCoord;
     int yCoord;
  
    public Diamond(int x,int y) throws FileNotFoundException {
          super(x,y);
           xCoord = x;
           yCoord = y;
       
    }
        
}
