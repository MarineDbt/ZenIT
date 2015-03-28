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


public class ModifierAccessoireSalleUI extends JFrame implements ActionListener {
	
	private JTextField tNumSalle;
	private JTextField tNomAcc;
	private JTextField tQty;
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
	public ModifierAccessoireSalleUI(AbstractPersistenceHandlerFactory maFactory) {
		super("Modification de la quantité");
		factory = maFactory;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		Container mainContentPane = getContentPane();
		
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNum = new JLabel("Numéro de la salle :");
		contentPane.add(lblNum, "2, 2");
		
		JLabel lblNom = new JLabel("Nom de l'accessoire :");
		contentPane.add(lblNom, "2, 4");
		
		JLabel lblQty = new JLabel("Quantité :");
		contentPane.add(lblQty, "2, 6");
		
		tNumSalle = new JTextField("Le numéro de la salle");
		tNumSalle.setSize(30, 30);
		tNomAcc = new JTextField("Le nom de l'accessoire");
		tQty = new JTextField("La nouvelle quantité");
		contentPane.add(tNumSalle, "4, 2");
		contentPane.add(tNomAcc, "4, 4");
		contentPane.add(tQty, "4, 6");
		
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
			Accessory accessory = new Accessory(tNomAcc.getText());
			RoomFacade facade = new RoomFacade(factory);
	    	boolean result = facade.modifyAccessoryRoom(accessory, room,tQty.getText());
	    	
	    	 
	    	 if(result)
	    	 {
	    		 dispose();
	    		 OkUI modifSalleOK = new OkUI("La quantité a bien été modifiée !");
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
