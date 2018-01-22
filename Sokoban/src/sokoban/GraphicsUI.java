/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.image.*;
import java.io.FileNotFoundException;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author 16003841
 */
public class GraphicsUI extends JPanel implements ActionListener {
   
    public JFrame mainWindow = new JFrame("Sokoban");
    GridLayout guiGrid = new GridLayout(5,1);
   static GridLayout tileGrid;
    JPanel mainPanel = new JPanel();
    JPanel guiPanel = new JPanel(guiGrid);  
    static JPanel tilePanel = new JPanel();
     
     
     public void loadFrame(){
     
        mainWindow.setSize(900,900);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainPanel.setLayout(new GridBagLayout()); 
        
       guiPanel.setPreferredSize(new Dimension(200,200));
        mainPanel.add(guiPanel); 
        
       tileGrid = new GridLayout(Level.returnLineNumber(), Level.returnLineLength()); 
     
       tilePanel.setLayout(tileGrid);
         tilePanel.setPreferredSize(tilePanel.getPreferredSize());
        mainPanel.add(tilePanel);
        
        mainWindow.add(mainPanel);
        mainWindow.pack();

      
     }
     
     public void loadButtons(){
     
     JButton resetLevelButton = new JButton("Reset Level"); 
      resetLevelButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            System.out.println("reset level");
         }});
     guiPanel.add(resetLevelButton);
     mainWindow.setVisible(true);
     
     JButton moveUpButton = new JButton("Up");
     moveUpButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             try {
                 Level.moveWarehouseKeeper("up");
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(GraphicsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             }
            System.out.println("move up");
            
         }});
         
  
     JButton moveLeftButton = new JButton("Left");
      moveLeftButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             System.out.println("move left");
         }});
      
      
     JButton moveRightButton = new JButton("Right");
      moveRightButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             System.out.println("move right");
         }});
      
     JButton moveDownButton = new JButton("Down");
     moveDownButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             System.out.println("move down");
         }});
     
     guiPanel.add(moveUpButton);
     guiPanel.add(moveLeftButton);
     guiPanel.add(moveRightButton);
     guiPanel.add(moveDownButton);
     
     }
     
     public static void loadTileGrid (JLabel imgLabel){
    
     tilePanel.add(imgLabel);
     }
     
     public static void clearTileGrid(){
     
         tilePanel.removeAll();
         tilePanel.revalidate();
     
     }
     

  
     
     GraphicsUI (){
         
                
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

