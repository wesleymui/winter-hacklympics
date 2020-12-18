import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StoryScene {
	
	static JPanel story = new JPanel();
	public StoryScene() {

		 	JButton test = new JButton("This is Story click me to go to Hospital");
			story.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
			story.setLayout(new GridLayout(0, 1));
			story.add(test);
			
			test.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					story.setVisible(false);
					System.out.println("going to Hospital");
					new Hospital();
					GUI.frame.add(Hospital.Hospital);
				}
	        });
	}
}
