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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.JButton;

public class DescActivityUI extends BaseUI implements ActionListener {

	public AbstractPersistenceHandlerFactory factory;
	public User user;
	public Activity currentActivity;

	public DescActivityUI(AbstractPersistenceHandlerFactory factory, User currentUser, Activity currentActivity) {
		
		//super(factory, currentUser);
		super(new DatabaseQueryHandlerFactory(), new User()); //a enlever
		this.factory = factory;
		this.user = currentUser;
		content.setLayout(null);
		this.currentActivity = currentActivity;
		
		
		JLabel lblNom = new JLabel("Name :");
		lblNom.setBounds(146, 33, 56, 14);
		content.add(lblNom);
		
	
		JLabel labelname = new JLabel("");
		labelname.setBounds(280, 33, 221, 14);
		labelname.setText(currentActivity.getName());
		content.add(labelname);
		
		JLabel lblNewLabel = new JLabel("Short description :");
		lblNewLabel.setBounds(146, 73, 113, 14);
		content.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(280, 73, 221, 86);
		content.add(scrollPane);
		
		JTextArea shortArea = new JTextArea();
		shortArea.setBackground(UIManager.getColor("Button.background"));
		shortArea.setLineWrap(true); 
		shortArea.setWrapStyleWord(true);
		shortArea.setEditable(false);
		shortArea.setText(currentActivity.getShortDescription());
		scrollPane.setViewportView(shortArea);
		
		JLabel lblDetailledDescription = new JLabel("Detailled description : ");
		lblDetailledDescription.setBounds(146, 182, 113, 14);
		content.add(lblDetailledDescription);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(280, 182, 221, 86);
		content.add(scrollPane_1);
		
		JTextArea detailledArea = new JTextArea();
		detailledArea.setBackground(UIManager.getColor("Button.background"));
		detailledArea.setLineWrap(true); 
		detailledArea.setWrapStyleWord(true);
		detailledArea.setEditable(false);
		detailledArea.setText(currentActivity.getDetailledDescription());
		scrollPane_1.setViewportView(detailledArea);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.setBounds(188, 285, 89, 23);
		btnReturn.addActionListener(this);
		btnReturn.setActionCommand("return");
		content.add(btnReturn);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(290, 285, 89, 23);
		btnUpdate.addActionListener(this);
		btnUpdate.setActionCommand("update");
		content.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(389, 285, 89, 23);
		btnDelete.addActionListener(this);
		btnDelete.setActionCommand("delete");
		content.add(btnDelete);
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("return")) {
			UIActivity frame = new UIActivity(factory, this.user);
			frame.setVisible(true);
			this.dispose();
			
		}
		
		if (e.getActionCommand().equals("delete")) {
			
			UIActivity frame = new UIActivity(factory, this.user);
			ActivityFacade facade = new ActivityFacade(factory);
			if (facade.deleteActivity(currentActivity)) {
			frame.setVisible(true);
			this.dispose();
			ActSupprime frameMessage = new ActSupprime("L'activité a bien été supprimée");
			frameMessage.setVisible(true);
			}
			
			
		}
		
		if (e.getActionCommand().equals("update")) {
		UpdateActivityUI frame = new UpdateActivityUI(this.factory,this.user,this.currentActivity);
		frame.setVisible(true);
		this.dispose();
		}
	}
}
