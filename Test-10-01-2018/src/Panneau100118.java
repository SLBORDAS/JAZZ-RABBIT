import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
public class Panneau100118 extends JPanel {
 
        public void paintComponent(Graphics g){
                try {
                        Image img = ImageIO.read(new File("D:\\test.png"));
                        g.drawImage(img, 0, 0, this);
                        //Pour une image de fond
                        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
        }               
}

