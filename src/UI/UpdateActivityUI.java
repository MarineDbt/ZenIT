package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BL.DataClasses.Activity;
import BL.DataClasses.User;
import BL.Front.ActivityFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class UpdateActivityUI extends BaseUI implements ActionListener {
	
	public AbstractPersistenceHandlerFactory factory;
	public User user;
	public Activity currentActivity;
	
	private JTextField textField;
	private JTextField shortArea;
	private JTextField detailledArea;
	
	/**
	 * Create the frame.
	 */
	public UpdateActivityUI(AbstractPersistenceHandlerFactory factory, User currentUser, Activity currentActivity) {
		
				//super(factory, currentUser);
				super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
				this.factory = factory;
				this.user = currentUser;
				content.setLayout(null);
				this.currentActivity = currentActivity;
				
				JLabel lblName = new JLabel("Name :");
				lblName.setBounds(134, 73, 46, 14);
				
				content.add(lblName);
				
				JLabel lblShortDescription = new JLabel("Short description :");
				lblShortDescription.setBounds(134, 118, 95, 14);
				
				content.add(lblShortDescription);
				
				JLabel lblDetailledDescription = new JLabel("Detailled description :");
				lblDetailledDescription.setBounds(135, 177, 120, 14);
				
				content.add(lblDetailledDescription);
				
				textField = new JTextField();
				textField.setBounds(253, 73, 200, 20);
				textField.setText(this.currentActivity.getName());
				content.add(textField);
				textField.setColumns(10);
				
				JButton btnSend = new JButton("Send");
				btnSend.setBounds(313, 219, 89, 23);
				content.add(btnSend);
				btnSend.addActionListener(this);
				btnSend.setActionCommand("send");
				
				JButton btnRetour = new JButton("Return");
				btnRetour.setBounds(313, 28, 89, 23);
				content.add(btnRetour);
				btnRetour.addActionListener(this);
				btnRetour.setActionCommand("return");
				
				shortArea = new JTextField();
				shortArea.setBounds(253, 118, 200, 20);
				shortArea.setText(this.currentActivity.getShortDescription());
				content.add(shortArea);
				shortArea.setColumns(10);
				
				detailledArea = new JTextField();
				detailledArea.setBounds(253, 174, 200, 20);
				detailledArea.setText(this.currentActivity.getDetailledDescription());
				content.add(detailledArea);
				detailledArea.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("send")) {
			
			// a enlever apres
			User usertropcool = new User("Marine", "Dubédat", "rue trop cool", "34000", "Montpellier", "0603899427", "mailtropcool", "marinedbt", "marine");
			
			ActivityFacade facade = new ActivityFacade(factory);
			boolean result = facade.modifyActivity(this.currentActivity, this.textField.getText(), this.shortArea.getText(), this.detailledArea.getText());
			
			if (result ==true) {
			UIActivity frame = new UIActivity(factory, user);
			frame.setVisible(true); 
			this.dispose();
			}
			
			if (result ==false) {
				UIActivity frame = new UIActivity(factory, user);
				frame.setVisible(true); 
				this.dispose();
			}
		}
		
		if (e.getActionCommand().equals("return")) {
			UIActivity frame = new UIActivity(factory, user);
			frame.setVisible(true);
			this.dispose();
		}
		
	}
}
