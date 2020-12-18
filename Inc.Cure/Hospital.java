import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hospital{
	static JPanel Hospital = new JPanel();
	
	public Hospital() {
		JButton test = new JButton("This is Hospital click me to go to Supermarket");
		Hospital.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
		Hospital.setLayout(new GridLayout(0, 1));
		Hospital.add(test);
		
		test.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("going to Supermarket");
				Hospital.setVisible(false);
				new Supermarket();
				GUI.frame.add(Supermarket.supermarket);
			}
        });
	}
	
	
}
