import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class fondCase extends JPanel {
	public fondCase(){
		super();
	}
	
	public void paintComponent(Graphics g){
		Image wall;
		try {
			wall = ImageIO.read(new File(".\\fond2.jpg"));
			g.drawImage((Image) wall,0,0,600,600,this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
