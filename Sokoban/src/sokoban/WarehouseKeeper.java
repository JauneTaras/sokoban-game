/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;


public class WarehouseKeeper extends MoveableMapElement {
    
     int collumns = 1;
     int rows = 1;
     
     public void move(String direction){
            MapElement tempElement = null;
            
        if ("up".equals(direction)){
        System.out.println("up detected");
            if (map[collumns-1][rows]instanceof Wall) {
                 System.out.println("wall up detected");
                      }
            
            else { tempElement = map[collumns-1][rows];
           
            map[collumns-1][rows] = currentWarehouseKeeper;
            map[collumns][rows] = tempElement;
            super.displayMap();   
            collumns = collumns-1;}
            
          
       } 
         
       
        }

    
//    public void setXCoord(int newX){
//    xCoord = newX;}
//     
//    public void setYCoord(int newY){
//    yCoord = newY;
//    }
//     
//    public int returnXCoord(){
//     
//     return xCoord;
//     }
//     
//     public int returnYCoord(){
//     
//     return yCoord;
//     }
     
       public WarehouseKeeper(int y, int x) throws FileNotFoundException{
           super(x,y);
        collumns = y;
        rows = x;
       
       }
    
}
