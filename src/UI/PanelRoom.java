package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import java.awt.Color;

public class PanelRoom extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelRoom() {
		setBackground(Color.ORANGE);
	
		setLayout(null);
		
		JButton btnAjouterUneActivit = new JButton("Ajouter une activit\u00E9");
		btnAjouterUneActivit.setBounds(256, 11, 146, 23);
		add(btnAjouterUneActivit);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 40, 639, 253);
		add(panel);
		
		
		int nbBtn = 10;
		JButton[] btn;
		btn = new JButton[nbBtn];
		for (int i=0; i<btn.length; i++){
			JButton bouton = new JButton("Activité "+Integer.toString(i));
			btn[i]=bouton;
			panel.add(bouton); }
		

	

	}
}

