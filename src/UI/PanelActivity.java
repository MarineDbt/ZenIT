package UI;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.SystemColor;

public class PanelActivity extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelActivity() {
		setBackground(SystemColor.control);
	
		setLayout(null);
		
		JButton btnAjouterUneActivit = new JButton("Ajouter une activit\u00E9");
		btnAjouterUneActivit.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnAjouterUneActivit.setBounds(258, 11, 127, 23);
		add(btnAjouterUneActivit);
		
		JPanel panel = new JPanel();
		//panel.setBackground(Color.ORANGE);
		panel.setBounds(10, 40, 639, 255);
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		/* JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		System.out.println("Bouton ajouté");
		*/
		
		
		int nbBtn =10;
		JButton[] btn;
		btn = new JButton[nbBtn];
		for (int i=0; i<btn.length; i++){
			JButton bouton = new JButton("Activité "+Integer.toString(i));
			btn[i]=bouton;
			panel.add(bouton);  
			} 
		
		

	}
}
