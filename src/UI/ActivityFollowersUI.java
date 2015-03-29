package UI;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;

public class ActivityFollowersUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	public Activity currentActivity;



	public ActivityFollowersUI(AbstractPersistenceHandlerFactory factory, User currentUser, Activity currentActivity) {
		super(factory, currentUser);
		//super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		this.currentActivity = currentActivity;
		content.setLayout(null);
		
		JLabel activityName = new JLabel("");
		activityName.setHorizontalAlignment(SwingConstants.CENTER);
		activityName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		activityName.setBounds(128, 11, 326, 22);
		activityName.setText(this.currentActivity.getName());
		content.add(activityName);
		
		JLabel lblNumberOfFollowers = new JLabel("Number of followers : ");
		lblNumberOfFollowers.setBounds(211, 44, 127, 14);
		content.add(lblNumberOfFollowers);
		
		JLabel numberfollow = new JLabel("");
		numberfollow.setBounds(349, 44, 46, 14);
		content.add(numberfollow);
		
		ActivityFacade facade = new ActivityFacade(factory);
		ArrayList<User> followers = facade.getMembers(currentActivity); 
		/* User follow1 = new User("MarineDbt", "Marine", "Dbt");
		User follow2 = new User("Marine", "Marine", "Dbt");
		User follow3 = new User("Mégane", "Mégane", "Dbt");
		User follow4 = new User("JulesCrd", "Jules", "Dbt");
		User follow5 = new User("HarryP", "Harry", "Potter");
		User follow6 = new User("ElieGlt", "Elie", "Galet");
		User follow7 = new User("Lululu", "Lucas", "Esteban");
		ArrayList<User> followers = new ArrayList<User>();
		followers.add(follow1);
		followers.add(follow2);
		followers.add(follow3);
		followers.add(follow4);
		followers.add(follow5);
		followers.add(follow6);
		followers.add(follow7); */
		
		numberfollow.setText(String.valueOf(followers.size()));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 557, 243);
		content.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel title = new JPanel();
		panel.add(title);
		
		JLabel titleid = new JLabel("Id");
		titleid.setFont(new Font("Eurostile-Roman", Font.PLAIN, 18));
		titleid.setMinimumSize(new Dimension(114,28));
		titleid.setMaximumSize(new Dimension(114,28));
		titleid.setPreferredSize(new Dimension(114,28));
		//lblNom.setBounds(6,28+39*i,71,24);
		title.add(titleid);
		
		JLabel titlefirstname = new JLabel("Firstname");
		titlefirstname.setFont(new Font("Eurostile-Roman", Font.PLAIN, 18));
		titlefirstname.setMinimumSize(new Dimension(114,28));
		titlefirstname.setMaximumSize(new Dimension(114,28));
		titlefirstname.setPreferredSize(new Dimension(114,28));
		//lblNom.setBounds(6,28+39*i,71,24);
		title.add(titlefirstname);
		
		JLabel titlelastname = new JLabel("Lastname");
		titlelastname.setFont(new Font("Eurostile-Roman", Font.PLAIN, 18));
		titlelastname.setMinimumSize(new Dimension(114,28));
		titlelastname.setMaximumSize(new Dimension(114,28));
		titlelastname.setPreferredSize(new Dimension(114,28));
		//lblNom.setBounds(6,28+39*i,71,24);
		title.add(titlelastname);
		
		JButton btnRetour = new JButton("Return");
		btnRetour.setBounds(20, 14, 89, 23);
		content.add(btnRetour);
		btnRetour.addActionListener(this);
		btnRetour.setActionCommand("return");
		
		for (int i=0; i<followers.size(); i++){ 
		JPanel panelfollow = new JPanel();
		panel.add(panelfollow);
		panelfollow.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblid = new JLabel(followers.get(i).getID());
		lblid.setMinimumSize(new Dimension(114,28));
		lblid.setMaximumSize(new Dimension(114,28));
		lblid.setPreferredSize(new Dimension(114,28));
		//lblNom.setBounds(6,28+39*i,71,24);
		panelfollow.add(lblid);
		
		JLabel lblfirstname = new JLabel(followers.get(i).getFirstname());
		lblfirstname.setMinimumSize(new Dimension(114,28));
		lblfirstname.setMaximumSize(new Dimension(114,28));
		lblfirstname.setPreferredSize(new Dimension(114,28));
		//lblNom.setBounds(6,28+39*i,71,24);
		panelfollow.add(lblfirstname);
		
		JLabel lbllastname = new JLabel(followers.get(i).getLastname());
		lbllastname.setMinimumSize(new Dimension(114,28));
		lbllastname.setMaximumSize(new Dimension(114,28));
		lbllastname.setPreferredSize(new Dimension(114,28));
		//lblNom.setBounds(6,28+39*i,71,24);
		panelfollow.add(lbllastname);
		
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("return")) {
			UIActivity frame = new UIActivity(factory, user);
			frame.setVisible(true);
			this.dispose();
		}
	}
}
