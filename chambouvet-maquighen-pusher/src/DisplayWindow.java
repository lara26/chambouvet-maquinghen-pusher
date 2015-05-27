import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;
import javax.swing.plaf.DimensionUIResource;

public class DisplayWindow implements PlayerDisplay, Runnable {
	
	JFrame fenetre = new JFrame();

	
	
	public void displayDirectionChoice()
	{
		System.out.println("Please choose a direction using Z,Q,S,D");
	}

	
	
	@Override
	public void displayMap(String formattedMap) {
		Map map =  Map.parseMap(formattedMap);
		int lign = map.getNumberOfRows();
		int column = map.getNumberOfColumns();
	
		fenetre.setTitle("Sokoban");
		fenetre.setSize(600, 600);
		fondCase sokobanGame = new fondCase();
		sokobanGame.setPreferredSize(new Dimension(500, 500));
		sokobanGame.setLayout(new GridLayout(lign, column));

		Icon wall = new ImageIcon(new ImageIcon(".\\wall3.png").getImage().getScaledInstance(75, 65,Image.SCALE_DEFAULT));
		Icon playerImg = new ImageIcon(new ImageIcon(".\\perso.png").getImage().getScaledInstance(60, 50,Image.SCALE_DEFAULT));
		Icon boxImg = new ImageIcon(new ImageIcon(".\\box.png").getImage().getScaledInstance(60, 50,Image.SCALE_DEFAULT));
		Icon bulle = new ImageIcon(new ImageIcon(".\\bulle.png").getImage().getScaledInstance(60, 50,Image.SCALE_DEFAULT));
		
		for (int i=0;i<lign;i++){
			for (int j=0; j<column; j++){

			if ((map.getSquareAt(new Position(i, j)).getFixedContent() == null) && (map.getSquareAt(new Position(i, j)).getMovableContent() == null)){
						JLabel vide = new JLabel();
						sokobanGame.add(vide);
					}
			else if (map.getSquareAt(new Position(i, j)).getMovableContent() instanceof Player){
				JLabel player = new JLabel(playerImg);
				sokobanGame.add(player);
			}
	
			else if (map.getSquareAt(new Position(i, j)).getMovableContent() instanceof Box){
				JLabel box = new JLabel(boxImg);
				sokobanGame.add(box);
			}
	
	
			else if(map.getSquareAt(new Position(i, j)).getFixedContent() instanceof Wall){
					JLabel fixedItem = new JLabel(wall);
					sokobanGame.add(fixedItem);	
				}

			else if (map.getSquareAt(new Position(i, j)).getFixedContent() instanceof Exit){
					JLabel exit = new JLabel(bulle);
					sokobanGame.add(exit);	
				}
			
			}
		}

		fenetre.getContentPane().add(sokobanGame);
		fenetre.setVisible(true);
		
	}
	
	public void run(){
		fenetre.setVisible(true);
		
	}
	
	public void displayVictoryMessage()
	{
		System.out.println("Victory !");
	}
	
	public void displayInvalidDirectionMessage()
	{
		System.out.println("Invalid direction");
	}
	
	public void displayHowToGiveUpMessage()
	{
		System.out.println("Type \"give up\" to stop your game");
	}
	
	public void displayGiveUpMessage()
	{
		System.out.println("You give up, pusher's stronger than you!");
	}

}

