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
import BL.DataClasses.User;
import BL.Front.EventFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddOccasionalEventUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	Activity currentActivity;
	private JTextField namefield;

	private JButton btnSend;
	private JFormattedTextField tfDate;
	private JTextField descfield;
	private JComboBox eventType;
	private JLabel lblType;
	private String chosenType;
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
	
	public AddOccasionalEventUI(AbstractPersistenceHandlerFactory factory, User currentUser, Activity currentAct) {

		//super(factory, currentUser);
		super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		this.currentActivity = currentAct;
		content.setLayout(null);
		
		/*
		//	Choix de la langue francaise
		Locale locale = Locale.getDefault();
		Date actuelle = new Date();
		
		//	Definition du format utilise pour les dates
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		// Donne la date au format "aaaa-mm-jj" 

			String dat = dateFormat.format(actuelle);
			System.out.println(dat);
			
*/
			
		JLabel lblName = new JLabel("Name : ");
		lblName.setBounds(190, 11, 46, 14);
		content.add(lblName);
		
		namefield = new JTextField();
		namefield.setBounds(264, 8, 152, 20);
		content.add(namefield);
		namefield.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setBounds(190, 52, 73, 14);
		content.add(lblDescription);
		
		descfield = new JTextField();
		descfield.setBounds(264, 52, 152, 20);
		content.add(descfield);
		descfield.setColumns(10);
		
		Locale locale = Locale.getDefault();
		JLabel lblDate = new JLabel("Date (DD/MM/YYYY) :");
		lblDate.setBounds(239, 83, 179, 14);
		content.add(lblDate);
		
		DateFormat dform = new SimpleDateFormat("dd/MM/yyyy");
		
		tfDate = new JFormattedTextField(dform);
		tfDate.setColumns(10);
		tfDate.setBounds(239, 107, 152, 20);
		content.add(this.tfDate);
		
		String[] eventTypeslist = { "Conference", "Private Sales","Master Class" };
		this.eventType = new JComboBox(eventTypeslist);
		eventType.setBounds(264, 183, 152, 20);
		eventType.setSelectedIndex(1);
		eventType.addActionListener(this);
		content.add(eventType);
		
		btnSend = new JButton("Next");
		btnSend.setBounds(264, 250, 89, 23);
		content.add(btnSend);
		btnSend.addActionListener(this);
		btnSend.setActionCommand("next");
		
		lblType = new JLabel("Type : ");
		lblType.setBounds(190, 186, 46, 14);
		content.add(lblType);
		
		de = new JLabel("De");
		de.setBounds(190, 151, 29, 14);
		content.add(de);
		
		heuredeb = new JTextField();
		heuredeb.setBounds(217, 145, 29, 20);
		content.add(heuredeb);
		heuredeb.setColumns(10);
		
		lblH = new JLabel("h");
		lblH.setBounds(251, 151, 20, 14);
		content.add(lblH);
		
		mindeb = new JTextField();
		mindeb.setBounds(267, 145, 30, 20);
		content.add(mindeb);
		mindeb.setColumns(10);
		
		a = new JLabel("\u00E0");
		a.setBounds(307, 151, 20, 14);
		content.add(a);
		
		heurefin = new JTextField();
		heurefin.setColumns(10);
		heurefin.setBounds(322, 145, 29, 20);
		content.add(heurefin);
		
		minfin = new JTextField();
		minfin.setColumns(10);
		minfin.setBounds(372, 145, 30, 20);
		content.add(minfin);
		
		label = new JLabel("h");
		label.setBounds(356, 151, 20, 14);
		content.add(label);
		
		EventFacade facade = new EventFacade(factory);
		ArrayList<User> contributors = facade.allContributors();
		
		String[] contributorstab = new String[contributors.size()];
		for (int i=0;i<contributors.size();i++) {
			contributorstab[i] = contributors.get(i).getID();
		}
		
		this.contrib = new JComboBox(contributorstab);
		contrib.setBounds(264, 214, 152, 20);
		contrib.setSelectedIndex(contributorstab.length-1);
		contrib.addActionListener(this);
		content.add(contrib);
		
		JLabel lblContributor = new JLabel("Contributor :");
		lblContributor.setBounds(190, 217, 73, 14);
		content.add(lblContributor);
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		String Type = (String)this.eventType.getSelectedItem();
	     this.chosenType = Type;
	     
	    String contributor = (String)this.contrib.getSelectedItem();
	    this.chosenContrib = contributor;
	     
	    if (e.getActionCommand().equals("next")) {
		    		
					
					
		}
	}
}
