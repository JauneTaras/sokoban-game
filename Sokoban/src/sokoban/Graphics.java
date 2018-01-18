/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Jaune
 */
public class Graphics{
    
    public JFrame mainWindow = new JFrame("Sokoban");
    GridLayout guiGrid = new GridLayout(5,1);
    GridLayout tileGrid = new GridLayout(25,25,1,1);
    JPanel mainPanel = new JPanel();
    JPanel guiPanel = new JPanel(guiGrid);  
    JPanel tilePanel = new JPanel();
     
     
     public void loadFrame(){
     
        mainWindow.setSize(700,700);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainPanel.setLayout(new GridBagLayout()); 
        
       guiPanel.setPreferredSize(new Dimension(200,200));
        mainPanel.add(guiPanel); 
        
        tilePanel.setPreferredSize(new Dimension(675,500));
        mainPanel.add(tilePanel);
        
        mainWindow.add(mainPanel);
        mainWindow.pack();

      
     }
     
     public void loadButtons(){
     
     JButton resetLevelButton = new JButton("Reset Level");  
     guiPanel.add(resetLevelButton);
     mainWindow.setVisible(true);
     
     JButton moveUpButton = new JButton("Up");
     JButton moveLeftButton = new JButton("Left");
     JButton moveRightButton = new JButton("Right");
     JButton moveDownButton = new JButton("Down");
     
     guiPanel.add(moveUpButton);
     guiPanel.add(moveLeftButton);
     guiPanel.add(moveRightButton);
     guiPanel.add(moveDownButton);
     
     }
     
     public void loadTileGrid(){
         
         
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 25; j++){
        
        tilePanel.add(new JButton(i+","+j));}}
       
         
     }
    
     
     Graphics (){
         
                
     }
    
    
    
}
