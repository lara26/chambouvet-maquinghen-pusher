import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayWindow implements Runnable {

	public Map maprendue(){
		String fixedContentOfTheMap = "";
		fixedContentOfTheMap += "[f,-];[f,-];[w,-];[w,-];[w,-];[w,-];[w,-];[f,-]\n";
		fixedContentOfTheMap += "[w,-];[w,-];[w,-];[f,-];[f,-];[f,-];[w,-];[f,-]\n";
		fixedContentOfTheMap += "[w,-];[1,p];[f,-];[f,1];[f,-];[f,-];[w,-];[f,-]\n";
		fixedContentOfTheMap += "[w,-];[w,-];[w,-];[f,-];[f,2];[2,-];[w,-];[f,-]\n";
		fixedContentOfTheMap += "[w,-];[7,-];[w,-];[w,-];[f,3];[f,-];[w,-];[f,-]\n";
		fixedContentOfTheMap += "[w,-];[f,-];[w,-];[f,-];[3,-];[f,-];[w,-];[w,-]\n";
		fixedContentOfTheMap += "[w,-];[f,7];[f,-];[6,6];[f,5];[f,4];[4,-];[w,-]\n";
		fixedContentOfTheMap += "[w,-];[f,-];[f,-];[f,-];[5,-];[f,-];[f,-];[w,-]\n";
		fixedContentOfTheMap += "[w,-];[w,-];[w,-];[w,-];[w,-];[w,-];[w,-];[w,-]\n";
			
		Map map = Map.parseMap(fixedContentOfTheMap);
		return map;
	}
	
	
	public void run(){
		Map map = maprendue();
		int lign = map.getNumberOfRows();
		int column = map.getNumberOfColumns();
	
		
		
		
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Sokoban");
		fenetre.setSize(500, 500);
		Position posiPlayer =map.getPlayerPosition();
		
		
		
		
		//fenetre.setContentPane(new fondCase());
		fenetre.setLayout(new GridLayout(lign, column));
		Icon wall = new ImageIcon(new ImageIcon(".\\wall.png").getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT));		
		
		for (int i=0;i<lign;i++){
			for (int j=0; j<column; j++){
				Position posiCurrent = new Position(i,j);
			//	FixedItem fixedItemCurrent = map.getFixedContentAt(posiCurrent);
				
				
				//map.getSquareAt(new Position(rowNumber, columnNumber)).getFixedContent() ==
				
				if ((posiCurrent.getX() == posiPlayer.getX())&&(posiCurrent.getY() == posiPlayer.getY())){
					JLabel bouh = new JLabel("P");
					fenetre.getContentPane().add(bouh);
				}
/**//**/		if(map.getSquareAt(posiCurrent).getFixedContent() == null){
					JLabel bouh1 = new JLabel("b");
					fenetre.getContentPane().add(bouh1);
				}
				else{
					JLabel fixedItem = new JLabel(wall);
					fenetre.getContentPane().add(fixedItem);	
			
				}
			}
		}
		
		fenetre.setVisible(true);
	}
}

