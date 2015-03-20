
package UI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import BL.Front.ActivityFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuBar;

/**
 * 
 * 
 * @poseidon-object-id [I3921c69fm14bffe267fdmm493c]
 */
public class ActivityUI extends JPanel implements ActionListener {
	
	public ActivityFacade activityfacade;
	
	//Constructeur
	public ActivityUI(AbstractPersistenceHandlerFactory factory){
		super();
		
		this.activityfacade = new ActivityFacade(factory);
		setSize(500,500);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 474, 102);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ZenLounge");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(164, 11, 139, 27);
		panel.add(lblNewLabel);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnAccueil.setBounds(10, 11, 76, 23);
		panel.add(btnAccueil);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 158, 474, 288);
		//getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 113, 474, 34);
	//	getContentPane().add(panel_2);
		
		JButton btnAjouterUneCatgorie = new JButton("Ajouter une activit\u00E9");
		panel_2.add(btnAjouterUneCatgorie);
		
		int nbBtn = 100;
		JButton[] btn;
		btn = new JButton[nbBtn];
		for (int i=0; i<btn.length; i++){
			JButton bouton = new JButton("Activité "+Integer.toString(i));
			btn[i]=bouton;
			panel_1.add(bouton); 
		} 

		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
 }
