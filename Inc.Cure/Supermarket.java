import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Supermarket {
static JPanel supermarket = new JPanel();
	
	public Supermarket() {
		JButton test = new JButton("This is Supermarket click me to go to subway");
		supermarket.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
		supermarket.setLayout(new GridLayout(0, 1));
		supermarket.add(test);
		
		test.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("go to story");
				supermarket.setVisible(false);
				new Subway();
				GUI.frame.add(Subway.subway);
			}
        });
	}
}
