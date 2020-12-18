import java.awt.Dimension;

import javax.swing.JButton;

public class LocationButtons extends GUI{
	
	
	public void goToSubway() {
		JButton button = new JButton("Go To Subway");
		//panel.add(button);
	}

	public void goToHome() {
		JButton button = new JButton("Go Home");
		//panel.add(button);
	}
	
	public void goToSuperMarket() {
		JButton button = new JButton("Go To Supermarket");
		//panel.add(button);
	}
	
	public void goToHospital() {
		JButton button = new JButton("Go To Hospital");
		button.setBounds(0, 0, 10, 5);
	    //panel.add(button);
		
	}
}
