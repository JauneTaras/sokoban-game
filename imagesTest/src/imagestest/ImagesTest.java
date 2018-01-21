/*
 * src = https://stackoverflow.com/questions/21001438/how-to-display-multiple-images-on-a-jlabel
 */
package imagestest;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author Jaune
 */
public class ImagesTest extends JPanel {

    /**
     * @param args the command line arguments
     * 
     * 
     */
    
    public ImagesTest(){
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/image/Floor.png"));
         ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/image/Floor.png"));
         ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/image/Floor.png"));
         JLabel label1 = new JLabel(icon); 
         JLabel label2 = new JLabel(icon1); 
         JLabel label3 = new JLabel(icon2); 

         add(label1);
         add(label2);
         add(label3);
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
           JFrame frame = new JFrame();

        frame.add(new ImagesTest());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
