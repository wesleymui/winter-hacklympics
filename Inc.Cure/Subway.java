import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Subway {
static JPanel subway = new JPanel();
	
	public Subway() {
		JButton test = new JButton("This is subway");
		subway.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
		subway.setLayout(new GridLayout(0, 1));
		subway.add(test);
		
		test.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("going nowhere lul");
			}
        });
	}
}
