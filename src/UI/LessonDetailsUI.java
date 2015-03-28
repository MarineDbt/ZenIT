package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BL.DataClasses.Activity;
import BL.DataClasses.Event;
import BL.DataClasses.TimeSlot;
import BL.DataClasses.User;
import BL.Front.ActivityFacade;
import BL.Front.EventFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

public class LessonDetailsUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	public Event currentEvent;
	public Activity currentActivity;

	
	public LessonDetailsUI(AbstractPersistenceHandlerFactory factory, User currentUser, Event currentEvent, Activity currentActivity) {
	
		//super(factory, currentUser);
				super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
				this.factory = factory;
				this.user = currentUser;
				this.currentEvent = currentEvent;
				content.setLayout(null);
				this.currentActivity = currentActivity;
				
				EventFacade facade = new EventFacade(factory);
				
				JLabel lblNom = new JLabel("Name : ");
				lblNom.setBounds(183, 11, 46, 14);
				content.add(lblNom);
				
				JLabel lblDescription = new JLabel("Description :");
				lblDescription.setBounds(182, 36, 68, 14);
				content.add(lblDescription);
				
				JLabel lblContributor = new JLabel("Contributor : "+this.currentEvent.getContributor());
				lblContributor.setBounds(183, 96, 201, 14);
				content.add(lblContributor);
				
				JLabel lblRoom = new JLabel("Room : "+this.currentEvent.getRoom());
				lblRoom.setBounds(183, 121, 201, 14);
				content.add(lblRoom);
				
				TimeSlot timeSlot = this.currentEvent.getTimeSlot();
				String fromto = "From "+timeSlot.getHDeb()+" h "+timeSlot.getMDeb()+" to "+timeSlot.getHFin()+" h "+timeSlot.getMFin();
				JLabel labelheure = new JLabel(fromto);
				labelheure.setBounds(183, 146, 201, 14);
				content.add(labelheure);
				
				JButton btnUpdate = new JButton("Update");
				btnUpdate.setBounds(254, 236, 89, 23);
				content.add(btnUpdate);
				btnUpdate.addActionListener(this);
				btnUpdate.setActionCommand("update");
				
				JButton btnDelete = new JButton("Delete");
				btnDelete.setBounds(254, 265, 89, 23);
				content.add(btnDelete);
				btnDelete.addActionListener(this);
				btnDelete.setActionCommand("delete");
				
				JButton btnReturn = new JButton("Return");
				btnReturn.setBounds(254, 293, 89, 23);
				content.add(btnReturn);
				btnReturn.addActionListener(this);
				btnReturn.setActionCommand("return");
				
				JLabel labelname = new JLabel("");
				labelname.setBounds(230, 11, 154, 14);
				labelname.setText(this.currentEvent.getName());
				content.add(labelname);
				
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane.setBounds(260, 36, 124, 51);
				content.add(scrollPane);
				
				JTextArea shortArea = new JTextArea();
				shortArea.setBackground(UIManager.getColor("Button.background"));
				shortArea.setLineWrap(true); 
				shortArea.setWrapStyleWord(true);
				shortArea.setEditable(false);
				shortArea.setText(currentEvent.getEventDescription());
				scrollPane.setViewportView(shortArea);
			
				
				JLabel lbldate = new JLabel("");
				lbldate.setBounds(220, 171, 46, 14);
			
				content.add(lbldate);
				
				JLabel lblDay = new JLabel("Day : "+facade.getEventDay(this.currentEvent));
				lblDay.setBounds(183, 171, 201, 14);
				content.add(lblDay);
				
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		EventFacade facade = new EventFacade(factory);
	    
	     
	    if (e.getActionCommand().equals("return")) {
	    	ActivityListEventUI frame = new ActivityListEventUI(this.factory,this.currentUser,this.currentActivity);
	    	frame.setVisible(true);
	    	this.dispose();
	    }
	    
	    if (e.getActionCommand().equals("update")) {
	    	LessonUpdateUI frame = new LessonUpdateUI(this.factory,this.currentUser,this.currentActivity,this.currentEvent);
	    	frame.setVisible(true);
	    	this.dispose();
	    }
	    
	    if (e.getActionCommand().equals("delete")) {
	    	UIActivity frame = new UIActivity(factory, this.user);
	
			if (facade.deleteLesson(this.currentEvent)) {
			frame.setVisible(true);
			this.dispose();
			ActSupprime frameMessage = new ActSupprime("L'évènement a bien été supprimée");
			frameMessage.setVisible(true);
	    }
	    
	    }
	    
	}
}
