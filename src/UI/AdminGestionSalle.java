package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import BL.DataClasses.User;
import BL.Front.*;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;


public class AdminGestionSalle extends AdminServiceUI implements ActionListener {
	
	private AbstractPersistenceHandlerFactory maFactory;


	public AdminGestionSalle(User user, AbstractPersistenceHandlerFactory factory) {
		super(user, factory);
		maFactory = factory;
		this.setMinimumSize(new Dimension(650,500));
		
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JButton btnAfficherSalles = new JButton("Afficher les salles");
		btnAfficherSalles.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnAfficherSalles,"2, 2, left, top");
		
		JButton btnAjoutSalle = new JButton("Ajouter une salle");
		btnAjoutSalle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnAjoutSalle,"2, 4, left, top");
		btnAjoutSalle.addActionListener(this);
		btnAjoutSalle.setActionCommand("AjoutSalle");
		
		JButton btnModifierSalle = new JButton("Modifier une salle");
		btnModifierSalle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnModifierSalle,"2, 6, left, top");
		btnModifierSalle.addActionListener(this);
		btnModifierSalle.setActionCommand("ModificationSalle");
		
		JButton btnSupprimerUneSalle = new JButton("Supprimer une salle");
		btnSupprimerUneSalle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnSupprimerUneSalle,"2, 8, left, top");
		btnSupprimerUneSalle.addActionListener(this);
		btnSupprimerUneSalle.setActionCommand("SuppressionSalle");
		
		JButton btnAfficherAccessoires = new JButton("Afficher les accessoires");
		btnAfficherAccessoires.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnAfficherAccessoires,"2, 10, left, top");
		
		JButton btnCreerAccessoire= new JButton("Créer un accessoire");
		btnCreerAccessoire.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnCreerAccessoire,"2, 12, left, top");
		btnCreerAccessoire.addActionListener(this);
		btnCreerAccessoire.setActionCommand("AjoutAccessoire");
		
		JButton btnModifierUnAccessoire = new JButton("Modifier un accessoire");
		btnModifierUnAccessoire.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnModifierUnAccessoire,"2, 14, left, top");
		btnModifierUnAccessoire.addActionListener(this);
		btnModifierUnAccessoire.setActionCommand("ModifAccessoire");
		
		JButton btnSupprimerUnAccessoire = new JButton("Supprimer un accessoire");
		btnSupprimerUnAccessoire.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnSupprimerUnAccessoire,"2, 16, left, top");
		btnSupprimerUnAccessoire.addActionListener(this);
		btnSupprimerUnAccessoire.setActionCommand("SupAccessoire");
		
		JButton btnAjouterAccessoiresalle = new JButton("Ajouter Accessoire/Salle");
		btnAjouterAccessoiresalle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnAjouterAccessoiresalle,"2, 18, left, top");
		btnAjouterAccessoiresalle.addActionListener(this);
		btnAjouterAccessoiresalle.setActionCommand("AjoutAccessoireSalle");
		
		JButton btnModifierAccessoiresalle = new JButton("Modifier Accessoire/Salle");
		btnModifierAccessoiresalle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnModifierAccessoiresalle,"2, 20, left, top");
		btnModifierAccessoiresalle.addActionListener(this);
		btnModifierAccessoiresalle.setActionCommand("ModifAccessoireSalle");
		
		JButton btnSupprimerAccessoiresalle = new JButton("Supprimer Accessoire/Salle");
		btnSupprimerAccessoiresalle.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnSupprimerAccessoiresalle,"2, 22, left, top");
		btnSupprimerAccessoiresalle.addActionListener(this);
		btnSupprimerAccessoiresalle.setActionCommand("SupAccessoireSalle");
	}
	
	public void actionPerformed(ActionEvent e) {
	
		
		if (e.getActionCommand().equals("AjoutSalle")){
			AjouterSalleUI ajoutSalle = new AjouterSalleUI(maFactory);
			ajoutSalle.setVisible(true);
	     }
		if (e.getActionCommand().equals("ModificationSalle")){
			ModifierSalleUI modifierSalle = new ModifierSalleUI(maFactory);
			modifierSalle.setVisible(true);
	     }
		if (e.getActionCommand().equals("SuppressionSalle")){
			SupprimerSalleUI suppressionSalle = new SupprimerSalleUI(maFactory);
			suppressionSalle.setVisible(true);
	     }
		if (e.getActionCommand().equals("AjoutAccessoire")){
			AjouterAccessoireUI ajouterAccessoire = new AjouterAccessoireUI(maFactory);
			ajouterAccessoire.setVisible(true);
	     }
		if (e.getActionCommand().equals("ModifAccessoire")){
			ModifierAccessoireUI modifAccessoire = new ModifierAccessoireUI(maFactory);
			modifAccessoire.setVisible(true);
	     }
		if (e.getActionCommand().equals("SupAccessoire")){
			SupprimerAccessoireUI supAccessoire = new SupprimerAccessoireUI(maFactory);
			supAccessoire.setVisible(true);
	     }
		if (e.getActionCommand().equals("AjoutAccessoireSalle")){
			AjouterAccessoireSalleUI ajoutAccessoire = new AjouterAccessoireSalleUI(maFactory);
			ajoutAccessoire.setVisible(true);
	     }
		if (e.getActionCommand().equals("ModifAccessoireSalle")){
			ModifierAccessoireSalleUI modifierAccessoireSalle = new ModifierAccessoireSalleUI(maFactory);
			modifierAccessoireSalle.setVisible(true);
	     }
		if (e.getActionCommand().equals("SupAccessoireSalle")){
			SupprimerAccessoireSalleUI supAccessoireSalle = new SupprimerAccessoireSalleUI(maFactory);
			supAccessoireSalle.setVisible(true);
	     }
		else 
		{
			super.actionPerformed(e);
		}

	}
}
