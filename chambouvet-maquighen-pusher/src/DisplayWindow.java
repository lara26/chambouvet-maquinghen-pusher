
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayWindow implements Runnable {

	public void run()
	{
		JFrame window = new JFrame();
		setLayout(null);
		JLabel fixedLabel = new JLabel("bouh");
		window.setTitle("Sokaban");
		window.setSize(600, 700);
	//	FixedItem testfixed;
	//	MovableItem testnotfixed;
		//Map displayMap = new Map();
	//	int column = displayMap.getNumberOfColumns();
		for (int i=0; i<4;i++){
			window.getContentPane().add(fixedLabel);
			fixedLabel.setBounds(1+i, 1+i, 10, 10);
		}
		
		window.setVisible(true);
	}
}
