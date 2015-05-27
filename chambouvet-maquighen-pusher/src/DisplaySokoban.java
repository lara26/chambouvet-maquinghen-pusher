import javax.swing.SwingUtilities;


public class DisplaySokoban {

	public static void main(String[] args) {
		
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
		
		/*DisplayWindow affichage = new DisplayWindow();
		affichage.displayMap(fixedContentOfTheMap);
		SwingUtilities.invokeLater(new DisplayWindow());*/
		//DisplayWindow.displayDirectionChoice();
		new GameOfPusher(map, new EntryConsole(), new DisplayWindow()).play();
	
	}

}

