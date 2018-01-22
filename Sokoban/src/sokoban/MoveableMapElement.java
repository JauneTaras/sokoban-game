/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;


public class MoveableMapElement extends MapElement {
    private int collumns;
    private int rows;
    
    
    public void moveElement(String direction) throws FileNotFoundException{
        
        if (this instanceof WarehouseKeeper){
        
        currentWarehouseKeeper.move(direction);
        
            
        }
 
   
       
   
    }
    
   public MoveableMapElement(int y, int x )throws FileNotFoundException{
       super(x,y);
   collumns = y;
   rows = x;
      
    }
    
}
