/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;



public class Diamond extends MapElement {
    
    String imageLocation = "SokobanImages/Diamond.jpg";
    
    public String getImageLocation(){
    
    return imageLocation;
    }
    
    public Diamond(String name) throws FileNotFoundException {
        super(name);
    }
        
}
