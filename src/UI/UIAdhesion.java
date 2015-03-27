package UI;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import BL.DataClasses.User;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class UIAdhesion extends BaseUI implements ActionListener {
	
	private User currentUser;
	private AbstractPersistenceHandlerFactory factory;
	
	public UIAdhesion(AbstractPersistenceHandlerFactory factory, User currentUser) {
		
		this.currentUser = currentUser;
		this.factory = factory;
		
		JLabel lblNewLabel = new JLabel("L'adh\u00E9sion \u00E0 l'association Zen Lounge n\u00E9cessite le paiement d'une cotisation de 65 \u20AC.");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 13, 493, 16);
		content.add(lblNewLabel);
		
		JButton cotisationButton = new JButton("Payer ma cotisation");
		cotisationButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		cotisationButton.addActionListener(this);
		cotisationButton.setActionCommand("cotisation");
		
		cotisationButton.setBounds(198, 42, 158, 25);
		content.add(cotisationButton);
		
		JButton btnRetourLaccueil = new JButton("Retour \u00E0 l'accueil");
		btnRetourLaccueil.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnRetourLaccueil.setBounds(368, 42, 158, 25);
		content.add(btnRetourLaccueil);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("cotisation")) {
			UIPayment frame = new UIPayment(factory, currentUser);
			frame.setVisible(true);
			this.dispose();
			}
	}

}
