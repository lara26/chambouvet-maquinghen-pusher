import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayWindow implements Runnable {

	public void run(){
		
		
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Sokoban");
		fenetre.setSize(500, 500);
		fenetre.setContentPane(new fondCase());
		fenetre.setLayout(new GridLayout(8, 9));

		
		Icon wall = new ImageIcon(new ImageIcon(".\\wall.png").getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));		
		
		for (int i=0;i<8;i++){
			for (int j=0; j<9; j++){
					JLabel fixedItem = new JLabel(wall);
					fixedItem.setBounds(20, 50, 20, 20);
					fenetre.getContentPane().add(fixedItem);
			}
		}
		
		fenetre.setVisible(true);
	}
}
