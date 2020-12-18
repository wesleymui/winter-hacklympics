import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class House {
static JPanel story = new JPanel();
	
	public House() {
		JButton test = new JButton("Hospital");
		story.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
		story.setLayout(new GridLayout(0, 1));
		story.add(test);
		
		test.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("go to story");
				
				new StoryScene();
				GUI.frame.add(StoryScene.story);
			}
        });
	}
}
