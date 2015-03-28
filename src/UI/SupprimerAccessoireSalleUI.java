package UI;

import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.FlowLayout;

import BL.DataClasses.*;
import BL.Front.RoomFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;


public class SupprimerAccessoireSalleUI extends JFrame implements ActionListener {
	
	private JTextField tNumSalle;
	private JTextField tNom;
	private AbstractPersistenceHandlerFactory factory;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterSalleUI frame = new AjouterSalleUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	/**
	 * Create the frame.
	 */
	public SupprimerAccessoireSalleUI(AbstractPersistenceHandlerFactory maFactory) {
		super("Suppression d'un accessoire dans une salle");
		factory = maFactory;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		
		
		Container mainContentPane = getContentPane();
		
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNum = new JLabel("Numéro de la salle :");
		contentPane.add(lblNum, "2, 2");
		
		JLabel lblNom = new JLabel("Nom de l'accessoire :");
		contentPane.add(lblNom, "2, 4");
		
		tNumSalle = new JTextField("Le numéro de la salle");
		tNumSalle.setSize(30, 30);
		tNom = new JTextField();
		contentPane.add(tNumSalle, "4, 2");
		contentPane.add(tNom, "4, 4");
		
		mainContentPane.add(contentPane,BorderLayout.CENTER);
		
		JPanel panelSud = new JPanel();
		
		JButton BoutonValider = new JButton("Valider");
		BoutonValider.setSize(30,10);
		BoutonValider.addActionListener(this);
		BoutonValider.setActionCommand("valid");
		
		JButton BoutonAnnuler = new JButton("Annuler");
		BoutonAnnuler.addActionListener(this);
		BoutonAnnuler.setActionCommand("cancel");
		
		panelSud.add(BoutonValider);
		panelSud.add(BoutonAnnuler);
		mainContentPane.add(panelSud,BorderLayout.SOUTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("valid")){
			Room room = new Room(tNumSalle.getText());
			Accessory accessory = new Accessory(tNom.getText());
			RoomFacade facade = new RoomFacade(factory);
	    	 boolean result = facade.removeAccessoryRoom(room,accessory);
	    	
	    	 
	    	 if(result)
	    	 {
	    		 dispose();
	    		 OkUI modifSalleOK = new OkUI("L'accessoire a bien été supprimé de la salle !");
	    		 modifSalleOK.setVisible(true);
	    	 }
	    	 else
	    	 {
	    		 EchecUI echec = new EchecUI();
	    		 echec.setVisible(true);	 
	    	 }
		}
	    if (e.getActionCommand().equals("cancel"))
	    {
	    	dispose();
	    }
		}

}
