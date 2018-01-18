/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Color;
import java.io.FileNotFoundException;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;


/**
 *
 * @author Jaune
 */
public class MapElement extends Level{
    
    JLabel lbl = new JLabel();
    
     public JLabel getImage(){
        return lbl;
    }
    
    public void loadImage(String type, int x, int y){
     
       ImageIcon iconImg = new ImageIcon("C:/Users/Jaune/Documents/NetBeansProjects/Sokoban/sokobanImages/" + type + ".png", type + " image icon");  
       if (!(iconImg == null)){
           //System.out.println(iconImg.getIconHeight());
       } else {
       }
       lbl.setIcon(iconImg);
       lbl.setFont(new Font("Verdana", 1, 20));
       lbl.setSize(lbl.getPreferredSize());
       lbl.setLocation(x*10, y*10);
        
    }
    
   
   
    
    MapElement()throws FileNotFoundException{}

}

