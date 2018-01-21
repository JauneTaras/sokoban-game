package sokoban;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import static sokoban.SokobanGame.map;

/**
 *
 * @author Jaune
 */
public class Level extends SokobanGame{
    
         WarehouseKeeper warehouseKeeper;
         Crate crates[] = new Crate[20];
         int numberOfMoves;
         JLabel numberOfMovesLabel;
         JButton restartLevelButton;
         MapElement map[][] =  new MapElement[20][25];

    
  public void loadMap(int mapNumber) throws FileNotFoundException{
      
  
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
                 map[k][l] = new Floor("Floor");}
             else if (item == 'X'){
                map[k][l] = new Wall("Wall");}
             else if (item == '*'){
                map[k][l] = new Crate("Crate");}
             else if (item == '.'){
                map[k][l] = new Diamond("Diamond");}
             else if (item == '@'){
              map[k][l] = new WarehouseKeeper("WarehouseKeeper");}
            System.out.println(map[k][l]);  }}}     
 
  
    public void checkForWin(){}
     
    public void displayMap(){
    
          for(int i=0; i<map.length; i++) {
        for(int j=0; j<map[i].length; j++){
            
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/sokobanImages/Floor.png"));
        JLabel tileImage = new JLabel(icon);
        GraphicsUI.loadTileGrid(tileImage);
        }}
    
    
    
    }
    public void restartLevel(){}
            
           
    Level() throws FileNotFoundException{
       
     
    }
}
