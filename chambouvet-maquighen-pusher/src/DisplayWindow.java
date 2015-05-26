
import java.awt.Component;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayWindow implements Runnable {

	public void run()
	{
		JFrame window = new JFrame();
		Icon image = new ImageIcon(new ImageIcon(".\\mur.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		//JLabel fixedLabel = new JLabel(image);
		int column = 9;
		int lign = 8;
		JLabel[][] Plateau = new JLabel[lign][column];
		window.setTitle("Sokaban");
		window.setSize(600, 700);
		//window.getContentPane().add(fixedLabel);
//		fixedLabel.setHorizontalAlignment(JLabel.LEFT);
		//fixedLabel.setVerticalAlignment(JLabel.BOTTOM);
		
		for( int i=0; i<lign; i++){
			for (int j=0; j<column; j++){
				JLabel fixedLabel = new JLabel(image);
				fixedLabel.setLocation(i,j);
				Plateau[i][j]= fixedLabel;
				window.getContentPane().add(fixedLabel);
			}
		}
		
		//window.getContentPane().add(Plateau);
	/*	String fixedContentOfTheMap="";
		
		Map map = Map.parseMap(fixedContentOfTheMap);
		int column = map.getNumberOfColumns();
		int lign = map.getNumberOfRows();
		for (int i=0; i<column; i++){
			for (int j=0; j<lign; j++){
			if (fixedContentOfTheMap=="w") window.getContentPane().add(fixedLabel);
			}
		}
		*/
		
		window.setVisible(true);
	}
}
