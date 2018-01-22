/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;


public class Crate extends MoveableMapElement {
     private int xCoord;
    private int yCoord;

    
     public void setXCoord(){}
     
     public void setYCoord(){}
     
     public int returnXCoord(){
     
     return xCoord;
     }
     
     public int returnYCoord(){
     
     return yCoord;
     }
     
     
    public Crate(int x, int y ) throws FileNotFoundException{
        super(x,y);
         xCoord = x;
        yCoord = y;
       
      
    }
}
