/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Jaune
 */
public class GameGrid extends JPanel {
    
    
    static BufferedImage img;
    
    public void paint(Graphics g){
    g.drawImage(img,0,0, this);
    }
    
    
    public static void returnImg(BufferedImage tileImg){
    
    img = tileImg;
   
    
    
    }
}
