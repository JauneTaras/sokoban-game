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
public class Sokoban {

    public static void main(String[] args) throws FileNotFoundException {
       
        
      //  MapElement currentMap = new MapElement();

        SokobanGame game = new SokobanGame();
        game.loadLevel(1);
        
        GraphicsUI gui = new GraphicsUI();
        gui.loadFrame();
        gui.loadButtons();
       
    }
    
    
    
}
