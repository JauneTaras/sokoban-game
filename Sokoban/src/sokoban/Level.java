/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokoban;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Jaune
 */
public class Level {
    
    
    public static void loadMap(int mapNumber) throws FileNotFoundException {
  
        //creating File instance to reference text file in Java
        File text = new File("levels/level"+ mapNumber +".txt");
        // Levels 1-5 are saved as levels/level[1-5].txt
      
        //Creating Scanner instnace to read File in Java
        Scanner scnr = new Scanner(text);
      
        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;}
}
    
    
            
    Level() throws FileNotFoundException {
        
           
    }
   
    
}
