package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BL.DataClasses.User;
import BL.Front.ActivityFacade;
import BL.TechnicalClasses.AbstractPersistenceHandlerFactory;
import BL.TechnicalClasses.DatabaseQueryHandlerFactory;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ErrorAddActivityUI extends BaseUI implements ActionListener {

	User user;
	public AbstractPersistenceHandlerFactory factory;
	
	public ErrorAddActivityUI(AbstractPersistenceHandlerFactory factory,User currentUser) {
		
		//super(factory, currentUser);
		super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		content.setLayout(null);
		
		JLabel lblFail = new JLabel("Fail");
		lblFail.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblFail.setBounds(275, 39, 34, 37);
		content.add(lblFail);
		
		JButton btnMyActivities = new JButton("My activities");
		btnMyActivities.setBounds(232, 88, 122, 23);
		content.add(btnMyActivities);
		btnMyActivities.addActionListener(this);
		btnMyActivities.setActionCommand("activities");
		
		JButton btnAddAnActivity = new JButton("Add an activity");
		btnAddAnActivity.setBounds(232, 122, 122, 23);
		content.add(btnAddAnActivity);
		btnAddAnActivity.addActionListener(this);
		btnAddAnActivity.setActionCommand("addActivities");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("activities")) {
			UIActivity frame = new UIActivity(factory, this.user);
			frame.setVisible(true);
			this.dispose();
			}
		if (e.getActionCommand().equals("addActivities")) {
			ActivityCreationUI frame = new ActivityCreationUI(factory, this.user);
			frame.setVisible(true);
			this.dispose();
			}
		
		}
		
	}
	


