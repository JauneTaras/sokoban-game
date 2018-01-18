package sokoban;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import static sokoban.SokobanGame.map;

/**
 *
 * @author Jaune
 */
public class Level extends SokobanGame{
    
          MapElement map[][] =  new MapElement[20][25];
          WarehouseKeeper warehouseKeeper;
          Crate crates[] = new Crate[20];
         private BufferedImage image;
             JLabel lbl = new JLabel();
       
        
        
    
  public void loadMap(int mapNumber) throws FileNotFoundException{
      
     
//creating File instance to reference text file in Java
         
           File text = new File("levels/level"+ mapNumber +".txt");
         // Levels 1-5 are saved as levels/level[1-5].txt

         //Creating Scanner instnace to read File in Java
         Scanner scnr = new Scanner(text);

         String[] levelMapLines = new String[20];
         //Reading each line of file using Scanner class
         int lineNumber = 0;
         while(scnr.hasNextLine()){
             String line = scnr.nextLine();
           levelMapLines[lineNumber] = line;
          System.out.println("line " + lineNumber + " :" + levelMapLines[lineNumber] );
             lineNumber++;}

        char temp; 
        int lineLength = levelMapLines[0].length();
        //Assumming that every line in each level will be the same length, 
        //which is true in the provided 5 levels but might not be in the future

       //Creating a character array and populating it with the characters used to draw a level
       char[][] charMap = new char[20][25];   
       for (int i = 0; i < lineNumber; i++){
         for (int j = 0; j < lineLength; j++){
             temp = levelMapLines[i].charAt(j);
             System.out.println(temp);
             charMap[i][j] = temp;}}
       
      
        //Creating an MapElement array and populating it with gameplay Objects
     for (int k = 0; k < lineNumber; k++){
         for (int l = 0; l < lineLength; l++){
             char item =  charMap[k][l];
             String icon = null;
             if (item == ' '){
                 map[k][l] = new Floor(k,l);
                 map[k][l].loadImage("Floor", k, l);
                 lbl = map[k][l].getImage();
                           }
             else if (item == 'X'){
                map[k][l] = new Wall(k,l);
               map[k][l].loadImage("Wall", k, l);
               lbl = map[k][l].getImage();
                          
             }
             else if (item == '*'){
                crates[k] = new Crate();
                map[k][l] = crates[k];
              crates[k].loadImage("Crate", k, l);
              lbl = crates[k].getImage();
                        }
             else if (item == '.'){
                map[k][l] = new Diamond(k,l);
             map[k][l].loadImage("Diamond", k, l);
             lbl = map[k][l].getImage();
                      }
             else if (item == '@'){
                this.warehouseKeeper = new WarehouseKeeper(k, l);
                warehouseKeeper.loadImage("WarehouseKeeper", k, l);
                lbl = warehouseKeeper.getImage();
                        }
            System.out.println(map[k][l]);         }     
     
     }
            
            
                    
  }
    Level() throws FileNotFoundException{
       
     
    }
}
