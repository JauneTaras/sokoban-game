/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Jaune
 */
public class SokobanGame extends Sokoban {
   
     
    
     
      public void loadLevel(int mapNumber) throws FileNotFoundException {
          
     Level currentLevel = new Level();  
     currentLevel.loadMap(mapNumber);
     currentLevel.displayMap();
   
     }

    
      
      

    SokobanGame() throws FileNotFoundException {

     
 
      }       
}
