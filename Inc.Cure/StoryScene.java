import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StoryScene {

	static JPanel story = new JPanel();
	JButton test = new JButton("HAHAHA");
	
	public StoryScene() {
		story.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
		story.setLayout(new GridLayout(0, 1));
		story.add(test);
		
		JLabel label = new JLabel("<html><div style = 'text-align: center;'>" + "Welcome to Cure.Inc" +
                "</div></html>");

	}
}
