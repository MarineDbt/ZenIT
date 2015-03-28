package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import BL.DataClasses.Activity;
import BL.DataClasses.Event;
import BL.DataClasses.Room;
import BL.DataClasses.TimeSlot;
import BL.DataClasses.User;
import BL.Front.EventFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LessonUpdateUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	Activity currentActivity;
	private JTextField namefield;

	private JButton btnSend;
	private JTextField descfield;
	private String chosenContrib;
	private JLabel de;
	private JTextField heuredeb;
	private JLabel lblH;
	private JTextField mindeb;
	private JLabel a;
	private JTextField minfin;
	private JLabel label;
	private JTextField heurefin;
	private JComboBox contrib;
	private JComboBox roombox;
	private String chosenRoom;
	private String choseDay;

	private JComboBox day;
	Event currentEvent;
	
	public LessonUpdateUI(AbstractPersistenceHandlerFactory factory, User currentUser, Activity currentAct, Event currentEvent) {

		//super(factory, currentUser);
		super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		this.currentActivity = currentAct;
		content.setLayout(null);
		this.currentEvent = currentEvent;
		
			
		JLabel lblName = new JLabel("Name : ");
		lblName.setBounds(190, 21, 46, 14);
		content.add(lblName);
		
		namefield = new JTextField();
		namefield.setBounds(264, 18, 152, 20);
		content.add(namefield);
		namefield.setText(this.currentEvent.getName());
		namefield.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setBounds(190, 49, 73, 14);
		content.add(lblDescription);
		
		descfield = new JTextField();
		descfield.setBounds(264, 49, 152, 20);
		content.add(descfield);
		descfield.setText(this.currentEvent.getEventDescription());
		descfield.setColumns(10);
	

		
		btnSend = new JButton("Next");
		btnSend.setBounds(264, 246, 89, 23);
		content.add(btnSend);
		btnSend.addActionListener(this);
		btnSend.setActionCommand("next");
		
		de = new JLabel("De");
		de.setBounds(190, 128, 29, 14);
		content.add(de);
		
		
		heuredeb = new JTextField();
		heuredeb.setBounds(217, 122, 29, 20);
		content.add(heuredeb);
		heuredeb.setColumns(10);
		
		lblH = new JLabel("h");
		lblH.setBounds(251, 128, 20, 14);
		content.add(lblH);
		
		mindeb = new JTextField();
		mindeb.setBounds(267, 122, 30, 20);
		content.add(mindeb);
		mindeb.setColumns(10);
		
		a = new JLabel("\u00E0");
		a.setBounds(307, 128, 20, 14);
		content.add(a);
		
		heurefin = new JTextField();
		heurefin.setColumns(10);
		heurefin.setBounds(322, 122, 29, 20);
		content.add(heurefin);
		
		minfin = new JTextField();
		minfin.setColumns(10);
		minfin.setBounds(372, 122, 30, 20);
		content.add(minfin);
		
		label = new JLabel("h");
		label.setBounds(356, 128, 20, 14);
		content.add(label);
		
		EventFacade facade = new EventFacade(factory);
		ArrayList<User> contributors = facade.allContributors();
		
		String[] contributorstab = new String[contributors.size()];
		for (int i=0;i<contributors.size();i++) {
			contributorstab[i] = contributors.get(i).getID();
		}
		
		this.contrib = new JComboBox(contributorstab);
		contrib.setBounds(264, 190, 152, 20);
		contrib.setSelectedIndex(contributorstab.length-1);
		contrib.addActionListener(this);
		content.add(contrib);
		
		JLabel lblContributor = new JLabel("Contributor :");
		lblContributor.setBounds(190, 193, 73, 14);
		content.add(lblContributor);
		
		JLabel lblRoom = new JLabel("Room : ");
		lblRoom.setBounds(190, 165, 46, 14);
		content.add(lblRoom);
		
		ArrayList<Room> rooms = facade.selectAllRooms();
		
		String[] roomtab = new String[rooms.size()];
		for (int i=0;i<rooms.size();i++) {
			roomtab[i] = rooms.get(i).getid();
		}
		
		this.roombox = new JComboBox(roomtab);
		roombox.setBounds(264, 162, 152, 20);
		roombox.setSelectedIndex(contributorstab.length-1);
		roombox.addActionListener(this);
		content.add(roombox);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setActionCommand("next");
		btnReturn.setBounds(264, 280, 89, 23);
		content.add(btnReturn);
		btnReturn.addActionListener(this);
		btnReturn.setActionCommand("return");
		
		JLabel lblDay = new JLabel("Day :");
		lblDay.setBounds(190, 80, 46, 14);
		content.add(lblDay);
		
		String[] daylist = { "Lundi", "Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche" };
		this.day = new JComboBox(daylist);
		day.setBounds(264, 80, 152, 20);
		day.setSelectedIndex(0);
		day.addActionListener(this);
		content.add(day);
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
	    
	     
	    if (e.getActionCommand().equals("next")) {
	    	
	    	EventFacade facade = new EventFacade(factory);
		     
	    	String days = (String)this.day.getSelectedItem();
		    this.choseDay = days;
	    	
		    String contributor = (String)this.contrib.getSelectedItem();
		    this.chosenContrib = contributor;
		 
		    String room = (String)this.roombox.getSelectedItem();
		    this.chosenRoom = room;
		    
		    TimeSlot timeSlot = new TimeSlot(Integer.parseInt(heuredeb.getText()),Integer.parseInt(this.mindeb.getText()),Integer.parseInt(this.heurefin.getText()),Integer.parseInt(this.minfin.getText()));
		    
		    if (facade.updateLesson(this.currentEvent, this.chosenContrib, this.namefield.getText(), this.descfield.getText(), this.chosenRoom, timeSlot, this.choseDay)) {
		    	ActivityListEventUI frame = new ActivityListEventUI(this.factory,this.user,this.currentActivity);
				frame.setVisible(true);
				this.dispose();
				ActSupprime frame2 = new ActSupprime("L'évènement a bien été mis à jour");
				frame2.setVisible(true);
		    }
		    
		    else {
		    	LessonDetailsUI frame = new LessonDetailsUI(this.factory, this.user,this.currentEvent,this.currentActivity);
				frame.setVisible(true);
				this.dispose();
				ActSupprime frame2 = new ActSupprime("Il y a eu une erreur, vérifiez vos informations");
				frame2.setVisible(true);
		    }
					
					
		}
	    
	    if (e.getActionCommand().equals("return")) {
	    	ActivityListEventUI frame = new ActivityListEventUI(this.factory,this.user,this.currentActivity);
			frame.setVisible(true);
			this.dispose();
	    }
	}
}
