package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BL.DataClasses.Activity;
import BL.DataClasses.Event;
import BL.DataClasses.User;
import BL.Front.ActivityFacade;
import BL.Front.EventFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class ActivityListEventUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	Activity currentActivity;
	ArrayList<Event> events = new ArrayList<Event>();

	public ActivityListEventUI(AbstractPersistenceHandlerFactory factory, User currentUser, Activity currentAct) {
		//super(factory, currentUser);
		super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		content.setLayout(null);
		this.currentActivity = currentAct;
		
		JLabel nameact = new JLabel("");
		nameact.setHorizontalAlignment(SwingConstants.CENTER);
		nameact.setBounds(226, 11, 138, 14);
		nameact.setText(this.currentActivity.getName());
		content.add(nameact);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 557, 253);
		content.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JButton btnAddEvent = new JButton("Add an event");
		btnAddEvent.setBounds(236, 33, 118, 23);
		content.add(btnAddEvent);
		btnAddEvent.addActionListener(this);
		btnAddEvent.setActionCommand("addEvent");
		
		ActivityFacade facade = new ActivityFacade(factory);
		this.events = facade.getEvents(this.currentActivity);
		//this.events = new ArrayList<Event>();
		//Event ev = new Event("Conférence de folie"); //a enlever
		//events.add(ev); // a enlever
		
		if (events.size()!=0) {
		for (int i=0; i<events.size(); i++){
			JPanel panel_1 = new JPanel();
			panel.add(panel_1);
			panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNom = new JLabel(events.get(i).getName());
			lblNom.setMinimumSize(new Dimension(114,28));
			lblNom.setMaximumSize(new Dimension(114,28));
			lblNom.setPreferredSize(new Dimension(114,28));
			//lblNom.setBounds(6,28+39*i,71,24);
			panel_1.add(lblNom);
			
			EventFacade facadeEvent = new EventFacade(factory);
		    ArrayList<User> participants = new ArrayList<User>();
		   
		    
		    participants = facadeEvent.getMembers(this.events.get(i));
			
			JLabel lblparticipants = new JLabel("Il y a "+participants.size()+" participants");
			lblparticipants.setMinimumSize(new Dimension(114,28));
			lblparticipants.setMaximumSize(new Dimension(114,28));
			lblparticipants.setPreferredSize(new Dimension(114,28));
			panel_1.add(lblparticipants);
			
			JButton btnDetails = new JButton("Details");
			//btnDetails.setBounds(66, 26+39*i, 90, 28);
			btnDetails.addActionListener(this);
			btnDetails.setActionCommand("details"+i);
			panel_1.add(btnDetails);
			
			JButton btnParticipants = new JButton("Participants");
			//btnDetails.setBounds(66, 26+39*i, 90, 28);
			btnParticipants.addActionListener(this);
			btnParticipants.setActionCommand("participants"+i);
			panel_1.add(btnParticipants);
			}
		}
		else {
			JPanel panel2 = new JPanel();
			panel.add(panel2);
			
			JLabel lblnoevents = new JLabel("There are no events for " + this.currentActivity.getName());
			lblnoevents.setBounds(236,200,118,23);
			panel2.add(lblnoevents);
		}
	}

	
	public void actionPerformed(ActionEvent e) {
	
		EventFacade facade = new EventFacade(factory);
		
		if (e.getActionCommand().equals("addEvent")) {
			AddEventTypeUI frame = new AddEventTypeUI(this.factory, this.user,this.currentActivity);
			frame.setVisible(true);
			this.dispose();
		}
			
		for (int i=0;i<this.events.size();i++) {

		if (e.getActionCommand().equals("details"+i)) {
			if (facade.isOccasional(this.events.get(i))) {
			
			OccasionalDetailsUI frame = new OccasionalDetailsUI(this.factory,this.user,this.events.get(i),this.currentActivity);
			frame.setVisible(true);
			this.dispose();
			
			}
			
			if (facade.isLesson(this.events.get(i))) {
				System.out.println("coucou");
			}
			
			
		}
		
		if (e.getActionCommand().equals("participants"+i)) {
			OccasionalParticipantsUI frame = new OccasionalParticipantsUI(this.factory,this.user,this.events.get(i),this.currentActivity);
			frame.setVisible(true);
			this.dispose();
			
		}
		
		}
}
}
