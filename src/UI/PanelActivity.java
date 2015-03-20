package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class PanelActivity extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelActivity() {
		setLayout(null);
		
		JButton btnAjouterUneActivit = new JButton("Ajouter une activit\u00E9");
		btnAjouterUneActivit.setBounds(256, 11, 146, 23);
		add(btnAjouterUneActivit);
		

	}

}
