/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;


public class WarehouseKeeper extends MoveableMapElement {
    
     String imageLocation = "SokobanImages/WarehouseKeeper.jpg";


    public String getImageLocation(){
    
    return imageLocation;}
    
    
       WarehouseKeeper(String name) throws FileNotFoundException{
     super(name);
       
       }
    
}
