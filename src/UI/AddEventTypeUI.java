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
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

public class AddEventTypeUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	private String chosenType;
	Activity currentActivity;
	JComboBox eventType;
	
	
	public AddEventTypeUI(AbstractPersistenceHandlerFactory factory, User currentUser, Activity currentAct) {
	

		//super(factory, currentUser);
		super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		content.setLayout(null);
		this.currentActivity = currentAct;
		
		JLabel typeEvent = new JLabel("Event Type : ");
		typeEvent.setBounds(219, 78, 76, 14);
		content.add(typeEvent);
		
		String[] eventTypeslist = { "Occasional", "Lesson" };
		this.eventType = new JComboBox(eventTypeslist);
		eventType.setBounds(291, 75, 97, 20);
		eventType.setSelectedIndex(1);
		eventType.addActionListener(this);
		content.add(eventType);
		
		JLabel lblChoseTheEvent = new JLabel("Chose the event type");
		lblChoseTheEvent.setFont(new Font("Eurostile-Roman", Font.PLAIN, 21));
		lblChoseTheEvent.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoseTheEvent.setBounds(194, 36, 206, 20);
		content.add(lblChoseTheEvent);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(267, 122, 89, 23);
		btnSend.addActionListener(this);
		btnSend.setActionCommand("send");
		content.add(btnSend);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 
	     String Type = (String)this.eventType.getSelectedItem();
	     this.chosenType = Type;
	   
		
		if (e.getActionCommand().equals("send")) {
	
			if (this.chosenType == "Occasional") {
				AddOccasionalEventUI frame = new AddOccasionalEventUI(this.factory, this.user,this.currentActivity);
				frame.setVisible(true);
				this.dispose();
			}
			
			if (this.chosenType == "Lesson") {

				AddLessonEventUI frame = new AddLessonEventUI(this.factory, this.user,this.currentActivity);
				frame.setVisible(true);
				this.dispose();
			}
		}
		
	}
}
