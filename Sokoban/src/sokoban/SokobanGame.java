/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.io.FileNotFoundException;
import javax.swing.*;
/**
 *
 * @author Jaune
 */
public class SokobanGame {
    
      public static void loadLevel(int levelNumber) throws FileNotFoundException {
      
          Level.loadMap(levelNumber);
      
      }
        
      SokobanGame() throws FileNotFoundException {
          
       JFrame mainWindow = new JFrame();
        
        mainWindow.setSize(500,500);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
         Level testLevel = new Level();
         
         SokobanGame.loadLevel(3);
     
         
        
      }  
        
        
}
