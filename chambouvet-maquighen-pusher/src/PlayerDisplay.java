
/**
 * display message interface
 * @author chamboug
 *
 */
public interface PlayerDisplay
{

	
	public void displayDirectionChoice();

	public void displayMap(String formattedMap);

	public void displayVictoryMessage();
	
	public void displayInvalidDirectionMessage();

	public void displayHowToGiveUpMessage();
	
	public void displayGiveUpMessage();

}