package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BL.DataClasses.User;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class SupervisorUI extends BaseUI implements ActionListener {
	
	public AbstractPersistenceHandlerFactory factory;
	public User user;

	public SupervisorUI(AbstractPersistenceHandlerFactory factory, User currentUser) {

		//super(factory, currentUser);
				super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
				this.factory = factory;
				this.user = currentUser;
				content.setLayout(null);
				
				JLabel lblBonjour = new JLabel("Bonjour");
				lblBonjour.setHorizontalAlignment(SwingConstants.CENTER);
				lblBonjour.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblBonjour.setBounds(258, 11, 70, 14);
				content.add(lblBonjour);
				
				JLabel label = new JLabel("");
				label.setHorizontalAlignment(SwingConstants.CENTER);
				label.setBounds(223, 36, 142, 14);
				label.setText(this.user.getFirstname() + " " +  this.user.getLastname());
				content.add(label);
				
				JButton btnact = new JButton("Gérer mes activités");
				btnact.setBounds(210, 70, 175, 23);
				btnact.addActionListener(this);
				btnact.setActionCommand("act");
				content.add(btnact);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("act")) {
			UIActivity frame = new UIActivity(factory, this.user);
			frame.setVisible(true);
			this.dispose();
			
		}
		
		
		
	}
}
